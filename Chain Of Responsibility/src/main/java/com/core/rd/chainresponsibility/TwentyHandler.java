/**
 * For Handling the twenty ruppes notes.
 */
package com.core.rd.chainresponsibility;

/**
 * @author Shiva Kumar For Handling the twenty ruppes notes.
 */
public class TwentyHandler extends CurrencyHandler {
	/**
	 * twenty ruppes notes.
	 */
	private static final long NOTES_20 = 20;

	/**
	 * (non-Javadoc).
	 * @see com.core.chainspattern.CurrencyHandler#dispense(long)
	 */
	@Override
	public void dispense(final long amount) {
		long numberofNotesForDispatched = amount / NOTES_20;
		if (numberofNotesForDispatched > 0) {
			System.out.println(
					numberofNotesForDispatched +
					" notes 20 are dispatched");
		}
		long pendingAmountForProcessed = amount % NOTES_20;
		if (pendingAmountForProcessed > 0) {
			currencyHandler.dispense(pendingAmountForProcessed);
		}
	}

}
