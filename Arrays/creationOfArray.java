package Arrays;

public class creationOfArray {

    public static void main(String[] args) {
        int num[] = { 1, 4, 56, 4 };  // creation of array when we know the values will be present in array

        System.out.println(num.length); // length func is used to get the length of the array
        
        System.out.println(num[0]); // this is the way to fetch a particular element from the array.
        
        // in java , arrays indexing starts from 0.
        
        num[1] = 6; // in this way we make change in the array 
        
        // how to make array dynamic

        int num1[] = new int[4];   // by default value in array is 0.

        System.out.println(num1[0]);


    }  
    
}
