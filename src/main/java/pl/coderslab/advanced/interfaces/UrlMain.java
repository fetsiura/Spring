package pl.coderslab.advanced.interfaces;

public class UrlMain {

    public static void main(String[] args) {


        StandardUrl standardUrl = new StandardUrl();
        String param = standardUrl.getParam("param1", "url_example?param1=99&param2=string");


    }
}
