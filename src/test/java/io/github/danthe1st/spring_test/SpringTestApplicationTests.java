package io.github.danthe1st.spring_test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class SpringTestApplicationTests {
	@Autowired
	private SomeEntityRepository repo;

	@Test
	void someQuery() {
		System.out.println(repo.getAllByOther_Something(false));
	}
}
