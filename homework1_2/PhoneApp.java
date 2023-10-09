package src.homework1_2;



public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setPhoneName("MyPhone");
        phone.setNumber("1234567890");
        System.out.println("Phone name: " + phone.getPhoneName());

        phone.makeCall("987654321");
        phone.receiveCall("John Doe");

        ButtonPhone buttonPhone = new ButtonPhone();
        buttonPhone.setPhoneName("ButtonPhone");
        buttonPhone.setNumber("12345");
        buttonPhone.makeCall("987654321");
        buttonPhone.receiveCall("Sergey");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setPhoneName("SmartPhone");
        smartPhone.setNumber("54321");
        smartPhone.makeCall("123456789");
        smartPhone.receiveCall("Alexandr");

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setPhoneName("RadioPhone");
        radioPhone.setNumber("67890");
        radioPhone.makeCall("9876543210");
        radioPhone.receiveCall("Natali");
    }

}