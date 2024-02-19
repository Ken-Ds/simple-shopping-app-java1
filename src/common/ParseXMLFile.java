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


    /**
     * Checks Account is in the accounts.xml file
     *
     * @param checkUsername
     * @param checkPassword
     * @return boolean if account is valid
     */
    public boolean checkAccount(String checkUsername, String checkPassword) {
        NodeList nodes = null;
        try {
            File inputFile = new File("src/res/accounts.xml");
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(inputFile);
            document.getDocumentElement().normalize();

            nodes = document.getElementsByTagName("account");
            for (int i = 0; i < nodes.getLength(); i++) {
                Node node = nodes.item(i);
                Element element = (Element) node;
                ;
                String id = element.getElementsByTagName("id").item(0).getTextContent();
                String username = element.getElementsByTagName("username").item(0).getTextContent();
                String password = element.getElementsByTagName("password").item(0).getTextContent();
                String cart = element.getElementsByTagName("cart").item(0).getTextContent();
                if (username.equalsIgnoreCase(checkUsername) && password.equalsIgnoreCase(checkPassword)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public void addAccount(String username, String password) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/accounts.xml");
            Element rootElement = document.getDocumentElement();


            Element newAccount = document.createElement("account");
            rootElement.appendChild(newAccount);

            Element idElement = document.createElement("id");
            idElement.appendChild(document.createTextNode(new CreateId().createIdAccount()));
            newAccount.appendChild(idElement);

            Element usernameElement = document.createElement("username");
            usernameElement.appendChild(document.createTextNode(username));
            newAccount.appendChild(usernameElement);

            Element passwordElement = document.createElement("password");
            passwordElement.appendChild(document.createTextNode(password));
            newAccount.appendChild(passwordElement);

            Element cartElement = document.createElement("cart");
            passwordElement.appendChild(document.createTextNode(""));
            newAccount.appendChild(cartElement);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/res/accounts.xml"));
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public NodeList readXMLProduct() {
        NodeList nodes = null;
        try {
            File inputFile = new File("src/res/products.xml");
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(inputFile);
            document.getDocumentElement().normalize();

            nodes = document.getElementsByTagName("product");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nodes;
    }

    public NodeList readXMLClient() {
        NodeList clientNodes = null;
        try {
            File inputFile = new File("src/res/accounts.xml");
            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(inputFile);
            document.getDocumentElement().normalize();
            clientNodes = document.getElementsByTagName("account");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clientNodes;
    }


    public void addXMLProduct(String name, String price, String description) {
        CreateId createId = new CreateId();
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/products.xml");
            Element rootElement = document.getDocumentElement();

            Element newProduct = document.createElement("product");
            rootElement.appendChild(newProduct);

            Element idElement = document.createElement("id");
            idElement.appendChild(document.createTextNode(createId.createIdProduct()));
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
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deleteXMLProduct(String id) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/products.xml");
            Element rootElement = document.getDocumentElement();

            NodeList productList = document.getElementsByTagName("product");
            for (int x = 0; x < productList.getLength(); x++) {
                Node node = productList.item(x);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element productElement = (Element) node;
                    String productId = productElement
                            .getElementsByTagName("id")
                            .item(0)
                            .getTextContent();
                    if (productId.equals(id)) {
                        node.getParentNode().removeChild(node);
                        break;
                    }
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult("src/res/products.xml");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editXMLProduct(String searchID, String name, String price, String status) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/products.xml");
            Element rootElement = document.getDocumentElement();

            NodeList productList = document.getElementsByTagName("product");
            for (int x = 0; x < productList.getLength(); x++) {
                Node node = productList.item(x);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element product = (Element) node;
                    String id = product.getElementsByTagName("id")
                            .item(0)
                            .getTextContent();
                    if (id.equals(searchID)) {
                        product.getElementsByTagName("name").item(0).setTextContent(name);
                        product.getElementsByTagName("price").item(0).setTextContent(price);
                        product.getElementsByTagName("status").item(0).setTextContent(status);
                        break;
                    }
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult("src/res/products.xml");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addProductsToCart(String id, Cart products) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/accounts.xml");
            Element rootElement = document.getDocumentElement();

            NodeList accountList = document.getElementsByTagName("account");
            for (int x = 0; x < accountList.getLength(); x++) {
                Node node = accountList.item(x);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element accountElement = (Element) node;
                    String accountId = accountElement
                            .getElementsByTagName("id")
                            .item(0)
                            .getTextContent();
                    if (accountId.equals(id)) {
                        accountElement = (Element) accountElement.getElementsByTagName("cart").item(0);
                        for (Product product : products.getProducts()) {

                            Element productElement = document.createElement("product");
                            accountElement.appendChild(productElement);

                            Element idElement = document.createElement("id");
                            idElement.appendChild(document.createTextNode(product.getId()));
                            productElement.appendChild(idElement);

                            Element nameElement = document.createElement("name");
                            nameElement.appendChild(document.createTextNode(product.getName()));
                            productElement.appendChild(nameElement);

                            Element priceElement = document.createElement("price");
                            priceElement.appendChild(document.createTextNode(product.getPrice()));
                            productElement.appendChild(priceElement);

                            Element descriptionElement = document.createElement("description");
                            descriptionElement.appendChild(document.createTextNode(product.getDescription()));
                            productElement.appendChild(descriptionElement);

                            Element statusElement = document.createElement("status");
                            statusElement.appendChild(document.createTextNode(product.getStatus()));
                            productElement.appendChild(statusElement);
                        }
                    }
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File("src/res/accounts.xml"));
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

            transformer.transform(source, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public NodeList searchUser(String idAcc) {
        NodeList cartList = null;
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = docFactory.newDocumentBuilder();

            Document document = documentBuilder.parse("src/res/accounts.xml");
            NodeList accountList = document.getElementsByTagName("account");

            for (int x = 0; x < accountList.getLength(); x++) {
                Node node = accountList.item(x);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element accountElement = (Element) node;
                    String accountId = accountElement
                            .getElementsByTagName("id")
                            .item(0)
                            .getTextContent();
                    if (accountId.equals(idAcc)) {

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cartList;
    }
}
