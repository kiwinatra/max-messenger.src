package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sig  reason: default package */
public final class sig implements tig {
    public final String a;

    public sig(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sig) && Intrinsics.areEqual((Object) this.a, (Object) ((sig) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("UploadFile(uriString="), this.a, ")");
    }
}
