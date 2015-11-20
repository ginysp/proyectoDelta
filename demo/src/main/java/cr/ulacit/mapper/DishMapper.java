package cr.ulacit.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import cr.ulacit.dto.DishDTO;
import cr.ulacit.model.Dish;


@Mapper
public interface DishMapper {
	DishMapper INSTANCE = Mappers.getMapper(DishMapper.class);
	List<DishDTO> dishsToDishsDTOS(List<Dish> dishs);
	//source modelo  target dto
	//menuDish source nombre del xml
	@Mappings({
		@Mapping(source="id_dish",target="id_dish"),
		@Mapping(source="name",target="name"),
		@Mapping(source="size",target="size"),
		@Mapping(source="description",target="description"),
		@Mapping(source="totalcalories",target="totalcalories"),
		@Mapping(source="count",target="count"),
		@Mapping(source="menuDish",target="menuDish"),
		@Mapping(source="dishIngredients",target="dishIngredients")
	})
	DishDTO dishToDishDTO(Dish dish);
}
