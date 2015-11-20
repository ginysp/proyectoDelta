package cr.ulacit.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="dishIngredientsDTO")
public class DishIngredientsDTO {
	private int quantity;
	public DishIngredientsDTO(){
		super();
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
		return "DishIngredientsDTO [quantity=" + quantity + "]";
	}
	
}
