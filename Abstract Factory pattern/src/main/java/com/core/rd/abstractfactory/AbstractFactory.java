/**
 *For implementing the abstract factory.
 */
package com.core.rd.abstractfactory;

import com.core.rd.button.Button;
import com.core.rd.checkbox.CheckBox;
import com.core.rd.widgets.Widget;

/**
 * AbstractFactory class for the button and checkbox implementation details.
 * @author Shiva_Donkena
 */
public class AbstractFactory {
    /**
     * button type.
     */
    private Button button;
    /**
     * Check box type.
     */
    private CheckBox checkBox;

    /**
     * @param widget constructor.
     */
    public AbstractFactory(final Widget widget) {
        this.button = widget.widgetButtonImplementation();
        this.checkBox = widget.widgetCheckBoxImplementation();
    }

    /**
     * @return String button and checkbox creation.
     */
    public String implementAbstractFactory() {
        return button.implementButton() + " " + checkBox.implementCheckBox();

    }
}
