package Function_in_java;
class calculator {
    int add(int n1, int n2) {
        return n1 + n2;
    }

    int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    double add(double n1, int n2) {
        return n1 + n2;
    }
}

// this is called method overloading(multiple method have same name but different return type and number of arguments) 

class method_overloading {
    public static void main(String[] args) {
        calculator c1 = new calculator();

        System.out.println(c1.add(10, 50));

        System.out.println(c1.add(10.5,45));
    }
}
