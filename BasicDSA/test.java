public class test {
    public static void main(String[] args) {
        int arr[] = {10,12,20,65,14,70};

        int greatest = arr[0];
        int greatestindex = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>greatest){
                greatest = arr[i];
                greatestindex = i;
            }
        }
        System.out.println("Greatest element : "+greatest);
        System.out.println("Index of greatest element : "+greatestindex);
    }
}
