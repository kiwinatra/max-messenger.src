package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: bac  reason: default package */
public final class bac implements Serializable {
    public final b32 a;
    public final List b;
    public final cs3 c;

    public bac(b32 b32, a00 a00, cs3 cs3) {
        this.a = b32;
        this.b = a00;
        this.c = cs3;
    }

    public final String toString() {
        int o = kv0.o(this.b);
        return "{chat=" + this.a + ", highlights=" + o + ", contactSearchResult=" + this.c + "}";
    }
}
