package examples;

import java.text.NumberFormat;
import java.text.ParseException;

public class ParseTest {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        String s;
        Number num;
        s = "$45.67";
        // s = "hi mom";

        try {
            num = format.parse(s); // may generate exception
            System.out.println("Float value = " + num.floatValue());
        }
        catch (Exception b) {
        	System.err.println("Invalid string \"" + s + "\"");
        }
        catch (ParseException e) {
            System.err.println("Invalid string \"" + s + "\"");
        }
    }
}
