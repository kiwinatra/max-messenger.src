package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.ForkJoinPool;
import kotlin.jvm.functions.Function0;

/* renamed from: z96  reason: default package */
public final class z96 implements udf {
    public final ConcurrentSkipListSet a = new ConcurrentSkipListSet();
    public final y96 b = new y96(this);
    public final ArrayList c = new ArrayList();

    public final w96 b(String str, Iterable iterable, Function0 function0) {
        w96 w96 = new w96(str, new jh3(5, iterable, function0, this, str));
        ArrayList arrayList = this.c;
        x96 x96 = w96.b;
        arrayList.add(0, x96);
        ForkJoinPool.commonPool().execute(x96);
        return w96;
    }
}
