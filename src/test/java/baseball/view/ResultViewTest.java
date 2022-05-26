package baseball.view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultViewTest {
    private ResultView resultView = new ResultView();

    @Test
    void resultTest(){
        resultView.printResult("3S0B");
        resultView.printResult("0S0B");
        resultView.printResult("2S0B");
        resultView.printResult("0S2B");
        resultView.printResult("1S2B");
        resultView.printResult(null);

    }
}