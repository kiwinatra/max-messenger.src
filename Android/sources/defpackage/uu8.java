package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Handler;
import android.os.Messenger;
import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: uu8  reason: default package */
public final class uu8 extends gw8 {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final SparseArray j = new SparseArray();
    public final Handler k;
    public final AtomicInteger l = new AtomicInteger(1);
    public final y86 m = new y86(27, (Object) this);
    public int n = -1;
    public nv8 o;
    public final /* synthetic */ yu8 p;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0029, code lost:
        r3 = r3.getControlHints();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public uu8(defpackage.yu8 r2, android.media.MediaRouter2.RoutingController r3, java.lang.String r4) {
        /*
            r1 = this;
            r1.p = r2
            r1.<init>()
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.j = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 1
            r2.<init>(r0)
            r1.l = r2
            y86 r2 = new y86
            r0 = 27
            r2.<init>((int) r0, (java.lang.Object) r1)
            r1.m = r2
            r2 = -1
            r1.n = r2
            r1.g = r3
            r1.f = r4
            r2 = 0
            if (r3 != 0) goto L_0x0029
        L_0x0027:
            r3 = r2
            goto L_0x0038
        L_0x0029:
            android.os.Bundle r3 = r3.getControlHints()
            if (r3 != 0) goto L_0x0030
            goto L_0x0027
        L_0x0030:
            java.lang.String r4 = "androidx.mediarouter.media.KEY_MESSENGER"
            android.os.Parcelable r3 = r3.getParcelable(r4)
            android.os.Messenger r3 = (android.os.Messenger) r3
        L_0x0038:
            r1.h = r3
            if (r3 != 0) goto L_0x003d
            goto L_0x0047
        L_0x003d:
            android.os.Messenger r2 = new android.os.Messenger
            hy r3 = new hy
            r3.<init>(r1)
            r2.<init>(r3)
        L_0x0047:
            r1.i = r2
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r1.k = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu8.<init>(yu8, android.media.MediaRouter2$RoutingController, java.lang.String):void");
    }

    public final void d() {
        this.g.release();
    }

    public final void f(int i2) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController != null) {
            routingController.setVolume(i2);
            this.n = i2;
            Handler handler = this.k;
            y86 y86 = this.m;
            handler.removeCallbacks(y86);
            handler.postDelayed(y86, 1000);
        }
    }

    public final void i(int i2) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController != null) {
            int i3 = this.n;
            if (i3 < 0) {
                i3 = routingController.getVolume();
            }
            int max = Math.max(0, Math.min(i3 + i2, this.g.getVolumeMax()));
            this.n = max;
            this.g.setVolume(max);
            Handler handler = this.k;
            y86 y86 = this.m;
            handler.removeCallbacks(y86);
            handler.postDelayed(y86, 1000);
        }
    }

    public final void m(String str) {
        MediaRoute2Info i2;
        if (str != null && !str.isEmpty() && (i2 = this.p.i(str)) != null) {
            this.g.selectRoute(i2);
        }
    }

    public final void n(String str) {
        MediaRoute2Info i2;
        if (str != null && !str.isEmpty() && (i2 = this.p.i(str)) != null) {
            this.g.deselectRoute(i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r1 = r1.p;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(java.util.List r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x001e
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0009
            goto L_0x001e
        L_0x0009:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            yu8 r1 = r1.p
            android.media.MediaRoute2Info r2 = r1.i(r2)
            if (r2 != 0) goto L_0x0019
            return
        L_0x0019:
            android.media.MediaRouter2 r1 = r1.z
            r1.transferTo(r2)
        L_0x001e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uu8.o(java.util.List):void");
    }
}
