package by.bsuir.Puchynski.DAO.Factory.impl;

import by.bsuir.Puchynski.Entity.Appliance;
import by.bsuir.Puchynski.Entity.Laptop;
import by.bsuir.Puchynski.Entity.Enums.CPU;
import by.bsuir.Puchynski.Entity.Enums.OS;
import by.bsuir.Puchynski.Entity.Feature.SearchFeature;
import by.bsuir.Puchynski.DAO.ExceptionMessageConstant;
import by.bsuir.Puchynski.DAO.Factory.ApplianceFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * LaptopFactory class.
 * @author Puchynski Anatol
 */
public class LaptopFactory extends ApplianceFactory {
    /**
     * The Price field.
     */
    int price;
    /**
     * The Battery capacity field.
     */
    double batteryCapacity;
    /**
     * The Memory rom field.
     */
    double memoryRom;
    /**
     * The Display inches filed.
     */
    double displayInches;
    /**
     * The Cpu field.
     */
    CPU cpu;
    /**
     * The Os field.
     */
    OS os;

    /**
     * Method for create appliance
     *
     * @param nodeList the node list
     * @return appliance {@link Appliance}
     */
    @Override
    public Appliance createAppliance(NodeList nodeList) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                String value = nodeList.item(i).getTextContent();

                SearchFeature.Laptop laptopSearchCriteria = SearchFeature.Laptop.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (laptopSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case BATTERY_CAPACITY:
                        batteryCapacity = Double.parseDouble(value);
                        break;
                    case OS:
                        os = OS.valueOf(value);
                        break;
                    case MEMORY_ROM:
                        memoryRom = Double.parseDouble(value);
                        break;
                    case CPU:
                        cpu = CPU.valueOf(value);
                        break;
                    case DISPLAY_INCHES:
                        displayInches = Double.parseDouble(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }

        return new Laptop(price, batteryCapacity, os, memoryRom, cpu, displayInches);
    }

}
