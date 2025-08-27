package defpackage;

import java.text.CollationKey;
import java.text.Collator;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;

/* renamed from: ns3  reason: default package */
public final class ns3 {
    public final obe a;
    public final ptb b;
    public final km3 c;
    public final r62 d;
    public final fn4 e;
    public final hxd f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public ns3(jtb jtb, ptb ptb, km3 km3, r62 r62, fn4 fn4, hxd hxd, lfd lfd) {
        obe obe = new obe(new mka(1, new ms1(29, jtb)).n(lfd));
        this.a = obe;
        obe.l(new rh8(1, new zb2(16)));
        this.b = ptb;
        this.c = km3;
        this.d = r62;
        this.e = fn4;
        this.f = hxd;
    }

    public static int a(vk3 vk3, vk3 vk32, Collator collator) {
        CollationKey collationKey = vk3.v;
        if (collationKey == null) {
            collationKey = collator.getCollationKey(vk3.f().toLowerCase());
            vk3.v = collationKey;
        }
        CollationKey collationKey2 = vk32.v;
        if (collationKey2 == null) {
            collationKey2 = collator.getCollationKey(vk32.f().toLowerCase());
            vk32.v = collationKey2;
        }
        boolean z = false;
        boolean z2 = !cvg.A(vk3.f()) && Character.isLetter(vk3.f().charAt(0));
        if (!cvg.A(vk32.f()) && Character.isLetter(vk32.f().charAt(0))) {
            z = true;
        }
        return ((!z2 || !z) && (z2 || z)) ? z2 ? -1 : 1 : collationKey.compareTo(collationKey2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hz9, ra8, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0038, code lost:
        r6 = r3.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.util.List r9) {
        /*
            r8 = this;
            r8.d(r9)
            hz9 r0 = new hz9
            r0.<init>()
            long[] r1 = defpackage.bed.a
            r0.a = r1
            long[] r1 = defpackage.xa8.b
            r0.b = r1
            r0.c = r1
            r1 = 6
            int r1 = defpackage.bed.e(r1)
            r0.c(r1)
            java.util.Iterator r1 = r9.iterator()
        L_0x001e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0074
            java.lang.Object r2 = r1.next()
            vk3 r2 = (defpackage.vk3) r2
            long r3 = r2.r()
            r62 r5 = r8.d
            a32 r3 = r5.K(r3)
            r4 = 0
            if (r3 == 0) goto L_0x0049
            a89 r6 = r3.c
            if (r6 == 0) goto L_0x0049
            ha9 r6 = r6.a
            boolean r6 = r6.z()
            if (r6 != 0) goto L_0x0049
            long r6 = r3.n()
            goto L_0x004a
        L_0x0049:
            r6 = r4
        L_0x004a:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0057
            long r2 = r2.r()
            long r4 = -r6
            r0.d(r2, r4)
            goto L_0x001e
        L_0x0057:
            long r3 = r2.r()
            long r5 = r2.r()
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.util.concurrent.ConcurrentHashMap r5 = r8.g
            java.lang.Object r2 = r5.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r5 = (long) r2
            r0.d(r3, r5)
            goto L_0x001e
        L_0x0074:
            ks3 r8 = new ks3
            r1 = 0
            r8.<init>(r1, r0)
            r9.sort(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns3.b(java.util.List):void");
    }

    public final void c(List list, Function1 function1) {
        Collections.sort(list, new ms3(this, function1, new HashMap(), 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d(java.util.List r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            fn4 r0 = r6.e     // Catch:{ all -> 0x003e }
            boolean r0 = r0.d()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x009e
            hxd r0 = r6.f     // Catch:{ all -> 0x003e }
            jxd r0 = (defpackage.jxd) r0     // Catch:{ all -> 0x003e }
            int r0 = r0.h     // Catch:{ all -> 0x003e }
            r1 = 3
            if (r0 == r1) goto L_0x0014
            goto L_0x009e
        L_0x0014:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003e }
            r0.<init>()     // Catch:{ all -> 0x003e }
            java.util.concurrent.ConcurrentHashMap r1 = r6.g     // Catch:{ all -> 0x003e }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x003e }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x003e }
        L_0x0023:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x003e }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x003e }
            km3 r3 = r6.c     // Catch:{ all -> 0x003e }
            long r4 = r2.longValue()     // Catch:{ all -> 0x003e }
            r2 = 1
            vk3 r2 = r3.p(r4, r2)     // Catch:{ all -> 0x003e }
            r0.add(r2)     // Catch:{ all -> 0x003e }
            goto L_0x0023
        L_0x003e:
            r7 = move-exception
            goto L_0x00a0
        L_0x0040:
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x003e }
        L_0x0044:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x0064
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x003e }
            vk3 r1 = (defpackage.vk3) r1     // Catch:{ all -> 0x003e }
            java.util.concurrent.ConcurrentHashMap r2 = r6.g     // Catch:{ all -> 0x003e }
            long r3 = r1.r()     // Catch:{ all -> 0x003e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x003e }
            boolean r2 = r2.containsKey(r3)     // Catch:{ all -> 0x003e }
            if (r2 != 0) goto L_0x0044
            r0.add(r1)     // Catch:{ all -> 0x003e }
            goto L_0x0044
        L_0x0064:
            ptb r7 = r6.b     // Catch:{ all -> 0x003e }
            ts r7 = r7.d()     // Catch:{ all -> 0x003e }
            obe r1 = r6.a     // Catch:{ all -> 0x003e }
            java.lang.Object r1 = r1.f()     // Catch:{ all -> 0x003e }
            java.text.Collator r1 = (java.text.Collator) r1     // Catch:{ all -> 0x003e }
            ms3 r2 = new ms3     // Catch:{ all -> 0x003e }
            r3 = 0
            r2.<init>(r6, r7, r1, r3)     // Catch:{ all -> 0x003e }
            java.util.Collections.sort(r0, r2)     // Catch:{ all -> 0x003e }
            r7 = 0
        L_0x007c:
            int r1 = r0.size()     // Catch:{ all -> 0x003e }
            if (r7 >= r1) goto L_0x009c
            java.util.concurrent.ConcurrentHashMap r1 = r6.g     // Catch:{ all -> 0x003e }
            java.lang.Object r2 = r0.get(r7)     // Catch:{ all -> 0x003e }
            vk3 r2 = (defpackage.vk3) r2     // Catch:{ all -> 0x003e }
            long r2 = r2.r()     // Catch:{ all -> 0x003e }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x003e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x003e }
            r1.put(r2, r3)     // Catch:{ all -> 0x003e }
            int r7 = r7 + 1
            goto L_0x007c
        L_0x009c:
            monitor-exit(r6)
            return
        L_0x009e:
            monitor-exit(r6)
            return
        L_0x00a0:
            monitor-exit(r6)     // Catch:{ all -> 0x003e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns3.d(java.util.List):void");
    }
}
