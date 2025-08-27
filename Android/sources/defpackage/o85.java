package defpackage;

import kotlin.Result;
import kotlin.ResultKt;
import ru.ok.tamtam.shared.lifecycle.AlreadyHandledEventException;

/* renamed from: o85  reason: default package */
public class o85 {
    public final Object a;
    public boolean b;

    public o85(Object obj) {
        this.a = obj;
        System.currentTimeMillis();
    }

    public final Object a() {
        if (this.b) {
            Result.Companion companion = Result.Companion;
            return Result.m23constructorimpl(ResultKt.createFailure(new AlreadyHandledEventException()));
        }
        this.b = true;
        Result.Companion companion2 = Result.Companion;
        return Result.m23constructorimpl(this.a);
    }
}
