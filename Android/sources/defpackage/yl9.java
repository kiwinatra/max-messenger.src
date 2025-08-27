package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: yl9  reason: default package */
public final class yl9 extends SuspendLambda implements Function2 {
    public int a;
    public en9 b;
    public Collection c;
    public Iterator o;
    public ha9 v;
    public int w;
    public final /* synthetic */ List x;
    public final /* synthetic */ en9 y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yl9(en9 en9, List list, Continuation continuation) {
        super(2, continuation);
        this.x = list;
        this.y = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new yl9(this.y, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 0
            r4 = 0
            r5 = 2
            en9 r6 = r0.y
            r7 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 == r7) goto L_0x002f
            if (r2 != r5) goto L_0x0027
            int r2 = r0.a
            ha9 r8 = r0.v
            java.util.Iterator r9 = r0.o
            java.util.Collection r10 = r0.c
            java.util.Collection r10 = (java.util.Collection) r10
            en9 r11 = r0.b
            kotlin.ResultKt.throwOnFailure(r19)
            r12 = r19
            goto L_0x0096
        L_0x0027:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002f:
            int r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r19)
            r8 = r2
            r2 = r19
            goto L_0x0059
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r19)
            java.util.List r2 = r0.x
            int r8 = r2.size()
            if (r8 <= r7) goto L_0x0045
            r8 = r7
            goto L_0x0046
        L_0x0045:
            r8 = r4
        L_0x0046:
            kotlin.reflect.KProperty[] r9 = defpackage.en9.A1
            to9 r9 = r6.t()
            java.util.Collection r2 = (java.util.Collection) r2
            r0.a = r8
            r0.w = r7
            java.lang.Object r2 = r9.b(r2, r0)
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r2 = r2.iterator()
            r11 = r6
            r10 = r9
            r9 = r2
            r2 = r8
        L_0x0068:
            boolean r8 = r9.hasNext()
            if (r8 == 0) goto L_0x00fe
            java.lang.Object r8 = r9.next()
            ha9 r8 = (defpackage.ha9) r8
            if (r2 == 0) goto L_0x00a7
            kotlin.Lazy r12 = r11.I0
            java.lang.Object r12 = r12.getValue()
            eu3 r12 = (defpackage.eu3) r12
            long r13 = r8.w
            r0.b = r11
            r15 = r10
            java.util.Collection r15 = (java.util.Collection) r15
            r0.c = r15
            r0.o = r9
            r0.v = r8
            r0.a = r2
            r0.w = r5
            java.lang.Object r12 = r12.b(r13, r0)
            if (r12 != r1) goto L_0x0096
            return r1
        L_0x0096:
            vk3 r12 = (defpackage.vk3) r12
            if (r12 == 0) goto L_0x00a0
            java.lang.String r12 = r12.f()
            if (r12 != 0) goto L_0x00a8
        L_0x00a0:
            long r12 = r8.w
            java.lang.String r12 = java.lang.String.valueOf(r12)
            goto L_0x00a8
        L_0x00a7:
            r12 = r3
        L_0x00a8:
            java.lang.String r13 = r8.y
            if (r13 == 0) goto L_0x00b5
            int r13 = r13.length()
            if (r13 != 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            r13 = r4
            goto L_0x00b6
        L_0x00b5:
            r13 = r7
        L_0x00b6:
            r13 = r13 ^ r7
            if (r13 == 0) goto L_0x00bc
            java.lang.String r8 = r8.y
            goto L_0x00df
        L_0x00bc:
            boolean r13 = r8.q()
            if (r13 == 0) goto L_0x00c7
            ha9 r8 = r8.A0
            java.lang.String r8 = r8.y
            goto L_0x00df
        L_0x00c7:
            boolean r13 = defpackage.ld8.U(r8)
            if (r13 == 0) goto L_0x00de
            w28 r8 = r8.x0
            if (r8 == 0) goto L_0x00de
            l20 r8 = r8.F(r4)
            if (r8 == 0) goto L_0x00de
            i10 r8 = r8.e
            if (r8 == 0) goto L_0x00de
            java.lang.String r8 = r8.f
            goto L_0x00df
        L_0x00de:
            r8 = r3
        L_0x00df:
            if (r2 == 0) goto L_0x00f7
            if (r8 == 0) goto L_0x00f6
            kotlin.Lazy r13 = r11.D0
            java.lang.Object r13 = r13.getValue()
            android.app.Application r13 = (android.app.Application) r13
            int r14 = defpackage.ewa.U0
            java.lang.Object[] r8 = new java.lang.Object[]{r12, r8}
            java.lang.String r8 = r13.getString(r14, r8)
            goto L_0x00f7
        L_0x00f6:
            r8 = r3
        L_0x00f7:
            if (r8 == 0) goto L_0x0068
            r10.add(r8)
            goto L_0x0068
        L_0x00fe:
            java.util.List r10 = (java.util.List) r10
            kotlin.Lazy r0 = r6.D0
            java.lang.Object r0 = r0.getValue()
            android.app.Application r0 = (android.app.Application) r0
            r11 = r10
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            r15 = 0
            r16 = 0
            java.lang.String r12 = "\n\n"
            r13 = 0
            r14 = 0
            r17 = 62
            java.lang.String r1 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r11, r12, r13, r14, 0, r15, r16, r17, (java.lang.Object) null)
            defpackage.b59.k(r0, r1)
            boolean r0 = defpackage.b59.C()
            if (r0 == 0) goto L_0x013f
            int r0 = defpackage.dwa.a
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            ggf r2 = new ggf
            java.util.List r1 = kotlin.collections.ArraysKt.toList((T[]) r1)
            r2.<init>(r1, r0, r7)
            o8e r0 = new o8e
            r1 = 6
            r0.<init>(r2, r4, r3, r1)
            s85 r1 = r6.q1
            defpackage.xag.h(r1, r0)
        L_0x013f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
