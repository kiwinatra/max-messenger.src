package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;

/* renamed from: zvd  reason: default package */
public final class zvd {
    public static final zvd b = new zvd(new HashSet());
    public static final String c = Integer.toString(0, 36);
    public final dc7 a;

    static {
        int i = v0g.a;
    }

    public zvd(Collection collection) {
        this.a = dc7.p(collection);
    }

    public static zvd b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c);
        if (parcelableArrayList == null) {
            i8b.V("Missing commands. Creating an empty SessionCommands");
            return b;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashSet.add(yvd.a((Bundle) parcelableArrayList.get(i)));
        }
        return new zvd(hashSet);
    }

    public final boolean a(int i) {
        n79.f("Use contains(Command) for custom command", i != 0);
        for (yvd yvd : this.a) {
            if (yvd.a == i) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvd)) {
            return false;
        }
        return this.a.equals(((zvd) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }
}
