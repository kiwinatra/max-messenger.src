package org.apache.http.impl.auth;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.StringTokenizer;
import kotlin.uuid.Uuid;
import org.apache.http.Header;
import org.apache.http.HttpRequest;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AUTH;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.auth.params.AuthParams;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.EncodingUtils;

@Deprecated
public class DigestScheme extends RFC2617Scheme {
    private static final char[] HEXADECIMAL = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final String NC = "00000001";
    private static final int QOP_AUTH = 2;
    private static final int QOP_AUTH_INT = 1;
    private static final int QOP_MISSING = 0;
    private String cnonce;
    private boolean complete = false;
    private int qopVariant = 0;

    public static String createCnonce() {
        return encode(createMessageDigest("MD5").digest(EncodingUtils.getAsciiBytes(Long.toString(System.currentTimeMillis()))));
    }

    private String createDigest(Credentials credentials) throws AuthenticationException {
        String str;
        String str2;
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("methodname");
        String parameter5 = getParameter("algorithm");
        if (parameter == null) {
            throw new IllegalStateException("URI may not be null");
        } else if (parameter2 == null) {
            throw new IllegalStateException("Realm may not be null");
        } else if (parameter3 != null) {
            if (parameter5 == null) {
                parameter5 = "MD5";
            }
            String parameter6 = getParameter("charset");
            if (parameter6 == null) {
                parameter6 = "ISO-8859-1";
            }
            if (this.qopVariant != 1) {
                MessageDigest createMessageDigest = createMessageDigest("MD5");
                String name = credentials.getUserPrincipal().getName();
                String password = credentials.getPassword();
                StringBuilder sb = new StringBuilder(password.length() + parameter2.length() + name.length() + 2);
                sb.append(name);
                sb.append(':');
                sb.append(parameter2);
                sb.append(':');
                sb.append(password);
                String sb2 = sb.toString();
                if (parameter5.equalsIgnoreCase("MD5-sess")) {
                    String cnonce2 = getCnonce();
                    String encode = encode(createMessageDigest.digest(EncodingUtils.getBytes(sb2, parameter6)));
                    StringBuilder sb3 = new StringBuilder(cnonce2.length() + parameter3.length() + encode.length() + 2);
                    sb3.append(encode);
                    sb3.append(':');
                    sb3.append(parameter3);
                    sb3.append(':');
                    sb3.append(cnonce2);
                    sb2 = sb3.toString();
                } else if (!parameter5.equalsIgnoreCase("MD5")) {
                    throw new AuthenticationException(wj6.k("Unhandled algorithm ", parameter5, " requested"));
                }
                String encode2 = encode(createMessageDigest.digest(EncodingUtils.getBytes(sb2, parameter6)));
                if (this.qopVariant == 1) {
                    str = null;
                } else {
                    str = parameter4 + ':' + parameter;
                }
                String encode3 = encode(createMessageDigest.digest(EncodingUtils.getAsciiBytes(str)));
                if (this.qopVariant == 0) {
                    StringBuilder sb4 = new StringBuilder(encode3.length() + parameter3.length() + encode2.length());
                    sb4.append(encode2);
                    sb4.append(':');
                    sb4.append(parameter3);
                    sb4.append(':');
                    sb4.append(encode3);
                    str2 = sb4.toString();
                } else {
                    String qopVariantString = getQopVariantString();
                    String cnonce3 = getCnonce();
                    StringBuilder sb5 = new StringBuilder(encode3.length() + qopVariantString.length() + cnonce3.length() + parameter3.length() + encode2.length() + 8 + 5);
                    sb5.append(encode2);
                    sb5.append(':');
                    sb5.append(parameter3);
                    sb5.append(":00000001:");
                    sb5.append(cnonce3);
                    sb5.append(':');
                    sb5.append(qopVariantString);
                    sb5.append(':');
                    sb5.append(encode3);
                    str2 = sb5.toString();
                }
                return encode(createMessageDigest.digest(EncodingUtils.getAsciiBytes(str2)));
            }
            throw new AuthenticationException("Unsupported qop in HTTP Digest authentication");
        } else {
            throw new IllegalStateException("Nonce may not be null");
        }
    }

