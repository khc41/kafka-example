package test.kafkaconsumer.consumer;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Properties;
import java.util.regex.Pattern;

@Component
@RequiredArgsConstructor
public class TestKafkaConsumer {

    public static Properties properties() {
        Properties kafkaProps = new Properties();
        kafkaProps.put("bootstrap.servers", "localhost:9092");
        kafkaProps.put("group.id", "group1");
        kafkaProps.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        kafkaProps.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        return kafkaProps;
    }

    public static void main(String[] args) {
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties());
//        consumer.subscribe(Collections.singletonList("test"));
        consumer.subscribe(Pattern.compile("test.*"));
        Duration timeout = Duration.ofMillis(100);
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(timeout);
            for (ConsumerRecord<String, String> record : records) {
                System.out.println("record.topic() = " + record.topic());
                System.out.println("record.key() = " + record.key());
                System.out.println("record.value() = " + record.value());

            }
        }
    }

}
