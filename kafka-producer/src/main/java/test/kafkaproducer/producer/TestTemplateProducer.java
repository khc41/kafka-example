package test.kafkaproducer.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestTemplateProducer {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    public void testSend() {
        kafkaTemplate.send("test", "hello");
    }
}
