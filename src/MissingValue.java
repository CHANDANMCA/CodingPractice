public class MissingValue {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 7, 8};
        int n = 8;
        int expectedSum = (n * (n + 1)) / 2;
        int acutalValue = 0;
        for (int num : arr) {
            acutalValue += num;
        }
        int missing = expectedSum - acutalValue;
        System.out.println(missing);
    }
}
