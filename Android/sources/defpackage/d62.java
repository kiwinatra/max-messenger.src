package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: d62  reason: default package */
public final /* synthetic */ class d62 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r62 b;
    public final /* synthetic */ long c;

    public /* synthetic */ d62(r62 r62, long j, int i) {
        this.a = i;
        this.b = r62;
        this.c = j;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                ConcurrentHashMap concurrentHashMap = this.b.f;
                long j = this.c;
                a32 a32 = (a32) concurrentHashMap.get(Long.valueOf(j));
                if (a32 != null) {
                    return a32;
                }
                throw new IllegalArgumentException(wj6.i(j, "chat not found: "));
            case 1:
                r62 r62 = this.b;
                r62.getClass();
                return r62.b(l72.a, Collections.singletonList(Long.valueOf(this.c)), (String) null, (String) null);
            default:
                ConcurrentHashMap concurrentHashMap2 = this.b.g;
                long j2 = this.c;
                a32 a322 = (a32) concurrentHashMap2.get(Long.valueOf(j2));
                if (a322 != null) {
                    return a322;
                }
                throw new IllegalArgumentException(wj6.i(j2, "chat not found: "));
        }
    }
}
