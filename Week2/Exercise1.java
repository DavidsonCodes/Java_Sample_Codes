package Online_Code_Samples.Week2;

public class Exercise1 {
    public static void main(String[] args) {
        String first = "http://ingrydacademy.com/students";
        String protocol = first.substring(0, first.indexOf(':'));
        String host = first.substring(first.indexOf('i'), first.lastIndexOf('/'));
        String endpoint = first.substring(first.lastIndexOf('/') + 1);
        System.out.println(protocol);
        System.out.println(host);
        System.out.println(endpoint);
        String x = "";
        System.out.println();
    }
}
