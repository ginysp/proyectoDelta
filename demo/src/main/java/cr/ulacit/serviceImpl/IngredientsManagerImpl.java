package cr.ulacit.serviceImpl;

import java.util.List;

import javax.jws.WebService;
import javax.transaction.Transactional;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.stereotype.Service;

import cr.ulacit.dao.IngredientsDao;
import cr.ulacit.dto.IngredientsDTO;
import cr.ulacit.mapper.IngredientsMapper;
import cr.ulacit.model.Ingredients;
import cr.ulacit.service.IngredientsManager;
/*Implementación de la interfaz del IngredientsManager
 *@author: Gineth Salazar - Lourdes Sotomayor
 *@version: 2, 2015
 */
@Transactional
@Service("ingredientsManager")
@WebService(serviceName="IngredientsService",endpointInterface ="cr.ulacit.service.IngredientsManager")
public class IngredientsManagerImpl extends GenericManagerImpl<Ingredients,Integer> implements IngredientsManager{
	IngredientsDao dao;
	public IngredientsManagerImpl(){
	}
	public IngredientsManagerImpl(IngredientsDao ingredientdao){
		super(ingredientdao);
		this.dao=ingredientdao;
	}
	/*Este método tiene como función encontrar un ingrediente mediante su identificador único
	 *@Param: Integer id_ingredient, identificador del ingrediente
	 *@Return: List<IngredientsDTO>
	 */
	@Override
	public List<IngredientsDTO> findByID(Integer id_ingredient) {
		List<IngredientsDTO> ingreDTOs=null;
		List<Ingredients> ingreList=dao.findById(id_ingredient);
		ingreDTOs = IngredientsMapper.INSTANCE.ingredientsDTOs(ingreList);
		return ingreDTOs;
	}
	/*Este método tiene como función encontrar un ingrediente mediante su nombre
	 *@Param: String name, nombre del ingrediente
	 *@Return: List<IngredientsDTO>
	 */
	@Override
	public List<IngredientsDTO> findByName(String name) {
		List<IngredientsDTO> ingreDTOs=null;
		List<Ingredients> ingreList=dao.findByName(name);
		ingreDTOs = IngredientsMapper.INSTANCE.ingredientsDTOs(ingreList);
		return ingreDTOs;
	}
	/*Este método tiene como función crear un nuevo ingrediente
	 *@Param: Integer idIngredient, identificador del ingrediente
	 *@Param: String name, nombre del ingrediente
	 *@Param: Integer calories, calorias del ingrediente
	 *@Return: Boolean
	 */
	@Override
	public boolean createingredient(Integer idIngredient, String name, Integer calories){
		return false;
	}
	/*Este método tiene como función eliminar un ingrediente
	 *@Param: Integer id_ingredient, identificador del ingrediente
	 *@Return: Boolean
	 */
	@Override
	public boolean deleteingredient(Integer idIngredient){
		return false;
	}
}
