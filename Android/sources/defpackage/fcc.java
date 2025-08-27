package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: fcc  reason: default package */
public final class fcc extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ hcc b;
    public final /* synthetic */ byte[] c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fcc(hcc hcc, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.b = hcc;
        this.c = bArr;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fcc(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fcc) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        hcc hcc = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            xcd xcd = hcc.b;
            this.a = 1;
            xcd.getClass();
            obj2 = ev0.I(caa.a.plus(xcd.b), new wcd(xcd, this.c, (Continuation) null), this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Uri uri = (Uri) obj2;
        if (uri == null) {
            return Unit.INSTANCE;
        }
        String uri2 = uri.toString();
        String uri3 = uri.toString();
        long hashCode = (long) uri.hashCode();
        o9a o9a = sq9.b;
        d48 d48 = new d48(1, hashCode, uri2, uri3, 0, 0, "image/jpeg", 0, (Uri) null);
        xag.h(hcc.Z, new tbc(d48, hcc.o.f.u(d48)));
        obc obc = obc.a;
        xme xme = hcc.z;
        xme.getClass();
        xme.m((Object) null, obc);
        return Unit.INSTANCE;
    }
}
