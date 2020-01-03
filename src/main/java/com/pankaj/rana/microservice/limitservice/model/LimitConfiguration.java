package com.pankaj.rana.microservice.limitservice.model;

public class LimitConfiguration {
private  int minimum=1;

private int maximum=10;


public int getMinimum() {
	return minimum;
}


public void setMinimum(int minimum) {
	this.minimum = minimum;
}


public int getMaximum() {
	return maximum;
}


public void setMaximum(int maximum) {
	this.maximum = maximum;
}


public LimitConfiguration(int minimum, int maximum) {
	super();
	this.minimum = minimum;
	this.maximum = maximum;
}


protected LimitConfiguration() {
	super();
	// TODO Auto-generated constructor stub
}


}
