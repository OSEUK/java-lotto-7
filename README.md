# java-lotto-precourse

## 목적
- 간단한 로또 발매기를 구현한다.

## 기능 목록
- 로또의 숫자 범위 (1 ~ 45)
- 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑음
- 당첨 번호 추첨 시 중복되지 않는 6개의 숫자 + 보너스 번호 1개 뽑기
- 당첨은 1등부터 5등까지
- 일치한 번호에 따라 등수를 매기고, 당첨 금액이 정해져 있음.
- 로또 구입 금액을 입력하면, 구입 금액에 해당하는 만큼 로또 발행
- 로또 1장의 가격은 1,000원
- 당첨 번호와 보너스 번호는 입력받음
- 사용자가 구매한 로또 번호와 당첨 번호를 비교하여 당첨 내역 및 수익률을 출력
- 출력 후 게임 종료
- 예외 처리로 다시 입력 받도록

## 상세 기능 명세

### 사용자 입력
- [x] 로또 구입 금액 입력
- [x] 당첨 번호 입력
    - [x] 쉼표를 기준으로 구분
- [x] 보너스 번호 입력
- [x] 사용자 입력 단에서 null값 또는 파싱 검증

### 출력
- [x] 에러 메시지 출력 "[ERROR]"
- [x] 각 메시지 상수화
- [x] 수익률 출력


### 로또 (Lotto)
- [x] 리스트 입력 시 검증
- [x] 중복 여부도 검증

### 로또 구입 금액 (PurchasePrice)
- [x] 1,000원으로 나누어 떨어지는 지 검증

### 로또 발행
- [x] 6개의 숫자를 뽑음
- [x] 중복 여부 검사
-
### 당첨번호 추첨
- [x] 당첨 번호를 로또로 생성함
- [x] 보너스 번호를 생성하고 당첨 번호와 다른 지 검증
- [x] 추첨 후 일치 여부에 따라 등수를 선정
- [x] 당첨 결과 반환

### 게임 종료
- [x] 당첨 통계 출력
- [x] 수익률 계산
    - [x] 수익률은 소수점 둘 째 자리에서 반올림
    - [x] 구입 금액 대비 수익률을 계산

### 예외 처리
- [x] 공백문자가 입력되었을 경우
- [x] 숫자가 아닌 값이 입력되었을 경우
- [x] 1 ~ 45 내 숫자 범위가 아닌 값이 들어갔을 경우
- [x] 중복된 당첨 번호를 입력했을 경우
- [x] 1,000 원 단위로 나누어 떨어지지 않는 금액이 입력되었을 경우
