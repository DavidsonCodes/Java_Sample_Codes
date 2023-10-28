package Online_Code_Samples.Week2;

public class StaticAndInstanceMethods {

    public void print(){
        System.out.println("Instance Method Call");
    }
    public static void printStatic(){
        System.out.println("Static Method Call");
    }

    public static void main(String[] args) {
        StaticAndInstanceMethods victoria = new StaticAndInstanceMethods();
        victoria.print();
        printStatic();
    }
}

class Test{
    public static void main(String[] args) {
        StaticAndInstanceMethods.printStatic();
        System.out.println(Math.max(5,10));

    }
}
