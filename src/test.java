import java.util.Scanner;
public class test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int alsum = 0;
        int x = 0;
        do {
            System.out.println("종류 입력");
            String i = sc.next();
            int ess = 0;
            int am = 0;
            int ka = 0;
            int la = 0;

            switch (i){
                case  "에스프레소" :
                    ess++;
                    break;
                case  "아메리카노" :
                    am++;
                    break;
                case  "카푸치노" :
                    ka++;
                    break;
                case  "카페라떼" :
                    la++;
                    break;
            }

            System.out.println("개수 입력");
            int j = sc.nextInt();

            alsum = ess*j*1500 + ka*j*2500 + la*3000*j + am*j*2000;

            System.out.println("더 주문하시겠습니까?");
            String y = sc.next();
            if(y.equals("no"))
                break;
        }while(x == 0);

        System.out.println("총"+alsum+"원 입니다.");

    }
}
