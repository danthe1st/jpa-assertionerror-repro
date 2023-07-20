package io.github.danthe1st.spring_test;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface SomeEntityRepository extends CrudRepository<SomeEntity, SomeEntity.IdHolder> {
	List<SomeEntity> getAllByOther_Something(boolean something);
}