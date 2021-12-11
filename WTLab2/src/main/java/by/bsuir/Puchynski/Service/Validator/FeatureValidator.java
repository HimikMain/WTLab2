package by.bsuir.Puchynski.Service.Validator;

/**
 * CriteriaValidator interface.
 * @author Puchynski Anatol
 */
public interface FeatureValidator {

    /**
     * Validate value of a search criteria
     *
     * @param value - value to validate
     * @return true, if value is valid. Otherwise, false.
     */
    boolean isCriteriaValid(Object value);
}
