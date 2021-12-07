package streams.mock;

import com.google.common.io.Resources;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import streams.beans.Car;
import streams.beans.Person;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MockData {
    public static List<Person> getPepole() throws IOException {
        InputStream inputStream = Resources.getResource("pepole.json").openStream();
        String json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        //to whice type i will convert the data
        Type listType = new TypeToken<ArrayList<Person>>(){}.getType();
        return new Gson().fromJson(json,listType);
    }

    public static List<Car> getCars() {
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResource("cars.json").openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String json = null;
        try {
            json = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //to whice type i will convert the data
        Type listType = new TypeToken<ArrayList<Car>>(){}.getType();
        return new Gson().fromJson(json,listType);
    }
}
