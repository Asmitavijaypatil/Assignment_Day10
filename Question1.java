import java.util.Scanner;

 class FibnoSeries {
    private int n;
    
    public FibnoSeries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input: ");
        n = sc.nextInt();
    }

        public void getSeries() {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
        System.out.print(a + " ");
        int c = a + b;
            a = b;
            b = c;
        }
    }
 }
 public class Question1 {
    public static void main(String[] args) {
        FibnoSeries f = new FibnoSeries();
        f.getSeries();
        //System.out.println(f.getSeries(n));
 }
 }