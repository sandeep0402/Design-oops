package Adapter;

public class ApplePhoneSocket {

    public static void charge(ApplePhone apple) {
        System.out.println("It is not correct but say: Start Electricity at home");
        apple.charge();
        System.out.println("It is not correct but say: End Electricity at home");
    }
}
