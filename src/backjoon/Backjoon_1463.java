package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 1463번 : 동적 프로그래밍
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 *
 * 입력조건
 * 첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다.
 *
 * @Class Name : Backjoon_1463.java
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

public class Backjoon_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        //입력 최댓값을 1~1000000으로 설정
        int[] dp = new int[1000001];
        //1일때는 연산을 수행하지 않으므로 최솟값이 0
        dp[1] = 0;
        //dp[0]은 사용하지 않음, 배열에 해당하는 최솟값을 구하기 위함
        for(int i=2; i<=inputNum ; i++){
            //조건3의 1을 빼는 연산 처리, +1은 최솟값을 구하는 연산이 1번 늘어났음을 의미한다.
            dp[i] = dp[i-1] + 1;
            /*
            만약 입력받은수가 2의 배수일 경우
            이전 값에서 최솟값을 구하는 연산을 1번 늘린 결과와 2로 나눈 값의 연산에 최솟값 연산 +1값을 비교
            즉, 자신보다 1작은 숫자의 연산과 1/2숫자의 연산을 비교하는 것이다.
             */
            if(i%2 == 0) dp[i] = dp[i] < dp[i/2]+1 ? dp[i] : dp[i/2]+1;
            /*
            입력 받은 수가 3의 배수일 경우 1작은 숫자와 1/3숫자의 연산을 비교한다.
             */
            if(i%3 == 0) dp[i] = dp[i] < dp[i/3]+1 ? dp[i] : dp[i/3]+1;
        }

        System.out.println(dp[inputNum]);

    }
}
