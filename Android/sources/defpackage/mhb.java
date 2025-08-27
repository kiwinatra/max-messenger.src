package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: mhb  reason: default package */
public final class mhb extends SuspendLambda implements Function2 {
    public tz9 a;
    public int b;
    public final /* synthetic */ whb c;
    public final /* synthetic */ Set o;
    public final /* synthetic */ hkb v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mhb(whb whb, Set set, hkb hkb, Continuation continuation) {
        super(2, continuation);
        this.c = whb;
        this.o = set;
        this.v = hkb;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mhb(this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mhb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.b
            hkb r2 = r13.v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0031
            if (r1 == r5) goto L_0x002b
            if (r1 == r4) goto L_0x0022
            if (r1 != r3) goto L_0x001a
            tz9 r13 = r13.a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00a9
        L_0x001a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0022:
            tz9 r1 = r13.a
            kotlin.ResultKt.throwOnFailure(r14)
            r12 = r1
            r1 = r14
            r14 = r12
            goto L_0x0094
        L_0x002b:
            tz9 r13 = r13.a
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x006e
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r14)
            whb r14 = r13.c
            xme r14 = r14.w0
            java.util.Set r1 = r13.o
            int r6 = r1.size()
            if (r6 <= r5) goto L_0x0071
            int r1 = r1.size()
            r13.a = r14
            r13.b = r5
            r2.getClass()
            rhb r13 = new rhb
            int r2 = defpackage.ira.a
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            ggf r7 = new ggf
            java.util.List r3 = kotlin.collections.ArraysKt.toList((T[]) r3)
            r7.<init>(r3, r2, r1)
            r10 = 0
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            if (r13 != r0) goto L_0x006b
            return r0
        L_0x006b:
            r12 = r14
            r14 = r13
            r13 = r12
        L_0x006e:
            rhb r14 = (defpackage.rhb) r14
            goto L_0x00ab
        L_0x0071:
            cs2 r5 = defpackage.cs2.a
            q4 r5 = r5.getAccessor()
            java.lang.Class<to9> r6 = defpackage.to9.class
            java.lang.Object r5 = r5.g(r6)
            to9 r5 = (defpackage.to9) r5
            java.lang.Object r1 = kotlin.collections.CollectionsKt.first(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            long r6 = r1.longValue()
            r13.a = r14
            r13.b = r4
            java.lang.Object r1 = r5.a(r6, r13)
            if (r1 != r0) goto L_0x0094
            return r0
        L_0x0094:
            ha9 r1 = (defpackage.ha9) r1
            if (r1 != 0) goto L_0x009b
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L_0x009b:
            r13.a = r14
            r13.b = r3
            java.lang.Object r13 = r2.a(r1, r13)
            if (r13 != r0) goto L_0x00a6
            return r0
        L_0x00a6:
            r12 = r14
            r14 = r13
            r13 = r12
        L_0x00a9:
            rhb r14 = (defpackage.rhb) r14
        L_0x00ab:
            r13.setValue(r14)
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mhb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
