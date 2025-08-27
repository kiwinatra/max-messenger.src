package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.List;
import org.apache.http.Header;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.SM;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class BrowserCompatSpec extends CookieSpecBase {
    protected static final String[] DATE_PATTERNS = {"EEE, dd MMM yyyy HH:mm:ss zzz", DateUtils.PATTERN_RFC1036, DateUtils.PATTERN_ASCTIME, "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z"};
    private final String[] datepatterns;

    public BrowserCompatSpec(String[] strArr) {
        if (strArr != null) {
            this.datepatterns = (String[]) strArr.clone();
        } else {
            this.datepatterns = DATE_PATTERNS;
        }
        registerAttribHandler(ClientCookie.PATH_ATTR, new BasicPathHandler());
        registerAttribHandler(ClientCookie.DOMAIN_ATTR, new BasicDomainHandler());
        registerAttribHandler(ClientCookie.MAX_AGE_ATTR, new BasicMaxAgeHandler());
        registerAttribHandler(ClientCookie.SECURE_ATTR, new BasicSecureHandler());
        registerAttribHandler(ClientCookie.COMMENT_ATTR, new BasicCommentHandler());
        registerAttribHandler(ClientCookie.EXPIRES_ATTR, new BasicExpiresHandler(this.datepatterns));
    }

    public List<Header> formatCookies(List<Cookie> list) {
        if (list == null) {
            throw new IllegalArgumentException("List of cookies may not be null");
        } else if (!list.isEmpty()) {
            CharArrayBuffer charArrayBuffer = new CharArrayBuffer(list.size() * 20);
            charArrayBuffer.append(SM.COOKIE);
            charArrayBuffer.append(": ");
            for (int i = 0; i < list.size(); i++) {
                Cookie cookie = list.get(i);
                if (i > 0) {
                    charArrayBuffer.append("; ");
                }
                charArrayBuffer.append(cookie.getName());
                charArrayBuffer.append("=");
                String value = cookie.getValue();
                if (value != null) {
                    charArrayBuffer.append(value);
                }
            }
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new BufferedHeader(charArrayBuffer));
            return arrayList;
        } else {
            throw new IllegalArgumentException("List of cookies may not be empty");
        }
    }

    public int getVersion() {
        return 0;
    }

    public Header getVersionHeader() {
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<org.apache.http.cookie.Cookie> parse(org.apache.http.Header r7, org.apache.http.cookie.CookieOrigin r8) throws org.apache.http.cookie.MalformedCookieException {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x008c
            if (r8 == 0) goto L_0x0084
            java.lang.String r0 = r7.getValue()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r0.toLowerCase(r1)
            java.lang.String r2 = "expires="
            int r1 = r1.indexOf(r2)
            r2 = 1
            r3 = -1
            r4 = 0
            if (r1 == r3) goto L_0x0032
            int r1 = r1 + 8
            r5 = 59
            int r5 = r0.indexOf(r5, r1)
            if (r5 != r3) goto L_0x0027
            int r5 = r0.length()
        L_0x0027:
            java.lang.String r0 = r0.substring(r1, r5)     // Catch:{ DateParseException -> 0x0032 }
            java.lang.String[] r1 = r6.datepatterns     // Catch:{ DateParseException -> 0x0032 }
            org.apache.http.impl.cookie.DateUtils.parseDate(r0, r1)     // Catch:{ DateParseException -> 0x0032 }
            r0 = r2
            goto L_0x0033
        L_0x0032:
            r0 = r4
        L_0x0033:
            if (r0 == 0) goto L_0x007b
            org.apache.http.impl.cookie.NetscapeDraftHeaderParser r0 = org.apache.http.impl.cookie.NetscapeDraftHeaderParser.DEFAULT
            boolean r1 = r7 instanceof org.apache.http.FormattedHeader
            if (r1 == 0) goto L_0x004f
            org.apache.http.FormattedHeader r7 = (org.apache.http.FormattedHeader) r7
            org.apache.http.util.CharArrayBuffer r1 = r7.getBuffer()
            org.apache.http.message.ParserCursor r3 = new org.apache.http.message.ParserCursor
            int r7 = r7.getValuePos()
            int r5 = r1.length()
            r3.<init>(r7, r5)
            goto L_0x006a
        L_0x004f:
            java.lang.String r7 = r7.getValue()
            if (r7 == 0) goto L_0x0073
            org.apache.http.util.CharArrayBuffer r1 = new org.apache.http.util.CharArrayBuffer
            int r3 = r7.length()
            r1.<init>(r3)
            r1.append((java.lang.String) r7)
            org.apache.http.message.ParserCursor r3 = new org.apache.http.message.ParserCursor
            int r7 = r1.length()
            r3.<init>(r4, r7)
        L_0x006a:
            org.apache.http.HeaderElement[] r7 = new org.apache.http.HeaderElement[r2]
            org.apache.http.HeaderElement r0 = r0.parseHeader(r1, r3)
            r7[r4] = r0
            goto L_0x007f
        L_0x0073:
            org.apache.http.cookie.MalformedCookieException r6 = new org.apache.http.cookie.MalformedCookieException
            java.lang.String r7 = "Header value is null"
            r6.<init>(r7)
            throw r6
        L_0x007b:
            org.apache.http.HeaderElement[] r7 = r7.getElements()
        L_0x007f:
            java.util.List r6 = r6.parse(r7, r8)
            return r6
        L_0x0084:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Cookie origin may not be null"
            r6.<init>(r7)
            throw r6
        L_0x008c:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Header may not be null"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.impl.cookie.BrowserCompatSpec.parse(org.apache.http.Header, org.apache.http.cookie.CookieOrigin):java.util.List");
    }

    public BrowserCompatSpec() {
        this((String[]) null);
    }
}
