package kodlamaIO.entities;

import java.util.UUID;

public class Course {
	final private String id;
	private String name;
	private Category category;
	private double price;
	private Teacher teacher;

	public Course(String name, Category category, double price, Teacher teacher) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.teacher = teacher;
		id = UUID.randomUUID().toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[" + name + " " + category.getName() + ", Fiyat:" + price + ", Öğretici:" + teacher.getName() + "]";
	}

	/*
	 * @Override public String toString() { //return String.format("%s %s %d %s %n",
	 * name, category.getName(), price, teacher.getName()); }
	 */

}
