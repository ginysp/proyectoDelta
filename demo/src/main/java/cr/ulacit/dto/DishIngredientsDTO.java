package cr.ulacit.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dishIngredientsDTO")
public class DishIngredientsDTO {
	private int id_dishingredients;
	private int quantity;
	public DishIngredientsDTO(){
		super();
	}
	
	public int getId_dishingredients() {
		return id_dishingredients;
	}

	public void setId_dishingredients(int id_dishingredients) {
		this.id_dishingredients = id_dishingredients;
	}

	public DishIngredientsDTO(int quantity) {
		super();
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "DishIngredientsDTO [id_dishingredients=" + id_dishingredients + ", quantity=" + quantity + "]";
	}


	
}
