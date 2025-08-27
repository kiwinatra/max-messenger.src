package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* renamed from: ok7  reason: default package */
public final class ok7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InviteByPhoneScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ok7(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.b = inviteByPhoneScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ok7 ok7 = new ok7(continuation, this.b);
        ok7.a = obj;
        return ok7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ok7) create((kk7) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [e9d] */
    /* JADX WARNING: type inference failed for: r3v3, types: [e9d] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.a
            kk7 r15 = (defpackage.kk7) r15
            kotlin.reflect.KProperty[] r0 = one.me.inviteactions.invitebyphone.InviteByPhoneScreen.z0
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen r14 = r14.b
            one.me.sdk.uikit.common.button.OneMeButton r0 = r14.d0()
            r1 = 0
            r0.setProgressEnabled(r1)
            r2 = 1
            r0.setClickable(r2)
            boolean r0 = r15 instanceof defpackage.gk7
            if (r0 == 0) goto L_0x002f
            gk7 r15 = (defpackage.gk7) r15
            ngf r15 = r15.a
            android.content.Context r0 = r14.getContext()
            java.lang.CharSequence r15 = r15.a(r0)
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen.c0(r14, r15)
            goto L_0x013a
        L_0x002f:
            boolean r0 = r15 instanceof defpackage.hk7
            r3 = 0
            if (r0 == 0) goto L_0x0068
            hk7 r15 = (defpackage.hk7) r15
            ngf r0 = r15.a
            bk3 r1 = r14.a
            r1.getClass()
            android.content.Context r1 = r14.getContext()
            java.lang.CharSequence r0 = r0.a(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x013a
        L_0x0049:
            ngf r15 = r15.b
            if (r15 == 0) goto L_0x0055
            android.content.Context r1 = r14.getContext()
            java.lang.CharSequence r3 = r15.a(r1)
        L_0x0055:
            e0b r15 = new e0b
            r15.<init>((one.me.sdk.arch.Widget) r14)
            r15.i(r0)
            r15.b(r3)
            r15.e(r2)
            r15.j()
            goto L_0x013a
        L_0x0068:
            boolean r0 = r15 instanceof defpackage.ik7
            java.lang.String r4 = "BottomSheetWidget"
            r5 = 6
            if (r0 == 0) goto L_0x00d6
            kotlin.reflect.KProperty[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            int r15 = defpackage.xua.d
            igf r0 = new igf
            r0.<init>(r15)
            ng3 r15 = defpackage.b0h.a(r0, r3, r5)
            int r0 = defpackage.xua.c
            igf r5 = new igf
            r5.<init>(r0)
            r15.f(r5)
            int r0 = defpackage.wua.b
            int r5 = defpackage.xua.b
            igf r6 = new igf
            r6.<init>(r5)
            r15.d(r0, r6)
            int r0 = defpackage.wua.a
            int r5 = defpackage.xua.a
            igf r6 = new igf
            r6.<init>(r5)
            r15.d(r0, r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r8 = r15.e()
            r8.setTargetController(r14)
            r15 = r14
        L_0x00a6:
            zx3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x00b1
            zx3 r15 = r15.getParentController()
            goto L_0x00a6
        L_0x00b1:
            boolean r0 = r15 instanceof defpackage.l9d
            if (r0 == 0) goto L_0x00b8
            l9d r15 = (defpackage.l9d) r15
            goto L_0x00b9
        L_0x00b8:
            r15 = r3
        L_0x00b9:
            if (r15 == 0) goto L_0x00bf
            e9d r3 = r15.K()
        L_0x00bf:
            r8.p0(r14)
            if (r3 == 0) goto L_0x013a
            i9d r14 = new i9d
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            defpackage.a81.t(r1, r14, r2, r4)
            r3.G(r14)
            goto L_0x013a
        L_0x00d6:
            boolean r0 = r15 instanceof defpackage.jk7
            if (r0 == 0) goto L_0x0135
            kotlin.reflect.KProperty[] r15 = one.me.sdk.bottomsheet.BottomSheetWidget.v0
            int r15 = defpackage.iya.c
            igf r0 = new igf
            r0.<init>(r15)
            ng3 r15 = defpackage.b0h.a(r0, r3, r5)
            int r0 = defpackage.iya.b
            igf r5 = new igf
            r5.<init>(r0)
            r15.f(r5)
            int r0 = defpackage.hya.d
            int r5 = defpackage.iya.a
            igf r6 = new igf
            r6.<init>(r5)
            r15.d(r0, r6)
            one.me.sdk.bottomsheet.ConfirmationBottomSheet r8 = r15.e()
            r8.setTargetController(r14)
            r15 = r14
        L_0x0105:
            zx3 r0 = r15.getParentController()
            if (r0 == 0) goto L_0x0110
            zx3 r15 = r15.getParentController()
            goto L_0x0105
        L_0x0110:
            boolean r0 = r15 instanceof defpackage.l9d
            if (r0 == 0) goto L_0x0117
            l9d r15 = (defpackage.l9d) r15
            goto L_0x0118
        L_0x0117:
            r15 = r3
        L_0x0118:
            if (r15 == 0) goto L_0x011e
            e9d r3 = r15.K()
        L_0x011e:
            r8.p0(r14)
            if (r3 == 0) goto L_0x013a
            i9d r14 = new i9d
            r11 = 0
            r12 = 0
            r9 = 0
            r10 = 0
            r13 = -1
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13)
            defpackage.a81.t(r1, r14, r2, r4)
            r3.G(r14)
            goto L_0x013a
        L_0x0135:
            if (r15 != 0) goto L_0x013d
            one.me.inviteactions.invitebyphone.InviteByPhoneScreen.c0(r14, r3)
        L_0x013a:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x013d:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ok7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
