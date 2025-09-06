import java.util.Scanner;

public class arrayproblem1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        double sum=0;
        for(int num=0;num<array.length;num++){
            sum += array[num];
        }

        double mean = sum/n ;

        System.out.println("sum of elemenets : "+sum);
        System.out.println("mean of array: "+mean);
    }
}
