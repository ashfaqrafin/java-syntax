public class ExpectionHandling {
    public static void main(String[] args){
        int[] marks={97,96,98};

        try{
            System.out.println(marks[3]);
        } catch(Exception e){
            System.out.println("An error occured.");
        }
        
    }
    
}
