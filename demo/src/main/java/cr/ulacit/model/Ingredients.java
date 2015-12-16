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

/*Contiene información de los ingredients y tiene una relación con la clase DishIngredients
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: DishIngredients
 */
@XmlRootElement
@Entity
@Table(name="ingredients")
public class Ingredients {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_ingredient", unique = true, nullable = false)
	private int id_ingredient;
	
	@Column(name="name", length=100)
	private String name;
	
	@Column (name="calories")
	private int calories;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="Ingredients", cascade=CascadeType.ALL)
	private Set <DishIngredients> DishIngredients;
	
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
	public Set<DishIngredients> getDishIngredients() {
		return DishIngredients;
	}
	public void setDishIngredients(Set<DishIngredients> DishIngredients) {
		this.DishIngredients = DishIngredients;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + id_ingredient;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Ingredients other = (Ingredients) obj;
		if (calories != other.calories)
			return false;
		if (id_ingredient != other.id_ingredient)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ingredients [id_ingredient=" + id_ingredient + ", name=" + name + ", calories=" + calories + "]";
	}
	
}
