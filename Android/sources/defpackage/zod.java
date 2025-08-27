package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.io.ConstantsKt;

/* renamed from: zod  reason: default package */
public abstract class zod {
    public static final hod a = new hod(new byte[0], 0, 0, false, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(hod hod) {
        if (hod.f != null || hod.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!hod.d) {
            AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
            hod hod2 = (hod) atomicReference.get();
            if (hod2 != a) {
                int i = hod2 != null ? hod2.c : 0;
                if (i < 65536) {
                    hod.f = hod2;
                    hod.b = 0;
                    hod.c = i + ConstantsKt.DEFAULT_BUFFER_SIZE;
                    while (!atomicReference.compareAndSet(hod2, hod)) {
                        if (atomicReference.get() != hod2) {
                            hod.f = null;
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final hod b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        hod hod = a;
        hod hod2 = (hod) atomicReference.getAndSet(hod);
        if (hod2 == hod) {
            return new hod();
        }
        if (hod2 == null) {
            atomicReference.set((Object) null);
            return new hod();
        }
        atomicReference.set(hod2.f);
        hod2.f = null;
        hod2.c = 0;
        return hod2;
    }
}
