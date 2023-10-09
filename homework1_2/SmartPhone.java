package src.homework1_2;

public class SmartPhone extends Phone {
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("SmartPhone is making a call to number: " + getPhoneName() + " " + getNumber() + " try to make a call to number " + phoneNumber);
    }
    @Override
    public void receiveCall(String callerPhoneNumber) {
        System.out.println("SmartPhone is receiving a call from: " + callerPhoneNumber);
    }
}