/**
 * interface for the widget button and checkbox implemantation.
 */
package com.core.rd.widgets;

import com.core.rd.button.Button;
import com.core.rd.checkbox.CheckBox;

/**
 * @author Shiva_Donkena
 */
public interface Widget {
    /**
     * @return button.
     */
    Button widgetButtonImplementation();

    /**
     * @return checkbox.
     */
    CheckBox widgetCheckBoxImplementation();
}
