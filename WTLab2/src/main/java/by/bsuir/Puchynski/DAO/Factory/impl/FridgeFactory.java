package by.bsuir.Puchynski.DAO.Factory.impl;

import by.bsuir.Puchynski.Entity.Appliance;
import by.bsuir.Puchynski.Entity.Fridge;
import by.bsuir.Puchynski.Entity.Enums.Color;
import by.bsuir.Puchynski.Entity.Enums.Company;
import by.bsuir.Puchynski.Entity.Feature.SearchFeature;
import by.bsuir.Puchynski.DAO.ExceptionMessageConstant;
import by.bsuir.Puchynski.DAO.Factory.ApplianceFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * TabletPCFactory class.
 * @author Puchynski Anatol
 */
public class FridgeFactory extends ApplianceFactory {
    /**
     * The Price field.
     */
    int price;
    /**
     * The Color field.
     */
    Color color;
    /**
     * The Company field.
     */
    Company company;


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

                SearchFeature.Fridge tabletPCSearchCriteria = SearchFeature.Fridge.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (tabletPCSearchCriteria) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    case COMPANY:
                        company = Company.valueOf(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }
            }
        }
        return new Fridge(price, color, company);
    }

}
