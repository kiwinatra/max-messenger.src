package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: jf4  reason: default package */
public final class jf4 implements zf5 {
    public static final p7d X = new p7d(new tb4(18));
    public static final int[] y = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final p7d z = new p7d(new tb4(17));
    public boolean a;
    public int b;
    public int c;
    public k0d o;
    public boolean v = true;
    public gze w = new ece(10);
    public int x;

    public final void a(int i, ArrayList arrayList) {
        int i2 = 2;
        int i3 = 0;
        switch (i) {
            case 0:
                arrayList.add(new m3());
                return;
            case 1:
                arrayList.add(new q3());
                return;
            case 2:
                arrayList.add(new ac(this.a ? 1 : 0));
                return;
            case 3:
                arrayList.add(new ld(this.a ? 1 : 0));
                return;
            case 4:
                tf5 w2 = z.w(0);
                if (w2 != null) {
                    arrayList.add(w2);
                    return;
                } else {
                    arrayList.add(new qq5());
                    return;
                }
            case 5:
                arrayList.add(new qx5());
                return;
            case 6:
                gze gze = this.w;
                int i4 = this.b;
                if (this.v) {
                    i2 = 0;
                }
                arrayList.add(new lh8(i4 | i2, gze));
                return;
            case 7:
                arrayList.add(new ku9(this.a ? 1 : 0));
                return;
            case 8:
                arrayList.add(new vd6(this.v ? 0 : 32, this.w));
                gze gze2 = this.w;
                int i5 = this.c;
                if (!this.v) {
                    i3 = 16;
                }
                arrayList.add(new ou9(i5 | i3, gze2));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new y9c());
                return;
            case 11:
                if (this.o == null) {
                    lx5 lx5 = tb7.b;
                    this.o = k0d.v;
                }
                arrayList.add(new ntf(1, this.v ^ true ? 1 : 0, this.w, new rkf(0), new kk3(this.o, 0, 3)));
                return;
            case 12:
                arrayList.add(new efg());
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                arrayList.add(new dh4(this.x));
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                tf5 w3 = X.w(new Object[0]);
                if (w3 != null) {
                    arrayList.add(w3);
                    return;
                }
                return;
            case 16:
                arrayList.add(new ne0(this.v ^ true ? 1 : 0, this.w));
                return;
            case LangUtils.HASH_SEED /*17*/:
                arrayList.add(new dq0(1));
                return;
            case 18:
                arrayList.add(new qe0(2));
                return;
            case 19:
                arrayList.add(new dq0(0));
                return;
            case 20:
                int i6 = this.c;
                if ((i6 & 2) == 0 && (i6 & 4) == 0) {
                    arrayList.add(new qe0(1));
                    return;
                }
                return;
            case 21:
                arrayList.add(new qe0(0));
                return;
            default:
                return;
        }
    }

    public final synchronized tf5[] c() {
        return d(Uri.EMPTY, new HashMap());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[Catch:{ all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056 A[Catch:{ all -> 0x0048 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.tf5[] d(android.net.Uri r7, java.util.Map r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            int[] r1 = y     // Catch:{ all -> 0x0048 }
            r2 = 21
            r0.<init>(r2)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "Content-Type"
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x0048 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x0048 }
            r3 = 0
            if (r8 == 0) goto L_0x0023
            boolean r4 = r8.isEmpty()     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0023
        L_0x001c:
            java.lang.Object r8 = r8.get(r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0048 }
            goto L_0x0024
        L_0x0023:
            r8 = 0
        L_0x0024:
            int r8 = defpackage.fqc.w(r8)     // Catch:{ all -> 0x0048 }
            r4 = -1
            if (r8 == r4) goto L_0x002e
            r6.a(r8, r0)     // Catch:{ all -> 0x0048 }
        L_0x002e:
            int r7 = defpackage.fqc.x(r7)     // Catch:{ all -> 0x0048 }
            if (r7 == r4) goto L_0x0039
            if (r7 == r8) goto L_0x0039
            r6.a(r7, r0)     // Catch:{ all -> 0x0048 }
        L_0x0039:
            r4 = r3
        L_0x003a:
            if (r4 >= r2) goto L_0x004a
            r5 = r1[r4]     // Catch:{ all -> 0x0048 }
            if (r5 == r8) goto L_0x0045
            if (r5 == r7) goto L_0x0045
            r6.a(r5, r0)     // Catch:{ all -> 0x0048 }
        L_0x0045:
            int r4 = r4 + 1
            goto L_0x003a
        L_0x0048:
            r7 = move-exception
            goto L_0x0097
        L_0x004a:
            int r7 = r0.size()     // Catch:{ all -> 0x0048 }
            tf5[] r7 = new defpackage.tf5[r7]     // Catch:{ all -> 0x0048 }
        L_0x0050:
            int r8 = r0.size()     // Catch:{ all -> 0x0048 }
            if (r3 >= r8) goto L_0x0095
            java.lang.Object r8 = r0.get(r3)     // Catch:{ all -> 0x0048 }
            tf5 r8 = (defpackage.tf5) r8     // Catch:{ all -> 0x0048 }
            boolean r1 = r6.v     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0090
            tf5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.vd6     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            tf5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.ou9     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            tf5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.ntf     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            tf5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.ne0     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            tf5 r1 = r8.m()     // Catch:{ all -> 0x0048 }
            boolean r1 = r1 instanceof defpackage.lh8     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0090
            jze r1 = new jze     // Catch:{ all -> 0x0048 }
            gze r2 = r6.w     // Catch:{ all -> 0x0048 }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x0048 }
            r8 = r1
        L_0x0090:
            r7[r3] = r8     // Catch:{ all -> 0x0048 }
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0095:
            monitor-exit(r6)
            return r7
        L_0x0097:
            monitor-exit(r6)     // Catch:{ all -> 0x0048 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf4.d(android.net.Uri, java.util.Map):tf5[]");
    }

    public final void e(ece ece) {
        synchronized (this) {
            this.w = ece;
        }
    }

    public final void i(boolean z2) {
        synchronized (this) {
            this.v = z2;
        }
    }
}
