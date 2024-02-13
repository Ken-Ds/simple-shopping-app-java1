package common;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class ParseXMLFile {

    public NodeList readXMLProduct(){
        NodeList nodes = null;
        try {
            File inputFile = new File("src/res/products.xml");
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(inputFile);
            document.getDocumentElement().normalize();

            nodes = document.getElementsByTagName("product");
        } catch (Exception e){
            e.printStackTrace();
        }
        return nodes;
    }

    public void addXMLProduct(String name, String price, String description){
        CreateId createId = new CreateId();
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/products.xml");
            Element rootElement = document.getDocumentElement();

            Element newProduct = document.createElement("product");
            rootElement.appendChild(newProduct);

            Element idElement = document.createElement("id");
            idElement.appendChild(document.createTextNode(createId.createId()));
            newProduct.appendChild(idElement);

            Element nameElement = document.createElement("name");
            nameElement.appendChild(document.createTextNode(name));
            newProduct.appendChild(nameElement);

            Element priceElement = document.createElement("price");
            priceElement.appendChild(document.createTextNode(price));
            newProduct.appendChild(priceElement);

            Element descriptionElement = document.createElement("description");
            descriptionElement.appendChild(document.createTextNode(description));
            newProduct.appendChild(descriptionElement);

            Element statusElement = document.createElement("status");
            statusElement.appendChild(document.createTextNode("On Sale"));
            newProduct.appendChild(statusElement);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/res/products.xml"));
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,"yes");
            transformer.transform(source,result);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void deleteXMLProduct(String id){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/products.xml");
            Element rootElement = document.getDocumentElement();

            NodeList productList = document.getElementsByTagName("product");
            for(int x = 0; x < productList.getLength(); x++){
                Node node = productList.item(x);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element productElement = (Element) node;
                    String productId = productElement
                            .getElementsByTagName("id")
                            .item(0)
                            .getTextContent();
                    if(productId.equals(id)){
                        node.getParentNode().removeChild(node);
                        break;
                    }
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult("src/res/products.xml");
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,"yes");

            transformer.transform(source,result);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void editXMLProduct(String searchName, String price, String status) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/products.xml");
            Element rootElement = document.getDocumentElement();

            NodeList productList = document.getElementsByTagName("product");
            for(int x = 0; x < productList.getLength(); x++){
                Node node = productList.item(x);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element product = (Element) node;
                    String name = product.getElementsByTagName("name")
                            .item(0)
                            .getTextContent();
                    if(name.equals(searchName)){
                        NodeList childNodes = product.getChildNodes();
                        for(int y = 0; y < childNodes.getLength(); y++){
                            Node node1 = childNodes.item(y);
                            if(node1.getNodeType() == Node.ELEMENT_NODE){
                                Element element = (Element) node;
                                if(element.getTagName().equals("price")){
                                    element.setTextContent(price);
                                } else if (element.getTagName().equals("status")){
                                    element.setTextContent(status);
                                }
                            }
                        }
                        break;
                    }
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult("src/res/products.xml");
            transformer.setOutputProperty(OutputKeys.INDENT,"yes");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION,"yes");

            transformer.transform(source,result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}