package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.collections.SetsKt;

/* renamed from: w52  reason: default package */
public final /* synthetic */ class w52 implements Runnable {
    public final /* synthetic */ r62 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ a32 c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ w52(r62 r62, long j, a32 a32, boolean z) {
        this.a = r62;
        this.b = j;
        this.c = a32;
        this.o = z;
    }

    public final void run() {
        r62 r62 = this.a;
        ConcurrentHashMap concurrentHashMap = r62.f;
        long j = this.b;
        boolean containsKey = concurrentHashMap.containsKey(Long.valueOf(j));
        Long valueOf = Long.valueOf(j);
        a32 a32 = this.c;
        concurrentHashMap.put(valueOf, a32);
        r62.c.put(Long.valueOf(a32.b.l), a32);
        long Q = r62.Q();
        m72 m72 = a32.b;
        boolean h = m72.h(Q);
        long j2 = m72.a;
        if (h || j2 != 0) {
            r62.g.put(Long.valueOf(j2), a32);
        }
        boolean A = cvg.A(m72.I);
        ConcurrentHashMap concurrentHashMap2 = r62.h;
        if (!A) {
            concurrentHashMap2.put(Long.valueOf(j), a32);
        } else {
            concurrentHashMap2.remove(Long.valueOf(j));
        }
        if (containsKey) {
            Lazy lazy = r62.C;
            if (lazy.getValue() != null) {
                ((ia2) ((u82) lazy.getValue())).o(j, a32);
            }
            if (this.o) {
                r62.m.c(new xy2(Collections.singletonList(Long.valueOf(j)), false, false, bl4.REGULAR, (hj0) null, true, SetsKt.emptySet()));
                List singletonList = Collections.singletonList(a32);
                q62 q62 = r62.G;
                if (q62 != null) {
                    q62.c(singletonList);
                }
            }
        }
    }
}
