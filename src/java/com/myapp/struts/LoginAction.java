package com.myapp.struts;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public class LoginAction extends org.apache.struts.action.Action {


	private static final String SUCCESS = "success";

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		
		LoginForm lf = (LoginForm) form;
		String name = lf.getName();
		String password = lf.getPassword();
		
		return mapping.findForward(SUCCESS);
	}
}
