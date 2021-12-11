package by.bsuir.Puchynski.Service.Validator.impl;

import by.bsuir.Puchynski.Entity.Enums.Company;
import by.bsuir.Puchynski.Service.Validator.FeatureValidator;

/**
 * ColorValidator class.
 * @author Puchynski Anatol
 */
public class CompanyValidator implements FeatureValidator {

    /**
     * Method that checks valid of company.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            Company.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}