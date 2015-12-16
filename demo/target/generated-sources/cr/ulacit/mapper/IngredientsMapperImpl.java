package cr.ulacit.mapper;

import cr.ulacit.dto.IngredientsDTO;
import cr.ulacit.model.DishIngredients;
import cr.ulacit.model.Ingredients;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2015-12-15T15:51:27-0600",
    comments = "version: 1.0.0.CR1, compiler: javac, environment: Java 1.8.0_05 (Oracle Corporation)"
)
public class IngredientsMapperImpl implements IngredientsMapper {

    @Override
    public List<IngredientsDTO> ingredientsDTOs(List<Ingredients> ingredients) {
        if ( ingredients == null ) {
            return null;
        }

        List<IngredientsDTO> list = new ArrayList<IngredientsDTO>();
        for ( Ingredients ingredients_ : ingredients ) {
            list.add( ingredientDTO( ingredients_ ) );
        }

        return list;
    }

    @Override
    public IngredientsDTO ingredientDTO(Ingredients ingredient) {
        if ( ingredient == null ) {
            return null;
        }

        IngredientsDTO ingredientsDTO_ = new IngredientsDTO();

        ingredientsDTO_.setName( ingredient.getName() );
        ingredientsDTO_.setDishIngredients( dishIngredientsSetToDishIngredientsArray( ingredient.getDishIngredients() ) );
        ingredientsDTO_.setCalories( ingredient.getCalories() );
        ingredientsDTO_.setId_ingredient( ingredient.getId_ingredient() );

        return ingredientsDTO_;
    }

    protected DishIngredients[] dishIngredientsSetToDishIngredientsArray(Set<DishIngredients> set) {
        if ( set == null ) {
            return null;
        }

        DishIngredients[] dishIngredientsTmp = new DishIngredients[set.size()];
        int i = 0;
        for ( DishIngredients dishIngredients : set ) {
            dishIngredientsTmp[i] = dishIngredients;
            i++;
        }

        return dishIngredientsTmp;
    }

}
