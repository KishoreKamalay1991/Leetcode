
public class alphatobetavisainterview {

    public static int maxvalue(int[] alpha2beta, int[] beta2alpha, int missions) {

        int i = 0;
        int j = 0;
        int time = 0;

        for(int m =0; m < missions; m++) {

            while(i < alpha2beta.length && alpha2beta[i] < time) {
                i++;
            }
            time = alpha2beta[i] + 100;
            i++;

            System.out.println("i value " + i );

            while(j < beta2alpha.length && beta2alpha[j] < time) {
                j++;
            }
            time = beta2alpha[j] + 100;
            j++;
        }

        return  time;
    }

    public static void main(String[] args) {

        int[] alpha2beta = { 100, 200, 500};
        int[] beta2alpha = {99, 210, 450};
        int missions = 1;

        int maximum = maxvalue(alpha2beta, beta2alpha, missions);

        System.out.println("maximum " + maximum);

    }

}
