package xml_json;


import netscape.javascript.JSObject;
import org.json.JSONObject;
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
import java.util.Scanner;


public class Tester {
    //url of bank of israel for getting currencies data
    public final String urlXML = "https://www.boi.org.il/currency.xml";
    //url to get a car data
    public final String urlJSON = "https://data.gov.il/api/3/action/datastore_search?resource_id=053cea08-09bc-40ec-8f7a-156f0677aff3&q=";

    public static void main(String[] args) {
        var tester = new Tester();
        var xmlData = tester.getURLData(tester.urlXML);
        //xml - bank of israel
//        List<Currency> currencies = tester.readXML(xmlData);
//        for (Currency item:currencies){
//            System.out.println(item);
//        }
//        currencies.forEach(item -> System.out.println(item));
//        currencies.forEach(System.out::println);

        //json - ministry of transportation
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a car number:");
        var carNumber = input.nextLine();
        String jsonObject = tester.getURLData(tester.urlJSON+carNumber);
        //System.out.println(jsonObject);

        //to show json so we can read it
        //http://json.parser.online.fr/
        Car car = readJSON(jsonObject);

        //itzik kaknua - 2209179
    }

    private static Car readJSON(String jsonObject) {

        //convert our String to json object
        var carData = new JSONObject(jsonObject);
        //getting our result from json object
        var result = carData.getJSONObject("result");
        //get json array from result
        var carArray = result.getJSONArray("records");
        //get the first car from json array
        var singleCar = (JSONObject) carArray.get(0);

        System.out.println("mispar rechev: " + singleCar.getInt("mispar_rechev"));
        System.out.println("manufactor: " + singleCar.getString("tozeret_nm"));
        System.out.println("model: " + singleCar.getString("kinuy_mishari")+" "+singleCar.getString("ramat_gimur"));
        System.out.println("test: " + singleCar.getString("tokef_dt").split("T")[0]);
        System.out.println("year: " + singleCar.getInt("shnat_yitzur"));
        System.out.println("Color: " + singleCar.getString("tzeva_rechev"));


        return null;

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
