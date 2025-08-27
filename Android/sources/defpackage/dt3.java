package defpackage;

import android.net.Uri;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dt3  reason: default package */
public final class dt3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ long b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dt3(long j, Continuation continuation) {
        super(2, continuation);
        this.b = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        dt3 dt3 = new dt3(this.b, continuation);
        dt3.a = obj;
        return dt3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dt3) create((zo3) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        zo3 zo3 = (zo3) this.a;
        long j = zo3.a;
        String obj2 = zo3.b.toString();
        Uri uri = zo3.x;
        String uri2 = uri != null ? uri.toString() : null;
        if (uri2 == null) {
            uri2 = "";
        }
        return new njb(this.b, j, zo3.X, obj2, uri2);
    }
}
