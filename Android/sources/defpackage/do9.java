package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: do9  reason: default package */
public final class do9 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ MessagesListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public do9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.b = messagesListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        do9 do9 = new do9(continuation, this.b);
        do9.a = obj;
        return do9;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((do9) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: fdd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: fdd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: xn4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: oq0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: fdd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: fdd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: fdd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: fdd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: fdd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: fdd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: fdd} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.a
            c55 r9 = (defpackage.c55) r9
            kotlin.reflect.KProperty[] r0 = one.me.messages.list.ui.MessagesListWidget.R0
            one.me.messages.list.ui.MessagesListWidget r8 = r8.b
            android.widget.FrameLayout r0 = r8.d0()
            r0.removeAllViews()
            boolean r0 = r9 instanceof defpackage.z45
            r1 = 12
            r2 = 17
            r3 = -2
            if (r0 == 0) goto L_0x0049
            oq0 r0 = new oq0
            android.content.Context r4 = r8.getContext()
            r0.<init>(r4)
            z45 r9 = (defpackage.z45) r9
            r0.setState(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r9.<init>(r3, r3, r2)
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r9.setMargins(r1, r1, r1, r1)
            r0.setLayoutParams(r9)
            goto L_0x0122
        L_0x0049:
            boolean r0 = r9 instanceof defpackage.a55
            r4 = 30
            if (r0 == 0) goto L_0x00d4
            xn4 r0 = new xn4
            android.content.Context r5 = r8.getContext()
            r0.<init>(r5)
            a55 r9 = (defpackage.a55) r9
            zj2 r5 = new zj2
            r6 = 5
            r5.<init>(r6, r8)
            androidx.appcompat.widget.AppCompatTextView r6 = r0.b
            int r7 = defpackage.ewa.M
            r6.setText(r7)
            androidx.appcompat.widget.AppCompatTextView r6 = r0.c
            int r7 = defpackage.ewa.L
            r6.setText(r7)
            gpe r9 = r9.a
            if (r9 == 0) goto L_0x0089
            r6 = 144(0x90, float:2.02E-43)
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            pb8 r7 = r0.o
            r7.a(r9, r6)
        L_0x0089:
            r0.a = r5
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r5 = 262(0x106, float:3.67E-43)
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r9.<init>(r5, r3, r2)
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r9.setMargins(r1, r1, r1, r1)
            r0.setLayoutParams(r9)
            android.content.Context r9 = r0.getContext()
            ccb r9 = defpackage.o5a.v(r9)
            boolean r9 = r9.b
            if (r9 == 0) goto L_0x0122
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r4) goto L_0x0122
            e55 r9 = new e55
            android.view.View r1 = r8.requireView()
            r9.<init>(r0, r1)
            r8.P0 = r9
            goto L_0x0122
        L_0x00d4:
            boolean r0 = r9 instanceof defpackage.b55
            if (r0 == 0) goto L_0x011f
            fdd r0 = new fdd
            android.content.Context r1 = r8.getContext()
            r0.<init>(r1)
            b55 r9 = (defpackage.b55) r9
            r0.setState(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r9.<init>(r3, r3, r2)
            r1 = 32
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r9.setMargins(r1, r1, r1, r1)
            r0.setLayoutParams(r9)
            android.content.Context r9 = r8.getContext()
            ccb r9 = defpackage.o5a.v(r9)
            boolean r9 = r9.b
            if (r9 == 0) goto L_0x0122
            int r9 = android.os.Build.VERSION.SDK_INT
            if (r9 < r4) goto L_0x0122
            e55 r9 = new e55
            android.view.View r1 = r8.requireView()
            r9.<init>(r0, r1)
            r8.P0 = r9
            goto L_0x0122
        L_0x011f:
            if (r9 != 0) goto L_0x0137
            r0 = 0
        L_0x0122:
            if (r0 == 0) goto L_0x0134
            xvg r9 = new xvg
            r1 = 7
            r9.<init>(r1)
            defpackage.u3b.a(r0, r9)
            android.widget.FrameLayout r8 = r8.d0()
            r8.addView(r0)
        L_0x0134:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0137:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.do9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
