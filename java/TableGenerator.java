public class TableGenerator {

    public static void main(String[] args) {
        args = new String[] {"2","3"};
        int rowSize = Integer.parseInt(args[0]);
        int columnSize= Integer.parseInt(args[1]);
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column <columnSize ; column++) {
                System.out.print("+---"); 
            }
            System.out.print("+");
            System.out.println();
            for (int column = 0; column <columnSize ; column++) {
                System.out.print("|   "); 
            }
            System.out.print("|");
            System.out.println();
        }
                        
        for (int column = 0; column <columnSize ; column++) {
            System.out.print("+---"); 
            }
                    System.out.print("+");
        }
    }
