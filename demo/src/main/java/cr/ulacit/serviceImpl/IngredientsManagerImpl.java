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
	@Override
	public List<IngredientsDTO> getIngredients() {
		List<IngredientsDTO> ingreDTOs=null;
		List<Ingredients> ingreList=dao.getAll();
		ingreDTOs = IngredientsMapper.INSTANCE.ingredientsDTOs(ingreList);
		return ingreDTOs;
	}
	@Override
	public void createIngredients(String name, Integer calories) {
		dao.createIngredients(name, calories);
	}
	@Override
	public void updateIngredients(String name, Integer calories) {
		dao.updateIngredients(name, calories);
	}
	@Override
	public void deleteIngredients(Integer id_ingredient) {
		dao.deleteIngredients(id_ingredient);
	}
	
	
}
