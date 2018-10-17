/**
 * Builder Patten demo.
 */
package com.core.rd.builderpattern;

/**
 * @author Shiva Kumar
 */
public class BuilderPattern {
    /**
     * building computer.
     * @param hardDisk
     *            hard disk size
     * @param ram
     *            size of ram
     * @param blueTooth
     *            status
     * @return computer. creates a computer object.
     */
    public Computer buildComputer(final String hardDisk, final String ram,
            final boolean blueTooth) {
        Computer computer = new Computer.ComputerBuilder(hardDisk, ram)
                .setBluetoothEnabled(blueTooth).build();
        return computer;

    }
}
