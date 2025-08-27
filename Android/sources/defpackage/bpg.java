package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import ru.ok.messages.a;

/* renamed from: bpg  reason: default package */
public final class bpg {
    public final a a;
    public final ipg b;
    public final Lazy c;
    public final Lazy d = LazyKt.lazy(LazyThreadSafetyMode.NONE, new lce(22, this));

    public bpg(a aVar, ipg ipg, Lazy lazy) {
        this.a = aVar;
        this.b = ipg;
        this.c = lazy;
    }
}
