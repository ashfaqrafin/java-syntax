package OOP.part1;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println(a + " " + b);

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "other name";

        A obj = new A("Rnadvsjhv");

        System.out.println(obj);

    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
