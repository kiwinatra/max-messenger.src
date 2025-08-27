package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: zf4  reason: default package */
public final class zf4 extends wb6 {
    public final /* synthetic */ int Z;
    public final Map v0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zf4(int i, Map map) {
        super(11);
        this.Z = i;
        this.v0 = map;
    }

    public final Map T() {
        switch (this.Z) {
            case 0:
                return this.v0;
            default:
                return this.v0;
        }
    }

    public final boolean containsKey(Object obj) {
        switch (this.Z) {
            case 0:
                return obj != null && super.containsKey(obj);
            default:
                return obj != null && super.containsKey(obj);
        }
    }

    public final Set entrySet() {
        switch (this.Z) {
            case 0:
                return ryg.m(super.entrySet(), new yf4(2));
            default:
                return ryg.m(super.entrySet(), new yf4(1));
        }
    }

    public final boolean equals(Object obj) {
        switch (this.Z) {
            case 0:
                return obj != null && hd8.o(this, obj);
            default:
                return obj != null && hd8.o(this, obj);
        }
    }

    public final Object get(Object obj) {
        switch (this.Z) {
            case 0:
                if (obj == null) {
                    return null;
                }
                return (List) super.get(obj);
            default:
                if (obj == null) {
                    return null;
                }
                return (List) super.get(obj);
        }
    }

    public final int hashCode() {
        switch (this.Z) {
            case 0:
                return ryg.B(entrySet());
            default:
                return ryg.B(entrySet());
        }
    }

    public final boolean isEmpty() {
        switch (this.Z) {
            case 0:
                if (!super.isEmpty()) {
                    return super.size() == 1 && super.containsKey((Object) null);
                }
                return true;
            default:
                if (!super.isEmpty()) {
                    return super.size() == 1 && super.containsKey((Object) null);
                }
                return true;
        }
    }

    public final Set keySet() {
        switch (this.Z) {
            case 0:
                return ryg.m(super.keySet(), new yf4(0));
            default:
                return ryg.m(super.keySet(), new yf4(3));
        }
    }

    public final Object q() {
        switch (this.Z) {
            case 0:
                return this.v0;
            default:
                return this.v0;
        }
    }

    public final int size() {
        switch (this.Z) {
            case 0:
                return super.size() - (super.containsKey((Object) null) ? 1 : 0);
            default:
                return super.size() - (super.containsKey((Object) null) ? 1 : 0);
        }
    }
}
