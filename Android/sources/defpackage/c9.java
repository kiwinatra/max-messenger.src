package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;

/* renamed from: c9  reason: default package */
public final class c9 extends Lambda implements Function0 {
    public static final c9 a = new Lambda(0);

    public final Object invoke() {
        return Integer.valueOf(Random.Default.nextInt(2147418112) + 65536);
    }
}
