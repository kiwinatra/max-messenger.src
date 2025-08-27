package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ap6  reason: default package */
public final class ap6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ gp6 a;
    public final /* synthetic */ k48 b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ap6(gp6 gp6, k48 k48, List list, Continuation continuation) {
        super(2, continuation);
        this.a = gp6;
        this.b = k48;
        this.c = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ap6(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ap6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r14 = r0.c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r15)
            gp6 r15 = r14.a
            ql6 r0 = r15.b
            boolean r0 = r0.b
            k48 r3 = r14.b
            r1 = 0
            if (r0 != 0) goto L_0x0018
            j48 r0 = r3.Z
            j48 r2 = defpackage.j48.v
            if (r0 != r2) goto L_0x0018
            return r1
        L_0x0018:
            java.util.List r14 = r14.c
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L_0x0020:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r14.next()
            r2 = r0
            uqd r2 = (defpackage.uqd) r2
            d48 r2 = r2.a
            android.net.Uri r4 = r3.b
            android.net.Uri r2 = r2.c()
            boolean r2 = defpackage.y64.a(r4, r2)
            if (r2 == 0) goto L_0x0020
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            uqd r0 = (defpackage.uqd) r0
            if (r0 == 0) goto L_0x0049
            dfb r14 = r0.c
            if (r14 == 0) goto L_0x0049
            android.net.Uri r14 = r14.v
            r7 = r14
            goto L_0x004a
        L_0x0049:
            r7 = r1
        L_0x004a:
            android.net.Uri r14 = r3.Y
            if (r0 == 0) goto L_0x0070
            dfb r2 = r0.c
            d48 r4 = r0.a
            boolean r2 = defpackage.dfb.b(r2, r4)
            if (r2 == 0) goto L_0x0070
            dfb r2 = r0.c
            android.net.Uri r2 = defpackage.dfb.a(r2, r4)
            if (r2 == 0) goto L_0x0070
            java.lang.String r5 = r2.getPath()
            if (r5 == 0) goto L_0x0070
            java.lang.String r4 = r4.c
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0070
            r13 = r2
            goto L_0x0071
        L_0x0070:
            r13 = r14
        L_0x0071:
            ql6 r14 = r15.b
            boolean r2 = r14.c
            xm6 r14 = r15.w0
            v3d r4 = r14.h
            d48 r14 = defpackage.cvg.M(r3)
            sqd r15 = r15.D0
            int r8 = r15.h(r14)
            if (r0 == 0) goto L_0x0089
            p4g r14 = r0.b
            r6 = r14
            goto L_0x008a
        L_0x0089:
            r6 = r1
        L_0x008a:
            if (r0 == 0) goto L_0x0090
            dfb r14 = r0.c
            r5 = r14
            goto L_0x0091
        L_0x0090:
            r5 = r1
        L_0x0091:
            tm6 r14 = new tm6
            long r10 = r3.a
            r9 = 1
            r12 = 0
            r1 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ap6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
