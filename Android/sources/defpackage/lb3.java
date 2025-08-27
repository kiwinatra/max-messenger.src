package defpackage;

import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: lb3  reason: default package */
public abstract class lb3 {
    public static final Object a(Object obj) {
        if (!(obj instanceof jb3)) {
            return Result.m23constructorimpl(obj);
        }
        Result.Companion companion = Result.Companion;
        return Result.m23constructorimpl(ResultKt.createFailure(((jb3) obj).a));
    }
}
