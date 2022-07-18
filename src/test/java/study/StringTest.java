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
    void generateNumbers(){
        List<Integer> collect = new Random().ints(1, 10)
                .distinct()
                .limit(3)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        List<BNumber> numberList = new ArrayList<>();
        for(int i =0 ; i< 3; i++){
            numberList.add(new BNumber(i,collect.get(i)));
        }
        System.out.println(collect);
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
}
