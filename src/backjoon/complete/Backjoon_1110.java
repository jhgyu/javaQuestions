package backjoon.complete;

import java.io.*;

/**
 * 백준 1110 : 수학, 구현
 *
 * 문제
 * 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
 * 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 *
 * 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 *
 * 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 *
 * N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 *
 * 출력
 * 첫째 줄에 N의 사이클 길이를 출력한다.
 *
 * @Class Name : Backjoon_1110.java
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
public class Backjoon_1110 {
    public static void main(String[] args) throws IOException {
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputNum = br.readLine();
        int cycleCnt = 0;
        boolean cycleSwitch = true;
        if(inputNum.length()==1){
            inputNum = "0"+inputNum;
        }
        int startNum = Integer.parseInt(inputNum.substring(0,1));
        int endNum = Integer.parseInt(inputNum.substring(inputNum.length()-1));

        int sum = startNum+endNum;

        while(cycleSwitch){
            String endNumString = Integer.toString(endNum);
            String sumString = Integer.toString(sum);

            String nextNum = endNumString + sumString.substring(sumString.length()-1);

            if(nextNum.length()==1){
                nextNum = "0"+nextNum;
            }

            if(nextNum.equals(inputNum)){
                cycleCnt++;
                break;
            }else{
                cycleCnt++;
                startNum = Integer.parseInt(nextNum.substring(0,1));
                endNum = Integer.parseInt(nextNum.substring(nextNum.length()-1));
                sum = startNum+endNum;
            }
        }

        bw.write(Integer.toString(cycleCnt));
        bw.newLine();
        bw.flush();
        bw.close();*/

        //타 사이트에서 가져온 숏코딩
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int inputNum = Integer.parseInt(br.readLine());

        int cyclecnt = 0;
        int originNum = inputNum;

        do{
            //(inputNum % 10) * 10)은 일의 자리를 십의 자리로 만듬
            //((inputNum / 10) + (inputNum % 10)) % 10은 십의 자리와 일의 자리를 더한 뒤 그 숫자의 일의 자리를 구함
            inputNum = ((inputNum % 10) * 10) + (((inputNum / 10) + (inputNum % 10)) % 10);
            cyclecnt++;
        }while(inputNum != originNum);

        bw.write(Integer.toString(cyclecnt));
        bw.newLine();
        bw.flush();
        bw.close();
    }


}
