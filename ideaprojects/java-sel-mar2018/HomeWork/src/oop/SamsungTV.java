package oop;

public class SamsungTV extends RemoteControl implements TV{

    public void controlDevice() {

        System.out.println("User should be able to control their TV remotely");

    }

    public void Screen() {

        System.out.println("TV screens should fulfil all the quality rquirements");
    }

    public void Picture() {

        System.out.println("Still and moving pictures");

    }

    public void Audio() {

        System.out.println("Audio");

    }

    public void Samsung3D(){

        System.out.println("Samsung 3D must beat Apple's TriDimention model to win more customers");
    }
}
