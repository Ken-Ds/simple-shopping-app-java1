package server.model;

import common.ParseXMLFile;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class SetJTable extends JTable {
    ParseXMLFile xmlFile = new ParseXMLFile();

    public DefaultTableModel setTable() {
        NodeList nodes = xmlFile.readXMLProduct();
        Object[][] mod = new Object[nodes.getLength()][4];

        for (int x = 0; x < nodes.getLength(); x++) {
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
            String status = element
                    .getElementsByTagName("status")
                    .item(0)
                    .getTextContent();
            mod[x][0] = id;
            mod[x][1] = name;
            mod[x][2] = price;
            mod[x][3] = status;
        }

        DefaultTableModel model = new DefaultTableModel(
                mod,
                new String[]{
                        "Product ID", "Name", "Price", "Status"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };

        return model;
    }


}
