package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: dp0  reason: default package */
public final class dp0 implements fp0 {
    public final zu3 a;

    public dp0(zu3 zu3) {
        this.a = zu3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dp0) && Intrinsics.areEqual((Object) this.a, (Object) ((dp0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsUpdate(event=" + this.a + ")";
    }
}
