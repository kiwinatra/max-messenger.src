package defpackage;

import kotlin.ExceptionsKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* renamed from: dh3  reason: default package */
public final class dh3 extends ru0 {
    public final cu0 v0;

    public dh3(int i, cu0 cu0, Function1 function1) {
        super(i, function1);
        this.v0 = cu0;
        if (cu0 == cu0.a) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + Reflection.getOrCreateKotlinClass(ru0.class).getSimpleName() + " instead").toString());
        } else if (i < 1) {
            throw new IllegalArgumentException(a81.j(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ee A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object K(java.lang.Object r20, boolean r21) {
        /*
            r19 = this;
            r8 = r19
            cu0 r0 = defpackage.cu0.c
            cu0 r1 = r8.v0
            r9 = 0
            r10 = 1
            if (r1 != r0) goto L_0x002d
            java.lang.Object r0 = super.s(r20)
            boolean r1 = r0 instanceof defpackage.d22
            r1 = r1 ^ r10
            if (r1 != 0) goto L_0x00f2
            boolean r1 = r0 instanceof defpackage.c22
            if (r1 == 0) goto L_0x0019
            goto L_0x00f2
        L_0x0019:
            if (r21 == 0) goto L_0x0029
            kotlin.jvm.functions.Function1 r0 = r8.b
            if (r0 == 0) goto L_0x0029
            r11 = r20
            kotlinx.coroutines.internal.UndeliveredElementException r0 = defpackage.iq.p(r0, r11, r9)
            if (r0 != 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            throw r0
        L_0x0029:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x00f2
        L_0x002d:
            r11 = r20
            bpa r12 = defpackage.tu0.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.ru0.y
            java.lang.Object r0 = r0.get(r8)
            f22 r0 = (defpackage.f22) r0
        L_0x0039:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.ru0.o
            long r1 = r1.getAndIncrement(r8)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r13 = r1 & r3
            r3 = 0
            boolean r15 = r8.w(r1, r3)
            int r7 = defpackage.tu0.b
            long r4 = (long) r7
            long r1 = r13 / r4
            long r9 = r13 % r4
            int r9 = (int) r9
            r16 = r4
            long r3 = r0.c
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x0074
            f22 r1 = defpackage.ru0.a(r8, r1, r0)
            if (r1 != 0) goto L_0x0072
            if (r15 == 0) goto L_0x006f
            java.lang.Throwable r0 = r19.o()
            c22 r1 = new c22
            r1.<init>(r0)
        L_0x006c:
            r0 = r1
            goto L_0x00f2
        L_0x006f:
            r9 = 0
            r10 = 1
            goto L_0x0039
        L_0x0072:
            r10 = r1
            goto L_0x0075
        L_0x0074:
            r10 = r0
        L_0x0075:
            r0 = r19
            r1 = r10
            r2 = r9
            r3 = r20
            r4 = r13
            r6 = r12
            r18 = r7
            r7 = r15
            int r0 = defpackage.ru0.f(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto L_0x00ee
            r1 = 1
            if (r0 == r1) goto L_0x00eb
            r2 = 2
            if (r0 == r2) goto L_0x00c0
            r2 = 3
            if (r0 == r2) goto L_0x00b4
            r2 = 4
            if (r0 == r2) goto L_0x009d
            r2 = 5
            if (r0 == r2) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            r10.a()
        L_0x0099:
            r0 = r10
            r9 = 0
            r10 = r1
            goto L_0x0039
        L_0x009d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.ru0.v
            long r0 = r0.get(r8)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00aa
            r10.a()
        L_0x00aa:
            java.lang.Throwable r0 = r19.o()
            c22 r1 = new c22
            r1.<init>(r0)
            goto L_0x006c
        L_0x00b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            if (r15 == 0) goto L_0x00cf
            r10.i()
            java.lang.Throwable r0 = r19.o()
            c22 r1 = new c22
            r1.<init>(r0)
            goto L_0x006c
        L_0x00cf:
            boolean r0 = r12 instanceof defpackage.neg
            if (r0 == 0) goto L_0x00d7
            r0 = r12
            neg r0 = (defpackage.neg) r0
            goto L_0x00d8
        L_0x00d7:
            r0 = 0
        L_0x00d8:
            if (r0 == 0) goto L_0x00df
            int r7 = r9 + r18
            r0.a(r10, r7)
        L_0x00df:
            long r0 = r10.c
            long r0 = r0 * r16
            long r2 = (long) r9
            long r0 = r0 + r2
            r8.k(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x00f2
        L_0x00eb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x00f2
        L_0x00ee:
            r10.a()
            goto L_0x00eb
        L_0x00f2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dh3.K(java.lang.Object, boolean):java.lang.Object");
    }

    public final Object s(Object obj) {
        return K(obj, false);
    }

    public final Object t(Object obj, Continuation continuation) {
        UndeliveredElementException p;
        Object K = K(obj, true);
        if (!(K instanceof c22)) {
            return Unit.INSTANCE;
        }
        e22.a(K);
        Function1 function1 = this.b;
        if (function1 == null || (p = iq.p(function1, obj, (UndeliveredElementException) null)) == null) {
            throw o();
        }
        ExceptionsKt.addSuppressed(p, o());
        throw p;
    }

    public final boolean y() {
        return this.v0 == cu0.b;
    }
}
