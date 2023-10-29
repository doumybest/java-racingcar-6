package racingcar;

public class Application {
    public static void main(String[] args) {
        /*
        기능 구현 목록 정리
        - 경주 할 자동차 이름을 입력받는 기능(, 기준으로 구분 + 값 오류검사)
        - 입력받은 값을 바탕으로 컬렉션을 만드는 기능
        - 시도할 횟수를 입력받는 기능(값 오류 검사)
        - 입력받은 값을 통해 레이싱을 실시하는 기능
          -> 랜덤값을 만들어내고 전진 or 제자리 정하는 기능
          -> 전진 or 제자리 정해진 값에 따라 이를 반복시행하는 기능
          -> 시행된 결과를 출력하는 기능
        */
        RacingGame rc = new RacingGame();
        rc.start();
    }
}
