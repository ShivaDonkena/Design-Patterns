/**
 * Widget factory for the WindowButton and WindowChechBox.
 */
package com.core.rd.widgets;

import com.core.rd.button.WindowButton;
import com.core.rd.checkbox.WindowChechBox;

/**
 * @author Shiva_Donkena
 */
public class WindowsFactory implements Widget {

    /**
     * @return {@link WindowButton}
     */
    public WindowButton widgetButtonImplementation() {
        // TODO Auto-generated method stub
        return new WindowButton();
    }

    /**
     * @return {@link WindowChechBox}
     */
    public WindowChechBox widgetCheckBoxImplementation() {
        // TODO Auto-generated method stub
        return new WindowChechBox();
    }

}
