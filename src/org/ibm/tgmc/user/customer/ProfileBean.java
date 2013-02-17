package org.ibm.tgmc.user.customer;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * 
 * @author TROJAN
 */
@ManagedBean(name = "profile")
@SessionScoped
public class ProfileBean {

	private String ufname;
	private String umname;
	private String ulname;
	private String ffname;
	private String fmname;
	private String flname;
	private String city = "Jabalpur";
	private String street = "Hall 1, C Block";
	private String email = "ravijo@iiitdmj.ac.in";

	/**
	 * @return the ufname
	 */
	public String getUfname() {
		return ufname;
	}

	/**
	 * @param ufname
	 *            the ufname to set
	 */
	public void setUfname(String ufname) {
		this.ufname = ufname;
	}

	/**
	 * @return the umname
	 */
	public String getUmname() {
		return umname;
	}

	/**
	 * @param umname
	 *            the umname to set
	 */
	public void setUmname(String umname) {
		this.umname = umname;
	}

	/**
	 * @return the ulname
	 */
	public String getUlname() {
		return ulname;
	}

	/**
	 * @param ulname
	 *            the ulname to set
	 */
	public void setUlname(String ulname) {
		this.ulname = ulname;
	}

	/**
	 * @return the ffname
	 */
	public String getFfname() {
		return ffname;
	}

	/**
	 * @param ffname
	 *            the ffname to set
	 */
	public void setFfname(String ffname) {
		this.ffname = ffname;
	}

	/**
	 * @return the fmname
	 */
	public String getFmname() {
		return fmname;
	}

	/**
	 * @param fmname
	 *            the fmname to set
	 */
	public void setFmname(String fmname) {
		this.fmname = fmname;
	}

	/**
	 * @return the flname
	 */
	public String getFlname() {
		return flname;
	}

	/**
	 * @param flname
	 *            the flname to set
	 */
	public void setFlname(String flname) {
		this.flname = flname;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
