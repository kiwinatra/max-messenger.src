package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tp1  reason: default package */
public final class tp1 {
    public final a32 a;
    public final vk3 b;
    public final a89 c;
    public final gb1 d;
    public List e;

    public tp1(a89 a89, vk3 vk3) {
        this.b = vk3;
        this.c = a89;
        this.a = null;
        this.d = null;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(this.c.a.b));
        List list = this.e;
        if ((list == null ? 0 : list.size()) > 0) {
            for (tp1 tp1 : this.e) {
                arrayList.add(Long.valueOf(tp1.c.a.b));
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tp1.class != obj.getClass()) {
            return false;
        }
        tp1 tp1 = (tp1) obj;
        a32 a32 = tp1.a;
        a32 a322 = this.a;
        if (a322 == null ? a32 != null : !a322.equals(a32)) {
            return false;
        }
        vk3 vk3 = tp1.b;
        vk3 vk32 = this.b;
        if (vk32 == null ? vk3 != null : !vk32.equals(vk3)) {
            return false;
        }
        a89 a89 = tp1.c;
        a89 a892 = this.c;
        if (a892 == null ? a89 != null : !a892.equals(a89)) {
            return false;
        }
        gb1 gb1 = tp1.d;
        gb1 gb12 = this.d;
        if (gb12 == null ? gb1 != null : !gb12.equals(gb1)) {
            return false;
        }
        List list = this.e;
        return list != null ? list.equals(tp1.e) : tp1.e == null;
    }

    public final int hashCode() {
        int i = 0;
        a32 a32 = this.a;
        int hashCode = (a32 != null ? a32.hashCode() : 0) * 31;
        vk3 vk3 = this.b;
        int hashCode2 = (hashCode + (vk3 != null ? vk3.hashCode() : 0)) * 31;
        a89 a89 = this.c;
        int hashCode3 = (hashCode2 + (a89 != null ? a89.hashCode() : 0)) * 31;
        gb1 gb1 = this.d;
        int hashCode4 = (hashCode3 + (gb1 != null ? gb1.hashCode() : 0)) * 31;
        List list = this.e;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public tp1(a32 a32, a89 a89) {
        this.a = a32;
        this.c = a89;
        this.b = null;
        this.d = null;
    }

    public tp1(gb1 gb1) {
        this.d = gb1;
        this.a = null;
        this.c = null;
        this.b = null;
    }
}
