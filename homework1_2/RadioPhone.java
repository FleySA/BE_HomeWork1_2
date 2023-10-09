package src.homework1_2;

public class RadioPhone extends Phone {
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("RadioPhone is making a call to number: " + phoneNumber);
    }

    @Override
    public void receiveCall(String callerPhoneNumber) {
        System.out.println("RadioPhone is receiving a call from: " + callerPhoneNumber);
    }
}
