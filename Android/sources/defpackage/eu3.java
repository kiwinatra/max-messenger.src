package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.Boxing;

/* renamed from: eu3  reason: default package */
public final class eu3 {
    public final km3 a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final ConcurrentHashMap e = new ConcurrentHashMap();

    public eu3(km3 km3, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = km3;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        km3.r = this;
    }

    public final vk3 a(long j) {
        return vk3.b(j, ((ltb) ((jtb) this.d.getValue())).a.e("server.timeDelta", 0), (yva) this.c.getValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(long r5, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.du3
            if (r0 == 0) goto L_0x0013
            r0 = r7
            du3 r0 = (defpackage.du3) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            du3 r0 = new du3
            r0.<init>(r4, r7)
        L_0x0018:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0064 }
            goto L_0x0061
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r7)
            km3 r4 = r4.a
            java.util.concurrent.ConcurrentHashMap r7 = r4.a
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.Object r7 = r7.get(r2)
            vk3 r7 = (defpackage.vk3) r7
            if (r7 == 0) goto L_0x0045
            return r7
        L_0x0045:
            rj0 r7 = new rj0     // Catch:{ all -> 0x0064 }
            r7.<init>(r4, r5)     // Catch:{ all -> 0x0064 }
            mka r4 = new mka     // Catch:{ all -> 0x0064 }
            r5 = 1
            r4.<init>(r5, r7)     // Catch:{ all -> 0x0064 }
            lfd r5 = defpackage.xfd.b()     // Catch:{ all -> 0x0064 }
            fce r4 = r4.n(r5)     // Catch:{ all -> 0x0064 }
            r0.c = r3     // Catch:{ all -> 0x0064 }
            java.lang.Object r7 = defpackage.bs0.f(r4, r0)     // Catch:{ all -> 0x0064 }
            if (r7 != r1) goto L_0x0061
            return r1
        L_0x0061:
            vk3 r7 = (defpackage.vk3) r7     // Catch:{ all -> 0x0064 }
            return r7
        L_0x0064:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu3.b(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final etc c(long j) {
        return new etc((tz9) this.e.computeIfAbsent(Long.valueOf(j), new yi(8, new cu3(this, j, 0))));
    }

    public final vk3 d() {
        vk3 r = this.a.r();
        return r == null ? a(((Number) this.b.getValue()).longValue()) : r;
    }

    public final Integer e() {
        Set set = km3.t;
        km3 km3 = this.a;
        int i = 0;
        vk3 p = km3.p(((ltb) km3.h).a.s(), false);
        Collection<vk3> values = km3.a.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (vk3 vk3 : values) {
                try {
                    if (vk3 != p && set.contains(vk3.a.c.k)) {
                        i++;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return Boxing.boxInt(i);
    }
}
