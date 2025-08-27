package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: gt5  reason: default package */
public abstract class gt5 {
    public static final ps5 a(bs5 bs5, long j, Function2 function2) {
        return new ps5(new on2(new g12(new ls5(j, bs5, (Continuation) null), EmptyCoroutineContext.INSTANCE, -2, cu0.a, 0), 25), function2, 0);
    }

    public static List b(wtc wtc, int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (arrayList.size() == i) {
                break;
            }
            Object e = wtc.e();
            if (e instanceof d22) {
                Throwable a = e22.a(e);
                if (a != null) {
                    throw a;
                }
            } else {
                arrayList.add(e);
            }
        }
        return arrayList;
    }

    public static final wb c(bs5 bs5, long j, Function2 function2) {
        eu5 Y = bs0.Y(new ps5(bs5, function2, 1), 1);
        Duration.Companion companion = Duration.Companion;
        return new wb(15, new on2(new fs5(0, new st5(DurationKt.toDuration(j, DurationUnit.MILLISECONDS), Y, (Continuation) null)), 26), new SuspendLambda(3, (Continuation<Object>) null));
    }

    public static final g12 d(bs5 bs5, long j) {
        return new g12(new ft5(j, bs5, (Continuation) null), EmptyCoroutineContext.INSTANCE, -2, cu0.a, 0);
    }
}
