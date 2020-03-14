package March14_2020;

public class CommonArray {
    public static void main(String[] args) {
        int[] arr1= {5, 4, 2, 1, 0};
        int[] arr2 = {2, 3, 4, 5, 1};
        commonArray(arr1, arr2);
        }

    public static void commonArray(int[]arr1, int[]arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
