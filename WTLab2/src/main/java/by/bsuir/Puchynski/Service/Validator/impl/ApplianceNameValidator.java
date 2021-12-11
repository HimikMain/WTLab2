package by.bsuir.Puchynski.Service.Validator.impl;

import by.bsuir.Puchynski.Common.ApplianceNameConstant;
import by.bsuir.Puchynski.Service.Validator.FeatureValidator;

/**
 * ApplianceNameValidator class.
 * @author Puchynski Anatol
 */
public class ApplianceNameValidator implements FeatureValidator {

    /**
     * Method that checks valid of criteria name.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            switch ((String) value) {
                case ApplianceNameConstant.LAPTOP:
                case ApplianceNameConstant.TEAPOT:
                case ApplianceNameConstant.FRIDGE:
                    return true;
                default:
                    return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
}
