package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: akf  reason: default package */
public final class akf {
    public final /* synthetic */ int a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;

    public akf(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new long[10];
                this.c = new Object[10];
                return;
            default:
                this.b = new long[10];
                this.c = new Object[10];
                return;
        }
    }

    public final synchronized void a(long j, Object obj) {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    int i2 = this.e;
                    if (i2 > 0) {
                        if (j <= this.b[((this.d + i2) - 1) % this.c.length]) {
                            b();
                        }
                    }
                    c();
                    int i3 = this.d;
                    int i4 = this.e;
                    Object[] objArr = this.c;
                    int length = (i3 + i4) % objArr.length;
                    this.b[length] = j;
                    objArr[length] = obj;
                    this.e = i4 + 1;
                    return;
                default:
                    int i5 = this.e;
                    if (i5 > 0) {
                        if (j <= this.b[((this.d + i5) - 1) % this.c.length]) {
                            b();
                        }
                    }
                    c();
                    int i6 = this.d;
                    int i7 = this.e;
                    Object[] objArr2 = this.c;
                    int length2 = (i6 + i7) % objArr2.length;
                    this.b[length2] = j;
                    objArr2[length2] = obj;
                    this.e = i7 + 1;
                    return;
            }
        }
    }

    public final synchronized void b() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    this.d = 0;
                    this.e = 0;
                    Arrays.fill(this.c, (Object) null);
                    return;
                default:
                    this.d = 0;
                    this.e = 0;
                    Arrays.fill(this.c, (Object) null);
                    return;
            }
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                int length = this.c.length;
                if (this.e >= length) {
                    int i = length * 2;
                    long[] jArr = new long[i];
                    Object[] objArr = new Object[i];
                    int i2 = this.d;
                    int i3 = length - i2;
                    System.arraycopy(this.b, i2, jArr, 0, i3);
                    System.arraycopy(this.c, this.d, objArr, 0, i3);
                    int i4 = this.d;
                    if (i4 > 0) {
                        System.arraycopy(this.b, 0, jArr, i3, i4);
                        System.arraycopy(this.c, 0, objArr, i3, this.d);
                    }
                    this.b = jArr;
                    this.c = objArr;
                    this.d = 0;
                    return;
                }
                return;
            default:
                int length2 = this.c.length;
                if (this.e >= length2) {
                    int i5 = length2 * 2;
                    long[] jArr2 = new long[i5];
                    Object[] objArr2 = new Object[i5];
                    int i6 = this.d;
                    int i7 = length2 - i6;
                    System.arraycopy(this.b, i6, jArr2, 0, i7);
                    System.arraycopy(this.c, this.d, objArr2, 0, i7);
                    int i8 = this.d;
                    if (i8 > 0) {
                        System.arraycopy(this.b, 0, jArr2, i7, i8);
                        System.arraycopy(this.c, 0, objArr2, i7, this.d);
                    }
                    this.b = jArr2;
                    this.c = objArr2;
                    this.d = 0;
                    return;
                }
                return;
        }
    }

    public Object d(long j, boolean z) {
        Object obj = null;
        long j2 = LongCompanionObject.MAX_VALUE;
        while (this.e > 0) {
            long j3 = j - this.b[this.d];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = g();
            j2 = j3;
        }
        return obj;
    }

    public synchronized Object e() {
        return this.e == 0 ? null : g();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 118 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object f(long r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
        L_0x0002:
            int r1 = r5.e     // Catch:{ all -> 0x001e }
            if (r1 <= 0) goto L_0x001a
            long[] r1 = r5.b     // Catch:{ all -> 0x001e }
            int r2 = r5.d     // Catch:{ all -> 0x001e }
            r1 = r1[r2]     // Catch:{ all -> 0x001e }
            long r1 = r6 - r1
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.lang.Object r0 = r5.g()     // Catch:{ all -> 0x001e }
            goto L_0x0002
        L_0x001a:
            monitor-exit(r5)
            return r0
        L_0x001c:
            monitor-exit(r5)     // Catch:{ all -> 0x001e }
            throw r6
        L_0x001e:
            r6 = move-exception
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akf.f(long):java.lang.Object");
    }

    public final Object g() {
        switch (this.a) {
            case 0:
                y64.j(this.e > 0);
                Object[] objArr = this.c;
                int i = this.d;
                Object obj = objArr[i];
                objArr[i] = null;
                this.d = (i + 1) % objArr.length;
                this.e--;
                return obj;
            default:
                n79.n(this.e > 0);
                Object[] objArr2 = this.c;
                int i2 = this.d;
                Object obj2 = objArr2[i2];
                objArr2[i2] = null;
                this.d = (i2 + 1) % objArr2.length;
                this.e--;
                return obj2;
        }
    }

    public synchronized int h() {
        return this.e;
    }
}
