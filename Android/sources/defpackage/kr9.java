package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: kr9  reason: default package */
public final class kr9 extends f0 {
    public final int v = 12;
    public final Lazy w;
    public final Lazy x;

    public kr9(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        super(lazy2, lazy3);
        this.w = lazy4;
        this.x = LazyKt.lazy(new ur(22, lazy));
    }

    public final ad9 b() {
        List take = CollectionsKt.take((Iterable) ((AtomicReference) this.c).get(), this.v);
        qf7 qf7 = new qf7();
        int size = take.size();
        pf7[] pf7Arr = new pf7[size];
        for (int i = 0; i < size; i++) {
            jr9 jr9 = (jr9) take.get(i);
            ArrayList b = ((t8c) this.w.getValue()).b(jr9.b);
            rf7[] rf7Arr = b != null ? (rf7[]) b.toArray(new rf7[0]) : null;
            pf7 pf7 = new pf7();
            pf7.a = jr9.a;
            pf7.b = jr9.b.toString();
            pf7.c = jr9.c.a;
            pf7.d = m58.q(jr9.d);
            if (!(rf7Arr == null || rf7Arr.length == 0)) {
                pf7.e = rf7Arr;
            }
            pf7Arr[i] = pf7;
        }
        qf7.a = pf7Arr;
        return qf7;
    }

    public final ez d() {
        return (ez) this.x.getValue();
    }

    public final Boolean h(byte[] bArr) {
        long nanoTime = System.nanoTime();
        String e = e();
        a67 a67 = z68.b;
        if (a67 != null && a67.c()) {
            a67.d(w78.v, e, "loadData start", (Throwable) null);
        }
        try {
            qf7 qf7 = (qf7) ad9.mergeFrom(new qf7(), bArr);
            ArrayList arrayList = new ArrayList(qf7.a.length);
            Iterator it = ArrayIteratorKt.iterator(qf7.a);
            while (it.hasNext()) {
                pf7 pf7 = (pf7) it.next();
                String str = pf7.a;
                CharSequence a = ((t8c) this.w.getValue()).a(pf7.b, pf7.e);
                int i = pf7.c;
                arrayList.add(new jr9(str, a, i == 0 ? r14.b : new r14(i), m58.s(pf7.d)));
            }
            ((AtomicReference) this.c).set(arrayList);
            String e2 = e();
            a67 a672 = z68.b;
            if (a672 != null && a672.c()) {
                w78 w78 = w78.v;
                Duration.Companion companion = Duration.Companion;
                a672.d(w78, e2, a81.m("loadData finish ", Duration.m1402toStringimpl(DurationKt.toDuration(System.nanoTime() - nanoTime, DurationUnit.NANOSECONDS))), (Throwable) null);
            }
            return Boxing.boxBoolean(true);
        } catch (InterruptedException e3) {
            throw e3;
        } catch (Throwable th) {
            String e4 = e();
            a67 a673 = z68.b;
            if (a673 != null && a673.c()) {
                w78 w782 = w78.v;
                Duration.Companion companion2 = Duration.Companion;
                a673.d(w782, e4, a81.m("loadData finish ", Duration.m1402toStringimpl(DurationKt.toDuration(System.nanoTime() - nanoTime, DurationUnit.NANOSECONDS))), (Throwable) null);
            }
            throw th;
        }
    }
}
