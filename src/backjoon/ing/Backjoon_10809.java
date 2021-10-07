package backjoon.ing;

import java.io.*;

/**
 * 백준 10809 : 알파벳 찾기
 *
 * 문제
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 *
 * 출력
 * 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
 *
 * 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
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

public class Backjoon_10809 {
    public static void main(String[] args) throws IOException {
        //입력 장치
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String inputStr = br.readLine().toLowerCase();

        //배열 초기화
        int[] outputIntArr = new int[26];
        for(int i=0; i<outputIntArr.length; i++){
            outputIntArr[i] = -1;
        }

        for(int i=0; i<inputStr.length(); i++){
            char ch = inputStr.charAt(i);
            //outputIntArr 원소 값이 -1인 경우에만 변경
            if(outputIntArr[ch - 'a'] == -1){
                outputIntArr[ch - 'a'] = i;
            }
        }

        for(int output : outputIntArr){
            System.out.print(output+" ");
        }


    }
}
