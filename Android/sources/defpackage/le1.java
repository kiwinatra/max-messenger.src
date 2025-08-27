package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* renamed from: le1  reason: default package */
public final class le1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallOpponentsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public le1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.b = callOpponentsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        le1 le1 = new le1(continuation, this.b);
        le1.a = obj;
        return le1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((le1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x008f, code lost:
        if (defpackage.y7e.I((android.view.ViewStub) r3.getValue()) == false) goto L_0x00cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.a
            oe1 r9 = (defpackage.oe1) r9
            kotlin.reflect.KProperty[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.B0
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r8 = r8.b
            r8.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.B0
            r1 = 4
            r1 = r0[r1]
            sn0 r1 = r8.Y
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r2 = r9.c
            r1.setText(r2)
            h3b r1 = r8.e0()
            java.lang.CharSequence r2 = r9.c
            r1.setTitle((java.lang.CharSequence) r2)
            r1 = 2
            r1 = r0[r1]
            sn0 r1 = r8.z
            java.lang.Object r1 = r1.getValue()
            iqa r1 = (defpackage.iqa) r1
            l2b r2 = defpackage.l2b.a
            java.util.List r2 = r9.b
            r1.a(r2)
            boolean r1 = r9.d
            if (r1 == 0) goto L_0x0052
            h3b r1 = r8.e0()
            kotlin.Lazy r2 = r8.x
            java.lang.Object r2 = r2.getValue()
            u2b r2 = (defpackage.u2b) r2
            r1.setRightActions(r2)
            goto L_0x005b
        L_0x0052:
            h3b r1 = r8.e0()
            s2b r2 = defpackage.s2b.a
            r1.setRightActions(r2)
        L_0x005b:
            java.util.List r1 = kotlin.collections.CollectionsKt.createListBuilder()
            java.util.List r9 = r9.a
            java.util.Collection r9 = (java.util.Collection) r9
            r1.addAll(r9)
            java.util.List r9 = kotlin.collections.CollectionsKt.build(r1)
            kotlin.Lazy r1 = r8.z0
            java.lang.Object r1 = r1.getValue()
            yd1 r1 = (defpackage.yd1) r1
            r1.G(r9)
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            r1 = r9 ^ 1
            r2 = 8
            sn0 r3 = r8.x0
            if (r1 == 0) goto L_0x0092
            r4 = r0[r2]
            java.lang.Object r4 = r3.getValue()
            android.view.ViewStub r4 = (android.view.ViewStub) r4
            boolean r4 = defpackage.y7e.I(r4)
            if (r4 != 0) goto L_0x0092
            goto L_0x00cc
        L_0x0092:
            r4 = r0[r2]
            java.lang.Object r3 = r3.getValue()
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            r4 = 9
            r5 = r0[r4]
            sn0 r5 = r8.y0
            java.lang.Object r6 = r5.getValue()
            one.me.sdk.uikit.common.emptyview.OneMeEmptyView r6 = (one.me.sdk.uikit.common.emptyview.OneMeEmptyView) r6
            r7 = 0
            defpackage.y7e.C(r3, r6, r7)
            r3 = r0[r4]
            java.lang.Object r3 = r5.getValue()
            one.me.sdk.uikit.common.emptyview.OneMeEmptyView r3 = (one.me.sdk.uikit.common.emptyview.OneMeEmptyView) r3
            r4 = 0
            if (r9 == 0) goto L_0x00b7
            r9 = r4
            goto L_0x00b8
        L_0x00b7:
            r9 = r2
        L_0x00b8:
            r3.setVisibility(r9)
            r9 = 3
            r9 = r0[r9]
            sn0 r8 = r8.X
            java.lang.Object r8 = r8.getValue()
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            if (r1 == 0) goto L_0x00c9
            r2 = r4
        L_0x00c9:
            r8.setVisibility(r2)
        L_0x00cc:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
