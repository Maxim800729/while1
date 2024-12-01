//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int y = 10;
        int x = 10;
        for (y = 0; y < 10; y++) {
            for (x = 0; x < 10; x++) {

                if (x > 0 && x < 9 && y > 0 && y < 9) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");


                }
            }

            System.out.println();
        }
        System.out.println();


        for (int y1 = 0; y1 < 10; y1++) {
            for (int x1 = 0; x1 < y1 + 1; x1++) {
                if (x1 == 0 || x1 == y1 || y1 == 9) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10 - i; j++) {
                if (i == 0 || j == 0 || i == 9 - j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        System.out.println();


        int g = 10;
        int l = 19;
        for (int s = 0; s < g; s++) {
            for (int m = 0; m < l; m++) {

                if (s == 9 - m || s == 9 || m == 9 + s) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
        System.out.println();

        int g1 = 10;
        int l1 = 19;
        for (int s1 = 0; s1 < g1; s1++) {
            for (int m1 = 0; m1 < l1; m1++) {

                if (s1 == 9 - m1 || s1 == 9 || m1 == 9 + s1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }}
            System.out.println();
        }
        for (int k = 19; k > 10; k--) {
            for (int u = 0; u <= k - 1; u++) {
                //if (u == 1) {
                System.out.print("*");
                //} else {
                //System.out.print("0");
                //
            }
                System.out.println();

        }
            }
        }









