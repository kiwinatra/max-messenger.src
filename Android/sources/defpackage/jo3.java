package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jo3  reason: default package */
public final class jo3 extends ibf implements g88 {
    public final List c;

    public jo3(List list) {
        this.c = list;
    }

    public final String a(boolean z, boolean z2) {
        return "CONTACT_INFO.Response(contacts=" + n54.w(this.c, z, z2) + ')';
    }

    public final List d() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.c) {
            if (((fo3) next) != do3.y0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jo3) && Intrinsics.areEqual((Object) this.c, (Object) ((jo3) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return a(false, false);
    }
}
