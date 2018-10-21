/**
 * Exception for amount validation.
 */
package com.core.rd.exception;

/**
 * @author Shiva Kumar
 *
 */
public class InvalidAmountException extends Exception {
	/**
	 * Default serial version ID.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Parameterized constructor.
	 * 
	 * @param message
	 *            exception message.
	 */
	public InvalidAmountException(final String message) {
		super(message);
	}
}
