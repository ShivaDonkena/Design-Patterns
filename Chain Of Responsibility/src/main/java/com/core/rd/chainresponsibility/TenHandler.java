/**
 * Ten ruppe notes handler.
 */
package com.core.rd.chainresponsibility;

/**
 * @author Shiva Kumar
 *
 */
public class TenHandler extends CurrencyHandler {
	/**
	 * Ten ruppes notes handler.
	 */
	private static final long NOTES_10 = 10;

	/**
	 * (non-Javadoc).
	 * 
	 * @see com.core.chainspattern.CurrencyHandler#dispense(long)
	 */
	@Override
	public void dispense(final long amount) {
		long numberofNotesForDispatched = amount / NOTES_10;
		if (numberofNotesForDispatched > 0) {
			System.out.println(
					numberofNotesForDispatched +
					" notes 10 are dispatched");
		}
		long pendingAmountForProcessed = amount % NOTES_10;

		if (pendingAmountForProcessed > 0) {
			currencyHandler.dispense(pendingAmountForProcessed);
		}
	}

}
