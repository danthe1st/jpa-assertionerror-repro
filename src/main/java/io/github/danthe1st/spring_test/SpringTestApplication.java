package io.github.danthe1st.spring_test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
public class SpringTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplication.class, args);
	}
}

interface SomeEntityRepository extends CrudRepository<SomeEntity, SomeEntity.IdHolder> {
	List<SomeEntity> getAllByOther_Something(boolean something);
}
