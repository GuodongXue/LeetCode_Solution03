package DefangingAnIPAddress;

public class test {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String sb = DefangingAnIPAddress.defangIPaddr2(address);
        System.out.println(sb);
    }
}
