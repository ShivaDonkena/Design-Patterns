/**
 * FiftyHandler handler for ATM.
 */
package com.core.rd.chainresponsibility;

/**
 * @author Shiva Kumar
 */
public class FiftyHandler extends CurrencyHandler {
	/**
	 * fifty notes.
	 */
	private static final long NOTES_50 = 50;

	/**
	 * (non-Javadoc).
	 * @see com.core.chainspattern.CurrencyHandler#dispense(long)
	 */
	@Override
	public void dispense(final long amount) {
		long numberofNotesToBeDispatched = amount / NOTES_50;
		if (numberofNotesToBeDispatched > 0) {
			System.out.println(
					numberofNotesToBeDispatched
					+ " notes 50 are dispatched");
		}
		long pendingAmountToBeProcessed = amount % NOTES_50;

		if (pendingAmountToBeProcessed > 0) {
			currencyHandler.dispense(pendingAmountToBeProcessed);
		}
	}

}
