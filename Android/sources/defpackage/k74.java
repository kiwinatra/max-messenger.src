package defpackage;

import android.graphics.BitmapFactory;
import android.net.Uri;

/* renamed from: k74  reason: default package */
public final class k74 implements fo0 {
    public static final s2f o = m58.B(new ad3(1));
    public final n08 a;
    public final g74 b;
    public final BitmapFactory.Options c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k74(android.content.Context r3) {
        /*
            r2 = this;
            s2f r0 = o
            java.lang.Object r0 = r0.get()
            n08 r0 = (defpackage.n08) r0
            defpackage.n79.o(r0)
            ud4 r1 = new ud4
            r1.<init>(r3)
            r3 = 0
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k74.<init>(android.content.Context):void");
    }

    public final zz7 d(Uri uri) {
        return ((ct9) this.a).a(new z52(2, this, uri));
    }

    public final zz7 n(byte[] bArr) {
        return ((ct9) this.a).a(new z52(1, this, bArr));
    }

    public k74(n08 n08, ud4 ud4, BitmapFactory.Options options) {
        this.a = n08;
        this.b = ud4;
        this.c = options;
    }
}
