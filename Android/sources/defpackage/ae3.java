package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function2;

/* renamed from: ae3  reason: default package */
public abstract class ae3 {
    public static final bpa a = new bpa(10, "CLOSED");

    public static final Object a(iod iod, long j, Function2 function2) {
        while (true) {
            if (iod.c >= j && !iod.d()) {
                return iod;
            }
            Object obj = be3.a.get(iod);
            bpa bpa = a;
            if (obj == bpa) {
                return bpa;
            }
            iod iod2 = (iod) ((be3) obj);
            if (iod2 == null) {
                iod2 = (iod) function2.invoke(Long.valueOf(iod.c + 1), iod);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = be3.a;
                    if (!atomicReferenceFieldUpdater.compareAndSet(iod, (Object) null, iod2)) {
                        if (atomicReferenceFieldUpdater.get(iod) != null) {
                            break;
                        }
                    } else if (iod.d()) {
                        iod.e();
                    }
                }
            }
            iod = iod2;
        }
    }
}
