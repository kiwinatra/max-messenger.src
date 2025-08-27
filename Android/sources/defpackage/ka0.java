package defpackage;

/* renamed from: ka0  reason: default package */
public final class ka0 extends v23 {
    public final u23 a = u23.a;
    public final yd b;

    public ka0(v90 v90) {
        this.b = v90;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v23)) {
            return false;
        }
        v23 v23 = (v23) obj;
        u23 u23 = this.a;
        if (u23 != null ? u23.equals(((ka0) v23).a) : ((ka0) v23).a == null) {
            yd ydVar = this.b;
            if (ydVar == null) {
                if (((ka0) v23).b == null) {
                    return true;
                }
            } else if (ydVar.equals(((ka0) v23).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        u23 u23 = this.a;
        int hashCode = ((u23 == null ? 0 : u23.hashCode()) ^ 1000003) * 1000003;
        yd ydVar = this.b;
        if (ydVar != null) {
            i = ydVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }
}
