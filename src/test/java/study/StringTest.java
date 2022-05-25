package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split(){
        String[] splitTwo = "1,2".split(",");
        assertThat(splitTwo).contains("1","2");

        String[] splitOne = "1".split(",");
        assertThat(splitOne).containsExactly("1");
    }


}