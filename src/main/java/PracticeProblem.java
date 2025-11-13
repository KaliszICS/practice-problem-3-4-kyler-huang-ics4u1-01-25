import java.util.HashSet;

public class PracticeProblem {

    public static int[] recaman(int n) {
        // If 0 or negative, return empty array
        if (n <= 0) {
            return new int[0];
        }

        int[] result = new int[n + 1];  // include a(0)
        HashSet<Integer> seen = new HashSet<>();
        result[0] = 0;
        seen.add(0);

        generate(result, seen, 1, n);

        // Return from a(1) onward (exclude initial 0)
        int[] trimmed = new int[n];
        System.arraycopy(result, 1, trimmed, 0, n);
        return trimmed;
    }

    private static void generate(int[] result, HashSet<Integer> seen, int index, int n) {
        if (index > n) {
            return;
        }

        int prev = result[index - 1];
        int candidate = prev - index;

        if (candidate > 0 && !seen.contains(candidate)) {
            result[index] = candidate;
        } else {
            result[index] = prev + index;
        }

        seen.add(result[index]);

        generate(result, seen, index + 1, n);
    }

    // For manual verification
    public static void main(String[] args) {
        printArray(recaman(6));   // [1, 3, 6, 2, 7, 13]
        printArray(recaman(17));  // [1, 3, 6, 2, 7, 13, 20, 12, 21, 11, 22, 10, 23, 9, 24, 8, 25]
        printArray(recaman(20));  // [1, 3, 6, 2, 7, 13, 20, 12, 21, 11, 22, 10, 23, 9, 24, 8, 25, 43, 62, 42]
        printArray(recaman(1));   // [1]
        printArray(recaman(0));   // []
        printArray(recaman(-5));  // []
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
