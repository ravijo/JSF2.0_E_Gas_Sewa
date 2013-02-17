package org.ibm.tgmc.admin;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * 
 * @author TROJAN
 */
@ManagedBean(name = "userDetail")
@RequestScoped
public class UserDetailBean {

	private List<String> carsSmall;
	private String selectedCar;
	private final static String[] manufacturers;
	private final static String[] colors;
	private String model = "testtttt";

	static {
		colors = new String[10];
		colors[0] = "Black";
		colors[1] = "White";
		colors[2] = "Green";
		colors[3] = "Red";
		colors[4] = "Blue";
		colors[5] = "Orange";
		colors[6] = "Silver";
		colors[7] = "Yellow";
		colors[8] = "Brown";
		colors[9] = "Maroon";

		manufacturers = new String[10];
		manufacturers[0] = "Mercedes";
		manufacturers[1] = "BMW";
		manufacturers[2] = "Volvo";
		manufacturers[3] = "Audi";
		manufacturers[4] = "Renault";
		manufacturers[5] = "Opel";
		manufacturers[6] = "Volkswagen";
		manufacturers[7] = "Chrysler";
		manufacturers[8] = "Ferrari";
		manufacturers[9] = "Ford";
	}

	public UserDetailBean() {
		carsSmall = new ArrayList<String>();

		populateRandomCars(carsSmall, 9);
	}

	private void populateRandomCars(List<String> list, int size) {
		for (int i = 0; i < size; i++) {
			list.add((manufacturers[i] + ":" + colors[i] + ":"
					+ manufacturers[i] + ":" + colors[i]));
		}
	}

	public String getSelectedCar() {
		return selectedCar;
	}

	public void setSelectedCar(String selectedCar) {
		this.selectedCar = selectedCar;
	}

	@SuppressWarnings("rawtypes")
	public List getCarsSmall() {
		return carsSmall;
	}

	public void deleteCar() {
		carsSmall.remove(selectedCar);
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
}
