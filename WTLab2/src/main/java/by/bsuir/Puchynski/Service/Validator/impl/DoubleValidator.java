package by.bsuir.Puchynski.Service.Validator.impl;

import by.bsuir.Puchynski.Service.Validator.FeatureValidator;

/**
 * DoubleValidator class.
 * @author Puchynski Anatol
 */
public class DoubleValidator implements FeatureValidator {

    /**
     * Method that checks valid of double.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        if (value instanceof Double) {
            return (Double) value > 0;
        } else {
            return false;
        }
    }

}
