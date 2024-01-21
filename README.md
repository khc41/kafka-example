# kafka-example
## 유의사항 
테스트 전에 localhost나 docker에 kafka가 설치되어 있어야 한다.

## 테스트 방법
1. kafka consumer 프로젝트 실행
2. kafka producer 프로젝트에서 TestProducerTest 테스트 실행 

producer에서 test topic에 hello라는 메시지를 보내면,
test topic을 구독하고 있는 consumer 프로젝트에서 메시지가 출력된다.
