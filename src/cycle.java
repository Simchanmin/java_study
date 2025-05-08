import java.util.Scanner;
public class cycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int sum = 0;
        while(i<=10){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);

    }
}
