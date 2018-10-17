/**
 * Test cases.
 */
package com.core.rd.abstractfactorytest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

import com.core.rd.abstractfactory.AbstractFactory;
import com.core.rd.abstractfactory.AbstractFactoryDemo;

/**
 * @author Shiva_Donkena
 *test cases for the abstract factory with widgets button and checkbox.
 */
public class WidgetsTest {

    /**
     * Window OS name.
     */
    private static final String WINDOWS_OS = "Windows 10";
    /**
     * Unix OS name.
     */
    private static final String UNIX_OS = "UNIX";

    /**
     * To test the windows OS for creating the button and checkbox.
     */
    @Test
    public void testWindowsWidget() {
        AbstractFactoryDemo demo = new AbstractFactoryDemo();
        AbstractFactory widget = demo.configure(WINDOWS_OS);
        assertEquals(
                "Windows button is created!! Windows checkbox is created!!",
                widget.implementAbstractFactory());
    }

    /**
     * To test the UNIX OS for creating the button and checkbox.
     */
    @Test
    public void testUnixWidget() {
        AbstractFactoryDemo demo = new AbstractFactoryDemo();
        AbstractFactory widget = demo.configure(UNIX_OS);
        assertEquals("Unix Button is created!! Unix checkbox is created!!",
                widget.implementAbstractFactory());
    }

    /**
     * This is to test if we pass the null value as os type.
     */
    @Test
    public void testIsNull() {
        AbstractFactoryDemo demo = new AbstractFactoryDemo();
        assertNull(demo.configure(null));
    }
}

