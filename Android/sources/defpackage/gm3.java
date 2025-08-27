package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;

/* renamed from: gm3  reason: default package */
public final /* synthetic */ class gm3 implements BiConsumer {
    public final /* synthetic */ Collection a;
    public final /* synthetic */ Map b;

    public /* synthetic */ gm3(ws wsVar, ts tsVar) {
        this.a = wsVar;
        this.b = tsVar;
    }

    public final void accept(Object obj, Object obj2) {
        Long l = (Long) obj;
        vk3 vk3 = (vk3) obj2;
        if (this.a.contains(l)) {
            this.b.put(l, vk3);
        }
    }
}
