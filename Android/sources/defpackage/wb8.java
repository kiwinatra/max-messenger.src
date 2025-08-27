package defpackage;

import com.jakewharton.processphoenix.ProcessPhoenix;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.android.MainActivity;

/* renamed from: wb8  reason: default package */
public final class wb8 extends SuspendLambda implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ MainActivity b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wb8(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.b = mainActivity;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        wb8 wb8 = new wb8(this.b, continuation);
        wb8.a = ((Boolean) obj).booleanValue();
        return wb8;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((wb8) create(bool, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.a) {
            ProcessPhoenix.b(this.b);
        }
        return Unit.INSTANCE;
    }
}
