package defpackage;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.MapsKt;
import kotlin.ranges.RangesKt;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: uv9  reason: default package */
public final class uv9 extends qm implements lcf {
    public final long o;
    public final long v;
    public final List w;
    public final String x = uv9.class.getName();

    public uv9(long j, long j2, long j3, List list) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = list;
    }

    public final void e(ibf ibf) {
        vv9 vv9 = (vv9) ibf;
        z68.c(this.x, wj6.h(vv9.c.keySet().size(), "reactions: onSuccess: reactionsCount = "), new Object[0]);
        Iterable iterable = this.w;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(next, (ud9) vv9.c.get(Long.valueOf(((Number) next).longValue())));
        }
        rm rmVar = this.c;
        if (rmVar == null) {
            rmVar = null;
        }
        ((ae9) rmVar.M.getValue()).f(this.o, linkedHashMap);
    }

    public final fbf g() {
        List list = this.w;
        Collection collection = list;
        if (!collection.isEmpty()) {
            np2 np2 = new np2(x3b.MSG_GET_REACTIONS, 24);
            if (!collection.isEmpty()) {
                np2.p(this.v, ApiProtocol.PARAM_CHAT_ID);
                np2.i("messageIds", list);
                return np2;
            }
            throw new IllegalArgumentException("mesageIds can't be empty".toString());
        }
        throw new IllegalArgumentException("messageIds is empty, MsgGetReactions requires at least one messageId".toString());
    }

    public final void h(qaf qaf) {
        z68.h(this.x, qaf.v, "reactions, onFail %s", qaf);
        k().c(new hj0(this.a, qaf));
    }
}
