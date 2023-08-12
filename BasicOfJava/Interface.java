package BasicOfJava;

interface Phone {
    void RingingPhone();
    void ChargingPhone();
}
interface SmartPhone{
    void Wifi();
    void Camera();
}
class TakeAllTogether implements Phone, SmartPhone{
    public void RingingPhone(){
        System.out.println("Phone is Ringing...");
    }
    public void ChargingPhone(){
        System.out.println("Phone is Charging...");
    }
    public void Wifi(){
        System.out.println("Phone's Wifi conn...");
    }
    public void Camera(){
        System.out.println("Phone's camera On ...");
    }
}
public class Interface {
    public static void main(String[] args) {
        TakeAllTogether on = new TakeAllTogether();
        on.RingingPhone();
        on.Camera();
        on.ChargingPhone();
        on.Wifi();

    }
}
