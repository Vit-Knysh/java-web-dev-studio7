package org.launchcode.studio7;

public class LP extends BaseDisk implements OpticalDisk{
    public LP(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
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
//    Vinyl Disc

}
