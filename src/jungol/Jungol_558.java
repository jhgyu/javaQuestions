package jungol;

import java.util.Scanner;

/**
 * 정올 558번 : 100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가
 * 0이 입력되면 0을 제외하고 그 때까지 입력된 정수를 가장 나중에 입력된 정수부터 차레대로
 * 출력하는 프로그램을 작성
 * @Class Name : Jungol_558.java
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
public class Jungol_558 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arrInt[] = new int[100];            //저장될 정수 배열
        int inputNum;                           //입력 정수

        //정수를 입력하여 배열에 저장하되 0이 입력될 시 반복문 중단
        for(int i=0;i<arrInt.length;i++){
            inputNum = sc.nextInt();
            arrInt[arrInt.length-(i+1)] = inputNum;
            if(inputNum==0) {
                for(int outputNum : arrInt){
                    if(outputNum==0){
                        continue;
                    }else{
                        System.out.print(outputNum+" ");
                    }
                }
                break;
            }
        }
    }
}
