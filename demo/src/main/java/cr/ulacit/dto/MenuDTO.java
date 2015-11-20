package cr.ulacit.dto;

import javax.xml.bind.annotation.XmlRootElement;
import cr.ulacit.model.MenuDish;

@XmlRootElement(name="menuDTO")
public class MenuDTO {
	private int id_menu;
	private MenuDish[] MenuDish;
	public MenuDTO(){
		super();
	}
	public MenuDTO(int id_menu, cr.ulacit.model.MenuDish[] menuDish) {
		super();
		this.id_menu = id_menu;
		MenuDish = menuDish;
	}
	public int getId_menu() {
		return id_menu;
	}
	public void setId_menu(int id_menu) {
		this.id_menu = id_menu;
	}
	public MenuDish[] getMenuDish() {
		return MenuDish;
	}
	public void setMenuDish(MenuDish[] menuDish) {
		MenuDish = menuDish;
	}
	@Override
	public String toString() {
		return "MenuDTO [id_menu=" + id_menu + "]";
	}
	
}
