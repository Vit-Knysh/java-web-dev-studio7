package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD myCD = new CD();
        DVD myDVD = new DVD("For Data");

        myCD.spinDisk();
        myDVD.spinDisk();

        // TODO: Call each CD and DVD method to verify that they work as expected.
        myCD.writeData("Some data added.");
        System.out.println(myCD.readData());

    }
}
