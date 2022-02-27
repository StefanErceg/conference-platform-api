package org.unibl.etf.pisio.conference.services.implementation;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import org.unibl.etf.pisio.conference.exceptions.UnauthorizedException;
import org.unibl.etf.pisio.conference.models.JwtUser;
import org.unibl.etf.pisio.conference.models.Login;
import org.unibl.etf.pisio.conference.models.requests.LoginRequest;
import org.unibl.etf.pisio.conference.services.AuthService;
import org.unibl.etf.pisio.conference.services.UserService;
import org.unibl.etf.pisio.conference.util.Logging;

import java.util.Date;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserService userService;
    @Value("${authorization.token.expiration-time}")
    private String tokenExpirationTime;
    @Value("${authorization.token.secret}")
    private String tokenSecret;


    public AuthServiceImpl(AuthenticationManager authenticationManager, UserService userService) {
        this.authenticationManager = authenticationManager;
        this.userService = userService;
    }

    @Override
    public Login login(LoginRequest request) {
        Login response = null;
        try {
            Authentication authenticate = authenticationManager
                    .authenticate(
                            new UsernamePasswordAuthenticationToken(
                                    request.getUsername(), request.getPassword()
                            )
                    );
            JwtUser user = (JwtUser) authenticate.getPrincipal();
            response = userService.findById(user.getId(), Login.class);
            response.setToken(generateJwt(user));
        } catch (Exception ex) {
            Logging.logException(ex, getClass());
            throw new UnauthorizedException();
        }
        return response;
    }

    private String generateJwt(JwtUser user) {
        return Jwts.builder()
                .setId(user.getId().toString())
                .setSubject(user.getUsername())
                .setExpiration(new Date(System.currentTimeMillis() + Long.parseLong(tokenExpirationTime)))
                .signWith(SignatureAlgorithm.HS512, tokenSecret)
                .compact();
    }
}