package Adapter;

/**
 * Adapter Design Pattern Example In Java.
 * http://javabypatel.blogspot.in/2016/06/adapter-design-pattern-java.html 
 We have Socket which charges ApplePhone Mobile and we want same Socket to be used for
 SamsungPhone Mobile as well, We will make socket compatible.
 */
public class Main {

    public static void main(String[] args) {
        // ApplePhone Phone charges correctly
        ApplePhone appleMobile = new ApplePhoneImpl();
        ApplePhoneSocket.charge(appleMobile);
        
        // SamsungPhone Phone can't be charged with ApplePhone socket directly
        SamsungPhone samsungMobile = new SamsumgPhoneImpl();
        //SocketForAppleMobile.charge(samsungMobile); //It will not accept SamsungPhone charger

        // SamsungPhone Phone  using AppleSamsungPhoneAdapter, can be charged with ApplePhone socket
        AppleSamsungPhoneAdapter appleSamsungMobile = new AppleSamsungPhoneAdapter(samsungMobile);
        ApplePhoneSocket.charge(appleSamsungMobile); //It will charge now..
    }
}
