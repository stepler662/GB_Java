package c1.lesson2;

public class MethodApp {

    public static final String TEMPLATE = "int = %d string = %s"; // константа, где %d - int, %s - string. final - переменная не может быть переопределена после ее создания

    public static void main(String[] args) {
        int v1 = multiplication(4, 10);
        int v2 = multiplication(5, 6);
        //int v3 = multiplication(v1, v2);

        System.out.println("v1 = " + v1 + " v2 = " + v2 + " v3 = " + multiplication(v1, v2));

        PrintUtil.printFormatted("string to format");

        System.out.printf(TEMPLATE, 10, "str");
        System.out.println();
        System.out.printf(TEMPLATE, 123, "st123123r");

    }

    public static int multiplication(int n1, int n2) {
        return n1 * n2;
    }

}
