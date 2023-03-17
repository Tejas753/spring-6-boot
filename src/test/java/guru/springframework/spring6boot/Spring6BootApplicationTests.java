package guru.springframework.spring6boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6BootApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}

}
