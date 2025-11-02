package com.example.orderservice.exception;

public class OrderFetchException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OrderFetchException(String message, Throwable cause) {
        super(message, cause);
    }
}
