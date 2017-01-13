package dao;

import model.Ingredient;

/**
 * Created by Admin on 13.12.2016.
 */
public class IngredientDaoImpl extends GenericDaoImpl<Ingredient, Integer> implements IngredientDao{

    public boolean removeIngredient(Ingredient ingredient) {
        currentSession().delete(ingredient);
        return true;
    }
}
