package backjoon;

/**
 * 백준 1296번 :
 *
 * @Class Name : Backjoon_1296.java
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

import java.util.Scanner;

public class Backjoon_1296 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String hero = null;
        int heroLoverCnt = 0;
        String[] lover;
        String humanName;
        int maxValue = -1;

        int L = 0;
        int O = 0;
        int V = 0;
        int E = 0;

        String checker;
        String trueLover = null;

        humanName = sc.next();
        if(humanName.length()<=20 && alphabetCheck(humanName)){
            //입력된 사람이름이 A-Z로 구성되어 있을 때
            hero = humanName.toUpperCase();
        }
        heroLoverCnt = sc.nextInt();

        //좋아하는 사람이(CNT)가 50 이하일 때 실행
        if(heroLoverCnt<=50){
            lover = new String[heroLoverCnt];

            for(int i=0;i<heroLoverCnt;i++){
                humanName = sc.next();
                //입력된 사람이름이 20자 이내일 때
                if(humanName.length()<=20 && alphabetCheck(humanName)){
                    //입력된 사람이름이 A-Z로 구성되어 있을 때
                        lover[i] = humanName.toUpperCase();
                }else{
                    //20자 이상일땐 공백지정
                    lover[i] = "";
                }
            }

            for(int i=0;i<heroLoverCnt;i++){
                L = 0;
                O = 0;
                V = 0;
                E = 0;
                //주인공과 연인의 이름을 더함
                checker = hero + lover[i];
                for(int j=0;j<checker.length();j++){
                    if(checker.charAt(j)=='L'){
                        L++;
                        continue;
                    }
                    else if(checker.charAt(j)=='O'){
                        O++;
                        continue;
                    }
                    else if(checker.charAt(j)=='V'){
                        V++;
                        continue;
                    }
                    else if(checker.charAt(j)=='E'){
                        E++;
                        continue;
                    }
                }
                int loveValue = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100;
                //맨 처음에는 트루러버에 맨 처음 러버를 저장

                if(loveValue > maxValue) {
                    trueLover = lover[i];
                    maxValue = loveValue;
                }
                //갯수가 같은 경우
                else if(loveValue == maxValue){
                    if(!lover[i].equals("")){
                        trueLover = trueLover.compareTo(lover[i]) < 0 ? trueLover : lover[i] ;
                    }
                }

            }
            System.out.println(trueLover);
        }
    }
    static boolean alphabetCheck(String name){
        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)>='A'&&name.charAt(i)<='Z'){
                return true;
            }else{
                return false;
            }
        }
        //오지 않는 값
        return true;
    }
}



