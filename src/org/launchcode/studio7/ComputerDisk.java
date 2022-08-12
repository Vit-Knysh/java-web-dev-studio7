package org.launchcode.studio7;

public abstract class ComputerDisk extends BaseDisk{
    private boolean isInserted;

    public ComputerDisk(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
        this.isInserted = false;
    }

    public ComputerDisk(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
        this.isInserted = false;
    }

    public void insert() {
        this.isInserted = true;
    }

    public boolean isInserted() {
        return this.isInserted;
    }
}
