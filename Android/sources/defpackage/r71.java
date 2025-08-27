package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import one.me.calllist.ui.CallHistoryScreen;

/* renamed from: r71  reason: default package */
public final class r71 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallHistoryScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r71(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.b = callHistoryScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r71 r71 = new r71(continuation, this.b);
        r71.a = obj;
        return r71;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r71) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        xme xme;
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        t71 t71 = (t71) this.a;
        KProperty[] kPropertyArr = CallHistoryScreen.y0;
        CallHistoryScreen callHistoryScreen = this.b;
        boolean z = ((t71) callHistoryScreen.d0().w.getValue()).a;
        ReadOnlyProperty readOnlyProperty = callHistoryScreen.v;
        if (!z) {
            v71 d0 = callHistoryScreen.d0();
            do {
                xme = d0.w;
                value = xme.getValue();
                t71 t712 = (t71) value;
            } while (!xme.b(value, new t71()));
            ((h3b) readOnlyProperty.getValue(callHistoryScreen, CallHistoryScreen.y0[1])).b();
        } else {
            ((h3b) readOnlyProperty.getValue(callHistoryScreen, CallHistoryScreen.y0[1])).a(String.valueOf(((t71) callHistoryScreen.d0().w.getValue()).b.size()), CollectionsKt.listOf(new e3b(0, vkc.call_history_item_call_toolbar_action_remove, oec.ic_delete_22)), new o71(callHistoryScreen, 0), new l(17, callHistoryScreen));
        }
        ((k3b) ((h3b) readOnlyProperty.getValue(callHistoryScreen, CallHistoryScreen.y0[1])).w0.getValue()).setSelectionTitle(String.valueOf(((t71) callHistoryScreen.d0().w.getValue()).b.size()));
        return Unit.INSTANCE;
    }
}
