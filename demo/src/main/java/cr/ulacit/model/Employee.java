package cr.ulacit.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
/*Contiene información de los Employee y tiene una relación con la clase Menu
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: Menu
 */
@XmlRootElement
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_employee", unique = true, nullable = false)
	private int id_employee;
	
	@Column(name = "name", length = 75)
	private String name;
	
	@Column(name = "password", length = 100)
	private String password;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="Employee", cascade=CascadeType.ALL)
	private Set< Menu> Menu;
	
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
	public Set<Menu> getMenu() {
		return Menu;
	}
	public void setMenu(Set<Menu> Menu) {
		this.Menu = Menu;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_employee;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id_employee != other.id_employee)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [id_employee=" + id_employee + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
}
