package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: xwb  reason: default package */
public final class xwb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ProfileChangeLinkScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xwb(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.b = profileChangeLinkScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        xwb xwb = new xwb(continuation, this.b);
        xwb.a = obj;
        return xwb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xwb) create((hxb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1, types: [e9d] */
    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r14)
            java.lang.Object r14 = r13.a
            hxb r14 = (defpackage.hxb) r14
            boolean r1 = r14 instanceof defpackage.fxb
            r2 = 2
            one.me.profileedit.screens.changelink.ProfileChangeLinkScreen r13 = r13.b
            if (r1 == 0) goto L_0x003e
            defpackage.kr7.z(r13)
            ix3 r0 = defpackage.ix3.a
            lw3 r0 = defpackage.m58.b(r0)
            fxb r14 = (defpackage.fxb) r14
            java.util.List r14 = r14.b
            java.util.Collection r14 = (java.util.Collection) r14
            lw3 r14 = r0.h(r14)
            kotlin.reflect.KProperty[] r0 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.Y
            r0 = r0[r2]
            kotlin.properties.ReadOnlyProperty r1 = r13.x
            java.lang.Object r0 = r1.getValue(r13, r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            lw3 r14 = r14.o(r0)
            mw3 r14 = r14.build()
            r14.o(r13)
            goto L_0x01cd
        L_0x003e:
            boolean r1 = r14 instanceof defpackage.gxb
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x00c1
            gxb r14 = (defpackage.gxb) r14
            ngf r1 = r14.b
            if (r1 == 0) goto L_0x00be
            android.content.Context r5 = r13.getContext()
            java.lang.CharSequence r1 = r1.a(r5)
            if (r1 != 0) goto L_0x0055
            goto L_0x00be
        L_0x0055:
            ngf r5 = r14.c
            if (r5 == 0) goto L_0x0061
            android.content.Context r4 = r13.getContext()
            java.lang.CharSequence r4 = r5.a(r4)
        L_0x0061:
            e0b r5 = new e0b
            r5.<init>((one.me.sdk.arch.Widget) r13)
            r5.i(r1)
            r5.b(r4)
            boolean r1 = r14.d
            if (r1 == 0) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r3 = r2
        L_0x0072:
            r5.e(r3)
            n0b r1 = new n0b
            one.me.sdk.uikit.common.button.OneMeButton r3 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.c0(r13)
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x009e
            one.me.sdk.uikit.common.button.OneMeButton r13 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.c0(r13)
            int r13 = r13.getMeasuredHeight()
            r3 = 12
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            int r3 = r3 * r2
            int r3 = r3 + r13
            goto L_0x009f
        L_0x009e:
            r3 = r0
        L_0x009f:
            r13 = 3
            r1.<init>(r0, r3, r13)
            r5.c(r1)
            java.lang.Integer r13 = r14.e
            if (r13 == 0) goto L_0x00b4
            o0b r14 = new o0b
            int r13 = r13.intValue()
            r14.<init>(r13)
            goto L_0x00b6
        L_0x00b4:
            p0b r14 = defpackage.p0b.a
        L_0x00b6:
            r5.f(r14)
            r5.j()
            goto L_0x01cd
        L_0x00be:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L_0x00c1:
            boolean r1 = r14 instanceof defpackage.dxb
            if (r1 == 0) goto L_0x011c
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "android.intent.action.SEND"
            r0.setAction(r1)
            dxb r14 = (defpackage.dxb) r14
            ngf r14 = r14.b
            android.content.Context r1 = r13.getContext()
            java.lang.CharSequence r14 = r14.a(r1)
            java.lang.String r1 = "android.intent.extra.TEXT"
            r0.putExtra(r1, r14)
            java.lang.String r14 = "text/plain"
            r0.setType(r14)
            vzb r14 = defpackage.vzb.b
            int r1 = defpackage.ixa.N1
            android.content.Context r13 = r13.getContext()
            java.lang.String r13 = defpackage.q8.p(r1, r13)
            java.lang.Class<one.me.profileedit.screens.changelink.ProfileChangeLinkScreen> r1 = one.me.profileedit.screens.changelink.ProfileChangeLinkScreen.class
            java.lang.String r1 = r1.getName()
            ta4 r14 = r14.W0()
            java.lang.String r2 = "ru.ok.tamtam.extra.DATA"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r2, r0)
            java.lang.String r2 = "ru.ok.tamtam.extra.SHARE_TITLE"
            kotlin.Pair r13 = kotlin.TuplesKt.to(r2, r13)
            java.lang.String r2 = "tag"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            kotlin.Pair[] r13 = new kotlin.Pair[]{r0, r13, r1}
            android.os.Bundle r13 = defpackage.o54.f(r13)
            java.lang.String r0 = ":chats/share"
            r14.b(r0, r13)
            goto L_0x01cd
        L_0x011c:
            boolean r1 = r14 instanceof defpackage.axb
            if (r1 == 0) goto L_0x012d
            android.content.Context r13 = r13.getContext()
            axb r14 = (defpackage.axb) r14
            java.lang.String r14 = r14.b
            defpackage.te8.f(r13, r14)
            goto L_0x01cd
        L_0x012d:
            boolean r1 = r14 instanceof defpackage.exb
            if (r1 == 0) goto L_0x0198
            kotlin.reflect.KProperty[] r1 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            exb r14 = (defpackage.exb) r14
            ngf r1 = r14.b
            r2 = 6
            ng3 r1 = defpackage.b0h.a(r1, r4, r2)
            ngf r2 = r14.c
            r1.f(r2)
            nj2 r2 = new nj2
            java.lang.String r10 = "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;"
            r11 = 8
            r6 = 1
            java.lang.Class<ng3> r8 = defpackage.ng3.class
            java.lang.String r9 = "addButton"
            r12 = 8
            r5 = r2
            r7 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            lj2 r5 = new lj2
            r6 = 7
            r5.<init>(r2, r6)
            java.util.List r14 = r14.d
            r14.forEach(r5)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r7 = r1.e()
            r7.setTargetController(r13)
            r14 = r13
        L_0x0166:
            zx3 r1 = r14.getParentController()
            if (r1 == 0) goto L_0x0171
            zx3 r14 = r14.getParentController()
            goto L_0x0166
        L_0x0171:
            boolean r1 = r14 instanceof defpackage.l9d
            if (r1 == 0) goto L_0x0178
            l9d r14 = (defpackage.l9d) r14
            goto L_0x0179
        L_0x0178:
            r14 = r4
        L_0x0179:
            if (r14 == 0) goto L_0x017f
            e9d r4 = r14.K()
        L_0x017f:
            r7.p0(r13)
            if (r4 == 0) goto L_0x01cd
            i9d r13 = new i9d
            r9 = 0
            r12 = -1
            r8 = 0
            r10 = 0
            r11 = 0
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            java.lang.String r14 = "BottomSheetWidget"
            defpackage.a81.t(r0, r13, r3, r14)
            r4.G(r13)
            goto L_0x01cd
        L_0x0198:
            boolean r1 = r14 instanceof defpackage.bxb
            if (r1 == 0) goto L_0x01b6
            java.lang.String r0 = defpackage.hsg.n
            android.content.Context r0 = r13.getContext()
            bxb r14 = (defpackage.bxb) r14
            ngf r14 = r14.b
            android.content.Context r13 = r13.getContext()
            java.lang.CharSequence r13 = r14.a(r13)
            if (r13 != 0) goto L_0x01b2
            java.lang.String r13 = ""
        L_0x01b2:
            defpackage.hsg.G(r0, r13)
            goto L_0x01cd
        L_0x01b6:
            boolean r1 = r14 instanceof defpackage.cxb
            if (r1 == 0) goto L_0x01d0
            vzb r1 = defpackage.vzb.b
            jkb r2 = new jkb
            r2.<init>((one.me.profileedit.screens.changelink.ProfileChangeLinkScreen) r13, (defpackage.hxb) r14)
            ta4 r13 = r1.W0()
            uzb r14 = new uzb
            r14.<init>(r0, r2)
            r13.e(r14)
        L_0x01cd:
            kotlin.Unit r13 = kotlin.Unit.INSTANCE
            return r13
        L_0x01d0:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
