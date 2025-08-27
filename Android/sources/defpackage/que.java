package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.stickerssettings.StickersSettingsScreen;

/* renamed from: que  reason: default package */
public final class que extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ StickersSettingsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public que(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.b = stickersSettingsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        que que = new que(continuation, this.b);
        que.a = obj;
        return que;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((que) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.a
            t0e r12 = (defpackage.t0e) r12
            kotlin.reflect.KProperty[] r0 = one.me.stickerssettings.StickersSettingsScreen.w
            one.me.stickerssettings.StickersSettingsScreen r11 = r11.b
            r11.getClass()
            boolean r0 = r12 instanceof defpackage.r0e
            if (r0 == 0) goto L_0x0032
            r0e r12 = (defpackage.r0e) r12
            java.util.List r12 = r12.a
            ix3 r0 = defpackage.ix3.b
            lw3 r0 = defpackage.m58.b(r0)
            java.util.Collection r12 = (java.util.Collection) r12
            lw3 r12 = r0.h(r12)
            lw3 r12 = r12.p()
            mw3 r12 = r12.build()
            r12.o(r11)
            goto L_0x012c
        L_0x0032:
            boolean r0 = r12 instanceof defpackage.o0e
            r1 = 0
            if (r0 == 0) goto L_0x0082
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "android.intent.action.SEND"
            r0.setAction(r2)
            o0e r12 = (defpackage.o0e) r12
            java.lang.String r12 = r12.a
            java.lang.String r2 = "android.intent.extra.TEXT"
            r0.putExtra(r2, r12)
            java.lang.String r12 = "text/plain"
            r0.setType(r12)
            e9d r11 = r11.getRouter()
            java.util.ArrayList r11 = r11.e()
            java.lang.Object r11 = kotlin.collections.CollectionsKt.lastOrNull(r11)
            i9d r11 = (defpackage.i9d) r11
            if (r11 == 0) goto L_0x0061
            java.lang.String r1 = r11.b
        L_0x0061:
            nue r11 = defpackage.nue.b
            ta4 r11 = r11.W0()
            java.lang.String r12 = "ru.ok.tamtam.extra.DATA"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r12, r0)
            java.lang.String r0 = "tag"
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            kotlin.Pair[] r12 = new kotlin.Pair[]{r12, r0}
            android.os.Bundle r12 = defpackage.o54.f(r12)
            java.lang.String r0 = ":chats/share"
            r11.b(r0, r12)
            goto L_0x012c
        L_0x0082:
            boolean r0 = r12 instanceof defpackage.p0e
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = defpackage.hsg.n
            android.content.Context r11 = r11.getContext()
            p0e r12 = (defpackage.p0e) r12
            java.lang.String r12 = r12.a
            defpackage.hsg.G(r11, r12)
            goto L_0x012c
        L_0x0095:
            boolean r0 = r12 instanceof defpackage.q0e
            if (r0 == 0) goto L_0x0103
            q0e r12 = (defpackage.q0e) r12
            kotlin.reflect.KProperty[] r0 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            ngf r0 = r12.a
            r2 = 6
            ng3 r0 = defpackage.b0h.a(r0, r1, r2)
            ngf r2 = r12.b
            r0.f(r2)
            nj2 r2 = new nj2
            java.lang.Class<ng3> r6 = defpackage.ng3.class
            java.lang.String r7 = "addButton"
            r4 = 1
            java.lang.String r8 = "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;"
            r9 = 8
            r10 = 13
            r3 = r2
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            lj2 r3 = new lj2
            r4 = 11
            r3.<init>(r2, r4)
            java.util.List r12 = r12.c
            r12.forEach(r3)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r5 = r0.e()
            r5.setTargetController(r11)
            r12 = r11
        L_0x00cf:
            zx3 r0 = r12.getParentController()
            if (r0 == 0) goto L_0x00da
            zx3 r12 = r12.getParentController()
            goto L_0x00cf
        L_0x00da:
            boolean r0 = r12 instanceof defpackage.l9d
            if (r0 == 0) goto L_0x00e1
            l9d r12 = (defpackage.l9d) r12
            goto L_0x00e2
        L_0x00e1:
            r12 = r1
        L_0x00e2:
            if (r12 == 0) goto L_0x00e8
            e9d r1 = r12.K()
        L_0x00e8:
            r5.p0(r11)
            if (r1 == 0) goto L_0x012c
            i9d r11 = new i9d
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r10 = -1
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = 0
            r0 = 1
            java.lang.String r2 = "BottomSheetWidget"
            defpackage.a81.t(r12, r11, r0, r2)
            r1.G(r11)
            goto L_0x012c
        L_0x0103:
            boolean r0 = r12 instanceof defpackage.s0e
            if (r0 == 0) goto L_0x012f
            e0b r0 = new e0b
            r0.<init>((one.me.sdk.arch.Widget) r11)
            o0b r1 = new o0b
            s0e r12 = (defpackage.s0e) r12
            int r2 = r12.a
            r1.<init>(r2)
            r0.f(r1)
            android.content.Context r11 = r11.getContext()
            ngf r12 = r12.b
            java.lang.CharSequence r11 = r12.a(r11)
            if (r11 != 0) goto L_0x0126
            java.lang.String r11 = ""
        L_0x0126:
            r0.i(r11)
            r0.j()
        L_0x012c:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x012f:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.que.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
