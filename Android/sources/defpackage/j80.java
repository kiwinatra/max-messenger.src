package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j80  reason: default package */
public final class j80 extends ibf {
    public final Map c;
    public final List o;

    public j80(LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.c = linkedHashMap;
        this.o = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80 = (j80) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) j80.c) && Intrinsics.areEqual((Object) this.o, (Object) j80.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        String str;
        Map map = this.c;
        if (map == null) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder("{");
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                sb.append((String) entry.getKey());
                sb.append("=");
                sb.append(cvg.G((CharSequence) entry.getValue()));
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
            sb.append("}");
            str = sb.toString();
        }
        return wj6.k("{tokenTypes=", str, "}");
    }
}
