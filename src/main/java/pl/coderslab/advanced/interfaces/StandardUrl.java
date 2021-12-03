package pl.coderslab.advanced.interfaces;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StandardUrl implements Url{


    @Override
    public String getParam(String name, String url) {
        String param ="";

        Pattern pattern = Pattern.compile(name + "=([^&]+)");
        Matcher matcher = pattern.matcher(url);
        if(matcher.find()){
            param = matcher.group(1);
        }
        return param;
    }
}
