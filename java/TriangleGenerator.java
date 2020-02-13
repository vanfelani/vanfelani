
public class TriangleGenerator {
    public static void main(String[] args) {
        
        args = new String[] {"3"};
        int length = Integer.parseInt(args[0]);
        
        for (int i = 1; i <= length; i++) {
            for (int j = length; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");                
            
            }
            System.out.println();
        }
    }
    
}
