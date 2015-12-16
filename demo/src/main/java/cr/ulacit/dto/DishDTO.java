package cr.ulacit.dto;
import java.util.Arrays;

import javax.xml.bind.annotation.XmlRootElement;

import cr.ulacit.model.DishIngredients;
import cr.ulacit.model.MenuDish;


@XmlRootElement(name="dishDTO")
public class DishDTO {
	private int id_dish;
	private String name;
	private String size;
	private String description;
	private int timesserved;
	private MenuDish[] menuDish;
	private DishIngredients[] dishIngredients;
	
	public DishDTO(){
		super();
	}
	public DishDTO(int id_dish, String name, String size, String description, int timesserved,
			MenuDish[] menuDish, DishIngredients[] dishIngredients) {
		super();
		this.id_dish = id_dish;
		this.name = name;
		this.size = size;
		this.description = description;
		this.timesserved = timesserved;
		this.menuDish = menuDish;
		this.dishIngredients = dishIngredients;
	}
	public int getId_dish() {
		return id_dish;
	}

	public void setId_dish(int id_dish) {
		this.id_dish = id_dish;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTimesserved() {
		return timesserved;
	}
	public void setTimesserved(int timesserved) {
		this.timesserved = timesserved;
	}
	public MenuDish[] getMenuDish() {
		return menuDish;
	}
	public void setMenuDish(MenuDish[] menuDish) {
		this.menuDish = menuDish;
	}
	public DishIngredients[] getDishIngredients() {
		return dishIngredients;
	}
	public void setDishIngredients(DishIngredients[] dishIngredients) {
		this.dishIngredients = dishIngredients;
	}
	@Override
	public String toString() {
		return "DishDTO [id_dish=" + id_dish + ", name=" + name + ", size=" + size + ", description=" + description
				+ ", timesserved=" + timesserved + ", menuDish=" + Arrays.toString(menuDish) + ", dishIngredients="
				+ Arrays.toString(dishIngredients) + "]";
	}
}
