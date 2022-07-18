package study;

import baseball.BNumber;
import baseball.BaseBall;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }


    @Test
    void ballTest(){
        BNumber bn = new BNumber(0,3);

        assertThat(bn.checkBall(4)).isFalse();
        assertThat(bn.checkBall(3)).isTrue();
    }

    @Test
    void strikeTest(){
        BNumber bn = new BNumber(0,3);

        assertThat(bn.equals(new BNumber(0,3))).isTrue();
        assertThat(bn.equals(new BNumber(1,3))).isFalse();
    }

    @Test
    void baseBallTest(){
        BaseBall baseBall = new BaseBall();
        baseBall.generateNumbers(3);

        System.out.println(baseBall.getBNumbers());
    }

    @Test
    void calculateTest(){
        BaseBall baseBall =  new BaseBall();
        BaseBall baseBall2 =  new BaseBall();

        List<BNumber> list1 = new ArrayList<>();
        List<BNumber> list2 = new ArrayList<>();

        list1.add(new BNumber(0,1));
        list1.add(new BNumber(1,3));
        list1.add(new BNumber(2,4));

        list2.add(new BNumber(0,2));
        list2.add(new BNumber(1,4));
        list2.add(new BNumber(2,3));

        baseBall.setBNumbers(list1);
        baseBall2.setBNumbers(list2);

        System.out.println(baseBall.calculate(baseBall2));
    }
}
