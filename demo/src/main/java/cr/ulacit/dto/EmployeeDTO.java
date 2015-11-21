package cr.ulacit.dto;

import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

import cr.ulacit.model.Menu;

@XmlRootElement(name="employeeDTO")
public class EmployeeDTO {
	private int id_employee;
	private String name;
	private String password;
	private Menu[] Menu;
	public EmployeeDTO(){
		super();
	}
	public EmployeeDTO(int id_employee, String name, String password,
			Menu[] menu) {
		super();
		this.id_employee = id_employee;
		this.name = name;
		this.password = password;
		Menu = menu;
	}
	public int getId_employee() {
		return id_employee;
	}
	public void setId_employee(int id_employee) {
		this.id_employee = id_employee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Menu[] getMenu() {
		return Menu;
	}
	public void setMenu(Menu[] menu) {
		Menu = menu;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id_employee=" + id_employee + ", name=" + name + ", password=" + password + ", Menu="
				+ Arrays.toString(Menu) + "]";
	}
	
	
}
