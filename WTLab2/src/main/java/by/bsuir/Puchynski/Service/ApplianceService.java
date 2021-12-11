package by.bsuir.Puchynski.Service;

import by.bsuir.Puchynski.Exception.ResourceException;
import by.bsuir.Puchynski.Exception.ServiceException;
import by.bsuir.Puchynski.Entity.Appliance;
import by.bsuir.Puchynski.Entity.Feature.Feature;

import java.util.List;

/**
 * ApplianceService interface of an ApplianceService class.
 * @author Puchynski Anatol
 */
public interface ApplianceService {

    /**
     * Method that finds list of appliance.
     *
     * @param feature the feature
     * @return the list
     * @throws ResourceException the resource exception
     * @throws ServiceException  the service exception
     */
    List<Appliance> find(Feature feature) throws ResourceException, ServiceException;

}
