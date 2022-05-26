package baseball.game;

import lombok.Data;

import java.util.Random;

@Data
public class BaseBall {
    private String answer ;


    public BaseBall(){
        numberGenerator();
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
}
