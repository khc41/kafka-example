package test.kafkaproducer.producer;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestKafkaProducer {
    private final KafkaProducer<String, String> producer;

    public void testSend() {
        ProducerRecord<String, String> record = new ProducerRecord<>("test", "hello", "world");
        try {
            producer.send(record);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
