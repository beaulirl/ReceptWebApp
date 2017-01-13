package service;

import model.Ingredient;

/**
 * Created by Admin on 14.12.2016.
 */
public class IngredientServiceImpl extends GenericServiceImpl<Ingredient, Integer> implements IngredientService {

    public boolean removeIngredient(Ingredient ingredient) {
        genericDao.delete(ingredient);
        return true;
    }
}
