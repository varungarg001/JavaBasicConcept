package Arrays;

public class jaggedArray {
    public static void main(String[] args) {

        // we see in 2D array that 2d array have rows and columns and each column have some number of element but what is an array having row and column dows not have same number of element so we can done that through the 3d array.


        int nums[][] = new int[3][];

        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int)(Math.random()*100);
            }
        }

        for(int i[]:nums){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
