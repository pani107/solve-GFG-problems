import java.util.Scanner;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String row = "* ".repeat(n);

        for (int i = 0; i < n; i++) {
            System.out.println(row);
        }
    }
}