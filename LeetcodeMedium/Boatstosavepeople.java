import java.util.Arrays;

public class Boatstosavepeople {

    public static int boadtstosave(int[] people, int limit) {


        int start = 0;
        int end = people.length - 1;
        int boats = 0;
        Arrays.sort(people);

        while(start <= end) {

            if(people[start] + people[end] <= limit) {
                  start++;
                  end--;
                  boats++;
            } else {
                end--;
                boats++;
            }
        }
        return boats;
    }

    public static void main(String[] args) {

        int[] people =  {1,2};

        int limit = 3;


        int numberofboats = boadtstosave(people, limit);

    }

}
