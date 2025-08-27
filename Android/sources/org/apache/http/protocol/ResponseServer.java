package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.params.CoreProtocolPNames;

@Deprecated
public class ResponseServer implements HttpResponseInterceptor {
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        String str;
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!httpResponse.containsHeader(HTTP.SERVER_HEADER) && (str = (String) httpResponse.getParams().getParameter(CoreProtocolPNames.ORIGIN_SERVER)) != null) {
            httpResponse.addHeader(HTTP.SERVER_HEADER, str);
        }
    }
}
