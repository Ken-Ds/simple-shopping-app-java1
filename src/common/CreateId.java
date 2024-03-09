package common;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class CreateId {

    public String createIdProduct(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("res/products.xml");

            NodeList productList = document.getElementsByTagName("product");
            String returnID = "0";
            for(int x = 0; x < productList.getLength(); x++){
                Node node = productList.item(x);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element productElement = (Element) node;
                    String productId = productElement
                            .getElementsByTagName("id")
                            .item(0)
                            .getTextContent();
                    int old = Integer.parseInt(returnID);
                    int neW = Integer.parseInt(productId);
                    if(old < neW){
                        returnID = String.valueOf(neW);
                    }
                }
            }
            int last = Integer.parseInt(returnID) + 1;
            return String.valueOf(last);
        } catch (Exception e){

        }
        return "0";
    }

    public String createIdAccount(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("res/accounts.xml");
            Element rootElement = document.getDocumentElement();

            NodeList productList = document.getElementsByTagName("account");
            String returnID = "0";
            for(int x = 0; x < productList.getLength(); x++){
                Node node = productList.item(x);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element productElement = (Element) node;
                    String productId = productElement
                            .getElementsByTagName("id")
                            .item(0)
                            .getTextContent();
                    int old = Integer.parseInt(returnID);
                    int neW = Integer.parseInt(productId);
                    if(old < neW){
                        returnID = String.valueOf(neW);
                    }
                }
            }
            int last = Integer.parseInt(returnID) + 1;
            return String.valueOf(last);
        } catch (Exception e){

        }
        return "0";
    }
}
