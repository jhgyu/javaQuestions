package backjoon.complete;

import java.io.*;
import java.math.BigInteger;

/**
 * 백준 13706 : 제곱근
 *
 * 문제
 * 정수 N이 주어졌을 때, N의 제곱근을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 양의 정수 N이 주어진다. 정수 N의 제곱근은 항상 정수이며, N의 길이는 800자리를 넘지 않는다.
 *
 * 출력
 * 첫째 줄에 정수 N의 제곱근을 출력한다.
 *
 * @Class Name : Backjoon_13706.java
 * @Modification information
 *<pre>
 *     수정일      수정자             수정내용
 *    -------   --------    --------------------
 *    2021.09.19  Jhgyu             최초 생성
 *</pre>
 *
 * @author Jhgyu
 * @since 1.0
 * @version 1.0
 */

public class Backjoon_13706 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputNum = br.readLine();

        BigInteger inputNumToBigInt = new BigInteger(inputNum);
        BigInteger two = new BigInteger("2");
        BigInteger start = BigInteger.ONE;
        BigInteger end = new BigInteger(inputNum);
        BigInteger mid, checkNum;

        //start < end 일 때 종료
        while(start.compareTo(end) <= 0){
            mid = (start.add(end)).divide(two);
            checkNum = mid.multiply(mid);
            //checkNum == inputNum 일 때
            if(checkNum.compareTo(inputNumToBigInt) == 0){
                System.out.println(mid);
                break;
            }
            //start > end 일 때
            else if(checkNum.compareTo(inputNumToBigInt) > 0){
                end = mid.subtract(BigInteger.ONE);
            }
            else{
                start = mid.add(BigInteger.ONE);
            }
        }
    }
}
