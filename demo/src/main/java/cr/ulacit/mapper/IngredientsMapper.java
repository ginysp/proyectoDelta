package cr.ulacit.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import cr.ulacit.dto.IngredientsDTO;
import cr.ulacit.model.Ingredients;

@Mapper
public interface IngredientsMapper {
	IngredientsMapper INSTANCE=Mappers.getMapper(IngredientsMapper.class);
	List<IngredientsDTO> ingredientsDTOs(List<Ingredients> ingredients);
	@Mappings({
		@Mapping(source="id_ingredient",target="id_ingredient"),
		@Mapping(source="name",target="name"),
		@Mapping(source="calories",target="calories"),
		@Mapping(source="dishIngredients",target="dishIngredients")
	})
	IngredientsDTO ingredientDTO(Ingredients ingredient);
}
