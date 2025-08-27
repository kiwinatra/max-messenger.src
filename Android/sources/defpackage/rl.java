package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: rl  reason: default package */
public interface rl {
    long a(n0g n0g) {
        return ((jna) this).w(n0g, false);
    }

    long c(int i, List list) {
        jna jna = (jna) this;
        return jna.z(jna, new cu(CollectionsKt.toLongArray(list), i, ((ltb) jna.D()).a.n()));
    }
}
