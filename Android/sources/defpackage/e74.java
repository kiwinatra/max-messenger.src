package defpackage;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import java.net.URLDecoder;

/* renamed from: e74  reason: default package */
public final class e74 extends dj0 {
    public q74 v;
    public byte[] w;
    public int x;
    public int y;

    public final long G(q74 q74) {
        c();
        this.v = q74;
        Uri normalizeScheme = q74.a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        n79.f("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i = v0g.a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.w = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw new ParserException(a81.m("Error while parsing Base64 encoded string: ", str), e, true, 0);
                }
            } else {
                this.w = URLDecoder.decode(str, x22.a.name()).getBytes(x22.c);
            }
            byte[] bArr = this.w;
            long j = q74.f;
            if (j <= ((long) bArr.length)) {
                int i2 = (int) j;
                this.x = i2;
                int length = bArr.length - i2;
                this.y = length;
                long j2 = q74.g;
                int i3 = (j2 > -1 ? 1 : (j2 == -1 ? 0 : -1));
                if (i3 != 0) {
                    this.y = (int) Math.min((long) length, j2);
                }
                d(q74);
                return i3 != 0 ? j2 : (long) this.y;
            }
            this.w = null;
            throw new DataSourceException(2008);
        }
        throw new ParserException("Unexpected URI format: " + normalizeScheme, (Exception) null, true, 0);
    }

    public final void close() {
        if (this.w != null) {
            this.w = null;
            b();
        }
        this.v = null;
    }

    public final Uri getUri() {
        q74 q74 = this.v;
        if (q74 != null) {
            return q74.a;
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
        int i4 = v0g.a;
        System.arraycopy(bArr2, this.x, bArr, i, min);
        this.x += min;
        this.y -= min;
        a(min);
        return min;
    }
}
