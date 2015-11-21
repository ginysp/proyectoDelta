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
	@Override
	public List<IngredientsDTO> findByID(Integer id_ingredient) {
		List<IngredientsDTO> ingreDTOs=null;
		List<Ingredients> ingreList=dao.findById(id_ingredient);
		ingreDTOs = IngredientsMapper.INSTANCE.ingredientsDTOs(ingreList);
		return ingreDTOs;
	}

	@Override
	public List<IngredientsDTO> findByName(String name) {
		List<IngredientsDTO> ingreDTOs=null;
		List<Ingredients> ingreList=dao.findByName(name);
		ingreDTOs = IngredientsMapper.INSTANCE.ingredientsDTOs(ingreList);
		return ingreDTOs;
	}
	
	@Override
	public boolean createingredient(Integer idIngredient, String name, Integer calories){
		return false;
	}
	
	@Override
	public boolean deleteingredient(Integer idIngredient){
		return false;
	}
}
