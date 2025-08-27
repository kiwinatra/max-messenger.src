package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: qw1  reason: default package */
public abstract class qw1 {
    public static final void a(Continuation continuation, Continuation continuation2) {
        try {
            Continuation intercepted = IntrinsicsKt.intercepted(continuation);
            Result.Companion companion = Result.Companion;
            y7e.U(intercepted, Result.m23constructorimpl(Unit.INSTANCE), (Function1) null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            continuation2.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }

    public static void b(Function2 function2, g0 g0Var, Continuation continuation) {
        try {
            Continuation<Unit> intercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, g0Var, continuation));
            Result.Companion companion = Result.Companion;
            y7e.U(intercepted, Result.m23constructorimpl(Unit.INSTANCE), (Function1) null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            continuation.resumeWith(Result.m23constructorimpl(ResultKt.createFailure(th)));
            throw th;
        }
    }
}
