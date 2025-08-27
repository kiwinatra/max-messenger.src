package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;

/* renamed from: p74  reason: default package */
public final class p74 {
    public static final /* synthetic */ int k = 0;
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;
    public final Object j;

    static {
        gd5.a("goog.exo.datasource");
    }

    public p74(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3, Object obj) {
        long j5 = j2;
        byte[] bArr2 = bArr;
        long j6 = j3;
        long j7 = j4;
        boolean z = false;
        y64.g(j5 + j6 >= 0);
        y64.g(j6 >= 0);
        y64.g((j7 > 0 || j7 == -1) ? true : z);
        this.a = uri;
        this.b = j5;
        this.c = i2;
        this.d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j6;
        this.g = j7;
        this.h = str;
        this.i = i3;
        this.j = obj;
    }

    public final o74 a() {
        o74 o74 = new o74(false, 0);
        o74.b = this.a;
        o74.c = this.b;
        o74.d = this.c;
        o74.e = this.d;
        o74.f = this.e;
        o74.g = this.f;
        o74.h = this.g;
        o74.i = this.h;
        o74.j = this.i;
        o74.k = this.j;
        return o74;
    }

    public final p74 b(long j2) {
        long j3 = this.g;
        long j4 = -1;
        if (j3 != -1) {
            j4 = j3 - j2;
        }
        return c(j2, j4);
    }

    public final p74 c(long j2, long j3) {
        if (j2 == 0 && this.g == j3) {
            return this;
        }
        return new p74(this.a, this.b, this.c, this.d, this.e, this.f + j2, j3, this.h, this.i, this.j);
    }

    public final String toString() {
        String str;
        int i2 = this.c;
        if (i2 == 1) {
            str = HttpGet.METHOD_NAME;
        } else if (i2 == 2) {
            str = HttpPost.METHOD_NAME;
        } else if (i2 == 3) {
            str = HttpHead.METHOD_NAME;
        } else {
            throw new IllegalStateException();
        }
        String valueOf = String.valueOf(this.a);
        int length = valueOf.length() + str.length() + 70;
        String str2 = this.h;
        StringBuilder sb = new StringBuilder(g63.f(length, str2));
        sb.append("DataSpec[");
        sb.append(str);
        sb.append(" ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        return wj6.l(sb, this.i, "]");
    }
}
