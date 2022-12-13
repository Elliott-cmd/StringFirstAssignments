package EMATH;
import java.math.BigInteger;
import java.util.*;
public class mathSolver {
    BigInteger factorial(int num) {
        BigInteger total = new BigInteger("1");
        while (num > 0) {

            total = total.multiply(new BigInteger(Integer.toString(num)));
            num--;
        }
        return total;
    }

    BigInteger permutation(int n, int r){
         BigInteger top = factorial(n);
         BigInteger bottom = factorial(n-r);
        BigInteger solution = top;
        solution = solution.divide(bottom);
        return solution;
    }
    BigInteger combination(int n, int r){
         BigInteger top = factorial(n);
         BigInteger bottom = factorial(n-r);
        bottom = bottom.multiply(factorial(r));
        BigInteger solution = top;
        solution = solution.divide(bottom);
        return solution;
    }
    BigInteger runner() {
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
                return permutation(n, r);
                

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

                return combination(n, r);
            }
        }else if(b == 'F'){
            System.out.println("Starting Factorial Calculation...");
            System.out.print("Enter Number - ");
            int n = sc.nextInt();
            System.out.println("Equation = " + n + "!");
            System.out.print("Continue? (Y/N) ");
            String c = sc.next();
            c = c.toUpperCase();
            char f = c.toCharArray()[0];
            if (f == 'Y') {
                sc.close();
                return factorial(n);
            }
        }else{
            sc.close();

            System.out.println("Please enter a vaild operation. Valid operation are as follows. Permutaions | Cominations"); 
        }
        sc.close();

        return new BigInteger("0"); 
    }

    public static void main(String[] args) {
        mathSolver solver = new mathSolver();
        System.out.println(solver.runner());
        
    }

}