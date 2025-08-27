package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import org.apache.commons.codec.BinaryDecoder;
import org.apache.commons.codec.BinaryEncoder;
import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringDecoder;
import org.apache.commons.codec.StringEncoder;

@Deprecated
public class URLCodec implements BinaryEncoder, BinaryDecoder, StringEncoder, StringDecoder {
    protected static byte ESCAPE_CHAR = 37;
    protected static final BitSet WWW_FORM_URL = new BitSet(256);
    protected String charset;

    static {
        for (int i = 97; i <= 122; i++) {
            WWW_FORM_URL.set(i);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            WWW_FORM_URL.set(i2);
        }
        for (int i3 = 48; i3 <= 57; i3++) {
            WWW_FORM_URL.set(i3);
        }
        BitSet bitSet = WWW_FORM_URL;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
    }

    public URLCodec() {
        this.charset = "UTF-8";
    }

    public static final byte[] decodeUrl(byte[] bArr) throws DecoderException {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < bArr.length) {
            byte b = bArr[i];
            if (b == 43) {
                byteArrayOutputStream.write(32);
            } else if (b == 37) {
                try {
                    int digit = Character.digit((char) bArr[i + 1], 16);
                    i += 2;
                    int digit2 = Character.digit((char) bArr[i], 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new DecoderException("Invalid URL encoding");
                    }
                    byteArrayOutputStream.write((char) ((digit << 4) + digit2));
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new DecoderException("Invalid URL encoding");
                }
            } else {
                byteArrayOutputStream.write(b);
            }
            i++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] encodeUrl(java.util.BitSet r5, byte[] r6) {
        /*
            if (r6 != 0) goto L_0x0004
            r5 = 0
            return r5
        L_0x0004:
            if (r5 != 0) goto L_0x0008
            java.util.BitSet r5 = WWW_FORM_URL
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        L_0x000e:
            int r2 = r6.length
            if (r1 >= r2) goto L_0x004d
            byte r2 = r6[r1]
            if (r2 >= 0) goto L_0x0017
            int r2 = r2 + 256
        L_0x0017:
            boolean r3 = r5.get(r2)
            if (r3 == 0) goto L_0x0027
            r3 = 32
            if (r2 != r3) goto L_0x0023
            r2 = 43
        L_0x0023:
            r0.write(r2)
            goto L_0x004a
        L_0x0027:
            r3 = 37
            r0.write(r3)
            int r3 = r2 >> 4
            r3 = r3 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            char r3 = java.lang.Character.toUpperCase(r3)
            r2 = r2 & 15
            char r2 = java.lang.Character.forDigit(r2, r4)
            char r2 = java.lang.Character.toUpperCase(r2)
            r0.write(r3)
            r0.write(r2)
        L_0x004a:
            int r1 = r1 + 1
            goto L_0x000e
        L_0x004d:
            byte[] r5 = r0.toByteArray()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.codec.net.URLCodec.encodeUrl(java.util.BitSet, byte[]):byte[]");
    }

    public byte[] decode(byte[] bArr) throws DecoderException {
        return decodeUrl(bArr);
    }

    public byte[] encode(byte[] bArr) {
        return encodeUrl(WWW_FORM_URL, bArr);
    }

    public String getDefaultCharset() {
        return this.charset;
    }

    public String getEncoding() {
        return this.charset;
    }

    public String decode(String str, String str2) throws DecoderException, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(decode(str.getBytes("US-ASCII")), str2);
    }

    public String encode(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(encode(str.getBytes(str2)), "US-ASCII");
    }

    public URLCodec(String str) {
        this.charset = str;
    }

    public String decode(String str) throws DecoderException {
        if (str == null) {
            return null;
        }
        try {
            return decode(str, getDefaultCharset());
        } catch (UnsupportedEncodingException e) {
            throw new DecoderException(e.getMessage());
        }
    }

    public String encode(String str) throws EncoderException {
        if (str == null) {
            return null;
        }
        try {
            return encode(str, getDefaultCharset());
        } catch (UnsupportedEncodingException e) {
            throw new EncoderException(e.getMessage());
        }
    }

    public Object decode(Object obj) throws DecoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return decode((byte[]) obj);
        }
        if (obj instanceof String) {
            return decode((String) obj);
        }
        throw new DecoderException("Objects of type " + obj.getClass().getName() + " cannot be URL decoded");
    }

    public Object encode(Object obj) throws EncoderException {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return encode((byte[]) obj);
        }
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("Objects of type " + obj.getClass().getName() + " cannot be URL encoded");
    }
}
