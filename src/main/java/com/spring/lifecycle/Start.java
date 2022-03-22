package com.spring.lifecycle;

public class Start {
private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Start() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Start [price=" + price + "]";
}
public void init()
{
	System.out.println("INIT-METHOD");
}
public void destroy()
{
	System.out.println("DESTROY-METHOD");
}
}

