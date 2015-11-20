package cr.ulacit.dto;
import javax.xml.bind.annotation.XmlRootElement;

import cr.ulacit.model.DishIngredients;
import cr.ulacit.model.MenuDish;


@XmlRootElement(name="dishDTO")
public class DishDTO {
	private int id_dish;
	private String name;
	private String size;
	private String description;
	private int totalcalories;
	private int count;
	private MenuDish[] menuDish;
	private DishIngredients[] dishIngredients;
	
	public DishDTO(){
		super();
	}
	public DishDTO(int id_dish, String name, String size, String description, int totalcalories, int count,
			MenuDish[] menuDish, DishIngredients[] dishIngredients) {
		super();
		this.id_dish = id_dish;
		this.name = name;
		this.size = size;
		this.description = description;
		this.totalcalories = totalcalories;
		this.count = count;
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

	public int getTotalcalories() {
		return totalcalories;
	}

	public void setTotalcalories(int totalcalories) {
		this.totalcalories = totalcalories;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
				+ ", totalcalories=" + totalcalories + ", count=" + count + "]";
	}
	
	
}
