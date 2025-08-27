package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

/* renamed from: p1  reason: default package */
public abstract class p1 extends q1 implements c1g {
    public static final char[] o = "0123456789ABCDEF".toCharArray();
    public final byte[] a;
    public volatile String b;
    public volatile CharacterCodingException c;

    public p1(byte[] bArr) {
        this.a = bArr;
    }

    public static void D(StringBuilder sb, String str) {
        sb.append("\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ') {
                switch (charAt) {
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        G(sb, charAt);
                        break;
                }
            } else if (charAt <= 127) {
                if (charAt == '\"') {
                    sb.append("\\\"");
                } else if (charAt != '\\') {
                    sb.append(charAt);
                } else {
                    sb.append("\\\\");
                }
            } else if (charAt < 55296 || charAt > 57343) {
                sb.append(charAt);
            } else {
                G(sb, charAt);
            }
        }
        sb.append("\"");
    }

    public static void G(StringBuilder sb, int i) {
        sb.append("\\u");
        char[] cArr = o;
        sb.append(cArr[(i >> 12) & 15]);
        sb.append(cArr[(i >> 8) & 15]);
        sb.append(cArr[(i >> 4) & 15]);
        sb.append(cArr[i & 15]);
    }

    public final String E() {
        if (this.b == null) {
            F();
        }
        if (this.c == null) {
            return this.b;
        }
        throw new RuntimeException(this.c);
    }

    public final void F() {
        synchronized (this.a) {
            if (this.b == null) {
                try {
                    CharsetDecoder newDecoder = fd9.a.newDecoder();
                    CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
                    this.b = newDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                } catch (CharacterCodingException e) {
                    throw new RuntimeException(e);
                } catch (CharacterCodingException e2) {
                    CharsetDecoder newDecoder2 = fd9.a.newDecoder();
                    CodingErrorAction codingErrorAction2 = CodingErrorAction.REPLACE;
                    this.b = newDecoder2.onMalformedInput(codingErrorAction2).onUnmappableCharacter(codingErrorAction2).decode(ByteBuffer.wrap(this.a).asReadOnlyBuffer()).toString();
                    this.c = e2;
                }
            }
        }
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        D(sb, toString());
        return sb.toString();
    }

    public final String toString() {
        if (this.b == null) {
            F();
        }
        return this.b;
    }
}
