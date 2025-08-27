package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: r3c  reason: default package */
public final class r3c extends s3c {
    public final CharSequence a;

    public r3c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3c) && Intrinsics.areEqual((Object) this.a, (Object) ((r3c) obj).a);
    }

    public final long getItemId() {
        return (long) 16;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return 16;
    }

    public final String toString() {
        return "Phone(text=" + this.a + ")";
    }
}
