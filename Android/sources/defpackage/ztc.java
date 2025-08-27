package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ztc  reason: default package */
public final class ztc extends i8b {
    public final CharSequence e;

    public ztc(String str) {
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ztc) && Intrinsics.areEqual((Object) this.e, (Object) ((ztc) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "Name(name=" + this.e + ")";
    }
}
