package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* renamed from: kd4  reason: default package */
public final class kd4 extends yi0 implements CloseableStaticBitmap {
    public static final /* synthetic */ int z = 0;
    public y33 o;
    public volatile Bitmap v;
    public final tac w;
    public final int x;
    public final int y;

    public kd4(Bitmap bitmap, b4d b4d, tac tac, int i, int i2) {
        bitmap.getClass();
        this.v = bitmap;
        Bitmap bitmap2 = this.v;
        b4d.getClass();
        this.o = y33.q0(bitmap2, b4d, y33.w);
        this.w = tac;
        this.x = i;
        this.y = i2;
    }

    public final synchronized y33 cloneUnderlyingBitmapReference() {
        return y33.o(this.o);
    }

    public final void close() {
        y33 y33;
        synchronized (this) {
            y33 = this.o;
            this.o = null;
            this.v = null;
        }
        if (y33 != null) {
            y33.close();
        }
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized defpackage.y33 convertToBitmapReference() {
        /*
            r2 = this;
            monitor-enter(r2)
            y33 r0 = r2.o     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "Cannot convert a closed static bitmap"
            defpackage.cvg.p(r0, r1)     // Catch:{ all -> 0x0016 }
            monitor-enter(r2)     // Catch:{ all -> 0x0016 }
            y33 r0 = r2.o     // Catch:{ all -> 0x0013 }
            r1 = 0
            r2.o = r1     // Catch:{ all -> 0x0013 }
            r2.v = r1     // Catch:{ all -> 0x0013 }
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0013 }
            throw r0     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0016 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd4.convertToBitmapReference():y33");
    }

    public final void finalize() {
        if (!isClosed()) {
            bg5.o("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", kd4.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public final int getExifOrientation() {
        return this.y;
    }

    public final int getHeight() {
        int i;
        if (this.x % 180 != 0 || (i = this.y) == 5 || i == 7) {
            Bitmap bitmap = this.v;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.v;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    public final tac getQualityInfo() {
        return this.w;
    }

    public final int getRotationAngle() {
        return this.x;
    }

    public final int getSizeInBytes() {
        return vo0.d(this.v);
    }

    public final Bitmap getUnderlyingBitmap() {
        return this.v;
    }

    public final int getWidth() {
        int i;
        if (this.x % 180 != 0 || (i = this.y) == 5 || i == 7) {
            Bitmap bitmap = this.v;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.v;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    public final synchronized boolean isClosed() {
        return this.o == null;
    }

    public kd4(y33 y33, tac tac, int i, int i2) {
        y33 n = y33.n();
        n.getClass();
        this.o = n;
        this.v = (Bitmap) n.e0();
        this.w = tac;
        this.x = i;
        this.y = i2;
    }
}
