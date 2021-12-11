package by.bsuir.Puchynski.Service.Validator.impl;

import by.bsuir.Puchynski.Entity.Enums.OS;
import by.bsuir.Puchynski.Service.Validator.FeatureValidator;

/**
 * OSValidator class.
 * @author Puchynski Anatol
 */
public class OSValidator implements FeatureValidator {

    /**
     * Method that checks valid of os.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            OS.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
