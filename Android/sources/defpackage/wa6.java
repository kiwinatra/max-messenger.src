package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wa6  reason: default package */
public final class wa6 extends SuspendLambda implements Function2 {
    public Set a;
    public int b;
    public final /* synthetic */ ya6 c;
    public final /* synthetic */ CharSequence o;
    public final /* synthetic */ Set v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ta6 x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wa6(ya6 ya6, CharSequence charSequence, Set set, boolean z, ta6 ta6, Continuation continuation) {
        super(2, continuation);
        this.c = ya6;
        this.o = charSequence;
        this.v = set;
        this.w = z;
        this.x = ta6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wa6(this.c, this.o, this.v, this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wa6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            ya6 r7 = r0.c
            if (r2 == 0) goto L_0x0032
            if (r2 == r6) goto L_0x002c
            if (r2 == r5) goto L_0x0025
            if (r2 == r4) goto L_0x0025
            if (r2 != r3) goto L_0x001d
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x010e
        L_0x001d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0025:
            java.util.Set r2 = r0.a
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x00bf
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r19)
            r2 = r19
            goto L_0x0040
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r19)
            zc4 r2 = r7.c
            r0.b = r6
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L_0x0040
            return r1
        L_0x0040:
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Long r8 = r7.e
            java.util.Set r9 = r7.a
            if (r8 == 0) goto L_0x007d
            boolean r8 = r7.f
            if (r8 == 0) goto L_0x007d
            java.util.List r11 = kotlin.collections.CollectionsKt.toList(r9)
            java.lang.Long r4 = r7.e
            long r15 = r4.longValue()
            java.util.List r14 = kotlin.collections.CollectionsKt.toList(r2)
            r0.a = r2
            r0.b = r5
            d19 r13 = r7.d
            r13.getClass()
            ha6 r4 = new ha6
            r17 = 0
            java.lang.CharSequence r12 = r0.o
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r17)
            java.lang.Object r4 = defpackage.e14.d(r4, r0)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x007a:
            if (r4 != r1) goto L_0x00bf
            return r1
        L_0x007d:
            kotlin.Lazy r5 = r7.i
            java.lang.Object r5 = r5.getValue()
            r13 = r5
            qa6 r13 = (defpackage.qa6) r13
            java.util.List r11 = kotlin.collections.CollectionsKt.toList(r9)
            java.util.List r12 = kotlin.collections.CollectionsKt.toList(r2)
            etc r5 = r7.s
            ome r5 = r5.a
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r14 = r5 ^ 1
            r0.a = r2
            r0.b = r4
            r13.getClass()
            oa6 r4 = new oa6
            r16 = 0
            java.lang.CharSequence r15 = r0.o
            r10 = r4
            r10.<init>(r11, r12, r13, r14, r15, r16)
            java.lang.Object r4 = defpackage.e14.d(r4, r0)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L_0x00bc:
            if (r4 != r1) goto L_0x00bf
            return r1
        L_0x00bf:
            java.util.Set r4 = r0.v
            int r4 = r4.size()
            if (r4 <= r6) goto L_0x00f8
            android.content.Context r2 = r7.g
            android.content.res.Resources r2 = r2.getResources()
            int r4 = defpackage.fra.a
            java.util.Set r5 = r7.a
            int r5 = r5.size()
            java.lang.String r2 = r2.getQuantityString(r4, r5)
            kotlin.Lazy r4 = r7.h
            java.lang.Object r4 = r4.getValue()
            gaf r4 = (defpackage.gaf) r4
            osa r4 = (defpackage.osa) r4
            gc8 r4 = r4.c()
            va6 r5 = new va6
            r6 = 0
            r5.<init>(r7, r2, r6)
            r0.a = r6
            r0.b = r3
            java.lang.Object r0 = defpackage.ev0.I(r4, r5, r0)
            if (r0 != r1) goto L_0x010e
            return r1
        L_0x00f8:
            boolean r1 = r0.w
            if (r1 != 0) goto L_0x010e
            n6e r1 = r7.o
            za6 r3 = new za6
            java.lang.Object r2 = kotlin.collections.CollectionsKt.first(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            ta6 r0 = r0.x
            r3.<init>(r2, r0)
            r1.d(r3)
        L_0x010e:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
