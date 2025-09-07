public class arrayproblem2 {

    public static void main(String[] args) {
        int array[] = {33,34,65,12,15};

        int greatest = array[0];
        int greatestindex = 0;

        for(int i=1 ; i<array.length;i++){
            if (array[i]>greatest) {
                greatest = array[i];
                greatestindex = i;
            }    
        }
        
        System.out.println("greatest element is : "+greatest);
        System.out.println("index of greatest element is : "+greatestindex);
    }
}
