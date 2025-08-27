package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* renamed from: rie  reason: default package */
public abstract class rie {
    public static final /* synthetic */ int a = 0;

    static {
        Object obj;
        Object obj2;
        ld9.c(new Exception(), gsg.class.getSimpleName());
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m26exceptionOrNullimpl(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) obj;
        try {
            obj2 = Result.m23constructorimpl(rie.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.Companion;
            obj2 = Result.m23constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m26exceptionOrNullimpl(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) obj2;
    }
}
