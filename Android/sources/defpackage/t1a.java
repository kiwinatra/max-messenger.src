package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: t1a  reason: default package */
public final class t1a extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ v1a b;
    public final /* synthetic */ byte[] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t1a(v1a v1a, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.b = v1a;
        this.c = bArr;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t1a(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t1a) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        v1a v1a = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xcd xcd = (xcd) v1a.x.getValue();
            this.a = 1;
            xcd.getClass();
            obj = ev0.I(caa.a.plus(xcd.b), new wcd(xcd, this.c, (Continuation) null), this);
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
            z68.f("v1a", "Can't save image", (Throwable) null);
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
                ni3.d(uri, false);
            }
        }
        return Unit.INSTANCE;
    }
}
