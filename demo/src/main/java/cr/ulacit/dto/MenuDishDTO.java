package cr.ulacit.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="menuDishDTO")
public class MenuDishDTO {
	private int id_menudish;

	public int getId_menudish() {
		return id_menudish;
	}

	public void setId_menudish(int id_menudish) {
		this.id_menudish = id_menudish;
	}

	@Override
	public String toString() {
		return "MenuDishDTO [id_menudish=" + id_menudish + "]";
	}
	

}