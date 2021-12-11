package by.bsuir.Puchynski.Service.Validator.impl;

import by.bsuir.Puchynski.Entity.Enums.Color;
import by.bsuir.Puchynski.Service.Validator.FeatureValidator;

/**
 * ColorValidator class.
 * @author Puchynski Anatol
 */
public class ColorValidator implements FeatureValidator {

    /**
     * Method that checks valid of color.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Color.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
