package com.myapp.struts;




import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends org.apache.struts.action.ActionForm {
	
	private String name;
	private String password;
	
	private int number;

		public String getName() {
		return name;
	}

		public void setName(String string) {
		name = string;
	}

	public int getNumber() {
		return number;
	}

		public void setNumber(int i) {
		number = i;
	}

		public LoginForm() {
		super();
	
	}
		public String getPassword() {
		return password;
	}

	
	public void setPassword(String password) {
		this.password = password;
	}

	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors errors = new ActionErrors();
		if (getName() == null || getName().length() < 1) {
			errors.add("name", new ActionMessage("error.name.required"));
			
		}
		return errors;
	}
}