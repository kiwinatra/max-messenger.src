package defpackage;

import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: k92  reason: default package */
public final class k92 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ ia2 b;
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k92(ia2 ia2, String str, Continuation continuation) {
        super(2, continuation);
        this.b = ia2;
        this.c = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new k92(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = ia2.K0;
            ia2 ia2 = this.b;
            c6d g = ia2.g();
            String str2 = this.c;
            ArrayList f = g.f(str2);
            boolean areEqual = Intrinsics.areEqual((Object) str2, (Object) "all.chat.folder");
            this.a = 1;
            obj = ia2.b(ia2, f, areEqual, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
