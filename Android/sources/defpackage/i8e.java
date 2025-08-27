package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i8e  reason: default package */
public final class i8e extends zs2 {
    public final long a;
    public final ngf b;
    public final ngf c;
    public final List d;

    public i8e(long j, ngf ngf, ngf ngf2, List list) {
        this.a = j;
        this.b = ngf;
        this.c = ngf2;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8e)) {
            return false;
        }
        i8e i8e = (i8e) obj;
        return this.a == i8e.a && Intrinsics.areEqual((Object) this.b, (Object) i8e.b) && Intrinsics.areEqual((Object) this.c, (Object) i8e.c) && Intrinsics.areEqual((Object) this.d, (Object) i8e.d);
    }

    public final int hashCode() {
        int g = i2a.g(Long.hashCode(this.a) * 31, 31, this.b);
        ngf ngf = this.c;
        return this.d.hashCode() + ((g + (ngf == null ? 0 : ngf.hashCode())) * 31);
    }

    public final String toString() {
        return "ShowConfirmation(chatId=" + this.a + ", title=" + this.b + ", description=" + this.c + ", buttons=" + this.d + ")";
    }
}
