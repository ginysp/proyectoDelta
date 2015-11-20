package cr.ulacit.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;
@XmlRootElement(name="menuDish")
@Entity
@Table(name="menu_dish")
public class MenuDish {
	@Id
	@ManyToOne
	@JoinColumn(name="menuid_menu", nullable=false)
	@JsonIgnore
	private Menu Menu; //tabla menuid_menu
	
	@Id
	@ManyToOne
	@JoinColumn(name="dishid_dish", nullable=false)
	@JsonIgnore
	private Dish Dish; //tabla dishid_dish
	
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
	
}
