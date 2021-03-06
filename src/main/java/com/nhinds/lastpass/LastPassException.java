package com.nhinds.lastpass;

/** General exception for problems during LastPass operations */
public class LastPassException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public LastPassException(String message) {
		super(message);
	}

	public LastPassException(Throwable cause) {
		super(cause);
	}

	public LastPassException(String message, Throwable cause) {
		super(message, cause);
	}

}