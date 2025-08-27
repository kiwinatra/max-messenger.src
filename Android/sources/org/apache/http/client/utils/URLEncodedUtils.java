package org.apache.http.client.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

@Deprecated
public class URLEncodedUtils {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String NAME_VALUE_SEPARATOR = "=";
    private static final String PARAMETER_SEPARATOR = "&";

    private static String decode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String encode(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String format(List<? extends NameValuePair> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (NameValuePair nameValuePair : list) {
            String encode = encode(nameValuePair.getName(), str);
            String value = nameValuePair.getValue();
            String encode2 = value != null ? encode(value, str) : "";
            if (sb.length() > 0) {
                sb.append(PARAMETER_SEPARATOR);
            }
            sb.append(encode);
            sb.append(NAME_VALUE_SEPARATOR);
            sb.append(encode2);
        }
        return sb.toString();
    }

    public static boolean isEncoded(HttpEntity httpEntity) {
        Header contentType = httpEntity.getContentType();
        return contentType != null && contentType.getValue().equalsIgnoreCase(CONTENT_TYPE);
    }

    public static List<NameValuePair> parse(URI uri, String str) {
        List<NameValuePair> emptyList = Collections.emptyList();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null || rawQuery.length() <= 0) {
            return emptyList;
        }
        ArrayList arrayList = new ArrayList();
        parse(arrayList, new Scanner(rawQuery), str);
        return arrayList;
    }

    public static List<NameValuePair> parse(HttpEntity httpEntity) throws IOException {
        List<NameValuePair> emptyList = Collections.emptyList();
        if (isEncoded(httpEntity)) {
            String entityUtils = EntityUtils.toString(httpEntity);
            Header contentEncoding = httpEntity.getContentEncoding();
            if (entityUtils != null && entityUtils.length() > 0) {
                emptyList = new ArrayList<>();
                parse(emptyList, new Scanner(entityUtils), contentEncoding != null ? contentEncoding.getValue() : null);
            }
        }
        return emptyList;
    }

    public static void parse(List<NameValuePair> list, Scanner scanner, String str) {
        scanner.useDelimiter(PARAMETER_SEPARATOR);
        while (scanner.hasNext()) {
            String[] split = scanner.next().split(NAME_VALUE_SEPARATOR);
            if (split.length == 0 || split.length > 2) {
                throw new IllegalArgumentException("bad parameter");
            }
            list.add(new BasicNameValuePair(decode(split[0], str), split.length == 2 ? decode(split[1], str) : null));
        }
    }
}
