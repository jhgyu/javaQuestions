package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 1193 : 수학, 구현
 *
 * 문제
 * 무한히 큰 배열에 다음과 같이 분수들이 적혀있다.
 *
 * 1/1	1/2	1/3	1/4	1/5	…
 * 2/1	2/2	2/3	2/4	…	…
 * 3/1	3/2	3/3	…	…	…
 * 4/1	4/2	…	…	…	…
 * 5/1	…	…	…	…	…
 * …	…	…	…	…	…
 * 이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
 *
 * X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.
 *
 * @Class Name : Backjoon_1193.java
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

public class Backjoon_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        //해당 범위의 대각선 갯수, 해당 대각선 직전 대각선까지의 누적합
        int crossCount = 1; int prevCountSum = 0;

        while(true){
            //직전 대각선 누적합 + 해당 대각선 갯수를 이용한 범위 판별, 1->3->6->10->15->21...순으로 올라간다.
            if(inputNum<=(prevCountSum+crossCount)){
                //대각선이 홀수일 때 분모가 큰수부터 시작
                //분자는 대각선 갯수 - (입력숫자 - 직전 대각선 누적합 - 1)
                //분모는 입력숫자 - 직전 대각선 누적합
                /*
                쉽게 생각해서 X-prev_count_sum이 분모라면 현재 대각선의 개수에서 분모값을 빼주면 자연스레 분자 값이 되는 것이고,
                반대로 X-prev_count_sum이 분자라면 역으로 cross_count_count -(X-prev_count_sum)은 분모자 되겠죠.
                다만 대각선의 개수와 분자+분모의 합은 1의 차이가 나기 때문에 전체 수식에 +1을 해주어야 할 겁니다.

                분자와 분모는 반비례
                분자+분모 합이 대각선갯수+1
                분자나 분모중 하나는 입력 숫자 - 직전대각선 누적합
                분모를 입력 숫자 - 직전대각선 누적합이라 할 때
                대각선갯수+1 = 분자+(입력 숫자 - 직전대각선 누적합)
                분자 = 대각선갯수-(입력 숫자 - 직전대각선 누적합)+1
                분자 = 대각선갯수-(입력 숫자 - 직전대각선 누적합-1)

                 */
                if(crossCount%2==1){
                    System.out.println((crossCount - (inputNum - prevCountSum -1))+"/"+(inputNum - prevCountSum));
                    break;
                }
                //대각선이 짝수일 때 분모와 분자는 홀수의 반대
                else{
                    System.out.println((inputNum - prevCountSum)+"/"+(crossCount - (inputNum - prevCountSum -1)));
                    break;
                }
            }else{
                prevCountSum+=crossCount;
                crossCount++;
            }
        }

    }
}
