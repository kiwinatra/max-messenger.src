package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: ve3  reason: default package */
public final class ve3 {
    public final Executor a;
    public final Executor b;
    public final gqg c;
    public final o9a d;
    public final grg e;
    public final int f;
    public final int g;
    public final int h;

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, gqg] */
    public ve3(g7a g7a) {
        Executor executor = (Executor) g7a.b;
        if (executor == null) {
            this.a = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new re3(false));
        } else {
            this.a = executor;
        }
        Executor executor2 = (Executor) g7a.d;
        if (executor2 == null) {
            this.b = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new re3(true));
        } else {
            this.b = executor2;
        }
        gqg gqg = (gqg) g7a.c;
        if (gqg == null) {
            String str = gqg.a;
            this.c = new Object();
        } else {
            this.c = gqg;
        }
        this.d = new o9a(13);
        this.e = new grg(16);
        this.f = 4;
        this.g = IntCompanionObject.MAX_VALUE;
        this.h = g7a.a;
    }
}
