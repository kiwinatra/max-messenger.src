package defpackage;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.util.Iterator;

/* renamed from: y33  reason: default package */
public abstract class y33 implements Cloneable, Closeable {
    public static final s9a v = new s9a(9, (byte) 0);
    public static final t9a w = new t9a(9);
    public boolean a = false;
    public final w6e b;
    public final x33 c;
    public final Throwable o;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public y33(defpackage.w6e r4, defpackage.x33 r5, java.lang.Throwable r6) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r4.getClass()
            r3.b = r4
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x001f }
            int r1 = r4.b     // Catch:{ all -> 0x0027 }
            r2 = 1
            if (r1 <= 0) goto L_0x0013
            r0 = r2
        L_0x0013:
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0021
            int r1 = r1 + r2
            r4.b = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            r3.c = r5
            r3.o = r6
            return
        L_0x001f:
            r3 = move-exception
            goto L_0x002a
        L_0x0021:
            com.facebook.common.references.SharedReference$NullReferenceException r3 = new com.facebook.common.references.SharedReference$NullReferenceException     // Catch:{ all -> 0x001f }
            r3.<init>()     // Catch:{ all -> 0x001f }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x0027:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0027 }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y33.<init>(w6e, x33, java.lang.Throwable):void");
    }

    public static void U(y33 y33) {
        if (y33 != null) {
            y33.close();
        }
    }

    public static void V(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                U((y33) it.next());
            }
        }
    }

    public static boolean m0(y33 y33) {
        return y33 != null && y33.k0();
    }

    public static y33 o(y33 y33) {
        if (y33 != null) {
            return y33.n();
        }
        return null;
    }

    public static jd4 p0(Closeable closeable) {
        return q0(closeable, v, w);
    }

    public static jd4 q0(Object obj, b4d b4d, x33 x33) {
        if (obj == null) {
            return null;
        }
        x33.c();
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof v33;
        }
        return new y33(obj, b4d, x33, (Throwable) null, true);
    }

    public void close() {
        synchronized (this) {
            try {
                if (!this.a) {
                    this.a = true;
                    this.b.a();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized Object e0() {
        Object b2;
        cvg.q(!this.a);
        b2 = this.b.b();
        b2.getClass();
        return b2;
    }

    public synchronized boolean k0() {
        return !this.a;
    }

    public abstract y33 m();

    public synchronized y33 n() {
        if (!k0()) {
            return null;
        }
        return m();
    }

    public y33(Object obj, b4d b4d, x33 x33, Throwable th, boolean z) {
        this.b = new w6e(obj, b4d, z);
        this.c = x33;
        this.o = th;
    }
}
