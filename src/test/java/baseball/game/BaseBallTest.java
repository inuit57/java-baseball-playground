package baseball.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseBallTest {

    private final BaseBall baseBall = new BaseBall();

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

    @Test
    void judgeTest(){
        baseBall.setAnswer("356");

        String win = baseBall.judge("356");
        assertThat(win).isEqualTo("3S");

        String twoBall = baseBall.judge("634");
        assertThat(twoBall).isEqualTo("0S2B");

        String threeBall = baseBall.judge("563");
        assertThat(threeBall).isEqualTo("0S3B");

        String S12B = baseBall.judge("365");
        assertThat(S12B).isEqualTo("1S2B");

        String twoStrike = baseBall.judge("354");
        assertThat(twoStrike).isEqualTo("2S0B");
    }

}