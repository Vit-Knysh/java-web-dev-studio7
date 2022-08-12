package org.launchcode.studio7;

public class FloppyDisk extends ComputerDisk implements OpticalDisk{

    public FloppyDisk(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
    }

    public FloppyDisk(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
    }

    @Override
    public void spinDisk() {

    }

    @Override
    public void storeData(String data) {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
