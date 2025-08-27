package org.apache.http.conn.params;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.params.HttpParams;

@Deprecated
public class ConnRouteParams implements ConnRoutePNames {
    public static final HttpHost NO_HOST;
    public static final HttpRoute NO_ROUTE;

    static {
        HttpHost httpHost = new HttpHost("127.0.0.255", 0, "no-host");
        NO_HOST = httpHost;
        NO_ROUTE = new HttpRoute(httpHost);
    }

    private ConnRouteParams() {
    }

    public static HttpHost getDefaultProxy(HttpParams httpParams) {
        if (httpParams != null) {
            HttpHost httpHost = (HttpHost) httpParams.getParameter(ConnRoutePNames.DEFAULT_PROXY);
            if (httpHost == null || !NO_HOST.equals(httpHost)) {
                return httpHost;
            }
            return null;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public static HttpRoute getForcedRoute(HttpParams httpParams) {
        if (httpParams != null) {
            HttpRoute httpRoute = (HttpRoute) httpParams.getParameter(ConnRoutePNames.FORCED_ROUTE);
            if (httpRoute == null || !NO_ROUTE.equals(httpRoute)) {
                return httpRoute;
            }
            return null;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public static InetAddress getLocalAddress(HttpParams httpParams) {
        if (httpParams != null) {
            return (InetAddress) httpParams.getParameter(ConnRoutePNames.LOCAL_ADDRESS);
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public static void setDefaultProxy(HttpParams httpParams, HttpHost httpHost) {
        if (httpParams != null) {
            httpParams.setParameter(ConnRoutePNames.DEFAULT_PROXY, httpHost);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public static void setForcedRoute(HttpParams httpParams, HttpRoute httpRoute) {
        if (httpParams != null) {
            httpParams.setParameter(ConnRoutePNames.FORCED_ROUTE, httpRoute);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }

    public static void setLocalAddress(HttpParams httpParams, InetAddress inetAddress) {
        if (httpParams != null) {
            httpParams.setParameter(ConnRoutePNames.LOCAL_ADDRESS, inetAddress);
            return;
        }
        throw new IllegalArgumentException("Parameters must not be null.");
    }
}
