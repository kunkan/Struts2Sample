//package com.kunal.tags;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.apache.struts2.components.Component;
//import org.apache.struts2.views.jsp.ComponentTagSupport;
//
//import com.opensymphony.xwork2.util.ValueStack;
//
//public class FormTag extends ComponentTagSupport {
//
//	protected String name;
//	protected String action;
//	protected String method;
//	protected String id;
//
//	@Override
//	public Component getBean(ValueStack stack, HttpServletRequest arg1,
//			HttpServletResponse arg2) {
//		return new Form(stack);
//	}
//
//	protected void populateParams() {
//		super.populateParams();
//		Form hello = (Form) component;
//		hello.setName(name);
//		hello.setAction(action);
//		hello.setMethod(method);
//		hello.setId(id);
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAction(String action) {
//		this.action = action;
//	}
//
//	public void setMethod(String method) {
//		this.method = method;
//	}
//
//	public void setId(String id) {
//		this.id = id;
//	}
//
//}
