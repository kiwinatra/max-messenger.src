package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.http.HttpHost;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.ClientCookie;

/* renamed from: g37  reason: default package */
public abstract class g37 {
    public static final zw6[] a;
    public static final Map b;

    static {
        zw6 zw6 = r1;
        zw6 zw62 = new zw6(zw6.i, "");
        zw6 zw63 = r2;
        vw0 vw0 = zw6.f;
        zw6 zw64 = new zw6(vw0, HttpGet.METHOD_NAME);
        zw6 zw65 = r4;
        zw6 zw66 = new zw6(vw0, HttpPost.METHOD_NAME);
        zw6 zw67 = r4;
        vw0 vw02 = zw6.g;
        zw6 zw68 = new zw6(vw02, "/");
        zw6 zw69 = r6;
        zw6 zw610 = new zw6(vw02, "/index.html");
        zw6 zw611 = r6;
        vw0 vw03 = zw6.h;
        zw6 zw612 = new zw6(vw03, HttpHost.DEFAULT_SCHEME_NAME);
        zw6 zw613 = r8;
        zw6 zw614 = new zw6(vw03, "https");
        zw6 zw615 = r8;
        vw0 vw04 = zw6.e;
        zw6 zw616 = new zw6(vw04, "200");
        zw6 zw617 = r9;
        zw6 zw618 = new zw6(vw04, "204");
        zw6 zw619 = r10;
        zw6 zw620 = new zw6(vw04, "206");
        zw6 zw621 = r11;
        zw6 zw622 = new zw6(vw04, "304");
        zw6 zw623 = r12;
        zw6 zw624 = new zw6(vw04, "400");
        zw6 zw625 = r13;
        zw6 zw626 = zw6;
        zw6 zw627 = new zw6(vw04, "404");
        zw6 zw628 = r0;
        zw6 zw629 = zw63;
        zw6 zw630 = new zw6(vw04, "500");
        zw6 zw631 = r0;
        zw6 zw632 = new zw6("accept-charset", "");
        String str = "";
        zw6 zw633 = r0;
        zw6 zw634 = new zw6("accept-encoding", "gzip, deflate");
        zw6 zw635 = r0;
        zw6 zw636 = new zw6("accept-language", str);
        zw6 zw637 = r0;
        zw6 zw638 = new zw6("accept-ranges", str);
        zw6 zw639 = r0;
        zw6 zw640 = new zw6("accept", str);
        zw6 zw641 = r0;
        zw6 zw642 = new zw6("access-control-allow-origin", str);
        zw6 zw643 = r0;
        zw6 zw644 = new zw6("age", str);
        zw6 zw645 = r0;
        zw6 zw646 = new zw6("allow", str);
        zw6 zw647 = r0;
        zw6 zw648 = new zw6("authorization", str);
        zw6 zw649 = r0;
        zw6 zw650 = new zw6("cache-control", str);
        zw6 zw651 = r0;
        zw6 zw652 = new zw6("content-disposition", str);
        zw6 zw653 = r0;
        zw6 zw654 = new zw6("content-encoding", str);
        zw6 zw655 = r0;
        zw6 zw656 = new zw6("content-language", str);
        zw6 zw657 = r0;
        zw6 zw658 = new zw6("content-length", str);
        zw6 zw659 = r0;
        zw6 zw660 = new zw6("content-location", str);
        zw6 zw661 = r0;
        zw6 zw662 = new zw6("content-range", str);
        zw6 zw663 = r0;
        zw6 zw664 = new zw6("content-type", str);
        zw6 zw665 = r0;
        zw6 zw666 = new zw6("cookie", str);
        zw6 zw667 = r0;
        zw6 zw668 = new zw6("date", str);
        zw6 zw669 = r0;
        zw6 zw670 = new zw6("etag", str);
        zw6 zw671 = r0;
        zw6 zw672 = new zw6("expect", str);
        zw6 zw673 = r0;
        zw6 zw674 = new zw6(ClientCookie.EXPIRES_ATTR, str);
        zw6 zw675 = r0;
        zw6 zw676 = new zw6("from", str);
        zw6 zw677 = r0;
        zw6 zw678 = new zw6("host", str);
        zw6 zw679 = r0;
        zw6 zw680 = new zw6("if-match", str);
        zw6 zw681 = r0;
        zw6 zw682 = new zw6("if-modified-since", str);
        zw6 zw683 = r0;
        zw6 zw684 = new zw6("if-none-match", str);
        zw6 zw685 = r0;
        zw6 zw686 = new zw6("if-range", str);
        zw6 zw687 = r0;
        zw6 zw688 = new zw6("if-unmodified-since", str);
        zw6 zw689 = r0;
        zw6 zw690 = new zw6("last-modified", str);
        zw6 zw691 = r0;
        zw6 zw692 = new zw6("link", str);
        zw6 zw693 = r0;
        zw6 zw694 = new zw6("location", str);
        zw6 zw695 = r0;
        zw6 zw696 = new zw6("max-forwards", str);
        zw6 zw697 = r0;
        zw6 zw698 = new zw6("proxy-authenticate", str);
        zw6 zw699 = r0;
        zw6 zw6100 = new zw6("proxy-authorization", str);
        zw6 zw6101 = r0;
        zw6 zw6102 = new zw6("range", str);
        zw6 zw6103 = r0;
        zw6 zw6104 = new zw6("referer", str);
        zw6 zw6105 = r0;
        zw6 zw6106 = new zw6("refresh", str);
        zw6 zw6107 = r0;
        zw6 zw6108 = new zw6("retry-after", str);
        zw6 zw6109 = r0;
        zw6 zw6110 = new zw6("server", str);
        zw6 zw6111 = r0;
        zw6 zw6112 = new zw6("set-cookie", str);
        zw6 zw6113 = r0;
        zw6 zw6114 = new zw6("strict-transport-security", str);
        zw6 zw6115 = r0;
        zw6 zw6116 = new zw6("transfer-encoding", str);
        zw6 zw6117 = r0;
        zw6 zw6118 = new zw6("user-agent", str);
        zw6 zw6119 = r0;
        zw6 zw6120 = new zw6("vary", str);
        zw6 zw6121 = r0;
        zw6 zw6122 = new zw6("via", str);
        zw6 zw6123 = r0;
        zw6 zw6124 = new zw6("www-authenticate", str);
        zw6[] zw6Arr = {zw626, zw629, zw65, zw67, zw69, zw611, zw613, zw615, zw617, zw619, zw621, zw623, zw625, zw628, zw631, zw633, zw635, zw637, zw639, zw641, zw643, zw645, zw647, zw649, zw651, zw653, zw655, zw657, zw659, zw661, zw663, zw665, zw667, zw669, zw671, zw673, zw675, zw677, zw679, zw681, zw683, zw685, zw687, zw689, zw691, zw693, zw695, zw697, zw699, zw6101, zw6103, zw6105, zw6107, zw6109, zw6111, zw6113, zw6115, zw6117, zw6119, zw6121, zw6123};
        a = zw6Arr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(zw6Arr[i].b)) {
                linkedHashMap.put(zw6Arr[i].b, Integer.valueOf(i));
            }
        }
        b = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(vw0 vw0) {
        int c = vw0.c();
        for (int i = 0; i < c; i++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte f = vw0.f(i);
            if (b2 <= f && b3 >= f) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(vw0.j()));
            }
        }
    }
}
