package pl.coderslab.advanced.interfaces;

import java.util.regex.Pattern;

public class UrlParsers {

    private static final Pattern STANDARD_URL_PATTERN = Pattern.compile("=([^&]+)");
    private static final Pattern EXTENDED_URL_PATTERN = Pattern.compile("\\.([^/]+)");

    public static UrlParser forUrl(String url) {
        if (STANDARD_URL_PATTERN.matcher(url).find()) {
            return new StandardUrlParser();
        } else if (EXTENDED_URL_PATTERN.matcher(url).find()) {
            return new ExtendedUrlParser();
        } else {
            throw new IllegalStateException("No UrlParser available for url: '" + url + "'");
        }
    }
}
