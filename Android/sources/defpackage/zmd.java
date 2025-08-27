package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zmd  reason: default package */
public final class zmd implements bnd {
    public final ngf a;
    public final int b;
    public final long c;
    public final int o = qza.C;

    public zmd(igf igf, int i, long j) {
        jnd jnd = jnd.a;
        this.a = igf;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmd)) {
            return false;
        }
        zmd zmd = (zmd) obj;
        if (!Intrinsics.areEqual((Object) this.a, (Object) zmd.a) || this.b != zmd.b || this.c != zmd.c) {
            return false;
        }
        jnd jnd = jnd.a;
        return true;
    }

    public final jnd g() {
        return jnd.o;
    }

    public final long getItemId() {
        return this.c;
    }

    public final ngf getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return jnd.o.hashCode() + wzf.i(rae.h(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final int i() {
        return this.o;
    }

    public final boolean k() {
        return false;
    }

    public final int s() {
        return this.b;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + this.c + ", sectionItemType=" + jnd.o + ")";
    }
}
