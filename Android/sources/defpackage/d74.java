package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.net.URLDecoder;

/* renamed from: d74  reason: default package */
public final class d74 extends cj0 {
    public p74 v;
    public byte[] w;
    public int x;
    public int y;

    public final long N(p74 p74) {
        c();
        this.v = p74;
        Uri uri = p74.a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        y64.f(valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "), equals);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = t0g.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.w = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    String valueOf2 = String.valueOf(str);
                    throw new ParserException(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e, true, 0);
                }
            } else {
                this.w = URLDecoder.decode(str, x22.a.name()).getBytes(x22.c);
            }
            byte[] bArr = this.w;
            long j = p74.f;
            if (j <= ((long) bArr.length)) {
                int i2 = (int) j;
                this.x = i2;
                int length = bArr.length - i2;
                this.y = length;
                long j2 = p74.g;
                int i3 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i3 != 0) {
                    this.y = (int) Math.min((long) length, j2);
                }
                d(p74);
                return i3 != 0 ? j2 : (long) this.y;
            }
            this.w = null;
            throw new DataSourceException(2008);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(valueOf3.length() + 23);
        sb.append("Unexpected URI format: ");
        sb.append(valueOf3);
        throw new ParserException(sb.toString(), (Exception) null, true, 0);
    }

    public final void close() {
        if (this.w != null) {
            this.w = null;
            b();
        }
        this.v = null;
    }

    public final Uri getUri() {
        p74 p74 = this.v;
        if (p74 != null) {
            return p74.a;
        }
        return null;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.y;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.w;
        int i4 = t0g.a;
        System.arraycopy(bArr2, this.x, bArr, i, min);
        this.x += min;
        this.y -= min;
        a(min);
        return min;
    }
}
