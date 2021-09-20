package backjoon.complete;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 백준 11047번 : 그리디 알고리즘
 *
 * 문제
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 *
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
 *
 * 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 *
 * 출력
 * 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
 *
 * @Class Name : Backjoon_11047.java
 * @Modification information
 *<pre>
 *     수정일      수정자             수정내용
 *    -------   --------    --------------------
 *    2021.09.20  Jhgyu             최초 생성
 *</pre>
 *
 * @author Jhgyu
 * @since 1.0
 * @version 1.0
 */



public class Backjoon_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int coinCnt = Integer.parseInt(st.nextToken());
        int coinAmount = Integer.parseInt(st.nextToken());
        int minNumOfCoin = 0;

        int[] coinValue = new int[coinCnt];
        for(int i=0;i<coinValue.length;i++){
            coinValue[i] = Integer.parseInt(br.readLine());
        }
        //배열의 마지막부터 처음까지 불러옴, >=임에 유의하자
        for(int i=coinValue.length-1;i>=0;i--){
            if(coinValue[i] <= coinAmount ){
                minNumOfCoin += (coinAmount/coinValue[i]);
                coinAmount %= coinValue[i];
            }
        }

        bw.write(Integer.toString(minNumOfCoin));
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
