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

/*Contiene información de los dish y tiene dos relaciones otras dos clases MenuDish y DishIngredients
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 *@See: MenuDish, DishIngredients
 */
@XmlRootElement
@Entity
@Table(name="dish")
public class Dish {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_dish", unique=true, nullable=false)
	private int id_dish;
	
	@Column(name="name", length=100)
	private String name;
	
	@Column(name="size",length=30)
	private String size;
	 
	@Column(name="description", length=100)
	private String description;
	
	@Column(name="timesserved")
	private int timesserved;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="Dish", cascade=CascadeType.ALL)
	private Set <MenuDish> MenuDish;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="Dish", cascade=CascadeType.ALL)
	private Set <DishIngredients> DishIngredients;

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
	public Set<MenuDish> getMenuDish() {
		return MenuDish;
	}
	public void setMenuDish(Set<MenuDish> menuDish) {
		MenuDish = menuDish;
	}
	public Set<DishIngredients> getDishIngredients() {
		return DishIngredients;
	}
	public void setDishIngredients(Set<DishIngredients> dishIngredients) {
		DishIngredients = dishIngredients;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id_dish;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + timesserved;
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
		Dish other = (Dish) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id_dish != other.id_dish)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (timesserved != other.timesserved)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dish [id_dish=" + id_dish + ", name=" + name + ", size=" + size + ", description=" + description
				+ ", timesserved=" + timesserved + "]";
	}
	
	
}
