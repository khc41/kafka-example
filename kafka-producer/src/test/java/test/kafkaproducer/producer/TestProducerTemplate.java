package test.kafkaproducer.producer;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestProducerTemplate {

    @Autowired
    private TestTemplateProducer testTemplateProducer;

    @Test
    void test() {
        testTemplateProducer.testSend();
    }
}