package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pva  reason: default package */
public final class pva extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ qva b;
    public final /* synthetic */ File c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pva(qva qva, File file, Continuation continuation) {
        super(2, continuation);
        this.b = qva;
        this.c = file;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new pva(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pva) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((zcd) this.b.k.getValue()).a(this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (((Uri) obj) == null) {
            z68.f("qva", "Can't save video", (Throwable) null);
        }
        return Unit.INSTANCE;
    }
}
