package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: i77  reason: default package */
public final class i77 extends m58 {
    public static final Pattern m = Pattern.compile("(.+?)='(.*?)';", 32);
    public final CharsetDecoder k = x22.c.newDecoder();
    public final CharsetDecoder l = x22.b.newDecoder();

    public final sp9 l(xp9 xp9, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.l;
        CharsetDecoder charsetDecoder2 = this.k;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new sp9(new m77((String) null, (String) null, bArr));
        }
        Matcher matcher = m.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String P = o54.P(group);
                P.getClass();
                if (P.equals("streamurl")) {
                    str3 = group2;
                } else if (P.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new sp9(new m77(str2, str3, bArr));
    }
}
