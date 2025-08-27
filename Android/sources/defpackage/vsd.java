package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vsd  reason: default package */
public final class vsd implements usd, iy0 {
    public final usd a;
    public final String b;
    public final Set c;

    public vsd(usd usd) {
        this.a = usd;
        this.b = usd.a() + '?';
        this.c = y64.e(usd);
    }

    public final String a() {
        return this.b;
    }

    public final Set b() {
        return this.c;
    }

    public final boolean c() {
        return true;
    }

    public final int d(String str) {
        return this.a.d(str);
    }

    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsd)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.a, (Object) ((vsd) obj).a);
    }

    public final String f(int i) {
        return this.a.f(i);
    }

    public final List g(int i) {
        return this.a.g(i);
    }

    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    public final kne getKind() {
        return this.a.getKind();
    }

    public final usd h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final boolean i(int i) {
        return this.a.i(i);
    }

    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
