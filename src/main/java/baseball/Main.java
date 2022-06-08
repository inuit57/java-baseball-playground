package baseball;

import baseball.game.BaseBall;
import baseball.view.InputView;
import baseball.view.ResultView;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello world!");

        BaseBall baseBall = new BaseBall();

        baseBall.startGame();

    }
}
