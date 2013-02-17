package org.ibm.tgmc.admin;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import org.primefaces.context.RequestContext;

/**
 * 
 * @author TROJAN
 */
@ManagedBean(name = "adminLogin")
@SessionScoped
public class LoginBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public void authUser(ActionEvent actionEvent) {
		RequestContext context = RequestContext.getCurrentInstance();
		FacesMessage msg = null;
		boolean loggedIn = false;

		if (username != null && username.equals("admin") && password != null
				&& password.equals("admin")) {
			loggedIn = true;
			msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome",
					username);
		} else {
			loggedIn = false;
			msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error",
					"Invalid credentials");
		}

		FacesContext.getCurrentInstance().addMessage(null, msg);
		context.addCallbackParam("loggedIn", loggedIn);
	}
}
