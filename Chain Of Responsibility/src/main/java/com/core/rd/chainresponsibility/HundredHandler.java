/**
 * Hundred ruppes handler for ATM.
 */
package com.core.rd.chainresponsibility;

/**
 * @author Shiva Kumar Hundred ruppes handler for ATM.
 */
public class HundredHandler extends CurrencyHandler {
	/**
	 * 100 Rs notes.
	 */
	private static final long NOTES_100 = 100;

	/**
	 * (non-Javadoc).
	 * @see com.core.chainspattern.CurrencyHandler#dispense(long)
	 */
	@Override
	public void dispense(final long amount) {
		long numberofNotesToBeDispatched = amount / NOTES_100;
		if (numberofNotesToBeDispatched > 0) {
			System.out.println(
					numberofNotesToBeDispatched +
					" notes 100 are dispatched");
		}
		long pendingAmountToBeProcessed = amount % NOTES_100;
		if (pendingAmountToBeProcessed > 0) {
			currencyHandler.dispense(pendingAmountToBeProcessed);
		}
	}

}
