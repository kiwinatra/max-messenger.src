package defpackage;

import android.util.Pair;
import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;
import java.util.HashMap;

/* renamed from: jo0  reason: default package */
public final class jo0 implements xvb {
    public final HashMap a;
    public final xvb b;
    public final boolean c;
    public final String d;
    public final String e;
    public final /* synthetic */ int f;
    public final cd4 g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public jo0(cd4 cd4, boolean z, xvb xvb) {
        this(xvb, "EncodedCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_ENCODED_COUNT, z);
        this.f = 1;
        this.g = cd4;
    }

    /* JADX INFO: finally extract failed */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:210)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void a(defpackage.zi0 r6, defpackage.yvb r7) {
        /*
            r5 = this;
            defpackage.tf6.P()     // Catch:{ all -> 0x004b }
            r0 = r7
            ik0 r0 = (defpackage.ik0) r0     // Catch:{ all -> 0x004b }
            bwb r0 = r0.c     // Catch:{ all -> 0x004b }
            java.lang.String r1 = r5.d     // Catch:{ all -> 0x004b }
            r0.j(r7, r1)     // Catch:{ all -> 0x004b }
            android.util.Pair r0 = r5.d(r7)     // Catch:{ all -> 0x004b }
        L_0x0011:
            monitor-enter(r5)     // Catch:{ all -> 0x004b }
            monitor-enter(r5)     // Catch:{ all -> 0x004d }
            java.util.HashMap r1 = r5.a     // Catch:{ all -> 0x004f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x004f }
            ux9 r1 = (defpackage.ux9) r1     // Catch:{ all -> 0x004f }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            r2 = 1
            if (r1 != 0) goto L_0x0030
            monitor-enter(r5)     // Catch:{ all -> 0x004d }
            ux9 r1 = new ux9     // Catch:{ all -> 0x002d }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x002d }
            java.util.HashMap r3 = r5.a     // Catch:{ all -> 0x002d }
            r3.put(r0, r1)     // Catch:{ all -> 0x002d }
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            r3 = r2
            goto L_0x0031
        L_0x002d:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x002d }
            throw r6     // Catch:{ all -> 0x004d }
        L_0x0030:
            r3 = 0
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            boolean r4 = r1.a(r6, r7)     // Catch:{ all -> 0x004b }
            if (r4 == 0) goto L_0x0011
            if (r3 == 0) goto L_0x0047
            ik0 r7 = (defpackage.ik0) r7     // Catch:{ all -> 0x004b }
            boolean r5 = r7.g()     // Catch:{ all -> 0x004b }
            if (r5 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = 2
        L_0x0044:
            r1.i(r2)     // Catch:{ all -> 0x004b }
        L_0x0047:
            defpackage.tf6.P()
            return
        L_0x004b:
            r5 = move-exception
            goto L_0x0054
        L_0x004d:
            r6 = move-exception
            goto L_0x0052
        L_0x004f:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004f }
            throw r6     // Catch:{ all -> 0x004d }
        L_0x0052:
            monitor-exit(r5)     // Catch:{ all -> 0x004d }
            throw r6     // Catch:{ all -> 0x004b }
        L_0x0054:
            defpackage.tf6.P()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo0.a(zi0, yvb):void");
    }

    public final Closeable c(Closeable closeable) {
        switch (this.f) {
            case 0:
                return y33.o((y33) closeable);
            default:
                return j55.a((j55) closeable);
        }
    }

    public final Pair d(yvb yvb) {
        switch (this.f) {
            case 0:
                ik0 ik0 = (ik0) yvb;
                return Pair.create(this.g.e(ik0.a, ik0.o), ik0.v);
            default:
                ik0 ik02 = (ik0) yvb;
                qa7 qa7 = ik02.a;
                cd4 cd4 = this.g;
                cd4.getClass();
                return Pair.create(cd4.g(qa7.b), ik02.v);
        }
    }

    public final synchronized void e(Object obj, ux9 ux9) {
        if (this.a.get(obj) == ux9) {
            this.a.remove(obj);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public jo0(cd4 cd4, ko0 ko0) {
        this(ko0, "BitmapMemoryCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_BITMAP_COUNT, false);
        this.f = 0;
        this.g = cd4;
    }

    public jo0(xvb xvb, String str, String str2, boolean z) {
        this.b = xvb;
        this.a = new HashMap();
        this.c = z;
        this.d = str;
        this.e = str2;
    }
}
