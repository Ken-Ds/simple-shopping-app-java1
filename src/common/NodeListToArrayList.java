package common;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;

public class NodeListToArrayList {
    public ArrayList<Product> productArrayList(NodeList nodes){
        ArrayList<Product> productList = new ArrayList<>();
        for (int x = 0; x < nodes.getLength(); x++){
            Node node = nodes.item(x);
            Element element = (Element) node;
                String id = element
                        .getElementsByTagName("id")
                        .item(0)
                        .getTextContent();
                String name = element
                        .getElementsByTagName("name")
                        .item(0)
                        .getTextContent();
                String price = element
                        .getElementsByTagName("price")
                        .item(0)
                        .getTextContent();
                String description = element
                        .getElementsByTagName("description")
                        .item(0)
                        .getTextContent();
                String status = element
                        .getElementsByTagName("status")
                        .item(0)
                        .getTextContent();
                productList.add(new Product(id, name, price, description, status));
        }
        return productList;
    }

    public ArrayList<Product> productArrayListOnSale(NodeList nodes){
        ArrayList<Product> productList = new ArrayList<>();
        for (int x = 0; x < nodes.getLength(); x++){
            Node node = nodes.item(x);
            Element element = (Element) node;
                String id = element
                        .getElementsByTagName("id")
                        .item(0)
                        .getTextContent();
                String name = element
                        .getElementsByTagName("name")
                        .item(0)
                        .getTextContent();
                String price = element
                        .getElementsByTagName("price")
                        .item(0)
                        .getTextContent();
                String description = element
                        .getElementsByTagName("description")
                        .item(0)
                        .getTextContent();
                String status = element
                        .getElementsByTagName("status")
                        .item(0)
                        .getTextContent();
                if(status.equalsIgnoreCase("On Sale")) {
                    productList.add(new Product(id, name, price, description, status));
                }
        }
        return productList;
    }
}
