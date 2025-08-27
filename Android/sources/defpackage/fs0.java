package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: fs0  reason: default package */
public abstract class fs0 {
    public final String a;

    public fs0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof fs0) {
                if (Intrinsics.areEqual((Object) this.a, (Object) ((fs0) obj).a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
