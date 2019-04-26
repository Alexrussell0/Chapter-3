public class Percentages {
    public static void main(String[] args){
        double a = 2.0;
        double b = 5.0;

        computePercentage(a, b);
    }
    public static void computePercentage(double a, double b){
        double percent = (a/b)*100;
        System.out.print(a + "is" + percent + "percent of " + b);

    }
}
