package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* renamed from: us  reason: default package */
public abstract class us {
    public static final int a;

    static {
        Object obj;
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.m23constructorimpl(StringsKt.toIntOrNull(System.getProperty("kotlinx.serialization.json.pool.size")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m29isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        a = num != null ? num.intValue() : 2097152;
    }
}
