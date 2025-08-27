package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo;

@Deprecated
public final class RouteTracker implements RouteInfo, Cloneable {
    private boolean connected;
    private RouteInfo.LayerType layered;
    private final InetAddress localAddress;
    private HttpHost[] proxyChain;
    private boolean secure;
    private final HttpHost targetHost;
    private RouteInfo.TunnelType tunnelled;

    public RouteTracker(HttpHost httpHost, InetAddress inetAddress) {
        if (httpHost != null) {
            this.targetHost = httpHost;
            this.localAddress = inetAddress;
            this.tunnelled = RouteInfo.TunnelType.PLAIN;
            this.layered = RouteInfo.LayerType.PLAIN;
            return;
        }
        throw new IllegalArgumentException("Target host may not be null.");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final void connectProxy(HttpHost httpHost, boolean z) {
        if (httpHost == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (!this.connected) {
            this.connected = true;
            this.proxyChain = new HttpHost[]{httpHost};
            this.secure = z;
        } else {
            throw new IllegalStateException("Already connected.");
        }
    }

    public final void connectTarget(boolean z) {
        if (!this.connected) {
            this.connected = true;
            this.secure = z;
            return;
        }
        throw new IllegalStateException("Already connected.");
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof RouteTracker)) {
            return false;
        }
        RouteTracker routeTracker = (RouteTracker) obj;
        boolean equals = this.targetHost.equals(routeTracker.targetHost);
        InetAddress inetAddress = this.localAddress;
        InetAddress inetAddress2 = routeTracker.localAddress;
        boolean z2 = equals & (inetAddress == inetAddress2 || (inetAddress != null && inetAddress.equals(inetAddress2)));
        HttpHost[] httpHostArr = this.proxyChain;
        HttpHost[] httpHostArr2 = routeTracker.proxyChain;
        boolean z3 = z2 & (httpHostArr == httpHostArr2 || !(httpHostArr == null || httpHostArr2 == null || httpHostArr.length != httpHostArr2.length));
        if (!(this.connected == routeTracker.connected && this.secure == routeTracker.secure && this.tunnelled == routeTracker.tunnelled && this.layered == routeTracker.layered)) {
            z = false;
        }
        boolean z4 = z & z3;
        if (z4 && httpHostArr != null) {
            while (z4) {
                HttpHost[] httpHostArr3 = this.proxyChain;
                if (i >= httpHostArr3.length) {
                    break;
                }
                z4 = httpHostArr3[i].equals(routeTracker.proxyChain[i]);
                i++;
            }
        }
        return z4;
    }

    public final int getHopCount() {
        if (!this.connected) {
            return 0;
        }
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr == null) {
            return 1;
        }
        return 1 + httpHostArr.length;
    }

    public final HttpHost getHopTarget(int i) {
        if (i >= 0) {
            int hopCount = getHopCount();
            if (i < hopCount) {
                return i < hopCount + -1 ? this.proxyChain[i] : this.targetHost;
            }
            throw new IllegalArgumentException(a81.l("Hop index ", i, " exceeds tracked route length ", hopCount, "."));
        }
        throw new IllegalArgumentException(wj6.h(i, "Hop index must not be negative: "));
    }

    public final RouteInfo.LayerType getLayerType() {
        return this.layered;
    }

    public final InetAddress getLocalAddress() {
        return this.localAddress;
    }

    public final HttpHost getProxyHost() {
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr == null) {
            return null;
        }
        return httpHostArr[0];
    }

    public final HttpHost getTargetHost() {
        return this.targetHost;
    }

    public final RouteInfo.TunnelType getTunnelType() {
        return this.tunnelled;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.targetHost.hashCode();
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            hashCode ^= inetAddress.hashCode();
        }
        HttpHost[] httpHostArr = this.proxyChain;
        if (httpHostArr != null) {
            i ^= httpHostArr.length;
            int i2 = 0;
            while (true) {
                HttpHost[] httpHostArr2 = this.proxyChain;
                if (i2 >= httpHostArr2.length) {
                    break;
                }
                i ^= httpHostArr2[i2].hashCode();
                i2++;
            }
        }
        if (this.connected) {
            i ^= 286331153;
        }
        if (this.secure) {
            i ^= 572662306;
        }
        return this.layered.hashCode() ^ (i ^ this.tunnelled.hashCode());
    }

    public final boolean isConnected() {
        return this.connected;
    }

    public final boolean isLayered() {
        return this.layered == RouteInfo.LayerType.LAYERED;
    }

    public final boolean isSecure() {
        return this.secure;
    }

    public final boolean isTunnelled() {
        return this.tunnelled == RouteInfo.TunnelType.TUNNELLED;
    }

    public final void layerProtocol(boolean z) {
        if (this.connected) {
            this.layered = RouteInfo.LayerType.LAYERED;
            this.secure = z;
            return;
        }
        throw new IllegalStateException("No layered protocol unless connected.");
    }

    public final HttpRoute toRoute() {
        if (!this.connected) {
            return null;
        }
        return new HttpRoute(this.targetHost, this.localAddress, this.proxyChain, this.secure, this.tunnelled, this.layered);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("RouteTracker[");
        InetAddress inetAddress = this.localAddress;
        if (inetAddress != null) {
            sb.append(inetAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.connected) {
            sb.append('c');
        }
        if (this.tunnelled == RouteInfo.TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.layered == RouteInfo.LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.secure) {
            sb.append('s');
        }
        sb.append("}->");
        if (this.proxyChain != null) {
            int i = 0;
            while (true) {
                HttpHost[] httpHostArr = this.proxyChain;
                if (i >= httpHostArr.length) {
                    break;
                }
                sb.append(httpHostArr[i]);
                sb.append("->");
                i++;
            }
        }
        sb.append(this.targetHost);
        sb.append(']');
        return sb.toString();
    }

    public final void tunnelProxy(HttpHost httpHost, boolean z) {
        if (httpHost == null) {
            throw new IllegalArgumentException("Proxy host may not be null.");
        } else if (this.connected) {
            HttpHost[] httpHostArr = this.proxyChain;
            if (httpHostArr != null) {
                int length = httpHostArr.length;
                HttpHost[] httpHostArr2 = new HttpHost[(length + 1)];
                System.arraycopy(httpHostArr, 0, httpHostArr2, 0, httpHostArr.length);
                httpHostArr2[length] = httpHost;
                this.proxyChain = httpHostArr2;
                this.secure = z;
                return;
            }
            throw new IllegalStateException("No proxy tunnel without proxy.");
        } else {
            throw new IllegalStateException("No tunnel unless connected.");
        }
    }

    public final void tunnelTarget(boolean z) {
        if (!this.connected) {
            throw new IllegalStateException("No tunnel unless connected.");
        } else if (this.proxyChain != null) {
            this.tunnelled = RouteInfo.TunnelType.TUNNELLED;
            this.secure = z;
        } else {
            throw new IllegalStateException("No tunnel without proxy.");
        }
    }

    public RouteTracker(HttpRoute httpRoute) {
        this(httpRoute.getTargetHost(), httpRoute.getLocalAddress());
    }
}
