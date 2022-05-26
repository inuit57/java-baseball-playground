package baseball.view;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    private final InputView inputView = new InputView();

    @Test
    @DisplayName("입력값 테스트")
    void inputTest(){
        assertThat(inputView.inputCheck("356")).isTrue();
        assertThat(inputView.inputCheck("%%^")).isFalse();
        assertThat(inputView.inputCheck("3445")).isFalse();
    }
}