package org.ibm.tgmc.home;

import java.util.Map;
import java.util.TreeMap;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 
 * @author TROJAN
 */
@ManagedBean(name = "themeSwitcher")
@RequestScoped
public class ThemeSwitcherBean {

	private Map<String, String> themes;
	private String theme;

	// private GuestPreferences gp;
	//
	// public void setGp(GuestPreferences gp) {
	// this.gp = gp;
	// }

	public Map<String, String> getThemes() {
		return themes;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	@PostConstruct
	public void init() {
		// theme = gp.getTheme();

		themes = new TreeMap<String, String>();
		themes.put("Black-Tie", "black-tie");
		themes.put("Cupertino", "cupertino");
		themes.put("Excite-Bike", "excite-bike");
		themes.put("Pepper-Grinder", "pepper-grinder");
		themes.put("South-Street", "south-street");
		themes.put("UI-Lightness", "ui-lightness");
	}
}
