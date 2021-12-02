package pl.coderslab.advanced.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

    public static void main(String[] args) {
        StandardUrlParser url1 = new StandardUrlParser();
        String param1Value = url1.getParam("param1", "url_example?param1=99&param2=string");

        System.out.println("param1 = " + param1Value);

        ExtendedUrlParser url2 = new ExtendedUrlParser();
        String param1Value2 = url2.getParam("param1", "url_example/param1.49/param2.abc");

        System.out.println("param1 = " + param1Value2);

        List<String> urls = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (Math.random() > 0.5) {
                urls.add("url_example?param1=99&param2=string");
            } else {
                urls.add("url_example/param1.49/param2.abc");
            }
        }

        List<UrlParser> urlParsers = List.of(
                new StandardUrlParser(),
                new ExtendedUrlParser());

        for (String url : urls) {
            String paramValue = null;
            for (UrlParser urlParser : urlParsers) {
                try {
                    paramValue = urlParser.getParam("param1", url);
                    break;
                } catch (Exception e) {
                    ;
                }
            }
            System.out.println("param1 = " + paramValue + " (" + url + ")");
        }

        for (String url : urls) {
            UrlParser urlParser = UrlParsers.forUrl(url);
            String value = urlParser.getParam("param1", url);
            System.out.println("param1 = " + value + " (" + url + ")");
        }
    }
}
