package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: yl8  reason: default package */
public final class yl8 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MediaBarWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yl8(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.b = mediaBarWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yl8 yl8 = new yl8(continuation, this.b);
        yl8.a = obj;
        return yl8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yl8) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.a
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1 = 0
            one.me.chatscreen.mediabar.MediaBarWidget r6 = r6.b
            if (r7 != 0) goto L_0x0023
            kotlin.reflect.KProperty[] r7 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            il8 r7 = r6.r0()
            boolean r7 = r7.l()
            if (r7 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r7 = r1
            goto L_0x0024
        L_0x0023:
            r7 = r0
        L_0x0024:
            kotlin.reflect.KProperty[] r2 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            orb r2 = r6.n0()
            lrb r2 = r2.getScrollState()
            lrb r3 = defpackage.lrb.a
            if (r2 != r3) goto L_0x0034
            r2 = r0
            goto L_0x0035
        L_0x0034:
            r2 = r1
        L_0x0035:
            dc9 r3 = r6.m0()
            r4 = 8
            if (r7 == 0) goto L_0x003f
            r5 = r1
            goto L_0x0040
        L_0x003f:
            r5 = r4
        L_0x0040:
            r3.setVisibility(r5)
            kotlin.reflect.KProperty[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r5 = 16
            r3 = r3[r5]
            sn0 r3 = r6.N0
            java.lang.Object r3 = r3.getValue()
            oz1 r3 = (defpackage.oz1) r3
            r0 = r0 ^ r7
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = r4
        L_0x0056:
            r3.setVisibility(r1)
            e9d r0 = r6.l0()
            boolean r0 = r0.n()
            if (r0 == 0) goto L_0x0073
            if (r7 == 0) goto L_0x0067
            if (r2 == 0) goto L_0x0073
        L_0x0067:
            il8 r6 = r6.r0()
            og9 r7 = defpackage.og9.a
            zqd r6 = r6.Y
            r6.C(r7)
            goto L_0x0086
        L_0x0073:
            if (r7 == 0) goto L_0x0077
            if (r2 == 0) goto L_0x0086
        L_0x0077:
            int r7 = defpackage.pq7.a
            int r7 = defpackage.pq7.c
            boolean r7 = defpackage.pq7.b(r7)
            if (r7 == 0) goto L_0x0086
            fb6 r6 = r6.Z0
            r6.k()
        L_0x0086:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yl8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
