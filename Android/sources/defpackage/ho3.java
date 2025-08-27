package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ho3  reason: default package */
public final class ho3 extends ibf {
    public final fo3 c;

    public ho3(fo3 fo3) {
        this.c = fo3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho3) && Intrinsics.areEqual((Object) this.c, (Object) ((ho3) obj).c);
    }

    public final int hashCode() {
        fo3 fo3 = this.c;
        if (fo3 == null) {
            return 0;
        }
        return fo3.hashCode();
    }

    public final String toString() {
        return "CONTACT_INFO_BY_PHONE.Response(contact=" + String.valueOf(this.c) + ')';
    }
}
