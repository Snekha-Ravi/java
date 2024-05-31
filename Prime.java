import java.util.Arrays;

public class Prime {

    public static void main(String[] args) {
        int[] array = {28, 12, 30, 7, 15, 12, 28};
        sortArrayByMinPrimeFactor(array);
        System.out.println(Arrays.toString(array));
    }

    
    public static void sortArrayByMinPrimeFactor(int[] array) {
   
        Integer[] integerArray = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            integerArray[i] = array[i];
        }
        
       
        Arrays.sort(integerArray, (a, b) -> {
            int minFactorA = minPrimeFactor(a);
            int minFactorB = minPrimeFactor(b);
            if (minFactorA != minFactorB) {
                return Integer.compare(minFactorA, minFactorB);
            } else {
                return Integer.compare(a, b);
            }
        });
        
       
        for (int i = 0; i < array.length; i++) {
            array[i] = integerArray[i];
        }
    }

 
    public static int minPrimeFactor(int n) {
        if (n <= 1) return n;
        if (n % 2 == 0) return 2;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return i;
        }
        return n;
    }
}
