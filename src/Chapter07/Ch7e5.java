package Chapter07;

/**
 * Created by greteliis on 27.12.2016.
 */
public class Ch7e5 {

    public static void main(String[] args) {

        double x = 0.1;
        while (x <= 100.0) {
            check(x);
            x = x*10;
        }
        x = -0.1;
        while (x >= -100.0) {
            check(x);
            x = x*10;
        }

    }

    public static double factorial(double n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }


    public static double myExp(double x) {
        double sum = 1;
        double n = 25;
        for (int i = 1; i < n; i++) {
            sum += Math.pow(x, i) / factorial(i);
        }
        return sum;
    }

    public static double myExp2(double x) {
        double n = 100;
        double numerator = 1;                    //esimese murru lugeja 1
        double denominator = 1;                  //esimese murru nimetaja 1
        double sum = 1;                          //esimene summa on 0 + 1/1 = 1

        //nüüd järgnevad n-1 summat:
        for (int i = 1; i < n; i++){
            numerator = numerator * x;          //igal tsüklil on uus lugeja: eelmine lugeja * x, ehk:
                                                //i=1 : 1*x = x = x^1
                                                //i=2 : x*x = x^2
                                                //i=3 : x^2*x = x^3
            denominator = denominator * i;      //igal tsüklil on uus nimetaja: eelmine nimetaja * i, ehk:
                                                //i=1 : 1*1 = 1 = 1!
                                                //i=2 : 1*2 = 2 = 2!
                                                //i=3 : 2*3 = 6 = 3!
                                                //i=4 : 6*4 = 24 = 4!
            sum += numerator / denominator;     // igal tsüklil lisame summale saadud murru väärtuse
        }
        return sum;
    }

    public static void check(double x) {

       // int i = 1;
        //while (i <= 9) {
          //  double x = (double) i;

            System.out.println(x + "\t\t" + myExp(x) + "\t\t" + myExp2(x) + "\t\t" + Math.exp(x));

            //i = i + 1;
        }
    }


