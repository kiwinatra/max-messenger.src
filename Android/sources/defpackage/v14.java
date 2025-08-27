package defpackage;

import java.util.List;

/* renamed from: v14  reason: default package */
public final class v14 {
    public final List a;
    public final List b;

    public v14(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v14.class != obj.getClass()) {
            return false;
        }
        v14 v14 = (v14) obj;
        List list = v14.a;
        List list2 = this.a;
        if (list2 == null ? list != null : !list2.equals(list)) {
            return false;
        }
        List list3 = v14.b;
        List list4 = this.b;
        return list4 != null ? list4.equals(list3) : list3 == null;
    }

    public final int hashCode() {
        int i = 0;
        List list = this.a;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.b;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CountryCodeProxiesEntry{countries=" + this.a + ", connectionHosts=" + this.b + '}';
    }
}
