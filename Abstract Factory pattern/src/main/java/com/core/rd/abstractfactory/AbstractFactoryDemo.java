/**
 * main class for the abstract factory for UNIX and WINDOWS commands.
 */
package com.core.rd.abstractfactory;

import com.core.rd.widgets.UnixFactory;
import com.core.rd.widgets.Widget;
import com.core.rd.widgets.WindowsFactory;

/**
 * @author Shiva_Donkena
 */
public class AbstractFactoryDemo {
    /**
     * @param osType
     *            configure the os type.
     * @return AbstractFactory
     */
    public AbstractFactory configure(final String osType) {
        AbstractFactory widgetFactory = null;
        Widget widget;
        if (osType == null) {
            return null;
        } else if (osType.equalsIgnoreCase("Windows 10")) {
            widget = new WindowsFactory();
            widgetFactory = new AbstractFactory(widget);
        } else {
            widget = new UnixFactory();
            widgetFactory = new AbstractFactory(widget);
        }
        return widgetFactory;
    }
}
