package String;

public class file02 {
    public static void main(String[] args) {
        String name = "varun";
        name = name + " kumar";

        // System.out.println(name);

        // by default strings are immutable.
        // but what we want to make mutable string so there are two class stringbuffer and stringbuilder.

        // string buffer 

        StringBuffer sb = new StringBuffer();
        // System.out.println(sb.capacity()); // it provides a extra capacity of 16 character so we can easily add data to the string without changing its location.

        // System.out.println(sb.length());

        // sb.append(" reddy");
        // System.out.println(sb);

        // String str = sb; // we can not directly convert stringbuffer string into 

        // String str = sb.toString(); // this method is use to convert stringbuffer into string

        // sb.insert(0, "Java ");

        // System.out.println(sb);

        sb.setLength(30);
        System.out.println(sb.capacity());

        // stringbuffer is thread safe and string builder is not thread safe.

    }
}
