//print rectangular pattern in java ...
public class Pattern {
    public static void main(String args[]) {
        int n = 4;
        int m = 8;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
