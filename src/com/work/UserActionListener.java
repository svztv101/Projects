package com.work;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class UserActionListener implements ActionListener {

	@Override
	public void processAction(ActionEvent arg0) throws AbortProcessingException {
		// access userData bean directly
		System.out.println(arg0.getComponent().getParent().getClientId());
		UserData userData = (UserData) FacesContext.getCurrentInstance()
				.getExternalContext().getSessionMap().get("userData");
		userData.setData("Hello Second Time");
	}
}