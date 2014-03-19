package com.kunal.tags;

import java.io.IOException;
import java.io.Writer;

import org.apache.struts2.components.Component;

import com.opensymphony.xwork2.util.ValueStack;

public class Form extends Component {

	protected String name;

	protected String action;

	protected String method;
	protected String id;

	public Form(ValueStack stack) {
		super(stack);
	}

	public boolean start(Writer writer) {
		try {
			writer.write("<form id= " + id + " name=" + name + " action="
					+ action + ".action method=" + method + ">");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return true;
	}

	public boolean end(Writer writer, String Body) {
		try {
			writer.write("</form>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean usesBody() {
		return false;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
