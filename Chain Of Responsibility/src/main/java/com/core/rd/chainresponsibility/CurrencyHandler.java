/**
 *Currency handler for ATM.
 */
package com.core.rd.chainresponsibility;

/**
 * @author Shiva Kumar
 *
 */
public abstract class CurrencyHandler {
	/**
	 * default constructor.
	 */
	public CurrencyHandler() {

	}

	/**
	 * @see {@link CurrencyHandler} reference.
	 */
	public CurrencyHandler currencyHandler;

	/**
	 * @param currencHandler
	 *            reference.
	 */
	public void nextHandler(final CurrencyHandler currencHandler) {
		this.currencyHandler = currencHandler;
	}

	/**
	 * @param amount
	 *            amount to be dispense.
	 */
	public abstract void dispense(long amount);

}
