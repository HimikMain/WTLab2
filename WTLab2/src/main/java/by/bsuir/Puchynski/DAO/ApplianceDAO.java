package by.bsuir.Puchynski.DAO;

import by.bsuir.Puchynski.Entity.Appliance;
import by.bsuir.Puchynski.Entity.Feature.Feature;
import by.bsuir.Puchynski.Exception.ResourceException;

import java.util.List;

/**
 * ApplianceDAO interface of an applianceDao class.
 * @author Puchynski Anatol
 */
public interface ApplianceDAO {

    /**
     * Finds all appliances by given criteria.
     *
     * @param feature {@link Feature}
     * @return list of appliance
     * @throws ResourceException exception
     */
    List<Appliance> find(Feature feature) throws ResourceException;
}
