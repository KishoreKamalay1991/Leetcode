public class rearrangearrayelementsbysign {

    public static int[] rearrange(int[] arr) {

        int[] result = new int[arr.length];

        int evenindex = 0;
        int oddindex = 1;

       for(int num : arr) {

           if(num > 0) {
              result[evenindex] = num;
              evenindex = evenindex + 2;
           } else {
               result[oddindex]  = num;
               oddindex = oddindex + 2;
           }
       }

       return result;


    }

    public  static void main(String[] args) {

        int[] arr = {3,1,-2,-5,2,-4};
        int[] result =  rearrange(arr);

    }


}
