package defpackage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import one.me.sdk.transfer.exceptions.TamHttpUrlExpiredException;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: v4f  reason: default package */
public final class v4f extends SuspendLambda implements Function4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4f(Object obj, Continuation continuation, int i) {
        super(4, continuation);
        this.a = i;
        this.c = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        ds5 ds5 = (ds5) obj;
        Throwable th = (Throwable) obj2;
        ((Number) obj3).longValue();
        Continuation continuation = (Continuation) obj4;
        switch (i) {
            case 0:
                v4f v4f = new v4f((h5f) this.c, continuation, 0);
                v4f.b = th;
                return v4f.invokeSuspend(Unit.INSTANCE);
            default:
                v4f v4f2 = new v4f((l5f) this.c, continuation, 1);
                v4f2.b = th;
                return v4f2.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i) {
            case 0:
                ResultKt.throwOnFailure(obj);
                if (this.b instanceof TamHttpUrlExpiredException) {
                    String str = ((h5f) this.c).b;
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.w, str, "Got error about expired URL, retry upload", (Throwable) null);
                    }
                    z = true;
                } else {
                    z = false;
                }
                return Boxing.boxBoolean(z);
            default:
                ResultKt.throwOnFailure(obj);
                Throwable th = this.b;
                return Boxing.boxBoolean((th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b));
        }
    }
}
