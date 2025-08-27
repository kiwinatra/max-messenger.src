package defpackage;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* renamed from: vp9  reason: default package */
public final class vp9 implements ja7, rb6 {
    public final LongSparseArray X = new LongSparseArray();
    public int Y;
    public final ArrayList Z;
    public final Object a = new Object();
    public final fx1 b = new fx1(1, this);
    public int c = 0;
    public final td8 o = new td8(22, this);
    public boolean v = false;
    public final ArrayList v0 = new ArrayList();
    public final ja7 w;
    public ia7 x;
    public Executor y;
    public final LongSparseArray z = new LongSparseArray();

    public vp9(int i, int i2, int i3, int i4) {
        he heVar = new he(ImageReader.newInstance(i, i2, i3, i4));
        this.w = heVar;
        this.Y = 0;
        this.Z = new ArrayList(o());
    }

    public final void a(ha7 ha7) {
        synchronized (this.a) {
            b(ha7);
        }
    }

    public final void b(ha7 ha7) {
        synchronized (this.a) {
            try {
                int indexOf = this.Z.indexOf(ha7);
                if (indexOf >= 0) {
                    this.Z.remove(indexOf);
                    int i = this.Y;
                    if (indexOf <= i) {
                        this.Y = i - 1;
                    }
                }
                this.v0.remove(ha7);
                if (this.c > 0) {
                    d(this.w);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(dyd dyd) {
        ia7 ia7;
        Executor executor;
        synchronized (this.a) {
            try {
                if (this.Z.size() < o()) {
                    dyd.a(this);
                    this.Z.add(dyd);
                    ia7 = this.x;
                    executor = this.y;
                } else {
                    dyd.close();
                    ia7 = null;
                    executor = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (ia7 == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new sx8(8, this, ia7));
        } else {
            ia7.i(this);
        }
    }

    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.v) {
                    Iterator it = new ArrayList(this.Z).iterator();
                    while (it.hasNext()) {
                        ((ha7) it.next()).close();
                    }
                    this.Z.clear();
                    this.w.close();
                    this.v = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0051, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026 A[SYNTHETIC, Splitter:B:16:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(defpackage.ja7 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            boolean r1 = r6.v     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r6 = move-exception
            goto L_0x0050
        L_0x000b:
            android.util.LongSparseArray r1 = r6.X     // Catch:{ all -> 0x0009 }
            int r1 = r1.size()     // Catch:{ all -> 0x0009 }
            java.util.ArrayList r2 = r6.Z     // Catch:{ all -> 0x0009 }
            int r2 = r2.size()     // Catch:{ all -> 0x0009 }
            int r1 = r1 + r2
            int r2 = r7.o()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0020
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0020:
            ha7 r2 = r7.p()     // Catch:{ IllegalStateException -> 0x0041, all -> 0x003f }
            if (r2 == 0) goto L_0x0042
            int r3 = r6.c     // Catch:{ all -> 0x0009 }
            int r3 = r3 + -1
            r6.c = r3     // Catch:{ all -> 0x0009 }
            int r1 = r1 + 1
            android.util.LongSparseArray r3 = r6.X     // Catch:{ all -> 0x0009 }
            l97 r4 = r2.getImageInfo()     // Catch:{ all -> 0x0009 }
            long r4 = r4.getTimestamp()     // Catch:{ all -> 0x0009 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0009 }
            r6.g()     // Catch:{ all -> 0x0009 }
            goto L_0x0042
        L_0x003f:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0009 }
        L_0x0041:
            r2 = 0
        L_0x0042:
            if (r2 == 0) goto L_0x004e
            int r2 = r6.c     // Catch:{ all -> 0x0009 }
            if (r2 <= 0) goto L_0x004e
            int r2 = r7.o()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0020
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0050:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp9.d(ja7):void");
    }

    public final ha7 e() {
        synchronized (this.a) {
            try {
                if (this.Z.isEmpty()) {
                    return null;
                }
                if (this.Y < this.Z.size()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < this.Z.size() - 1; i++) {
                        if (!this.v0.contains(this.Z.get(i))) {
                            arrayList.add((ha7) this.Z.get(i));
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ha7) it.next()).close();
                    }
                    int size = this.Z.size();
                    ArrayList arrayList2 = this.Z;
                    this.Y = size;
                    ha7 ha7 = (ha7) arrayList2.get(size - 1);
                    this.v0.add(ha7);
                    return ha7;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int f() {
        int f;
        synchronized (this.a) {
            f = this.w.f();
        }
        return f;
    }

    public final void g() {
        synchronized (this.a) {
            try {
                for (int size = this.z.size() - 1; size >= 0; size--) {
                    l97 l97 = (l97) this.z.valueAt(size);
                    long timestamp = l97.getTimestamp();
                    ha7 ha7 = (ha7) this.X.get(timestamp);
                    if (ha7 != null) {
                        this.X.remove(timestamp);
                        this.z.removeAt(size);
                        c(new dyd(ha7, (Size) null, l97));
                    }
                }
                h();
            } finally {
            }
        }
    }

    public final int getHeight() {
        int height;
        synchronized (this.a) {
            height = this.w.getHeight();
        }
        return height;
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.a) {
            surface = this.w.getSurface();
        }
        return surface;
    }

    public final int getWidth() {
        int width;
        synchronized (this.a) {
            width = this.w.getWidth();
        }
        return width;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            android.util.LongSparseArray r1 = r7.X     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x007e
            android.util.LongSparseArray r1 = r7.z     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0014
            goto L_0x007e
        L_0x0014:
            android.util.LongSparseArray r1 = r7.X     // Catch:{ all -> 0x005b }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray r5 = r7.z     // Catch:{ all -> 0x005b }
            long r5 = r5.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x005b }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x005b }
            r1 = r1 ^ 1
            defpackage.bs0.n(r1)     // Catch:{ all -> 0x005b }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            android.util.LongSparseArray r1 = r7.X     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x003e:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray r2 = r7.X     // Catch:{ all -> 0x005b }
            long r2 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x005d
            android.util.LongSparseArray r2 = r7.X     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x005b }
            ha7 r2 = (defpackage.ha7) r2     // Catch:{ all -> 0x005b }
            r2.close()     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray r2 = r7.X     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
            goto L_0x005d
        L_0x005b:
            r7 = move-exception
            goto L_0x0080
        L_0x005d:
            int r1 = r1 + -1
            goto L_0x003e
        L_0x0060:
            android.util.LongSparseArray r1 = r7.z     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x0068:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray r2 = r7.z     // Catch:{ all -> 0x005b }
            long r5 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0079
            android.util.LongSparseArray r2 = r7.z     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
        L_0x0079:
            int r1 = r1 + -1
            goto L_0x0068
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vp9.h():void");
    }

    public final void i() {
        synchronized (this.a) {
            this.w.i();
            this.x = null;
            this.y = null;
            this.c = 0;
        }
    }

    public final void k(ia7 ia7, Executor executor) {
        synchronized (this.a) {
            ia7.getClass();
            this.x = ia7;
            executor.getClass();
            this.y = executor;
            this.w.k(this.o, executor);
        }
    }

    public final int o() {
        int o2;
        synchronized (this.a) {
            o2 = this.w.o();
        }
        return o2;
    }

    public final ha7 p() {
        synchronized (this.a) {
            try {
                if (this.Z.isEmpty()) {
                    return null;
                }
                if (this.Y < this.Z.size()) {
                    ArrayList arrayList = this.Z;
                    int i = this.Y;
                    this.Y = i + 1;
                    ha7 ha7 = (ha7) arrayList.get(i);
                    this.v0.add(ha7);
                    return ha7;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
