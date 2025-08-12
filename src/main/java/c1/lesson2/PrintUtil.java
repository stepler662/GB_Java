package c1.lesson2;

public class PrintUtil {

    /**
     * Форматирует строку тремя * до и после
     *
     * @param str строка для форматирования
     */
    public static void printFormatted(String str) {
        System.out.println("***" + str + "***");
    }

    public static String GetFormatted(String str) {
        return "***" + str + "***";
    }

}
