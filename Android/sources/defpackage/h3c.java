package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: h3c  reason: default package */
public final class h3c extends t3c {
    public final xa2 a;

    public h3c(xa2 xa2) {
        this.a = xa2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3c) && Intrinsics.areEqual((Object) this.a, (Object) ((h3c) obj).a);
    }

    public final long getItemId() {
        return (long) 16384;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return 16384;
    }

    public final String toString() {
        return "ChatLinkItem(model=" + this.a + ")";
    }
}
