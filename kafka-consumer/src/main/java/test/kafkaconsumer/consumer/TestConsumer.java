package test.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer {
    @KafkaListener(topics = "test", groupId = "group1")
    public void listener(Object data) {
        System.out.println("data = " + data);
    }
}
