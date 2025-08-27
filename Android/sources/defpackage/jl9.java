package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jl9  reason: default package */
public final class jl9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ en9 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jl9(String str, en9 en9, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = en9;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jl9(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jl9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.b;
            Uri parse = Uri.parse(str);
            en9 en9 = this.c;
            wb e = ((by7) en9.U0.getValue()).e(parse);
            vb vbVar = new vb(24, en9, str);
            this.a = 1;
            if (e.e(vbVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
