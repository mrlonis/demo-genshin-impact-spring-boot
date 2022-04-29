package com.mrlonis.genshinimpact;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DemoGenshinImpactSpringBootApplication.class)
@ActiveProfiles("test")
public class DemoGenshinImpactSpringBootApplicationTests {

    @Test
    public void contextLoads() {

    }
}
