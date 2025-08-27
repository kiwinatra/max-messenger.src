package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: tq8  reason: default package */
public final class tq8 {
    public static final String i = Integer.toString(0, 36);
    public static final String j = Integer.toString(1, 36);
    public static final String k = Integer.toString(2, 36);
    public static final String l = Integer.toString(3, 36);
    public static final String m = Integer.toString(4, 36);
    public static final String n = Integer.toString(5, 36);
    public static final String o = Integer.toString(6, 36);
    public static final String p = Integer.toString(7, 36);
    public final UUID a;
    public final Uri b;
    public final wb7 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final tb7 g;
    public final byte[] h;

    static {
        int i2 = v0g.a;
    }

    public tq8(gc4 gc4) {
        n79.n(!gc4.c || ((Uri) gc4.e) != null);
        UUID uuid = (UUID) gc4.d;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) gc4.e;
        this.c = (wb7) gc4.f;
        this.d = gc4.a;
        this.f = gc4.c;
        this.e = gc4.b;
        this.g = (tb7) gc4.g;
        byte[] bArr = (byte[]) gc4.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq8)) {
            return false;
        }
        tq8 tq8 = (tq8) obj;
        return this.a.equals(tq8.a) && v0g.a(this.b, tq8.b) && v0g.a(this.c, tq8.c) && this.d == tq8.d && this.f == tq8.f && this.e == tq8.e && this.g.equals(tq8.g) && Arrays.equals(this.h, tq8.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int hashCode2 = uri != null ? uri.hashCode() : 0;
        int hashCode3 = this.c.hashCode();
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((hashCode3 + ((hashCode + hashCode2) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
