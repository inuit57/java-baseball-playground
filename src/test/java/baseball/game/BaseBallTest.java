package baseball.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallTest {

    private BaseBall baseBall = new BaseBall();

    @Test
    @DisplayName("숫자생성테스트:0~9")
    void createNumberRangeTest(){
        for(int i =0 ; i< 100; i++) {
            int num = baseBall.numberGenerator();
            //System.out.println("num = " + num);
            assertThat(num).isGreaterThanOrEqualTo(1);
            assertThat(num).isLessThanOrEqualTo(9);
        }
    }

    @Test
    @DisplayName("중복 숫자 검사")
    void generateNumberTest(){
        int length = 3;
        String number = baseBall.createNumber(length);
        System.out.println("number = " + number);

        assertThat(number.length()).isEqualTo(length);

        for(int i =0 ; i < number.length() ; i++){
            for(int j =i+1 ; j < number.length() ; j++){
                assertThat(number.charAt(i)).isNotEqualTo(number.charAt(j));
            }
        }
    }

}