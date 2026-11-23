package ArraysEnteros;

public class Ejercicio5Recursion {

    public int factorial(int n) {
        if (n <= 1) {
            return 1;
        }

        return n * factorial(n - 1);
        
    }

    public void main(String[] args) {
        System.out.println("0! = 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "! = " + factorial(i));
        }
    }
}
