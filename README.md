# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 설명

      * 사용자에게 ","로 구분된 n대의 자동차 이름과 시도할 횟수를 입력받아 각 자동차는 각각의 난수를 생성하고 
        기준값(4)과 비교하여 전진 또는 정지를 하고 그 기록과 우승자를 출력해주는 프로그램

## 참고사항

      * 정지 : 0에서 9 사이에서 RANDOM 값을 구한 후 RANDOM 값이 3 이하일 경우
      * 전진 : 0에서 9 사이에서 RANDOM 값을 구한 후 RANDOM 값이 4 이상일 경우
      * ex) RANDOM 값: 4 , RANDOM 값: 9 => 전진
      * ex) RANDOM 값: 0 , RANDOM 값: 3 => 정지
      * 우승 : 사용자가 입력한 시도할 횟수가 끝나고 가장 많이 전진한 자동차 ( 우승자는 1명 이상일 수 있다 )

## 구현 기능 목록

1. 자동차 1대 생성 & 전진 & 정지 기능
    * 유효성 체크 목록
        * 자동차 이름이 5자 초과인 경우
        * 자동차 이름이 null 인 경우


2. 자동차 N 대 생성 & N 대 전진 & N 대 정지 기능
    * 유효성 체크 목록
        * 각 자동차 1대에서 각각 유효성 체크


3. 레이싱 기능
    * 유효성 체크 목록
        * 레이싱에 참여할 자동차의 이름 리스트가 없을 경우
        * 레이싱을 시도할 횟수가 1 미만일 경우


4. 레이싱 결과 기능 구현


5. 사용자 입력받는 기능
    * 유효성 체크 목록
        * ","에 공백이 들어갈 경우 trim() 처리


6. 애플리케이션 실행 기능
