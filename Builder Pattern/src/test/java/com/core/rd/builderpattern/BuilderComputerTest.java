/**
 * builder pattern test cases for computer building.
 */

package com.core.rd.builderpattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Shiva Kumar
 */
public class BuilderComputerTest {
    /**
     * Hard disk size.
     */
    private static final String HARD_DISK = "2TB";
    /**
     * Ram size.
     */
    private static final String RAM = "16GB";
    /**
     * blue tooth status.
     */
    private static final boolean IS_BLUETOOT_ENABLED = true;
    /**
     * computer object for testing.
     */
    private Computer computer;
    /**
     * Hard disk size.
     */
    private static final String HARD_DISK1 = "21TB";
    /**
     * @throws Exception
     *             {@link Exception}
     */
    @Before
    public void setUp() throws Exception {
        BuilderPattern builder = new BuilderPattern();
        computer = builder.buildComputer(HARD_DISK, RAM, IS_BLUETOOT_ENABLED);
    }

    /**
     * Test method for {@link com.core.rd.builderpattern
     * BuilderPattern#buildComputer (java.lang.String, java.lang.String,
     * boolean)}.
     */
    @Test
    public void testBuildComputer() {
        assertEquals(HARD_DISK, computer.getHDD());
        assertEquals(RAM, computer.getRAM());
        assertEquals(IS_BLUETOOT_ENABLED, computer.isBluetoothEnabled());
    }
    /**
     * test case to check with wrong hard disk.
     */
    @Test
    public void testBuildComputer1() {
        assertNotEquals(HARD_DISK1, computer.getHDD());
        assertEquals(RAM, computer.getRAM());
        assertEquals(IS_BLUETOOT_ENABLED, computer.isBluetoothEnabled());
    }

}
