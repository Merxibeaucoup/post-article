package com.edgar.article.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Tag {
	
	
	@Column(name = "tag_name")
	private String name;

	public Tag(String name) {
		super();
		this.name = name;
	}
	
	public Tag() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Tag [name=" + name + "]";
	}
	
	

}
