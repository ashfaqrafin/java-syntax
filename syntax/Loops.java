package syntax;
public class Loops {
    public static void main(String[] args){
        // for loop
        for(int i = 0; i < 5; i++){
            System.out.println(i);
        }
        
        // while loop
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
        
        // do while loop
        i = 0;
        do{
            System.out.println(i);
            i++;
        } while(i < 5);
        
        // for each loop
        int[] numbers = {1, 2, 3, 4, 5};
        for(int number : numbers){
            System.out.println(number);
        }
    }
    
}
