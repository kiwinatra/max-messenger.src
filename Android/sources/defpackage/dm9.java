package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dm9  reason: default package */
public final class dm9 extends SuspendLambda implements Function2 {
    public a32 a;
    public int b;
    public final /* synthetic */ en9 c;
    public final /* synthetic */ List o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dm9(en9 en9, List list, Continuation continuation) {
        super(2, continuation);
        this.c = en9;
        this.o = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dm9(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dm9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.b
            r2 = 0
            java.util.List r3 = r9.o
            r4 = 1
            en9 r5 = r9.c
            if (r1 == 0) goto L_0x001e
            if (r1 != r4) goto L_0x0016
            a32 r9 = r9.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0056
        L_0x0016:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r10)
            etc r10 = r5.k1
            ome r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            a32 r10 = (defpackage.a32) r10
            if (r10 != 0) goto L_0x0030
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x0030:
            x23 r1 = r5.x0
            qjd r1 = (defpackage.qjd) r1
            long r6 = r1.s()
            m72 r1 = r10.b
            boolean r1 = r1.h(r6)
            if (r1 != 0) goto L_0x0061
            kotlin.Lazy r1 = r5.E0
            java.lang.Object r1 = r1.getValue()
            j89 r1 = (defpackage.j89) r1
            r9.a = r10
            r9.b = r4
            java.lang.Object r9 = r1.a(r3, r9)
            if (r9 != r0) goto L_0x0053
            return r0
        L_0x0053:
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x0056:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x0060
            r10 = r4
            goto L_0x0063
        L_0x0060:
            r10 = r9
        L_0x0061:
            r9 = r10
            r10 = r2
        L_0x0063:
            kotlin.reflect.KProperty[] r0 = defpackage.en9.A1
            kotlin.Lazy r0 = r5.E0
            java.lang.Object r0 = r0.getValue()
            j89 r0 = (defpackage.j89) r0
            r0.getClass()
            boolean r0 = r9.f0()
            if (r0 != 0) goto L_0x0077
            goto L_0x007f
        L_0x0077:
            boolean r9 = r9.K()
            if (r9 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r2 = r4
        L_0x007f:
            pg3 r9 = defpackage.d89.a
            int r9 = r3.size()
            int r0 = defpackage.dwa.b
            egf r1 = new egf
            r1.<init>(r0, r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.createListBuilder()
            if (r2 == 0) goto L_0x00a5
            pg3 r0 = new pg3
            int r2 = defpackage.cwa.m
            int r4 = defpackage.ewa.F
            igf r6 = new igf
            r6.<init>(r4)
            og3 r4 = defpackage.og3.a
            r0.<init>(r2, r6, r4)
            r9.add(r0)
        L_0x00a5:
            if (r10 == 0) goto L_0x00ba
            pg3 r10 = new pg3
            int r0 = defpackage.cwa.n
            int r2 = defpackage.ewa.E
            igf r4 = new igf
            r4.<init>(r2)
            og3 r2 = defpackage.og3.a
            r10.<init>(r0, r4, r2)
            r9.add(r10)
        L_0x00ba:
            pg3 r10 = defpackage.d89.a
            r9.add(r10)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            java.util.List r9 = kotlin.collections.CollectionsKt.build(r9)
            h8e r10 = new h8e
            r0 = 0
            r10.<init>(r3, r1, r0, r9)
            s85 r9 = r5.q1
            defpackage.xag.h(r9, r10)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
