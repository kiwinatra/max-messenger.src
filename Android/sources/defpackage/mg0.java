package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.leolin.shortcutbadger.ShortcutBadger;

/* renamed from: mg0  reason: default package */
public final class mg0 extends SuspendLambda implements Function2 {
    public /* synthetic */ int a;
    public final /* synthetic */ ng0 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mg0(ng0 ng0, Continuation continuation) {
        super(2, continuation);
        this.b = ng0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        mg0 mg0 = new mg0(this.b, continuation);
        mg0.a = ((Number) obj).intValue();
        return mg0;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mg0) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int i = this.a;
        if (i >= 0) {
            ShortcutBadger.applyCount(this.b.a, i);
        }
        return Unit.INSTANCE;
    }
}
