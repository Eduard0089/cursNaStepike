import java.util.Arrays;

public class SortirovkaMassivov {
    public static void main(String[] args) {
        int [] a1 = {1, 432, 543, 12, 475868, 113};
        int [] a2= {23, 1, 2, 4536, -213};
        Arrays.sort(a1);
        Arrays.sort(a2);
        int length3 = a1.length+ a2.length;
        int [] a3 = new int[length3];
        int indexA1 = 0;
        int indexA2 = 0;
        for (int i=0; i<length3; i++){
            if (indexA1==a1.length){
                a3[i]=a2[indexA2];
                indexA2++;
            } else if (indexA2==a2.length) {
                a3[i]=a1[indexA1];
                indexA1++;
            } else if (a1[indexA1]<=a2[indexA2]){
                a3[i]=a1[indexA1];
                indexA1++;
            } else if (a1[indexA1]>a2[indexA2]) {
                a3[i]=a2[indexA2];
                indexA2++;
            }
        }
        System.out.println(Arrays.toString(a3));
    }
}