package defpackage;

import java.util.function.ToLongFunction;
import kotlin.jvm.functions.Function1;
import one.me.android.OneMeApplication;

/* renamed from: qna  reason: default package */
public final /* synthetic */ class qna implements ToLongFunction {
    public final /* synthetic */ Function1 a;

    public /* synthetic */ qna(Function1 function1) {
        this.a = function1;
    }

    public final long applyAsLong(Object obj) {
        int i = OneMeApplication.X;
        return ((Number) this.a.invoke(obj)).longValue();
    }
}
