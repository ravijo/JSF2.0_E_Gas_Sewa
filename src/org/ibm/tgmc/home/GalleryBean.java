package org.ibm.tgmc.home;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 
 * @author TROJAN
 */
@ManagedBean(name = "gallery")
@RequestScoped
public class GalleryBean {

	private List<String> images;

	@PostConstruct
	public void init() {
		images = new ArrayList<String>();

		for (int i = 1; i <= 10; i++) {
			images.add("galleria" + i + ".jpg");
		}
	}

	public List<String> getImages() {
		return images;
	}
}
