package backjoon.complete;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 백준 11470번 :
 *
 * @Class Name : Backjoon_11470.java
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
//399+400-404+84-542
public class Backjoon_11470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String originExpression = "";
        String arithmeticExpression = "";
        String finalExpression = "";
        originExpression = sc.nextLine();

        boolean checker1 = Pattern.matches("^[-\\+0-9]*[0-9]$", originExpression);
        boolean checker2 = originExpression.length() <= 1000;
        boolean checker3 = (originExpression.charAt(0) != '0');
        boolean checker4 = !Pattern.matches("^.*(\\D)\\1.*$", originExpression);

        if (checker1 && checker2 && checker3 && checker4) {

            boolean originExpressionCheck = originExpression.charAt(0) != '-' && originExpression.charAt(0) != '+';

            if (originExpressionCheck) {
                arithmeticExpression = "+" + originExpression;
            }else{
                arithmeticExpression = originExpression;
            }

            // + 기호를 자를때는 '\\'사용
            //10+20-30+40-50
            String[] numberExpression = arithmeticExpression.split("\\D");
            String[] symbolExpression = arithmeticExpression.split("\\d");
            ArrayList<String> numberList = new ArrayList<String>();
            ArrayList<String> symbolList = new ArrayList<String>();
            ArrayList<String> symbolNumberList = new ArrayList<String>();

            for (String symbol : numberExpression) {
                if (!symbol.equals("")) {
                    numberList.add(symbol);
                }
            }
    /*        for(String symbol : symbolExpression){
                System.out.println(symbol);
            }*/

            for (String symbol : symbolExpression) {
                if (!symbol.equals("")) {
                    symbolList.add(symbol);
                }
            }
            //numberList와 symbolList의 size는 같기 때문에 어느 쪽을 사용해도 무관하다.
            for (int i = 0; i < numberList.size(); i++) {
                symbolNumberList.add(symbolList.get(i) + numberList.get(i));
            }

            for (int i = 0; i < symbolNumberList.size(); i++) {
                if (symbolNumberList.get(i).charAt(0) == '-') {
                    String editSymbolNumber = "";
                    String symbolNumber = symbolNumberList.get(i);

                    editSymbolNumber += symbolNumber.charAt(0);
                    for (int j = 1; j < symbolNumber.length(); j++) {
                        editSymbolNumber = editSymbolNumber + symbolNumber.charAt(j);
                        if (j != symbolNumber.length() - 1) {
                            editSymbolNumber += "+";
                        }
                    }
                    symbolNumberList.set(i, editSymbolNumber);
                }
            }

            for (String symbolNumber : symbolNumberList) {
                finalExpression += symbolNumber;
            }

            if (originExpressionCheck) {
                finalExpression = finalExpression.substring(1);
            }
            System.out.print(finalExpression);
        }
    }
}
