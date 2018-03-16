package com.work;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "userData", eager = true)
@SessionScoped
public class UserData implements Serializable {
	private static final long serialVersionUID = 1L;
	private static Map<String, String> countryMap;
	private String data = "sample data";
	@ManagedProperty(value = "#{helloWorld}")
	private HelloWorld helloWorld;

	// must povide the setter method
	public void setHelloWorld(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}

	public String getHelloWorldMessage() {
		return this.helloWorld.getMessage();
	}

	public String showResult() {
		System.out.println("show Result method");
		return "result";
	}

	public String showNav() {
		return "page1";
	}

	public void updateData(ActionEvent e) {
		System.out.println("facets" + e.getComponent().getFacets());
		helloWorld.setMessage("Changed hello!!!");
		data = "Hello World";
		new BookLibraryService().createPatron("ZZZZZZZZZZZZ");
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}