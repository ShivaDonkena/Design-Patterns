/**
 *Unix factory for Unix button and checkbox.
 */
package com.core.rd.widgets;

import com.core.rd.button.UnixButton;

import com.core.rd.checkbox.UnixCheckBox;

/**
 * @author Shiva_Donkena
 */
public class UnixFactory implements Widget {

    /**
     * @return {@link UnixButton}
     */
    public UnixButton widgetButtonImplementation() {

        return new UnixButton();
    }

    /**
     * @return {@link UnixCheckBox}
     */
    public UnixCheckBox widgetCheckBoxImplementation() {
        return new UnixCheckBox();
    }

}
