package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: u1a  reason: default package */
public final class u1a extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ v1a b;
    public final /* synthetic */ File c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1a(v1a v1a, File file, Continuation continuation) {
        super(2, continuation);
        this.b = v1a;
        this.c = file;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new u1a(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u1a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        v1a v1a = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            obj = ((zcd) v1a.y.getValue()).a(this.c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Uri uri = (Uri) obj;
        if (uri == null) {
            z68.f("v1a", "Can't save video", (Throwable) null);
            b4a b4a = (b4a) v1a.a;
            b4a.getClass();
            hi7.a0(qad.t1, (Context) b4a.b);
        } else {
            ok8 ok8 = (ok8) v1a.b;
            ok8.setSystemUiVisibility(0);
            i3a i3a = (i3a) ok8.w0;
            i3a.getClass();
            for (k1a k1a : (Set) i3a.a) {
                ni3 ni3 = k1a.b;
                ni3.f = uri;
                ni3.d(uri, true);
            }
        }
        return Unit.INSTANCE;
    }
}
