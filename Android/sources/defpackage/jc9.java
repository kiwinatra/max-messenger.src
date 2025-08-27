package defpackage;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jc9  reason: default package */
public final class jc9 implements kc9 {
    public final Layout a;

    public jc9(Layout layout) {
        this.a = layout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jc9) && Intrinsics.areEqual((Object) this.a, (Object) ((jc9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Simple(bodyLayout=" + this.a + ")";
    }
}
