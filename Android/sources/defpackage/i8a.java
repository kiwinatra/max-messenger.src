package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: i8a  reason: default package */
public final class i8a extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i8a(Continuation continuation, NeuroAvatarsScreen neuroAvatarsScreen) {
        super(2, continuation);
        this.b = neuroAvatarsScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i8a i8a = new i8a(continuation, this.b);
        i8a.a = obj;
        return i8a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i8a) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qd0 qd0 = (qd0) this.a;
        boolean areEqual = Intrinsics.areEqual((Object) qd0, (Object) nd0.a);
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        if (areEqual) {
            KProperty[] kPropertyArr = NeuroAvatarsScreen.K0;
            ((edb) neuroAvatarsScreen.x0.getValue()).g(new eng(neuroAvatarsScreen, 1));
        } else if (qd0 instanceof od0) {
            try {
                neuroAvatarsScreen.startActivityForResult(((od0) qd0).a, 555);
                z5a.g((z5a) neuroAvatarsScreen.y0.getValue(), jgd.AVATAR_PICKER_CAMERA);
            } catch (ActivityNotFoundException unused) {
                z68.f(neuroAvatarsScreen.getClass().getName(), "failed open camera", (Throwable) null);
                neuroAvatarsScreen.h0().b.a();
            }
        } else if (qd0 instanceof pd0) {
            neuroAvatarsScreen.startActivityForResult(((pd0) qd0).a, 666);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }
}
