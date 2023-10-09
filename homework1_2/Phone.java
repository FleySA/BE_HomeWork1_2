package src.homework1_2;

public class Phone implements Callable {
    private String number;
    private String phoneName;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    public void makeCall(String phoneNumber) {
        System.out.println("Trying to make a call to number: " + phoneNumber);
    }
    public void receiveCall(String callerPhoneNumber) {
        System.out.println("Incoming call from: " + callerPhoneNumber);
    }
}