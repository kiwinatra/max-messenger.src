package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* renamed from: tc0  reason: default package */
public final class tc0 {
    public final String a;
    public final byte[] b;
    public final tub c;

    public tc0(String str, byte[] bArr, tub tub) {
        this.a = str;
        this.b = bArr;
        this.c = tub;
    }

    public static g6d a() {
        g6d g6d = new g6d(2, false);
        g6d.o = tub.a;
        return g6d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tc0)) {
            return false;
        }
        tc0 tc0 = (tc0) obj;
        return this.a.equals(tc0.a) && Arrays.equals(this.b, tc0.b) && this.c.equals(tc0.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        return "TransportContext(" + this.a + ", " + this.c + ", " + encodeToString + ")";
    }
}
