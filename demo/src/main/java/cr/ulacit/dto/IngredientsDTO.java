package cr.ulacit.dto;

import javax.xml.bind.annotation.XmlRootElement;
import cr.ulacit.model.DishIngredients;

@XmlRootElement(name="ingredientsDTO")
public class IngredientsDTO {
	private int id_ingredient;
	private String name;
	private int calories;
	private DishIngredients[] DishIngredients;
	public IngredientsDTO(){
		super();
	}
	public IngredientsDTO(int id_ingredient, String name, int calories,
			cr.ulacit.model.DishIngredients[] dishIngredients) {
		super();
		this.id_ingredient = id_ingredient;
		this.name = name;
		this.calories = calories;
		DishIngredients = dishIngredients;
	}
	public int getId_ingredient() {
		return id_ingredient;
	}
	public void setId_ingredient(int id_ingredient) {
		this.id_ingredient = id_ingredient;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public DishIngredients[] getDishIngredients() {
		return DishIngredients;
	}
	public void setDishIngredients(DishIngredients[] dishIngredients) {
		DishIngredients = dishIngredients;
	}
	@Override
	public String toString() {
		return "IngredientsDTO [id_ingredient=" + id_ingredient + ", name=" + name + ", calories=" + calories + "]";
	}
	
}
