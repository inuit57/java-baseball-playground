## [NEXTSTEP 플레이그라운드의 미션 진행 과정](https://github.com/next-step/nextstep-docs/blob/master/playground/README.md)

---
## 학습 효과를 높이기 위해 추천하는 미션 진행 방법

---
1. 피드백 강의 전까지 미션 진행 
> 피드백 강의 전까지 혼자 힘으로 미션 진행. 미션을 진행하면서 하나의 작업이 끝날 때 마다 add, commit
> 예를 들어 다음 숫자 야구 게임의 경우 0, 1, 2단계까지 구현을 완료한 후 push

![mission baseball](https://raw.githubusercontent.com/next-step/nextstep-docs/master/playground/images/mission_baseball.png)

---
2. 피드백 앞 단계까지 미션 구현을 완료한 후 피드백 강의를 학습한다.

---
3. Git 브랜치를 master 또는 main으로 변경한 후 피드백을 반영하기 위한 새로운 브랜치를 생성한 후 처음부터 다시 미션 구현을 도전한다.

```
git branch -a // 모든 로컬 브랜치 확인
git checkout master // 기본 브랜치가 master인 경우
git checkout main // 기본 브랜치가 main인 경우

git checkout -b 브랜치이름
ex) git checkout -b apply-feedback
```

# 구현 기능 정리 

## 게임 시작 전 준비
1) 서로 다른 숫자 3개 생성
- [x] 랜덤한 숫자 생성하기
- [x] 중복된 숫자가 없는지 검사하기 

2) 숫자 저장 방식 
- [x] String 문자열에 저장하기 ( indexOf 또는 contains 로 검사가능)

## 게임 진행 과정
1) 스트라이크 체크
- [ ] 같은 수가 같은 자리에 있는 경우 스트라이크로 취급한다. 볼과는 중복되지 않으며 우선시된다.
- [ ] 0 스트라이크의 경우 따로 표기하지 않는다.   
- [ ] 3 스트라이크의 경우 게임 종료 판정이 일어난다. 

2) 볼 체크 
- [ ] 같은 수가 다른 자리에 있는 경우 볼로 취급한다. 

3) 낫싱 체크 
- [ ] 같은 수가 전혀 없는 경우 낫싱으로 취급한다. 
- [ ] 0볼과 동일하다. 
