package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class Disk {
    private String name;
    private int storageCapacity;
    private int usedCapacity = 0;
    private int remainingCapacity;
    private String discType;
    private int maxSpeed;
    private ArrayList<String> contents;

    public Disk(String name, int storageCapacity, int remainingCapacity, String discType, int maxSpeed) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.remainingCapacity = this.storageCapacity;
        this.discType = discType;
        this.maxSpeed = maxSpeed;
       }

    public void writeData(int dataUsed, ArrayList<String> data) {
//        this.content is initialized with data
//        this.usedCapacity += dataUsed;
//        remainingCapacity is updated (remainingCapacity- dataUsed)
//        console message telling the user that the write work
    }

    public void showInfo() {
//        make a string literal displaying all of the fields of the disc
//        and write that to the console
    }
}
