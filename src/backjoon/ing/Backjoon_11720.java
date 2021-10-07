package backjoon.ing;

import java.io.*;

/**
 * 백준 11720번 : 숫자의 합
 *
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 *
 * 출력
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 *
 * @Class Name : Backjoon_2839.java
 * @Modification information
 *<pre>
 *     수정일      수정자             수정내용
 *    -------   --------    --------------------
 *    2021.10.08  Jhgyu             최초 생성
 *</pre>
 *
 * @author Jhgyu
 * @since 1.0
 * @version 1.0
 */

public class Backjoon_11720 {
    public static void main(String[] args) throws IOException {
        //입,출력 장치
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //입력받을 숫자의 길이 지정
        int Strlen = Integer.parseInt(br.readLine());

        String inputNumStr = br.readLine();
        //설정한 숫자길이와 입력받은 숫자길이가 일치할 때 실행
        if(inputNumStr.length() == Strlen){
            String[] inputNumStrArr = inputNumStr.split("");
            int sum = 0;

            for(int j=0;j<inputNumStrArr.length;j++) {
                sum += Integer.parseInt(inputNumStrArr[j]);
            }

            bw.write(Integer.toString(sum));
            bw.newLine();
            bw.flush();
            bw.close();
        }
    }
}
