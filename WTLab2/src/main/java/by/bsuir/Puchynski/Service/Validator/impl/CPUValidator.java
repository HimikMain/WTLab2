package by.bsuir.Puchynski.Service.Validator.impl;

import by.bsuir.Puchynski.Entity.Enums.CPU;
import by.bsuir.Puchynski.Service.Validator.FeatureValidator;

/**
 * CPUValidator class.
 * @author Puchynski Anatol
 */
public class CPUValidator implements FeatureValidator {

    /**
     * Method that checks valid of cpu.
     *
     * @param value - value to validate
     * @return true or false
     */
    @Override
    public boolean isCriteriaValid(Object value) {
        try {
            CPU.valueOf((String) value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
