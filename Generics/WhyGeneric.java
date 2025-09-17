package Generics;

import java.util.ArrayList;

public class WhyGeneric {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();   // issue:type safety 
        arrayList.add("hello");
        arrayList.add(123);
        arrayList.add(3.14);

        String str =(String) arrayList.get(0);  // issue:manual casting

        // now the problem is user can enter any type of element, string,int,double or any type and we need to make the arraylist type safe

        // so to that we use Generics

        ArrayList<String> fruits = new ArrayList<>();
        
    }
}