package by.bsuir.Puchynski;

import by.bsuir.Puchynski.Common.ApplianceNameConstant;
import by.bsuir.Puchynski.Entity.Appliance;
import by.bsuir.Puchynski.Entity.Feature.Feature;
import by.bsuir.Puchynski.Entity.Feature.SearchFeature;
import by.bsuir.Puchynski.Exception.ResourceException;
import by.bsuir.Puchynski.Exception.ServiceException;
import by.bsuir.Puchynski.Service.ApplianceService;
import by.bsuir.Puchynski.Service.ServiceFactory;

import java.util.List;

/**
 * The type by.bsuir.Puchynski.Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws ServiceException  the service exception
     * @throws ResourceException the resource exception
     */
    public static void main(String[] args) throws ServiceException, ResourceException {
        List<Appliance> appliances;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        Feature featureLaptop = new Feature(ApplianceNameConstant.LAPTOP);
        featureLaptop.add(SearchFeature.PriceFilter.LESS_THAN_CURRENT_PRICE.name(), 6000.0);
        appliances = service.find(featureLaptop);
        PrinterAppliance.print(appliances);

        Feature featureTeapot = new Feature(ApplianceNameConstant.TEAPOT);
        featureTeapot.add(SearchFeature.Teapot.POWER.name(), 900.0);
        featureTeapot.add(SearchFeature.Teapot.BULK.name(), 2.0);
        appliances = service.find(featureTeapot);
        PrinterAppliance.print(appliances);

        Feature featureFridge = new Feature(ApplianceNameConstant.FRIDGE);
        featureFridge.add(SearchFeature.Fridge.COLOR.name(), "BLACK");
        featureFridge.add(SearchFeature.Fridge.COMPANY.name(), "BOSCH");
        appliances = service.find(featureFridge);
        PrinterAppliance.print(appliances);
    }
}
