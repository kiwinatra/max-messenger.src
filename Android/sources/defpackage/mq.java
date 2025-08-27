package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: mq  reason: default package */
public final class mq implements qd {
    public static final mq a = new Object();

    public static void a(String str, long j, Pair[] pairArr) {
        try {
            Result.Companion companion = Result.Companion;
            fpf fpf = fpf.a;
            fpf.a(str, TimeUnit.MILLISECONDS.toNanos(j), TimeUnit.NANOSECONDS, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            Result.m23constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m23constructorimpl(ResultKt.createFailure(th));
        }
    }
}
