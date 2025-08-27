package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;

/* renamed from: up2  reason: default package */
public final class up2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatStatusBottomWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public up2(ChatStatusBottomWidget chatStatusBottomWidget, Continuation continuation) {
        super(2, continuation);
        this.b = chatStatusBottomWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        up2 up2 = new up2(this.b, continuation);
        up2.a = obj;
        return up2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((up2) create((sp2) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0170  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.a
            sp2 r8 = (defpackage.sp2) r8
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.chatstatus.ChatStatusBottomWidget.c
            one.me.chatscreen.chatstatus.ChatStatusBottomWidget r7 = r7.b
            r7.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.chatstatus.ChatStatusBottomWidget.c
            r1 = 1
            r0 = r0[r1]
            kotlin.properties.ReadOnlyProperty r1 = r7.b
            java.lang.Object r0 = r1.getValue(r7, r0)
            one.me.sdk.uikit.common.button.OneMeButton r0 = (one.me.sdk.uikit.common.button.OneMeButton) r0
            int r1 = r8.ordinal()
            r2 = 3
            r3 = 0
            r4 = 12
            r5 = -1
            if (r1 == r2) goto L_0x00bb
            r2 = 4
            r6 = 6
            if (r1 == r2) goto L_0x0090
            if (r1 == r6) goto L_0x00bb
            r2 = 7
            if (r1 == r2) goto L_0x00bb
            r2 = 8
            if (r1 == r2) goto L_0x00bb
            aqa r1 = defpackage.aqa.c
            r0.setSize(r1)
            zpa r1 = defpackage.zpa.c
            r0.setMode(r1)
            xpa r1 = defpackage.xpa.c
            r0.setAppearance(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r5, r5)
            float r2 = (float) r4
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            float r3 = (float) r3
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r3
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r3 = r3 * r6
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r1.setMargins(r4, r5, r2, r3)
            r0.setLayoutParams(r1)
            goto L_0x0113
        L_0x0090:
            aqa r1 = defpackage.aqa.b
            r0.setSize(r1)
            zpa r1 = defpackage.zpa.a
            r0.setMode(r1)
            xpa r1 = defpackage.xpa.o
            r0.setAppearance(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r5, r5)
            float r2 = (float) r6
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r1.setMargins(r2, r2, r2, r2)
            r0.setLayoutParams(r1)
            goto L_0x0113
        L_0x00bb:
            aqa r1 = defpackage.aqa.c
            r0.setSize(r1)
            zpa r1 = defpackage.zpa.c
            r0.setMode(r1)
            xpa r1 = defpackage.xpa.a
            r0.setAppearance(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r5, r5)
            float r2 = (float) r4
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r2
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            float r3 = (float) r3
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r3
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r2 = r2 * r6
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r3 = r3 * r6
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r1.setMargins(r4, r5, r2, r3)
            r0.setLayoutParams(r1)
        L_0x0113:
            int[] r1 = defpackage.tp2.$EnumSwitchMapping$0
            int r2 = r8.ordinal()
            r1 = r1[r2]
            mgf r2 = defpackage.ngf.a
            switch(r1) {
                case -1: goto L_0x0177;
                case 0: goto L_0x0120;
                case 1: goto L_0x0170;
                case 2: goto L_0x0168;
                case 3: goto L_0x0160;
                case 4: goto L_0x0146;
                case 5: goto L_0x013e;
                case 6: goto L_0x0136;
                case 7: goto L_0x012e;
                case 8: goto L_0x0126;
                case 9: goto L_0x0177;
                default: goto L_0x0120;
            }
        L_0x0120:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L_0x0126:
            int r1 = defpackage.mra.p
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x0177
        L_0x012e:
            int r1 = defpackage.mra.q
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x0177
        L_0x0136:
            int r1 = defpackage.mra.v
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x0177
        L_0x013e:
            int r1 = defpackage.mra.t
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x0177
        L_0x0146:
            lp2 r1 = r7.c0()
            boolean r1 = r1.m()
            if (r1 == 0) goto L_0x0158
            int r1 = defpackage.mra.n
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x0177
        L_0x0158:
            int r1 = defpackage.mra.o
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x0177
        L_0x0160:
            int r1 = defpackage.mra.s
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x0177
        L_0x0168:
            int r1 = defpackage.mra.u
            igf r2 = new igf
            r2.<init>(r1)
            goto L_0x0177
        L_0x0170:
            int r1 = defpackage.mra.j
            igf r2 = new igf
            r2.<init>(r1)
        L_0x0177:
            android.content.Context r1 = r0.getContext()
            java.lang.CharSequence r1 = r2.a(r1)
            r0.setText((java.lang.CharSequence) r1)
            pb r1 = new pb
            r2 = 14
            r1.<init>(r2, r7, r8)
            defpackage.ct.G(r0, 300, r1)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
