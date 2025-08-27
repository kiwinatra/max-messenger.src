package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* renamed from: ux2  reason: default package */
public final /* synthetic */ class ux2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ux2(ay2 ay2, long j, int i) {
        this.a = i;
        this.b = ay2;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        switch (this.a) {
            case 0:
                ay2 ay2 = this.b;
                ConcurrentHashMap concurrentHashMap = ((r62) ((Lazy) ay2.o).getValue()).f;
                long j = this.c;
                xme a2 = f6e.a((a32) concurrentHashMap.get(Long.valueOf(j)));
                a32 a32 = (a32) a2.getValue();
                if (a32 == null) {
                    ev0.v((d14) ((Lazy) ay2.w).getValue(), (CoroutineContext) null, (f14) null, new xx2(a2, (Continuation) null, ay2, j), 3);
                } else {
                    ((tz9) ((ConcurrentHashMap) ay2.y).computeIfAbsent(Long.valueOf(a32.b.a), new zx2(new hw2(1, a32)))).setValue(a32);
                }
                return a2;
            default:
                ay2 ay22 = this.b;
                ConcurrentHashMap concurrentHashMap2 = ((r62) ((Lazy) ay22.o).getValue()).g;
                long j2 = this.c;
                xme a3 = f6e.a((a32) concurrentHashMap2.get(Long.valueOf(j2)));
                a32 a322 = (a32) a3.getValue();
                if (a322 == null) {
                    ev0.v((d14) ((Lazy) ay22.w).getValue(), (CoroutineContext) null, (f14) null, new yx2(a3, (Continuation) null, ay22, j2), 3);
                } else {
                    ((tz9) ((ConcurrentHashMap) ay22.x).computeIfAbsent(Long.valueOf(a322.a), new zx2(new hw2(1, a322)))).setValue(a322);
                }
                return a3;
        }
    }
}
