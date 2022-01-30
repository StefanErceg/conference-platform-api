package org.unibl.etf.pisio.conference.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class HttpException extends RuntimeException {
    private HttpStatus status;
    private Object data;

    public HttpException() {
        this.status = HttpStatus.INTERNAL_SERVER_ERROR;
        this.data = null;
    }

    public HttpException(Object data) {
        this(HttpStatus.INTERNAL_SERVER_ERROR, data);
    }

    public HttpException(HttpStatus status, Object data) {
        this.status = status;
        this.data = data;
    }
}
