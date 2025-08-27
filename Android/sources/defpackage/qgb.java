package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.startconversation.channel.PickSubscribersScreen;

/* renamed from: qgb  reason: default package */
public final class qgb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickSubscribersScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qgb(PickSubscribersScreen pickSubscribersScreen, Continuation continuation) {
        super(2, continuation);
        this.b = pickSubscribersScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qgb qgb = new qgb(this.b, continuation);
        qgb.a = obj;
        return qgb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qgb) create((Set) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ba, code lost:
        r0 = defpackage.y7e.r(r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.a
            java.util.Set r11 = (java.util.Set) r11
            int r11 = r11.size()
            kotlin.reflect.KProperty[] r2 = one.me.startconversation.channel.PickSubscribersScreen.w0
            one.me.startconversation.channel.PickSubscribersScreen r10 = r10.b
            one.me.sdk.uikit.common.button.OneMeButton r2 = r10.n0()
            r3 = 20000(0x4e20, float:2.8026E-41)
            r4 = 0
            kotlin.Lazy r5 = r10.X
            if (r11 != 0) goto L_0x0033
            int r6 = defpackage.g1b.d
            r2.setText((int) r6)
            r2.c(r4, r0)
            pgb r6 = new pgb
            r6.<init>(r10, r1)
            defpackage.ct.G(r2, 300, r6)
            r2.setEnabled(r0)
            goto L_0x0063
        L_0x0033:
            java.lang.Object r6 = r5.getValue()
            bud r6 = (defpackage.bud) r6
            akd r6 = (defpackage.akd) r6
            r6.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f69maxparticipants
            long r8 = (long) r3
            long r6 = r6.r(r7, r8)
            int r6 = (int) r6
            if (r11 <= r6) goto L_0x004c
            r2.setEnabled(r1)
            goto L_0x0063
        L_0x004c:
            int r6 = defpackage.jra.Q
            r2.setText((int) r6)
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r11)
            r2.c(r6, r0)
            r2.setEnabled(r0)
            pgb r6 = new pgb
            r6.<init>(r10, r0)
            defpackage.ct.G(r2, 300, r6)
        L_0x0063:
            java.lang.Object r0 = r5.getValue()
            bud r0 = (defpackage.bud) r0
            akd r0 = (defpackage.akd) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f69maxparticipants
            long r6 = (long) r3
            long r8 = r0.r(r2, r6)
            int r0 = (int) r8
            if (r11 <= r0) goto L_0x00f5
            z3a r11 = r10.Y
            if (r11 == 0) goto L_0x007f
            r11.o()
        L_0x007f:
            e0b r11 = new e0b
            r11.<init>((one.me.sdk.arch.Widget) r10)
            int r0 = defpackage.g1b.c
            java.lang.Object r3 = r5.getValue()
            bud r3 = (defpackage.bud) r3
            akd r3 = (defpackage.akd) r3
            r3.getClass()
            long r2 = r3.r(r2, r6)
            int r2 = (int) r2
            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            kgf r3 = new kgf
            java.util.List r2 = kotlin.collections.ArraysKt.toList((T[]) r2)
            r3.<init>(r0, r2)
            r11.h(r3)
            o0b r0 = new o0b
            int r2 = defpackage.cad.u1
            r0.<init>(r2)
            r11.f(r0)
            android.view.View r0 = r10.getView()
            if (r0 == 0) goto L_0x00c5
            java.lang.Integer r0 = defpackage.y7e.r(r0)
            if (r0 == 0) goto L_0x00c5
            int r0 = r0.intValue()
            goto L_0x00c6
        L_0x00c5:
            r0 = r1
        L_0x00c6:
            n0b r2 = new n0b
            one.me.sdk.uikit.common.button.OneMeButton r3 = r10.n0()
            int r3 = r3.getMeasuredHeight()
            if (r0 != 0) goto L_0x00e6
            one.me.sdk.uikit.common.button.OneMeButton r0 = r10.n0()
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r5 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x00e1
            r4 = r0
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x00e1:
            if (r4 == 0) goto L_0x00e6
            int r0 = r4.bottomMargin
            goto L_0x00e7
        L_0x00e6:
            r0 = r1
        L_0x00e7:
            int r3 = r3 + r0
            r0 = 3
            r2.<init>(r1, r3, r0)
            r11.c(r2)
            z3a r11 = r11.j()
            r10.Y = r11
        L_0x00f5:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
