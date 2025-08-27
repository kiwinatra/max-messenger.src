package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: jxf  reason: default package */
public final class jxf {
    public final fzf a;
    public final icf b;
    public final gcf c;
    public final x23 d;
    public final rl e;
    public final lfd f;
    public final yqf g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ifg i = new ifg();

    public jxf(fzf fzf, gcf gcf, icf icf, yqf yqf, x23 x23, rl rlVar, lfd lfd) {
        this.a = fzf;
        this.c = gcf;
        this.b = icf;
        this.g = yqf;
        this.d = x23;
        this.e = rlVar;
        this.f = lfd;
    }

    public final synchronized jha a(kxf kxf) {
        for (Map.Entry entry : this.h.entrySet()) {
            if (((kxf) entry.getKey()).equals(kxf)) {
                return (jha) entry.getValue();
            }
        }
        return null;
    }

    public final void b(bxf bxf) {
        z68.c("jxf", "putUploadInRepository: started, upload=%s", bxf);
        ryg.k0(this.a.a(bxf).m(), m58.f, new gxf(bxf, 0), new ivc(9, bxf));
    }

    public final synchronized void c(kxf kxf) {
        z68.c("jxf", "removeFromUploadObsCache: data=" + kxf, new Object[0]);
        this.h.remove(kxf);
    }

    public final void d(kxf kxf) {
        z68.c("jxf", "removeUploadFromRepository: started, data=%s", kxf);
        ryg.k0(this.a.c(kxf).m(), m58.f, new ixf(kxf, 0), new exf(kxf, 1));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized defpackage.jha e(defpackage.kxf r7) {
        /*
            r6 = this;
            r0 = 6
            r1 = 1
            r2 = 2
            java.lang.String r3 = "upload: has upload for "
            monitor-enter(r6)
            jha r4 = r6.a(r7)     // Catch:{ all -> 0x001f }
            if (r4 == 0) goto L_0x0022
            java.lang.String r0 = "jxf"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r1.<init>(r3)     // Catch:{ all -> 0x001f }
            r1.append(r7)     // Catch:{ all -> 0x001f }
            java.lang.String r7 = r1.toString()     // Catch:{ all -> 0x001f }
            defpackage.z68.c(r0, r7, new java.lang.Object[0])     // Catch:{ all -> 0x001f }
            monitor-exit(r6)
            return r4
        L_0x001f:
            r7 = move-exception
            goto L_0x00b1
        L_0x0022:
            java.lang.String r3 = "jxf"
            java.lang.String r4 = "upload: %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r7}     // Catch:{ all -> 0x001f }
            defpackage.z68.c(r3, r4, r5)     // Catch:{ all -> 0x001f }
            ixf r3 = new ixf     // Catch:{ all -> 0x001f }
            r3.<init>(r7, r1)     // Catch:{ all -> 0x001f }
            mka r4 = new mka     // Catch:{ all -> 0x001f }
            r4.<init>(r1, r3)     // Catch:{ all -> 0x001f }
            dxf r3 = new dxf     // Catch:{ all -> 0x001f }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x001f }
            wh8 r5 = new wh8     // Catch:{ all -> 0x001f }
            r5.<init>(r2, r4, r3)     // Catch:{ all -> 0x001f }
            h5 r3 = new h5     // Catch:{ all -> 0x001f }
            r4 = 22
            r3.<init>(r4, r7)     // Catch:{ all -> 0x001f }
            mka r4 = new mka     // Catch:{ all -> 0x001f }
            r4.<init>(r2, r3)     // Catch:{ all -> 0x001f }
            hb3 r3 = new hb3     // Catch:{ all -> 0x001f }
            r3.<init>(r1, r5, r4)     // Catch:{ all -> 0x001f }
            dxf r1 = new dxf     // Catch:{ all -> 0x001f }
            r4 = 7
            r1.<init>(r6, r4)     // Catch:{ all -> 0x001f }
            oa3 r4 = new oa3     // Catch:{ all -> 0x001f }
            r5 = 4
            r4.<init>(r5, r3, r1)     // Catch:{ all -> 0x001f }
            icf r1 = r6.b     // Catch:{ all -> 0x001f }
            r1.getClass()     // Catch:{ all -> 0x001f }
            dre r1 = new dre     // Catch:{ all -> 0x001f }
            r3 = 23
            r1.<init>(r3)     // Catch:{ all -> 0x001f }
            yia r3 = new yia     // Catch:{ all -> 0x001f }
            r3.<init>(r4, r1, r0)     // Catch:{ all -> 0x001f }
            pbb r0 = new pbb     // Catch:{ all -> 0x001f }
            r1 = 25
            r0.<init>(r1, r6, r7)     // Catch:{ all -> 0x001f }
            iia r0 = r3.j(r0)     // Catch:{ all -> 0x001f }
            xbf r1 = new xbf     // Catch:{ all -> 0x001f }
            r3 = 15
            r1.<init>((int) r3, (java.lang.Object) r6, (java.lang.Object) r7)     // Catch:{ all -> 0x001f }
            gga r3 = defpackage.m58.f     // Catch:{ all -> 0x001f }
            rha r4 = new rha     // Catch:{ all -> 0x001f }
            r4.<init>(r0, r3, r1, r2)     // Catch:{ all -> 0x001f }
            dxf r0 = new dxf     // Catch:{ all -> 0x001f }
            r1 = 8
            r0.<init>(r6, r1)     // Catch:{ all -> 0x001f }
            dj6 r1 = defpackage.m58.e     // Catch:{ all -> 0x001f }
            rha r3 = new rha     // Catch:{ all -> 0x001f }
            r3.<init>(r4, r0, r1, r2)     // Catch:{ all -> 0x001f }
            bka r0 = r3.t()     // Catch:{ all -> 0x001f }
            sja r1 = new sja     // Catch:{ all -> 0x001f }
            r1.<init>(r0)     // Catch:{ all -> 0x001f }
            lfd r0 = r6.f     // Catch:{ all -> 0x001f }
            pka r0 = r1.x(r0)     // Catch:{ all -> 0x001f }
            monitor-enter(r6)     // Catch:{ all -> 0x001f }
            java.util.concurrent.ConcurrentHashMap r1 = r6.h     // Catch:{ all -> 0x00ae }
            r1.put(r7, r0)     // Catch:{ all -> 0x00ae }
            monitor-exit(r6)     // Catch:{ all -> 0x001f }
            monitor-exit(r6)
            return r0
        L_0x00ae:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00ae }
            throw r7     // Catch:{ all -> 0x001f }
        L_0x00b1:
            monitor-exit(r6)     // Catch:{ all -> 0x001f }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxf.e(kxf):jha");
    }
}
