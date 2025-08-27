package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: kw8  reason: default package */
public final class kw8 {
    public static final kw8 c = new kw8((List) null, new Bundle());
    public final Bundle a;
    public List b;

    public kw8(List list, Bundle bundle) {
        this.a = bundle;
        this.b = list;
    }

    public final void a() {
        if (this.b == null) {
            ArrayList<String> stringArrayList = this.a.getStringArrayList("controlCategories");
            this.b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final ArrayList b() {
        a();
        return new ArrayList(this.b);
    }

    public final boolean c() {
        a();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kw8)) {
            return false;
        }
        kw8 kw8 = (kw8) obj;
        a();
        kw8.a();
        return this.b.equals(kw8.b);
    }

    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(b().toArray()) + " }";
    }
}
