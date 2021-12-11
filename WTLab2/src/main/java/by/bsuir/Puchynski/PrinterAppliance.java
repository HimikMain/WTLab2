package by.bsuir.Puchynski;

import by.bsuir.Puchynski.DAO.ExceptionMessageConstant;
import by.bsuir.Puchynski.Entity.Appliance;

import java.util.List;

/**
 * Class that print info of appliances.
 * @author Puchynski Anatol
 */
public class PrinterAppliance {

    /**
     * Method that prints information.
     *
     * @param appliances the appliances
     */
    public static void print(List<Appliance> appliances) {
        if (appliances == null) {
            System.out.println(ExceptionMessageConstant.APPLIANCES_LIST_NULL_EXCEPTION_MSG);
        } else if (appliances.isEmpty()) {
            System.out.println(ExceptionMessageConstant.APPLIANCES_LIST_EMPTY_EXCEPTION_MSG);
        } else {
            for (Appliance appliance : appliances) {
                System.out.println(appliance);
            }
        }
    }

}
