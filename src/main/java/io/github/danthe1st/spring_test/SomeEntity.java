package io.github.danthe1st.spring_test;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(SomeEntity.IdHolder.class)
public class SomeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Id
	@ManyToOne
	@JoinColumn(name = "other", insertable = false, updatable = false)
	private OtherEntity other;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public OtherEntity getOther() {
		return other;
	}

	public void setOther(OtherEntity other) {
		this.other = other;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, other);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SomeEntity other = (SomeEntity) obj;
		return Objects.equals(id, other.id) && Objects.equals(this.other, other.other);
	}

	@Override
	public String toString() {
		return "SomeEntity [id=" + id + ", other=" + other + "]";
	}

	public static class IdHolder {
		private Long id;
		private OtherEntity other;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public OtherEntity getOther() {
			return other;
		}

		public void setOther(OtherEntity other) {
			this.other = other;
		}

	}

}
