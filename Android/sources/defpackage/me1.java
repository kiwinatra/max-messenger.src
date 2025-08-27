package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: me1  reason: default package */
public final class me1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ CallOpponentsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public me1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.b = callOpponentsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        me1 me1 = new me1(continuation, this.b);
        me1.a = obj;
        return me1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((me1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof ji1) {
            ji1 ji1 = (ji1) v5a;
            KProperty[] kPropertyArr = CallOpponentsListWidget.B0;
            CallOpponentsListWidget callOpponentsListWidget = this.b;
            callOpponentsListWidget.getClass();
            if (!(ji1 instanceof xh1)) {
                if (ji1 instanceof ei1) {
                    id1.b.n1(((ei1) ji1).b, callOpponentsListWidget.getContext().getString(sqa.D0), CallOpponentsListWidget.class.getName());
                } else if (ji1 instanceof th1) {
                    b59.k(callOpponentsListWidget.getContext(), ((th1) ji1).b);
                    if (b59.C()) {
                        String string = callOpponentsListWidget.getContext().getString(ykc.call_link_share_dialog_share_link_copy);
                        e0b e0b = new e0b((Widget) callOpponentsListWidget);
                        e0b.i(string);
                        e0b.c(new n0b(0, 0, 3));
                        e0b.j();
                    }
                }
            }
        } else if (v5a instanceof pa4) {
            id1.b.Y0((pa4) v5a);
        }
        return Unit.INSTANCE;
    }
}
