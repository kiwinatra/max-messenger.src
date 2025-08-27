package defpackage;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* renamed from: pca  reason: default package */
public final class pca {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public final boolean d;
    public final Bundle e;
    public ArrayList f;
    public int g;
    public boolean h;
    public final boolean i;
    public final boolean j;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public pca(int i2, String str, PendingIntent pendingIntent) {
        this(i2 != 0 ? IconCompat.d((Resources) null, "", i2) : null, str, pendingIntent, new Bundle());
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.qca a() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0.i
            if (r1 != 0) goto L_0x0007
            goto L_0x000b
        L_0x0007:
            android.app.PendingIntent r1 = r0.c
            if (r1 == 0) goto L_0x008d
        L_0x000b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = r0.f
            if (r3 == 0) goto L_0x0046
            java.util.Iterator r3 = r3.iterator()
        L_0x001d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r3.next()
            a1d r4 = (defpackage.a1d) r4
            boolean r5 = r4.d
            if (r5 != 0) goto L_0x0042
            java.lang.CharSequence[] r5 = r4.c
            if (r5 == 0) goto L_0x0034
            int r5 = r5.length
            if (r5 != 0) goto L_0x0042
        L_0x0034:
            java.util.Set r5 = r4.g
            if (r5 == 0) goto L_0x0042
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0042
            r1.add(r4)
            goto L_0x001d
        L_0x0042:
            r2.add(r4)
            goto L_0x001d
        L_0x0046:
            boolean r3 = r1.isEmpty()
            r4 = 0
            if (r3 == 0) goto L_0x004f
            r11 = r4
            goto L_0x005c
        L_0x004f:
            int r3 = r1.size()
            a1d[] r3 = new defpackage.a1d[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            a1d[] r1 = (defpackage.a1d[]) r1
            r11 = r1
        L_0x005c:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x0064
        L_0x0062:
            r10 = r4
            goto L_0x0072
        L_0x0064:
            int r1 = r2.size()
            a1d[] r1 = new defpackage.a1d[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            r4 = r1
            a1d[] r4 = (defpackage.a1d[]) r4
            goto L_0x0062
        L_0x0072:
            qca r1 = new qca
            int r13 = r0.g
            boolean r14 = r0.h
            boolean r15 = r0.i
            boolean r2 = r0.j
            androidx.core.graphics.drawable.IconCompat r6 = r0.a
            java.lang.CharSequence r7 = r0.b
            android.app.PendingIntent r8 = r0.c
            android.os.Bundle r9 = r0.e
            boolean r12 = r0.d
            r5 = r1
            r16 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r1
        L_0x008d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Contextual Actions must contain a valid PendingIntent"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pca.a():qca");
    }

    public pca(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.d = true;
        this.h = true;
        this.a = iconCompat;
        this.b = eda.c(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = 0;
        this.h = true;
        this.i = false;
        this.j = false;
    }
}
