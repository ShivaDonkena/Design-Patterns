/**
 * Test class for ATM dispenser using chain responsibility.
 */
package com.core.rd.chainresponsibility;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.core.rd.exception.InvalidAmountException;

/**
 * @author Shiva Kumar This class test the ATM dispenser application.
 */
public class ATMDispenserTest {
	/**
	 * Invalid amount, not multiple of 10.
	 */
	private static final long INVALID_AMOUNT = 541;
	/**
	 * @see {@link ATMDispenseHandler}
	 */
	private ATMDispenseHandler atmHandler;

	/**
	 * Junit setUp method.
	 */
	@Before
	public void setUp() {
		atmHandler = new ATMDispenseHandler();
	}

	/**
	 * Exception rule defined.
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * @throws InvalidAmountException
	 *             {@link InvalidAmountException}
	 */
	@Test
	public void invalidAmountTest() throws InvalidAmountException {

		thrown.expect(InvalidAmountException.class);
		thrown.expectMessage("Amount should be in multiple number of 10");
		atmHandler.withdrawAmount(INVALID_AMOUNT);
	}

	/**
	 * @throws InvalidAmountException
	 *             {@link InvalidAmountException}
	 */
	@Test
	public void invalidNegativeAmountTest() throws InvalidAmountException {
		thrown.expect(InvalidAmountException.class);
		thrown.expectMessage("Amount should be only positive");
		atmHandler.withdrawAmount(0);
	}
}
