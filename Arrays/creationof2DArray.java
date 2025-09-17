package Arrays;

public class creationof2DArray {
    public static void main(String[] args) {
        int num[][] = new int[3][4];
        int random;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                random = (int) (Math.random() *10);
                num[i][j] = random;
            }
        }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print(num[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
           }
    }
}
