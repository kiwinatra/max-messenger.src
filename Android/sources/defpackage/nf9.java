package defpackage;

import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: nf9  reason: default package */
public final class nf9 {
    public static final /* synthetic */ KProperty[] c;
    public final ReadWriteProperty a;
    public final ReadWriteProperty b;

    static {
        Class<nf9> cls = nf9.class;
        c = new KProperty[]{rae.s(cls, "message", "getMessage()Lru/ok/tamtam/messages/Message;", 0), rae.s(cls, "isExpanded", "isExpanded()Z", 0)};
    }

    public nf9() {
        Delegates delegates = Delegates.INSTANCE;
        this.a = delegates.notNull();
        this.b = delegates.notNull();
    }

    public final of9 a() {
        KProperty[] kPropertyArr = c;
        return new of9((a89) this.a.getValue(this, kPropertyArr[0]), ((Boolean) this.b.getValue(this, kPropertyArr[1])).booleanValue());
    }
}
