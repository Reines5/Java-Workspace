package kodlamaIO.entities;

import java.util.UUID;

public class Teacher {
	final private String id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public Teacher(String name) {
		this.name = name;
		id = UUID.randomUUID().toString();
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}

	
}
