package com.core.rd.factorypattern;

/**
 * @author Shiva_Donkena
 */
public class ShapeFactory {
    /**
     * constant circle.
     */
    private static final String CIRCLE = "circle";
    /**
     * constant rectangle.
     */
    private static final String RECTANGLE = "rectangle";

    /**
     * @param message
     *            type of shape.
     * @return type of shape object
     */
    public Shape shapeType(final String message) {
        Shape sh;
        switch (message.toLowerCase()) {
        case CIRCLE:
            sh = new Circle();
            break;
        case RECTANGLE:
            sh = new Rectangle();
            break;
        default:
            sh = null;
            break;
        }
        return sh;
    }
}
