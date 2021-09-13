package backjoon;

/**
 * 백준 2839번 :
 *
 * @Class Name : Backjoon_2839.java
 * @Modification information
 *<pre>
 *     수정일      수정자             수정내용
 *    -------   --------    --------------------
 *    2021.08.10  Jhgyu             최초 생성
 *</pre>
 *
 * @author Jhgyu
 * @since 1.0
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon_2839 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugarBag = Integer.parseInt(br.readLine());
        //Scanner sc = new Scanner(System.in);
        //int sugarBag = sc.nextInt();
        //int deliverySugarBag = 0;

        /*if(sugarBag>=3 && sugarBag<=5000){
            while(sugarBag > 0){
                if(sugarBag % 5 == 0){
                    sugarBag -=5;
                    deliverySugarBag++;
                }

                else if(sugarBag % 3 == 0){
                    sugarBag -=3;
                    deliverySugarBag++;
                }

                else if(sugarBag > 5){
                    sugarBag -= 5;
                    deliverySugarBag++;
                }

                else{
                    deliverySugarBag = -1;
                    break;
                }
            }
            System.out.println(deliverySugarBag);
        }*/

        /*while(sugarBag>=0){
            if(sugarBag % 5 == 0){
                deliverySugarBag += sugarBag / 5;
                System.out.println(deliverySugarBag);
                System.exit(0);
            }
            sugarBag -= 3;
            deliverySugarBag++;
        }
        deliverySugarBag = -1;
        System.out.println(deliverySugarBag);*/

        if (sugarBag == 4 || sugarBag == 7) {
            System.out.println(-1);
        }
        else if (sugarBag % 5 == 0) {
            System.out.println(sugarBag / 5);
        }
        else if (sugarBag % 5 == 1 || sugarBag % 5 == 3) {
            System.out.println((sugarBag / 5) + 1);
        }
        else if (sugarBag % 5 == 2 || sugarBag % 5 == 4) {
            System.out.println((sugarBag / 5) + 2);
        }
    }
}
