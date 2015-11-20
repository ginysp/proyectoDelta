package cr.ulacit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;

@XmlRootElement(name="dishIngredients")
@Entity
@Table(name="dish_ingredients")
public class DishIngredients {
	@Column(name="quantity", length=10)
	private int quantity;
	
	@Id
	@ManyToOne
	@JoinColumn(name="dishid_dish", nullable=false)
	@JsonIgnore
	private Dish Dish; //tabla dishid_dish
	
	@Id
	@ManyToOne
	@JoinColumn(name="ingredientsid_ingredient",nullable=false)
	@JsonIgnore
	private Ingredients Ingredients; //tabla ingredientsid_ingredient
	
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Dish getDish() {
		return Dish;
	}
	public void setDish(Dish Dish) {
		this.Dish = Dish;
	}
	public Ingredients getIngredients() {
		return Ingredients;
	}
	public void setIngredients(Ingredients Ingredients) {
		this.Ingredients = Ingredients;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantity;
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
		DishIngredients other = (DishIngredients) obj;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "dishIngredients [quantity=" + quantity + "]";
	}
		
}
