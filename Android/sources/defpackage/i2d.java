package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i2d  reason: default package */
public final class i2d {
    public final List a;
    public final boolean b;

    public i2d(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2d)) {
            return false;
        }
        i2d i2d = (i2d) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) i2d.a) && this.b == i2d.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplyKeyboard(buttons=" + this.a + ", defaultInputDisabled=" + this.b + ")";
    }
}
