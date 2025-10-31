import java.util.HashSet;

public class containsduplicate {


    public static boolean ContainsDuplicate(int[] arrVal) {

        HashSet<Integer> duplicatevalueseen = new HashSet();

        for (int i = 0; i < arrVal.length; i++) {

            if(!duplicatevalueseen.add(arrVal[i])) {
              return true;
            }
        }


        return false;
    }

    public static void main(String[] args) {


        int [] arr = {1,2,3,4, 1, 2 };

        Boolean returnValue = containsduplicate.ContainsDuplicate(arr);

        System.out.println("return value" + returnValue);

    }

}
