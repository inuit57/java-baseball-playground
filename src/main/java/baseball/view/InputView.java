package baseball.view;

import java.util.Scanner;

public class InputView {

    private final Scanner scanner = new Scanner(System.in);
    private final int maxLen = 3;

    /**
     필요한 기능 정리

     0) 3글자 숫자 입력 받기
     1) 입력 값 검사
     2) 게임 새로 시작 여부 입력 처리
     */

    public String inputNumber(){
        System.out.print("숫자를 입력해 주세요 : ");
        String input = scanner.next();

        if(inputCheck(input)) return input;
        System.out.println("잘못된 값을 입력하셨습니다. 입력값 : " + input);
        return null ;
    }

    public boolean inputNewGame(){
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int input = scanner.nextInt();

        return input == 1;
    }

    protected boolean inputCheck(String input) {
        if(input.length() >3) return  false;

        try{
            int number = Integer.parseInt(input);
        }catch (NumberFormatException e){
            return false;
        }
        return true;
    }

}
