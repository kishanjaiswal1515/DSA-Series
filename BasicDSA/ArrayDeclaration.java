import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        
        //1st method  Declaration + Initialisation
        // In java Arrays are Objects

        int[] arr1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr1));

        //2nd Method  Declaration + Memory Allocation

        int[] arr2 = new int[5];
        System.out.println(Arrays.toString(arr2));

        //3rd method  Declaration + new with Initialization

        int[] arr3 = new int[]{12,13,11,14,15};
        System.out.println(Arrays.toString(arr3));

        //4th method   Array of Objects (1D)

        String[] names = new String[]{"kishan","raju","sachin","vimal"};
        System.out.println(Arrays.toString(names));

    }
}
