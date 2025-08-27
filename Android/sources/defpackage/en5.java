package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: en5  reason: default package */
public final class en5 {
    public final String a;

    public en5(String str) {
        k63 k63 = k63.a;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof en5)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.a, (Object) ((en5) obj).a)) {
            return false;
        }
        k63 k63 = k63.a;
        return true;
    }

    public final int hashCode() {
        return k63.a.hashCode() + g63.e(this.a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return "FilePreferencesOptions(name=" + this.a + ", isDebugMode=false, commitStrategy=" + k63.a + ")";
    }
}
