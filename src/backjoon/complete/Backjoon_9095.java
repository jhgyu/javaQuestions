package backjoon.complete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 9095 : 동적 프로그래밍
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 *
 * 조건
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
 *
 * @Class Name : Backjoon_9095.java
 * @Modification information
 *<pre>
 *     수정일      수정자             수정내용
 *    -------   --------    --------------------
 *    2021.09.14  Jhgyu             최초 생성
 *</pre>
 *
 * @author Jhgyu
 * @since 1.0
 * @version 1.0
 */

public class Backjoon_9095 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCnt = Integer.parseInt(br.readLine());
        //1부터 11까지 표현할 dp배열
        int[] dp = new int[11];

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int k=0;k<inputCnt;k++){
            int inputNum = Integer.parseInt(br.readLine());
            for(int i=4;i<=inputNum;i++){
                dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
            }
            System.out.println(dp[inputNum]);
        }

    }
}
