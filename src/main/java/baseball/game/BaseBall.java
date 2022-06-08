package baseball.game;

import baseball.view.InputView;
import baseball.view.ResultView;
import lombok.Data;

import java.util.Random;

@Data
public class BaseBall {
    private String answer ;
    private InputView inputView;
    private ResultView resultView;

    public BaseBall(){
        this.answer = createNumber(3);
        this.inputView = new InputView();
        this.resultView = new ResultView();
    }

    public void startGame(){
        //System.out.println("answer : " + this.answer);
        while (checkResult()){
            this.answer = createNumber(3);
            //System.out.println("answer : " + this.answer);
        }
    }

    private boolean checkResult(){
        boolean flag = true;
        while(flag){
            String result =  judge(inputView.inputNumber());
            flag = resultView.printResult(result);
        }
        return inputView.inputNewGame();
    }

    public int numberGenerator() {
        return new Random().nextInt(9) + 1;
    }

    public String createNumber(int length){
        String number = String.valueOf(numberGenerator()); // 첫 숫자는 먼저 생성하기
        for(int i =1 ; i< length; i++){
            number = getNumber(number);
        }
        return number;
    }

    private String getNumber(String number) {
        int num = numberGenerator();
        while( number.contains(String.valueOf(num))){
            num = numberGenerator();
        }
        number += num;
        return number;
    }

    public String judge(String input){
        if(this.answer.equals(input)){ return "3S0B"; }

        int strike = 0 ;
        int ball = 0;

        for(int i =0 ; i< answer.length() ; i++){
            strike += strikeChk(input, strike, i);
            ball += ballChk(input, ball, i);
        }

        return strike+"S"+ball+"B";
    }

    private int ballChk(String input, int ball, int i) {
        int idx = answer.indexOf(String.valueOf(input.charAt(i)));
        if( idx >=0 && idx != i){
            return 1;
        }
        return 0;
    }

    private int strikeChk(String input, int strike, int i) {
        if(answer.charAt(i) == input.charAt(i)) return 1;
        return 0 ;
    }
}
