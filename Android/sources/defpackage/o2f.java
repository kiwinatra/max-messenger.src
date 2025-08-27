package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.suggests.SuggestsViewModel;

/* renamed from: o2f  reason: default package */
public final class o2f extends SuspendLambda implements Function2 {
    public final /* synthetic */ SuggestsViewModel a;
    public final /* synthetic */ b2f b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o2f(SuggestsViewModel suggestsViewModel, b2f b2f, Continuation continuation) {
        super(2, continuation);
        this.a = suggestsViewModel;
        this.b = b2f;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o2f(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o2f) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        i1a i1a = this.a.E;
        if (i1a != null) {
            boolean z = true;
            boolean z2 = !(this.b instanceof a2f);
            a2a a2a = i1a.a.z.e;
            a2a.getClass();
            f2a f2a = a2a.a;
            if (f2a != null) {
                j4a j4a = (j4a) f2a;
                if (j4a.x0.w.getVisibility() != 0) {
                    z = false;
                }
                if (z != z2) {
                    j4a.x0.setPullerVisible(z2);
                    j4a.w0.invalidate();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
