import java.math.*;
public class ExecutionTimes {

    public static int counter=0;
    public static int TIMES = 500;
    BigInteger reallyBig = new BigInteger("21028704410074");//MS needed for 20 times and 1 sample

    public static void main(String[] args0) {
        System.out.println("TOTAL TIME:....................." + linear(TIMES)+cuadrado(TIMES)+cubo(TIMES)+log(TIMES));
    }
    /*
     * This method calculates the total times needed to compute a linear algorithm
     */
    public static long linear(int n) {

        System.out.println("Linear algorithm......"+((n*(n+1))/2));
        return(((n*(n+1))/2));
    }
    /*
     * This method calculates the total times needed to compute a logarithmic algorithm
     */
    public static long log(int n) {
        int resultado=0;
        int cons = n;
        int ini = n;
        int aux=n;
           while(aux>=1) {
               while (ini >= 1) {
                   ini = ini / 2;
                   resultado++;
               }
               ini=cons-1;
               cons=ini;
               aux=aux-1;

           }


        System.out.println("Logarithmic algorithm......."+resultado);
        return resultado;
    }
    /*
     * This method calculates the total times needed to compute a quadratic algorithm
     */
    public static long cuadrado(int n) {
        int resultado=0;
        int i = 1;
        while(i<=n){
            resultado = resultado + (i*i);

            i++;
        }
        System.out.println("Quadratic algorithm........"+resultado);
        return resultado;
    }
    /*
     * This method calculates the total times needed to compute a cubic algorithm
     */
    public static long cubo(int n) {
        long resultado=0;
        int i = 1;
        while(i<=n){
            resultado = (resultado + (i*i*i));

            i++;
        }
        System.out.println("Cubic algorithm......."+resultado);
        return resultado;
    }

}

