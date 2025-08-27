package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: wzc  reason: default package */
public final class wzc extends LinkedHashMap {
    public final /* synthetic */ ni0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wzc(ni0 ni0, int i) {
        super(i, 0.75f, true);
        this.a = ni0;
    }

    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.a.b;
    }
}
