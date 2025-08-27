package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;

/* renamed from: ihd  reason: default package */
public final class ihd {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final voc b;
    public final wie c;
    public u64 d;
    public final z8b e;
    public volatile boolean f = false;
    public msg g;
    public volatile Set h;
    public final rjf i;

    public ihd(voc voc, wie wie, Future future, z8b z8b, rjf rjf) {
        this.b = voc;
        this.c = wie;
        this.e = z8b;
        this.i = rjf;
    }
}
