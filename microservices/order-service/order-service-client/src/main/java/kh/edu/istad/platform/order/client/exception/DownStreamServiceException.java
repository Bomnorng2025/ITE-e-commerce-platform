package kh.edu.istad.platform.order.client.exception;

import kh.edu.istad.common.domain.exception.DomainException;

public class DownStreamServiceException extends DomainException {
    public DownStreamServiceException(String message) {
        super(message);
    }

    public DownStreamServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
