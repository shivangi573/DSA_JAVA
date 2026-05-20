package bitwise_operators;

public class FindUniqueIn3Element {

    public static int getSingle(int[] arr) {

        int ones = 0, twos = 0, mask;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            twos |= ones & num;

            ones ^= num;

            mask = ~(ones & twos);

            ones &= mask;
            twos &= mask;
        }

        return ones;
    }

    public static void main(String[] args) {

        int[] arr = {1, 10, 1, 1};

        System.out.println(getSingle(arr));
    }
}