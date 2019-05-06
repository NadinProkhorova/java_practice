package arrayTwo;

public class Matrix {
    public static void main (String [] args){
        double [][] a = { { 1.0, 9.0, 3.1 },
                          { 0.2, 1.0, 2.8 },
                          { 3.7, 0.4, 1.0 } };

        for ( int i = 0; i < 3; i++ ){
            String s = "";

            for ( int j = 0; j < 3; j++) {
                s += ( "    " + a[i][j]);
            }

            System.out.println ( s );
        }
    }
}
