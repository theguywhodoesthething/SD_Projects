package solutions;

public class Overflow {
    public static void main(String[] args) {
        int big = 2_147_483_647;
        int bigger = big + 1;

        System.out.println("Big:    " + big);
        System.out.println("Bigger: " + bigger);
    }
}
