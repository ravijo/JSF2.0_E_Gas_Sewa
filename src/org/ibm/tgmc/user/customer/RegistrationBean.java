package org.ibm.tgmc.user.customer;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

/**
 * 
 * @author TROJAN
 */
@ManagedBean(name = "register")
@RequestScoped
public class RegistrationBean {

	private String txt;

	public List<String> suggestion(String query) {
		List<String> results = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {
			results.add(query + i);
		}

		return results;
	}

	public void register(ActionEvent actionEvent) {

	}

	/**
	 * @return the txt
	 */
	public String getTxt() {
		return txt;
	}

	/**
	 * @param txt
	 *            the txt to set
	 */
	public void setTxt(String txt) {
		this.txt = txt;
	}

}
