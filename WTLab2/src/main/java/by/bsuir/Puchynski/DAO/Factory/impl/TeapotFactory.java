package by.bsuir.Puchynski.DAO.Factory.impl;

import by.bsuir.Puchynski.Entity.Appliance;
import by.bsuir.Puchynski.Entity.Teapot;
import by.bsuir.Puchynski.Entity.Enums.Color;
import by.bsuir.Puchynski.Entity.Feature.SearchFeature;
import by.bsuir.Puchynski.DAO.ExceptionMessageConstant;
import by.bsuir.Puchynski.DAO.Factory.ApplianceFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * TeapotFactory class.
 * @author Puchynski Anatol
 */
public class TeapotFactory extends ApplianceFactory {
    /**
     * The Price field.
     */
    int price;
    /**
     * The Power field.
     */
    double power;
    /**
     * The Weight field.
     */
    double weight;
    /**
     * The Bulk field.
     */
    double bulk;
    /**
     * The Color field.
     */
    Color color;


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

                SearchFeature.Teapot teapotSearchFeature
                        = SearchFeature.Teapot.valueOf(nodeList.item(i).getNodeName().toUpperCase());

                switch (teapotSearchFeature) {
                    case PRICE:
                        price = Integer.parseInt(value);
                        break;
                    case POWER:
                        power = Double.parseDouble(value);
                        break;
                    case WEIGHT:
                        weight = Double.parseDouble(value);
                        break;
                    case BULK:
                        bulk = Double.parseDouble(value);
                        break;
                    case COLOR:
                        color = Color.valueOf(value);
                        break;
                    default:
                        throw new IllegalArgumentException(ExceptionMessageConstant.ILLEGAL_ARGUMENT_CRITERIA_EXCEPTION_MSG);
                }

            }
        }
        return new Teapot(price, power, weight, bulk, color);
    }

}
