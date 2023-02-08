package com.prog;

public class Prog03 {
    
    public static void main(String[] args) {
        System.out.println(solution(2,3));
    }
    
    public static int solution(int num1, int num2) {
        int answer = 0;
        if(0 <= num1 && num1 <= 100 && 0 <= num2 && num2 <= 100){
            answer = num1 * num2;
        }        
        return answer;
    }

}
