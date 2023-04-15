package starter.Gorest;

public class JojonomicAPI {
    public static final String URL = "https://api.weatherbit.io/v2.0";
    public static final String DIR = System.getProperty("user.dir");

    public static final String JSON_SCHEMA = DIR + "/src/test/resources/JSON/JsonSchema";

    public static final String GET_LIST_CURRENT = URL + "/current?lat=40.730610&lon=-73.935242&key=8793937f62c645fea059f41963b41e60&include=minutely";
    public static final String GET_LIST_FORERCAST = URL + "/forecast/3hourly?postal_code={postal_code}&key=8793937f62c645fea059f41963b41e60&include=minutely";


    }
