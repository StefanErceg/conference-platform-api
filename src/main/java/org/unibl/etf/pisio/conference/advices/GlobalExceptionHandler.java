package org.unibl.etf.pisio.conference.advices;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.method.HandlerMethod;
import org.unibl.etf.pisio.conference.exceptions.HttpException;
import org.unibl.etf.pisio.conference.util.Logging;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public final ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException exception, HandlerMethod handlerMethod) {
        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(HttpException.class)
    public final ResponseEntity<Object> handleHttpException(HttpException exception, HandlerMethod handlerMethod) {
        Log log = getLog(handlerMethod);
        log.error(exception);
        HttpStatus status = exception.getStatus() != null ? exception.getStatus() : HttpStatus.INTERNAL_SERVER_ERROR;
        Object data = exception.getData();
        return new ResponseEntity<>(data, status);
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleException(Exception exception, HandlerMethod handlerMethod) {
        Logging.logException(exception, getLog(handlerMethod));
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private Log getLog(HandlerMethod handlerMethod) {
        return LogFactory.getLog(handlerMethod.getMethod().getDeclaringClass());
    }

}
