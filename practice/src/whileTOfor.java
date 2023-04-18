/** M4 - EX2: Modify the following code such that
 * for statement is used instead of while statement:
 * -----------------------------------------------------
 * int a = 1;
 * while (a < 5) {
 *      System.out.println("YES");
 *      if (++a == 3)
 *           continue;
 *      System.out.println("a = " + a);
 * }
 * System.out.println("a = " + a);

 * ----------
 * OUTPUT:
 * ----------
 * YES (✓)
 * a = 2 (✓)
 * YES (✓)
 * YES
 * a = 4 (✓)
 * YES
 * a = 5 (✓)
 * a = 5
 * */

public class whileTOfor {
    public static void main(String[] args) {
        int a;
        for (a=1;a<5;a++) {
            System.out.println("YES");
            if (a == 3)
                continue;
            System.out.println("a = " + a);
        }
        System.out.println("a = " + a);
    }
}
