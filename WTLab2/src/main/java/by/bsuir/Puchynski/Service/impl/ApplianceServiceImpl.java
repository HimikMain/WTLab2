package by.bsuir.Puchynski.Service.impl;

import by.bsuir.Puchynski.Exception.ResourceException;
import by.bsuir.Puchynski.Exception.ServiceException;
import by.bsuir.Puchynski.Service.Validator.Validator;
import by.bsuir.Puchynski.DAO.ExceptionMessageConstant;
import by.bsuir.Puchynski.DAO.ApplianceDAO;
import by.bsuir.Puchynski.DAO.DAOFactory;
import by.bsuir.Puchynski.Entity.Appliance;
import by.bsuir.Puchynski.Entity.Feature.Feature;
import by.bsuir.Puchynski.Service.ApplianceService;

import java.util.List;

/**
 * ApplianceServiceImpl class that works with appliances DAO.
 *
 * @author Puchynski Anatol
 */
public class ApplianceServiceImpl implements ApplianceService {

    /**
     * Method that find appliances by criteria.
     *
     * @param feature the criteria
     * @return appliances
     * @throws ServiceException exception
     */
    @Override
    public List<Appliance> find(Feature feature) throws ServiceException {
        if (!Validator.isCriteriaValid(feature)) {
            throw new ServiceException(ExceptionMessageConstant.INVALID_CRITERIA_EXCEPTION_MSG);
        }

        List<Appliance> appliances;
        try {
            DAOFactory factory = DAOFactory.getInstance();
            ApplianceDAO applianceDAO = factory.getApplianceDAO();
            appliances = applianceDAO.find(feature);
        } catch (ResourceException e) {
            throw new ServiceException(e);
        }
        return appliances;
    }

}
