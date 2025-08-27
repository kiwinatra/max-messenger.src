package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.startconversation.StartConversationScreen;

/* renamed from: gle  reason: default package */
public final class gle extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StartConversationScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gle(StartConversationScreen startConversationScreen, Continuation continuation) {
        super(2, continuation);
        this.b = startConversationScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gle gle = new gle(this.b, continuation);
        gle.a = obj;
        return gle;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gle) create((po3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.a
            po3 r9 = (defpackage.po3) r9
            one.me.startconversation.StartConversationScreen r8 = r8.b
            t56 r0 = r8.v0
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r0.G(r1)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            t56 r1 = r8.A0
            r1.G(r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            t56 r2 = r8.w0
            r2.G(r0)
            rle r0 = r8.d0()
            ju3 r0 = r0.z
            etc r0 = r0.i
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            po3 r0 = (defpackage.po3) r0
            boolean r0 = r0.b()
            t56 r3 = r8.B0
            if (r0 == 0) goto L_0x0082
            kotlin.reflect.KProperty[] r0 = one.me.startconversation.StartConversationScreen.E0
            r4 = 2
            r0 = r0[r4]
            is r0 = r8.v
            java.lang.Object r0 = r0.a(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0082
            kotlin.Lazy r0 = r8.Y
            java.lang.Object r0 = r0.getValue()
            edb r0 = (defpackage.edb) r0
            java.lang.String[] r4 = defpackage.edb.f
            boolean r0 = r0.b(r4)
            pt3 r4 = new pt3
            int r5 = defpackage.cad.M0
            int r6 = defpackage.sra.r
            if (r0 == 0) goto L_0x006b
            int r7 = defpackage.sra.q
            goto L_0x006d
        L_0x006b:
            int r7 = defpackage.sra.p
        L_0x006d:
            if (r0 == 0) goto L_0x0071
            r0 = 0
            goto L_0x0077
        L_0x0071:
            int r0 = defpackage.sra.o
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0077:
            r4.<init>(r5, r6, r7, r0)
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r4)
            r3.G(r0)
            goto L_0x0089
        L_0x0082:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            r3.G(r0)
        L_0x0089:
            java.lang.CharSequence r0 = r8.c0()
            t56 r3 = r8.z0
            t56 r4 = r8.y0
            t56 r5 = r8.x0
            if (r0 == 0) goto L_0x00ae
            int r0 = r0.length()
            if (r0 != 0) goto L_0x009c
            goto L_0x00ae
        L_0x009c:
            java.util.List r8 = r9.a
            r5.G(r8)
            java.util.List r8 = r9.b
            r4.G(r8)
            java.util.List r8 = r9.c
            r3.G(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x00ae:
            rle r9 = r8.d0()
            etc r9 = r9.Y
            ome r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            t56 r0 = r8.v0
            r0.G(r9)
            java.util.List r9 = defpackage.vzg.s()
            r1.G(r9)
            rle r9 = r8.d0()
            etc r9 = r9.y
            ome r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            po3 r9 = (defpackage.po3) r9
            java.util.List r9 = r9.a
            r5.G(r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
            r4.G(r9)
            rle r9 = r8.d0()
            etc r9 = r9.y
            ome r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            po3 r9 = (defpackage.po3) r9
            java.util.List r9 = r9.c
            r3.G(r9)
            kotlin.Lazy r8 = r8.y
            java.lang.Object r8 = r8.getValue()
            wh0 r8 = (defpackage.wh0) r8
            etc r8 = r8.y
            ome r8 = r8.a
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            r2.G(r8)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gle.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
