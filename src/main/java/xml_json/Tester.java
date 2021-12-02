package xml_json;


import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    //url of bank of israel for getting currencies data
    public final String urlXML = "https://www.boi.org.il/currency.xml";
    //url to get a car data
    public final String urlJSON = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=1113334";

    public static void main(String[] args) {
        var tester = new Tester();
        var xmlData = tester.getURLData(tester.urlXML);
        List<Currency> currencies = tester.readXML(xmlData);
//        for (Currency item:currencies){
//            System.out.println(item);
//        }
//        currencies.forEach(item -> System.out.println(item));
        currencies.forEach(System.out::println);
    }

    public List<Currency> readXML(String xmlData) {
        //we will create a document builder that will allow us an easier access to our XML string.
        List<Currency> currencies = new ArrayList<>();
        try {
            //create an object so we can build a document by our needs
            var builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            //convert the string to xml format
            var DOM = builder.parse(new InputSource(new StringReader(xmlData)));

            var itemName = DOM.getElementsByTagName("NAME");
            var itemUnit = DOM.getElementsByTagName("UNIT");
            var itemCurrencyCode = DOM.getElementsByTagName("CURRENCYCODE");
            var itemCountry = DOM.getElementsByTagName("COUNTRY");
            var itemRate = DOM.getElementsByTagName("RATE");
            var itemChange = DOM.getElementsByTagName("CHANGE");

            for (int counter = 0; counter < itemName.getLength(); counter++) {
                currencies.add(new Currency(
                        itemName.item(counter).getTextContent(),
                        Integer.parseInt(itemUnit.item(counter).getTextContent()),
                        itemCurrencyCode.item(counter).getTextContent(),
                        itemCountry.item(counter).getTextContent(),
                        Double.parseDouble(itemRate.item(counter).getTextContent()),
                        Double.parseDouble(itemChange.item(counter).getTextContent())
                ));
            }

        } catch (ParserConfigurationException | IOException | SAXException err) {
            System.out.println(err.getMessage());
        }
        return currencies;
    }

    public String getURLData(String url) {
        //string builder to getting data that will not be immutable
        StringBuilder sb = new StringBuilder();
        //create an instance of connection to the internet
        HttpURLConnection connection = null;
        try {
            //open a conneciton to the internet
            connection = (HttpURLConnection) new URL(url).openConnection();
            //create a buffer reader for getting data stream
            var buf = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            //while not getting null, read next line
            while ((line = buf.readLine()) != null) {
                //append line to string builder
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //close the connection
            connection.disconnect();
        }
        //return the result
        return sb.toString();
    }
}
