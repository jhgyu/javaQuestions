package backjoon.complete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 백준 2750 : 수 정렬하기
 *
 * 문제
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 *
 * 출력
 * 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 * @Class Name : Backjoon_2750.java
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

public class Backjoon_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCnt = Integer.parseInt(br.readLine());
        int[] ascendingArr = new int[inputCnt];
        
        //값이 입력 될때마다 버블 정렬을 사용해서 오름차순으로 정렬
        for(int i=0; i<ascendingArr.length; i++){
            int inputNum = Integer.parseInt(br.readLine());
            ascendingArr[i] = inputNum;
            for(int j=i; j>0; j--){
                if(ascendingArr[j] < ascendingArr[j-1]){
                    ascendingArr[j-1] = ascendingArr[j-1] + ascendingArr[j];
                    ascendingArr[j] = ascendingArr[j-1] - ascendingArr[j];
                    ascendingArr[j-1] = ascendingArr[j-1] - ascendingArr[j];
                }
            }
        }

        for(int number : ascendingArr){
            System.out.println(number);
        }
    }
}
