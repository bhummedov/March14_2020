package March14_2020;
import java.util.Arrays;
public class RemoveArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,4,5};
        int[] arr2=new int[arr1.length];
        deldupl(arr1, arr2);
    }
    public static void deldupl(int[] arr1, int[] arr2){
        int k=0;
        boolean x=true;
        for (int i=0;i<arr1.length;i++){
            x=true;
            for (int j=i;j<arr1.length;j++){
                if (arr1[i]==arr1[j]&&i!=j){
                    x=false;
                }
            }
            if (x){
                arr2[k]=arr1[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
