package defpackage;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;

/* renamed from: x0f  reason: default package */
public final class x0f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SuggestionsWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0f(SuggestionsWidget suggestionsWidget, Continuation continuation) {
        super(2, continuation);
        this.b = suggestionsWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        x0f x0f = new x0f(this.b, continuation);
        x0f.a = obj;
        return x0f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((x0f) create((h0f) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        h0f h0f = (h0f) this.a;
        SuggestionsWidget suggestionsWidget = this.b;
        if (h0f == null) {
            KProperty[] kPropertyArr = SuggestionsWidget.z0;
            suggestionsWidget.s0();
        } else {
            List list = h0f.b;
            boolean isEmpty = list.isEmpty();
            boolean z = !isEmpty;
            KProperty[] kPropertyArr2 = SuggestionsWidget.z0;
            int i = 8;
            suggestionsWidget.p0().setVisibility(isEmpty ? 0 : 8);
            EndlessRecyclerView q0 = suggestionsWidget.q0();
            if (z) {
                i = 0;
            }
            q0.setVisibility(i);
            suggestionsWidget.p0().setText(h0f.a == g0f.c ? yya.p : yya.q);
            ((m0f) suggestionsWidget.X.getValue()).G(list);
        }
        return Unit.INSTANCE;
    }
}
