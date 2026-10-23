public class Warmup {
    public static void main(String[] args) {
        int evensums = sumOfEvens(new int[] { 1, 2, 3, 4, 5 });
        System.out.println(evensums);
        int largestnum = largestNum(new int[] { -5, -2 });
        System.out.println(largestnum);
        int vowels = countVowels("TungTungSAhUr");
        System.out.println(vowels);
    }

    static int sumOfEvens(int arr[]) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    static int largestNum(int[] arr) {

        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }

    static int countVowels(String letters) {
        int count = 0;

        for (char c : letters.toCharArray()) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

}
