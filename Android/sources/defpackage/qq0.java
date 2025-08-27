package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qq0  reason: default package */
public final class qq0 extends ibf {
    public final List c;
    public final fo3 o;

    public qq0(List list, fo3 fo3) {
        this.c = list;
        this.o = fo3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq0)) {
            return false;
        }
        qq0 qq0 = (qq0) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) qq0.c) && Intrinsics.areEqual((Object) this.o, (Object) qq0.o);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        fo3 fo3 = this.o;
        return hashCode + (fo3 == null ? 0 : fo3.hashCode());
    }

    public final String toString() {
        return "Response(botCommands=" + this.c + ", contact=" + this.o + ")";
    }
}
