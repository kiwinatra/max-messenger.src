package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.sdk.lists.widgets.EndlessRecyclerView;
import ru.ok.messages.suggests.SuggestsFragment;

/* renamed from: m1f  reason: default package */
public final class m1f extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SuggestsFragment b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m1f(SuggestsFragment suggestsFragment, Continuation continuation) {
        super(2, continuation);
        this.b = suggestsFragment;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m1f m1f = new m1f(this.b, continuation);
        m1f.a = obj;
        return m1f;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m1f) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        String str = (String) this.a;
        SuggestsFragment suggestsFragment = this.b;
        suggestsFragment.l1.e().setText(str);
        boolean z = true;
        int i = 0;
        suggestsFragment.l1.e().setVisibility((str == null || str.length() == 0) ^ true ? 0 : 8);
        EndlessRecyclerView g = suggestsFragment.l1.g();
        if (!(str == null || str.length() == 0)) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        g.setVisibility(i);
        return Unit.INSTANCE;
    }
}
