import java.util.*;

public class mathSolver {
    int factorial(int num) {
        int total = 1;
        while (num > 0) {
            total *= num;
            num--;
        }
        return total;
    }

    void runner() {
        // Detects char for correct calculation
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter Calcultaion Opeation - ");
        String a = sc.next();
        a = a.toUpperCase();
        char b = a.toCharArray()[0];
        // Decides what calculation is needed
        if (b == 'P') {
            System.out.println("Starting Permutation Calculation...");
            System.out.print("Enter N - ");
            int n = sc.nextInt();
            System.out.print("Enter R - ");
            int r = sc.nextInt();
            System.out.println("Equation = " + n + b + r);
            System.out.print("Continue? (Y/N) ");
            String c = sc.next();
            c = c.toUpperCase();
            char f = c.toCharArray()[0];
            if (f == 'Y') {
                sc.close();
                System.out.println("Locked Input");
                final int top = factorial(n);
                final int bottom = factorial(n-r);
                final int solution = top/bottom;
                System.out.println(solution);
            }
        }else if(b == 'C'){
            System.out.println("Starting Combination Calculation...");
            System.out.print("Enter N - ");
            int n = sc.nextInt();
            System.out.print("Enter R - ");
            int r = sc.nextInt();
            System.out.println("Equation = " + n + b + r);
            System.out.print("Continue? (Y/N) ");
            String c = sc.next();
            c = c.toUpperCase();
            char f = c.toCharArray()[0];
            if (f == 'Y') {
                sc.close();
                System.out.println("Locked Input");
                final int top = factorial(n);
                final int bottom = factorial(n-r);
                final int solution = top/bottom;
                System.out.println(solution);
            }
        }
        }else{
            System.out.println("Please enter a vaild operation. Valid operation are as follows. Permutaions | Cominations");
        }
    }
    public static void main(String[] args) {
        while(true){
        mathSolver solver = new mathSolver();
        solver.runner();
    }}

}