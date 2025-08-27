package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatmedia.viewer.photo.GifViewerWidget;

/* renamed from: ur6  reason: default package */
public final class ur6 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ GifViewerWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ur6(Continuation continuation, GifViewerWidget gifViewerWidget) {
        super(2, continuation);
        this.b = gifViewerWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ur6 ur6 = new ur6(continuation, this.b);
        ur6.a = obj;
        return ur6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ur6) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r7v14, types: [hr8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.a
            p85 r7 = (defpackage.p85) r7
            kotlin.reflect.KProperty[] r0 = one.me.chatmedia.viewer.photo.GifViewerWidget.X
            one.me.chatmedia.viewer.photo.GifViewerWidget r6 = r6.b
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.j85
            r1 = 0
            if (r0 == 0) goto L_0x008f
            j85 r7 = (defpackage.j85) r7
            hr8 r0 = r7.a
            java.lang.String r0 = r0.v()
            java.lang.String r2 = r6.c0()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x00fb
            hr8 r7 = r7.a
            long r2 = r7.m()
            long r4 = r6.d0()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x0038
            goto L_0x00fb
        L_0x0038:
            aj2 r7 = r6.h0()
            long r2 = r6.d0()
            java.lang.String r0 = r6.c0()
            hr8 r7 = r7.t(r2, r0)
            boolean r0 = r7 instanceof defpackage.yq8
            if (r0 == 0) goto L_0x004f
            r1 = r7
            yq8 r1 = (defpackage.yq8) r1
        L_0x004f:
            if (r1 != 0) goto L_0x0053
            goto L_0x00fb
        L_0x0053:
            lfb r7 = r6.e0()
            boolean r7 = r7.getFailure()
            if (r7 == 0) goto L_0x007f
            aj2 r7 = r6.h0()
            long r2 = r6.d0()
            java.lang.String r0 = r6.c0()
            r7.v(r2, r0)
            lfb r7 = r6.e0()
            lfb r6 = r6.e0()
            boolean r6 = r6.getFailure()
            p87 r0 = r1.o
            r7.r(r0, r6)
            goto L_0x00fb
        L_0x007f:
            aj2 r7 = r6.h0()
            long r0 = r6.d0()
            java.lang.String r6 = r6.c0()
            r7.w(r0, r6)
            goto L_0x00fb
        L_0x008f:
            boolean r0 = r7 instanceof defpackage.k85
            if (r0 == 0) goto L_0x00d1
            k85 r7 = (defpackage.k85) r7
            hr8 r0 = r7.a
            java.lang.String r0 = r0.v()
            java.lang.String r2 = r6.c0()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x00fb
            hr8 r7 = r7.a
            long r2 = r7.m()
            long r4 = r6.d0()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            goto L_0x00fb
        L_0x00b4:
            r6.y = r1
            n7g r7 = r6.f0()
            if (r7 == 0) goto L_0x00c9
            r0 = 0
            r7.K0(r0)
            r7.pause()
            r7.L0(r1)
            r7.M0()
        L_0x00c9:
            h9g r6 = r6.g0()
            r6.b()
            goto L_0x00fb
        L_0x00d1:
            boolean r0 = r7 instanceof defpackage.l85
            if (r0 == 0) goto L_0x00fb
            l85 r7 = (defpackage.l85) r7
            yq8 r0 = r7.a
            java.lang.String r0 = r0.w
            java.lang.String r1 = r6.c0()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            if (r0 == 0) goto L_0x00fb
            yq8 r7 = r7.a
            long r0 = r7.a
            long r2 = r6.d0()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00fb
            lfb r6 = r6.e0()
            p87 r7 = r7.o
            r0 = 1
            r6.r(r7, r0)
        L_0x00fb:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
