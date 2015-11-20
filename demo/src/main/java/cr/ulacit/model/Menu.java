package cr.ulacit.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement(name="menu")
@Entity
@Table(name="menu")
public class Menu {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_menu", unique=true,nullable=false)
	private int id_menu;
	
	
	@ManyToOne
	@JoinColumn(name="employeeid_employee",nullable=false)
	@JsonIgnore
	private Employee Employee; //tabla employeeid_employee
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="Menu", cascade=CascadeType.ALL)
	private Set<MenuDish> MenuDish; 
	
	
	public int getId_menu() {
		return id_menu;
	}
	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}	
	public Employee getEmployee() {
		return Employee;
	}
	public void setEmployee(Employee Employee) {
		this.Employee = Employee;
	}
	public Set<MenuDish> getMenuDish() {
		return MenuDish;
	}
	public void setMenuDish(Set<MenuDish> MenuDish) {
		this.MenuDish = MenuDish;
	}
		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_menu;
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
		Menu other = (Menu) obj;
		if (id_menu != other.id_menu)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Menu [id_menu=" + id_menu + "]";
	}
	
	
}
