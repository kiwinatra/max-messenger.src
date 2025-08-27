package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w9f  reason: default package */
public final class w9f {
    public final String a;
    public final List b;

    public w9f(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9f)) {
            return false;
        }
        w9f w9f = (w9f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) w9f.a) && Intrinsics.areEqual((Object) this.b, (Object) w9f.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PickerInput(folderId=" + this.a + ", alreadyPickedIds=" + this.b + ")";
    }
}
