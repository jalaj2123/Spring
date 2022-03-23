package com.spring.annotation.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
public class Emp {
	@Value("Jalaj")
private String name;
	@Value("129")
	
private int id;
	@Value("#{myfriend}")
	private List<String> address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public Emp(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [name=" + name + ", id=" + id + ", address=" + address + "]";
}

}
