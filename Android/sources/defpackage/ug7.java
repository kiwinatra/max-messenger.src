package defpackage;

import android.os.Parcelable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.login.inputname.InputNameScreen;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: ug7  reason: default package */
public final class ug7 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ InputNameScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ug7(Continuation continuation, InputNameScreen inputNameScreen) {
        super(2, continuation);
        this.b = inputNameScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ug7 ug7 = new ug7(continuation, this.b);
        ug7.a = obj;
        return ug7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ug7) create((pg7) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        pg7 pg7 = (pg7) this.a;
        if (pg7 instanceof pg7) {
            InputNameScreen inputNameScreen = this.b;
            kr7.z(inputNameScreen);
            KProperty[] kPropertyArr = InputNameScreen.z0;
            aj7 aj7 = (aj7) inputNameScreen.y.getValue();
            f0d f0d = pg7.b;
            Class<ytb> cls = ytb.class;
            Object k = n54.k(inputNameScreen.getArgs(), "screen:input_name:avatars", cls);
            if (k != null) {
                aj7.getClass();
                aj7.a(iq.n(new NeuroAvatarsScreen(f0d, (ytb) ((Parcelable) k)), (ey3) null, (ey3) null), "InputNameScreen");
                return Unit.INSTANCE;
            }
            throw new IllegalArgumentException(wj6.k("No value passed for key screen:input_name:avatars of type ", cls.getSimpleName(), " in bundle").toString());
        }
        throw new NoWhenBranchMatchedException();
    }
}
