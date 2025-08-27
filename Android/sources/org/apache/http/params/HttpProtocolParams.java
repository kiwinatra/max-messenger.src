package org.apache.http.params;

import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

@Deprecated
public final class HttpProtocolParams implements CoreProtocolPNames {
    private HttpProtocolParams() {
    }

    public static String getContentCharset(HttpParams httpParams) {
        if (httpParams != null) {
            String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_CONTENT_CHARSET);
            return str == null ? "ISO-8859-1" : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static String getHttpElementCharset(HttpParams httpParams) {
        if (httpParams != null) {
            String str = (String) httpParams.getParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET);
            return str == null ? "US-ASCII" : str;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static String getUserAgent(HttpParams httpParams) {
        if (httpParams != null) {
            return (String) httpParams.getParameter(CoreProtocolPNames.USER_AGENT);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static ProtocolVersion getVersion(HttpParams httpParams) {
        if (httpParams != null) {
            Object parameter = httpParams.getParameter(CoreProtocolPNames.PROTOCOL_VERSION);
            return parameter == null ? HttpVersion.HTTP_1_1 : (ProtocolVersion) parameter;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setContentCharset(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter(CoreProtocolPNames.HTTP_CONTENT_CHARSET, str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setHttpElementCharset(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter(CoreProtocolPNames.HTTP_ELEMENT_CHARSET, str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setUseExpectContinue(HttpParams httpParams, boolean z) {
        if (httpParams != null) {
            httpParams.setBooleanParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, z);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setUserAgent(HttpParams httpParams, String str) {
        if (httpParams != null) {
            httpParams.setParameter(CoreProtocolPNames.USER_AGENT, str);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static void setVersion(HttpParams httpParams, ProtocolVersion protocolVersion) {
        if (httpParams != null) {
            httpParams.setParameter(CoreProtocolPNames.PROTOCOL_VERSION, protocolVersion);
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public static boolean useExpectContinue(HttpParams httpParams) {
        if (httpParams != null) {
            return httpParams.getBooleanParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, false);
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }
}
