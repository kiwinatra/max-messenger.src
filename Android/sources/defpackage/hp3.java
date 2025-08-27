package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: hp3  reason: default package */
public final class hp3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ String b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hp3(Object obj, Continuation continuation, String str) {
        super(2, continuation);
        this.a = obj;
        this.b = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new hp3(this.a, continuation, this.b);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((hp3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        qdb qdb = (qdb) this.a;
        long j = (long) qdb.a;
        List C = n54.C(qdb);
        String str = qdb.g;
        return new zo3(j, (CharSequence) qdb.b, (String) null, C, (CharSequence) null, (CharSequence) this.b, str != null ? Uri.parse(str) : null, false, false, qdb.a(), false, qdb, (Boolean) null, 0, false, 29696);
    }
}
