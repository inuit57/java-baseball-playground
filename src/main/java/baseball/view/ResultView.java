package baseball.view;

public class ResultView {

    /**
     작업 정리

     1) 기본 결과 출력
     - nSnB 형태로 들어온 입력 String 을
     "n 스트라이크 n 볼" 형태로 출력해준다.

     2) 승리 결과 판정
     - 3S0B 형태로 들어올 경우 승리 판정을 한다.
     - 그리고 게임을 다시 시작할 것인지 묻도록 한다.

     - 게임 다시 시작 여부의 입력 처리는 다른 곳에서 한다.

     */

    public boolean printResult(String result){
        String viewText = "";
        if(result == null || result.isEmpty()){
            return true;
        }
        int strike = result.charAt(0) - '0';
        if( strike > 0){
            viewText += (strike+"스트라이크");
        }
        int ball =  result.charAt(2) - '0';
        if( ball > 0){
            viewText += (ball +"볼");
        }

        if( strike == 0 &&  ball == 0){
            // 아웃 처리
            viewText = "아웃입니다.";
        }

        System.out.println(viewText);
        if("3S0B".equals(result)){
            //게임 승리
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료.");
            return false;
        }
        return true;
    }
}
