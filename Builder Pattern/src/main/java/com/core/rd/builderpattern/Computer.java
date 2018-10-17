/**
 * Builder pattern implementation.
 */
package com.core.rd.builderpattern;

/**
 * Computer class with harddisk, ram and bluetooth properties.
 * @author Shiva Kumar
 */
public final class Computer {

    /**
     * Hard disk value.
     */
    private String hardDisk;
    /**
     * Ram value.
     */
    private String ram;

    /**
     * status of bluetooth.
     */
    private boolean isBluetoothEnabled;

    /**
     * @return String HDD
     */
    public String getHDD() {
        return hardDisk;
    }

    /**
     * @return String ram value.
     */
    public String getRAM() {
        return ram;
    }

    /**
     * @return boolean buletooth status.
     */
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    /**
     * @param builder
     *            computer builder.
     */
    private Computer(final ComputerBuilder builder) {
        this.hardDisk = builder.hardDisk;
        this.ram = builder.ram;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    /**
     * @author Shiva_Donkena
     */
    public static class ComputerBuilder {
        /**
         * Hard disk value.
         */
        private String hardDisk;
        /**
         * Ram value.
         */
        private String ram;
        /**
         * status of bluetooth.
         */
        private boolean isBluetoothEnabled;

        /**
         * @param hdd
         *            String harddisk.
         * @param ramm
         *            String ram
         */
        public ComputerBuilder(final String hdd, final String ramm) {
            this.hardDisk = hdd;
            this.ram = ramm;
        }

        /**
         * @param isBluetoothEnabledd
         *            status.
         * @return ComputerBuilder.
         */
        public ComputerBuilder setBluetoothEnabled(
                final boolean isBluetoothEnabledd) {
            this.isBluetoothEnabled = isBluetoothEnabledd;
            return this;
        }

        /**
         * @return Computer.
         */
        public Computer build() {
            return new Computer(this);
        }

    }

}
