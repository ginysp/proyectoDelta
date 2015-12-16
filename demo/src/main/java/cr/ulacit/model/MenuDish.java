package cr.ulacit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
/*Contiene información del MenuDish y tiene dos relaciones otras dos clases Menu y Dish
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: Menu, Dish
 */
@XmlRootElement(name="menuDish")
@Entity
@Table(name="menu_dish")
public class MenuDish {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_menudish", unique=true, nullable=false)
	private int id_menudish;
	
	@ManyToOne
	@JoinColumn(name="menuid_menu", nullable=false)
	@JsonIgnore
	private Menu Menu; //tabla menuid_menu
	

	@ManyToOne
	@JoinColumn(name="dishid_dish", nullable=false)
	@JsonIgnore
	private Dish Dish; //tabla dishid_dish
	
	public int getId_menudish() {
		return id_menudish;
	}
	public void setId_menudish(int id_menudish) {
		this.id_menudish = id_menudish;
	}
	public Menu getMenu() {
		return Menu;
	}
	public void setMenu(Menu Menu) {
		this.Menu = Menu;
	}
	public Dish getDish() {
		return Dish;
	}
	public void setDish(Dish Dish) {
		this.Dish = Dish;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_menudish;
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
		MenuDish other = (MenuDish) obj;
		if (id_menudish != other.id_menudish)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "MenuDish [id_menudish=" + id_menudish + "]";
	}
	
}
