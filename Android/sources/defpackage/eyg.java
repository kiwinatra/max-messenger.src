package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: eyg  reason: default package */
public final class eyg extends zxg {
    public final transient yxg c;
    public final transient Object[] o;
    public final transient int v;

    public eyg(yxg yxg, Object[] objArr, int i) {
        this.c = yxg;
        this.o = objArr;
        this.v = i;
    }

    public final int b(Object[] objArr) {
        return f().b(objArr);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.c.get(key));
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    public final rxg m() {
        return new cyg(this);
    }

    public final int size() {
        return this.v;
    }
}
