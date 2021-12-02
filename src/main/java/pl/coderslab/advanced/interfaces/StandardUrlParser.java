package pl.coderslab.advanced.interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StandardUrlParser implements UrlParser {

    @Override
    public String getParam(String name, String url) {
        String param = "";
        Pattern pattern = Pattern.compile(name + "=([^&]+)");
        Matcher m = pattern.matcher(url);
        if (m.find()) {
            param = m.group(1);
        }
        return param;
    }

}
