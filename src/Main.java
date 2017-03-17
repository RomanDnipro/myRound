public class Main {

    static double myRound(double n){

        //для положительных
        if (n >= 0.0) {
            if (n - (int) n < 0.5) {
                return (int) n;
            } else {
                return (int) n + 1;
            }

        //для отрицательных
        }else{
            if (n - (int) n > -0.5) {
                return (int) n;
            } else {
                return (int) n - 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(myRound(3.599));
    }
}
