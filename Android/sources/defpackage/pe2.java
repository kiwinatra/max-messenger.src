package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: pe2  reason: default package */
public final class pe2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatMediaListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pe2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.b = chatMediaListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pe2 pe2 = new pe2(continuation, this.b);
        pe2.a = obj;
        return pe2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pe2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [tyc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.a
            jg2 r6 = (defpackage.jg2) r6
            one.me.profile.screens.media.ChatMediaListWidget r5 = r5.b
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = one.me.profile.screens.media.ChatMediaListWidget.c0(r5)
            r1 = 0
            r0.setRefreshingNext(r1)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = one.me.profile.screens.media.ChatMediaListWidget.c0(r5)
            androidx.recyclerview.widget.a r0 = r0.getLayoutManager()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r3 = 0
            if (r2 == 0) goto L_0x0024
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            goto L_0x0025
        L_0x0024:
            r0 = r3
        L_0x0025:
            if (r0 == 0) goto L_0x0030
            int r0 = r0.S0()
            java.lang.Integer r0 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
            goto L_0x0031
        L_0x0030:
            r0 = r3
        L_0x0031:
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r2 = one.me.profile.screens.media.ChatMediaListWidget.c0(r5)
            tyc r2 = r2.getAdapter()
            boolean r4 = r2 instanceof defpackage.me2
            if (r4 == 0) goto L_0x0040
            r3 = r2
            me2 r3 = (defpackage.me2) r3
        L_0x0040:
            if (r3 == 0) goto L_0x0047
            java.util.List r6 = r6.a
            r3.G(r6)
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            goto L_0x0057
        L_0x004a:
            int r6 = r0.intValue()
            if (r6 != 0) goto L_0x0057
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r5 = one.me.profile.screens.media.ChatMediaListWidget.c0(r5)
            r5.D0(r1)
        L_0x0057:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
