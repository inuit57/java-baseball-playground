package study;

import org.junit.jupiter.api.Test;

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

        System.out.println(collect);
    }
}
