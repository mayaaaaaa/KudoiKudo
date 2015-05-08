package int_to_eng;
import java.util.Scanner;


public class IntToEng {
	 // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {
    	String eng = "";
    	if (10 <= n && n <= 19) { // ティーン
    		eng = teens(n);
    	} else if (n > 19) { // 20以上二桁
    		int tensInt = n/10;
    		if (tensInt > 1) eng = tens(tensInt);
    		if (n % 10 != 0) {
    			eng = eng + " " + ones(n-tensInt*10);
    		} 		
    	} else { // 一桁
    		eng = ones(n);
    	}
        return eng;
    }
    static String ones(int n){
    	if(n==1) return "one";
    	if(n==2) return "two";
    	if(n==3) return "three";
    	if(n==4) return "four";
    	if(n==5) return "five";
    	if(n==6) return "six";
    	if(n==7) return "seven";
    	if(n==8) return "eight";
    	if(n==9) return "nine";
    	return "";
    }
    static String tens(int n) {
    	if(n==2) return "twenty";
    	if(n==3) return "thirty";
    	if(n==4) return "fourty";
    	if(n==5) return "fifty";
    	if(n==6) return "sixty";
    	if(n==7) return "seventy";
    	if(n==8) return "eighty";
    	if(n==9) return "ninety";
    	return "";
    }
    static String teens(int n) {
    	if(n==11) return "eleven";
    	if(n==12) return "twelve";
    	if(n==13) return "thirteen";
    	if(n==14) return "fourteen";
    	if(n==15) return "fifteen";
    	if(n==16) return "sixteen";
    	if(n==17) return "seventeen";
    	if(n==18) return "eighteen";
    	if(n==19) return "nineteen";
    	return "ten";
    }
    
}
