package DefangingAnIPAddress;

public class DefangingAnIPAddress {
    public static String defangIPaddr(String address){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< address.length(); i++){
            if(address.charAt(i)=='.'){
                sb.append("[.]");
                continue;
            }
            sb.append(address.charAt(i));
        }
        return sb.toString();
    }
    public static String defangIPaddr2(String address){
        return address.replace(".","[.]");
    }
}
