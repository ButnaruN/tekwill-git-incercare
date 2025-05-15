import pack1and2.Class1;
import pack1and2.Class2;
import pack3and4.Class3;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Class1 object1 = new Class1();
        Class1 object2 = new Class1(6);

        int c = object1.printA();
        System.out.println("c="+c);

        System.out.println(object2);

        System.out.println(object2.a);

        Class2 object3 = new Class2();

        System.out.println(object3.a);

        Class3 objecttxt = new Class3();

        String c3 = objecttxt.printMsg();
    }
}