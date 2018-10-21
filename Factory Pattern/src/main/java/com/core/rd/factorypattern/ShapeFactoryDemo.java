/**
 * This is example of the factory design pattern.
 * which deals with the shape of the circle or rectangle.
 */
package com.core.rd.factorypattern;

/**
 * @author Shiva_Donkena ShapeFactoryDemo class will will receive the command
 *         line argument as the type of shape.
 */
public final class ShapeFactoryDemo {

    /**
     * Default Constructor.
     */
    private ShapeFactoryDemo() {

    }

    /**
     * @param args
     *            command line arguments
     * @throws Exception
     *             arguments not proper exception
     */
    public static void main(final String[] args) {
        try {
            if (args.length != 1) {

                throw new Exception("Enter one command line argument");
            }
            // creating the object of the ShapeType.
            ShapeFactory shape = new ShapeFactory();
            Shape sh = shape.shapeType(args[0]);
            // call the draw method
            if (null == sh) {
                throw new Exception("Enter only  circle or rectangle");
            }
            System.out.println(sh.draw());
        } catch (Exception e) {
            // exception is raised when one argument is not passed as the input
            // during run
            System.out.println(e.getMessage());
        }
    }
}
