package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: kc3  reason: default package */
public final class kc3 implements mq4, nq4 {
    public he3 a;
    public volatile boolean b;

    public static void e(he3 he3) {
        if (he3 != null) {
            ArrayList arrayList = null;
            for (Object obj : (Object[]) he3.d) {
                if (obj instanceof mq4) {
                    try {
                        ((mq4) obj).dispose();
                    } catch (Throwable th) {
                        hd8.Z(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw p95.f((Throwable) arrayList.get(0));
            }
            throw new CompositeException((List) arrayList);
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [he3, java.lang.Object] */
    public final boolean a(mq4 mq4) {
        Objects.requireNonNull(mq4, "disposable is null");
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        he3 he3 = this.a;
                        he3 he32 = he3;
                        if (he3 == null) {
                            ? obj = new Object();
                            int numberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            obj.a = numberOfLeadingZeros - 1;
                            obj.c = (int) (0.75f * ((float) numberOfLeadingZeros));
                            obj.d = new Object[numberOfLeadingZeros];
                            this.a = obj;
                            he32 = obj;
                        }
                        he32.a(mq4);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        mq4.dispose();
        return false;
    }

    public final boolean b(mq4 mq4) {
        if (!c(mq4)) {
            return false;
        }
        mq4.dispose();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(defpackage.mq4 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "disposable is null"
            java.util.Objects.requireNonNull(r8, r0)
            boolean r0 = r7.b
            r1 = 0
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            monitor-enter(r7)
            boolean r0 = r7.b     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0014
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x0012:
            r8 = move-exception
            goto L_0x004e
        L_0x0014:
            he3 r0 = r7.a     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x004c
            java.lang.Object r2 = r0.d     // Catch:{ all -> 0x0012 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ all -> 0x0012 }
            int r3 = r0.a     // Catch:{ all -> 0x0012 }
            int r4 = r8.hashCode()     // Catch:{ all -> 0x0012 }
            r5 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r4 = r4 * r5
            int r5 = r4 >>> 16
            r4 = r4 ^ r5
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0012 }
            if (r5 != 0) goto L_0x002f
            goto L_0x004c
        L_0x002f:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0012 }
            r6 = 1
            if (r5 == 0) goto L_0x003a
            r0.c(r2, r4, r3)     // Catch:{ all -> 0x0012 }
            goto L_0x004a
        L_0x003a:
            int r4 = r4 + r6
            r4 = r4 & r3
            r5 = r2[r4]     // Catch:{ all -> 0x0012 }
            if (r5 != 0) goto L_0x0041
            goto L_0x004c
        L_0x0041:
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0012 }
            if (r5 == 0) goto L_0x003a
            r0.c(r2, r4, r3)     // Catch:{ all -> 0x0012 }
        L_0x004a:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r6
        L_0x004c:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            return r1
        L_0x004e:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kc3.c(mq4):boolean");
    }

    public final void d() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        he3 he3 = this.a;
                        this.a = null;
                        e(he3);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final void dispose() {
        if (!this.b) {
            synchronized (this) {
                try {
                    if (!this.b) {
                        this.b = true;
                        he3 he3 = this.a;
                        this.a = null;
                        e(he3);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }
    }

    public final boolean f() {
        return this.b;
    }
}
