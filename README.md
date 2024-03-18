# java 기초부터 다시 하기
### setting
- java 17
- spring boot 3.x

### gradle Lombok 에러 수정
- 문제 상황
  -> 올바른 코드인데 생성자를 호출 못 하는 에러 발생
  > 구글링을 통하여 gradle 설정을 수정하여 오류를 해경해야 한다는 것을 발변 
``` 
implementation 'org.projectlombok:lombok' 주석 처리
``` 
> 아래 부분 추가 적용으로 해경
```
  compileOnly 'org.projectlombok:lombok'
  annotationProcessor 'org.projectlombok:lombok'
```