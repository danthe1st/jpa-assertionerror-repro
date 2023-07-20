package io.github.danthe1st.spring_test;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class OtherEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private boolean something;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isSomething() {
		return something;
	}

	public void setSomething(boolean something) {
		this.something = something;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, something);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OtherEntity other = (OtherEntity) obj;
		return Objects.equals(id, other.id) && something == other.something;
	}

	@Override
	public String toString() {
		return "OtherEntity [id=" + id + ", something=" + something + "]";
	}

}
