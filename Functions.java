public class Functions {
    public static void greet(){
        System.out.println("Hello!"); 
    }
    public static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        greet();
        System.err.println(add(5,8));
    }
}
