package temp_average;

public class temp {
    public static void main (String [] args) {
        int [] tempr = {25, 28, 31, 30, 31, 30, 27, 35};
        double avg;
        int sum = 0;
        int n = tempr.length;

        for (int i = 0; i < n; i++ ){
            sum += tempr[i];
        }

        avg = (double) sum/n;

        System.out.println(avg);

    }
}
