public class nestedLoop {
    public static void main(String[] args) {
        //nested loop is a loop inside another loop
        // inner loop it always depends on outer loop
        for (int i = 0; i <=3; i++) {
            System.out.print(i );
            System.out.println(" ");
            for (int j = 0; j <=4 ; j++) {
              
                System.out.print(j+" ");
            }

        }
    }
}