    private Header createDigestHeader(Credentials credentials, String str) throws AuthenticationException {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(Uuid.SIZE_BITS);
        if (isProxy()) {
            charArrayBuffer.append(AUTH.PROXY_AUTH_RESP);
        } else {
            charArrayBuffer.append(AUTH.WWW_AUTH_RESP);
        }
        charArrayBuffer.append(": Digest ");
        String parameter = getParameter("uri");
        String parameter2 = getParameter("realm");
        String parameter3 = getParameter("nonce");
        String parameter4 = getParameter("opaque");
        String parameter5 = getParameter("algorithm");
        String name = credentials.getUserPrincipal().getName();
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(new BasicNameValuePair("username", name));
        arrayList.add(new BasicNameValuePair("realm", parameter2));
        arrayList.add(new BasicNameValuePair("nonce", parameter3));
        arrayList.add(new BasicNameValuePair("uri", parameter));
        arrayList.add(new BasicNameValuePair("response", str));
        if (this.qopVariant != 0) {
            arrayList.add(new BasicNameValuePair("qop", getQopVariantString()));
            arrayList.add(new BasicNameValuePair("nc", NC));
            arrayList.add(new BasicNameValuePair("cnonce", getCnonce()));
        }
        if (parameter5 != null) {
            arrayList.add(new BasicNameValuePair("algorithm", parameter5));
        }
        if (parameter4 != null) {
            arrayList.add(new BasicNameValuePair("opaque", parameter4));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            BasicNameValuePair basicNameValuePair = (BasicNameValuePair) arrayList.get(i);
            if (i > 0) {
                charArrayBuffer.append(", ");
            }
            BasicHeaderValueFormatter.DEFAULT.formatNameValuePair(charArrayBuffer, (NameValuePair) basicNameValuePair, !("nc".equals(basicNameValuePair.getName()) || "qop".equals(basicNameValuePair.getName())));
        }
        return new BufferedHeader(charArrayBuffer);
    }

    private static MessageDigest createMessageDigest(String str) throws UnsupportedDigestAlgorithmException {
        try {
            return MessageDigest.getInstance(str);
        } catch (Exception unused) {
            throw new UnsupportedDigestAlgorithmException(a81.m("Unsupported algorithm in HTTP Digest authentication: ", str));
        }
    }

    private static String encode(byte[] bArr) {
        if (bArr.length != 16) {
            return null;
        }
        char[] cArr = new char[32];
        for (int i = 0; i < 16; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = HEXADECIMAL;
            cArr[i2] = cArr2[(b & 240) >> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    private String getCnonce() {
        if (this.cnonce == null) {
            this.cnonce = createCnonce();
        }
        return this.cnonce;
    }

    private String getQopVariantString() {
        return this.qopVariant == 1 ? "auth-int" : "auth";
    }

    public Header authenticate(Credentials credentials, HttpRequest httpRequest) throws AuthenticationException {
        if (credentials == null) {
            throw new IllegalArgumentException("Credentials may not be null");
        } else if (httpRequest != null) {
            getParameters().put("methodname", httpRequest.getRequestLine().getMethod());
            getParameters().put("uri", httpRequest.getRequestLine().getUri());
            if (getParameter("charset") == null) {
                getParameters().put("charset", AuthParams.getCredentialCharset(httpRequest.getParams()));
            }
            return createDigestHeader(credentials, createDigest(credentials));
        } else {
            throw new IllegalArgumentException("HTTP request may not be null");
        }
    }

    public String getSchemeName() {
        return "digest";
    }

    public boolean isComplete() {
        if ("true".equalsIgnoreCase(getParameter("stale"))) {
            return false;
        }
        return this.complete;
    }

    public boolean isConnectionBased() {
        return false;
    }

    public void overrideParamter(String str, String str2) {
        getParameters().put(str, str2);
    }

    public void processChallenge(Header header) throws MalformedChallengeException {
        super.processChallenge(header);
        if (getParameter("realm") == null) {
            throw new MalformedChallengeException("missing realm in challange");
        } else if (getParameter("nonce") != null) {
            String parameter = getParameter("qop");
            boolean z = false;
            if (parameter != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(parameter, ",");
                while (true) {
                    if (!stringTokenizer.hasMoreTokens()) {
                        break;
                    }
                    String trim = stringTokenizer.nextToken().trim();
                    if (trim.equals("auth")) {
                        this.qopVariant = 2;
                        break;
                    } else if (trim.equals("auth-int")) {
                        this.qopVariant = 1;
                    } else {
                        z = true;
                    }
                }
            }
            if (!z || this.qopVariant != 0) {
                this.cnonce = null;
                this.complete = true;
                return;
            }
            throw new MalformedChallengeException("None of the qop methods is supported");
        } else {
            throw new MalformedChallengeException("missing nonce in challange");
        }
    }
}
