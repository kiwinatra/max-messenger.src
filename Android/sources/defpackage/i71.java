package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* renamed from: i71  reason: default package */
public final class i71 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallHistoryPageScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i71(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.b = callHistoryPageScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i71 i71 = new i71(this.b, continuation);
        i71.a = obj;
        return i71;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i71) create((n7b) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0067, code lost:
        if ((!((java.util.ArrayList) r2.o.o).isEmpty()) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r3)
            java.lang.Object r3 = r2.a
            n7b r3 = (defpackage.n7b) r3
            m7b r0 = defpackage.m7b.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            if (r0 != 0) goto L_0x0075
            boolean r0 = r3 instanceof defpackage.l7b
            if (r0 == 0) goto L_0x006f
            l7b r3 = (defpackage.l7b) r3
            s9a r0 = one.me.calllist.ui.page.CallHistoryPageScreen.X
            one.me.calllist.ui.page.CallHistoryPageScreen r2 = r2.b
            kotlin.Lazy r0 = r2.x
            java.lang.Object r0 = r0.getValue()
            f71 r0 = (defpackage.f71) r0
            java.util.Map r3 = r3.a
            java.util.Collection r3 = r3.values()
            r0.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = kotlin.collections.CollectionsKt.toList(r3)
            r0.G(r3)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r2.d0()
            n71 r0 = r2.f0()
            boolean r0 = r0.k()
            r3.setRefreshingNext(r0)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r2.d0()
            n71 r2 = r2.f0()
            r2.getClass()
            t9a r0 = defpackage.x71.b
            r0.getClass()
            x71 r0 = defpackage.x71.ALL
            x71 r1 = r2.b
            if (r1 != r0) goto L_0x006a
            hj7 r2 = r2.o
            java.lang.Object r2 = r2.o
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            r0 = 1
            r2 = r2 ^ r0
            if (r2 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r0 = 0
        L_0x006b:
            r3.setRefreshingPrev(r0)
            goto L_0x0075
        L_0x006f:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L_0x0075:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i71.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
