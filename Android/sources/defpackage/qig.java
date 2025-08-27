package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: qig  reason: default package */
public final class qig implements tig {
    public final String a;

    public qig(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qig) && Intrinsics.areEqual((Object) this.a, (Object) ((qig) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("ShowPhoneConfirmationDialog(appName="), this.a, ")");
    }
}
