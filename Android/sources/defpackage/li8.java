package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: li8  reason: default package */
public final class li8 extends AtomicReferenceArray implements mi8 {
    public final AtomicInteger a = new AtomicInteger();
    public int b;

    public li8(int i) {
        super(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void clear() {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4.b
            int r1 = r4.length()
            r2 = 0
            if (r0 != r1) goto L_0x000a
            goto L_0x0021
        L_0x000a:
            java.util.concurrent.atomic.AtomicInteger r1 = r4.a
        L_0x000c:
            java.lang.Object r3 = r4.get(r0)
            if (r3 == 0) goto L_0x001b
            int r1 = r0 + 1
            r4.b = r1
            r4.lazySet(r0, r2)
            r2 = r3
            goto L_0x0021
        L_0x001b:
            int r3 = r1.get()
            if (r3 != r0) goto L_0x000c
        L_0x0021:
            if (r2 == 0) goto L_0x002a
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x002a
            goto L_0x0000
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li8.clear():void");
    }

    public final void drop() {
        int i = this.b;
        lazySet(i, (Object) null);
        this.b = i + 1;
    }

    public final boolean isEmpty() {
        return this.b == this.a.get();
    }

    public final int m() {
        return this.a.get();
    }

    public final int o() {
        return this.b;
    }

    public final boolean offer(Object obj) {
        Objects.requireNonNull(obj, "value is null");
        int andIncrement = this.a.getAndIncrement();
        if (andIncrement >= length()) {
            return false;
        }
        lazySet(andIncrement, obj);
        return true;
    }

    public final Object peek() {
        int i = this.b;
        if (i == length()) {
            return null;
        }
        return get(i);
    }

    public final Object poll() {
        int i = this.b;
        if (i == length()) {
            return null;
        }
        AtomicInteger atomicInteger = this.a;
        do {
            Object obj = get(i);
            if (obj != null) {
                this.b = i + 1;
                lazySet(i, (Object) null);
                return obj;
            }
        } while (atomicInteger.get() != i);
        return null;
    }
}
