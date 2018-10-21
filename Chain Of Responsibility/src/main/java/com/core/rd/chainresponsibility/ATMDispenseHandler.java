/**
 * class for ATM dispenser using chain responsibility.
 */
package com.core.rd.chainresponsibility;

import com.core.rd.exception.InvalidAmountException;

/**
 * @author Shiva Kumar ATM machine implementation.
 */
public class ATMDispenseHandler {
	/**
	 * @see {@link HundredHandler}.
	 */
	private HundredHandler hundredHandler;
	/**
	 * @see {@link FiftyHandler}.
	 */
	private FiftyHandler fiftyHandler;
	/**
	 * @see {@link TwentyHandler}.
	 */
	private TwentyHandler twentyHandler;
	/**
	 * @see {@link TenHandler}.
	 */
	private TenHandler tenHandler;

	/**
	 * Default constructor.
	 */

	public ATMDispenseHandler() {
		hundredHandler = new HundredHandler();
		fiftyHandler = new FiftyHandler();
		twentyHandler = new TwentyHandler();
		tenHandler = new TenHandler();
		hundredHandler.nextHandler(fiftyHandler);
		fiftyHandler.nextHandler(twentyHandler);
		twentyHandler.nextHandler(tenHandler);
	}

	/**
	 * @param amount
	 *            long amount value.
	 * @throws InvalidAmountException
	 *             {@link InvalidAmountException}
	 */
	public void withdrawAmount(final long amount)
			throws InvalidAmountException {
		final int multipleNumber = 10;
		if (amount % multipleNumber != 0) {
			throw new InvalidAmountException(
					"Amount should be" + " in multiple number of 10");
		} else if (amount <= 0) {
			throw new InvalidAmountException("Amount should be only positive");
		} else {
			hundredHandler.dispense(amount);
		}
	}

}
