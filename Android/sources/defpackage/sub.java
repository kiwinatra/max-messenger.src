package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sub  reason: default package */
public final class sub implements usd {
    public final String a;
    public final rub b;

    public sub(String str, rub rub) {
        this.a = str;
        this.b = rub;
    }

    public final String a() {
        return this.a;
    }

    public final boolean c() {
        return false;
    }

    public final int d(String str) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sub)) {
            return false;
        }
        sub sub = (sub) obj;
        if (Intrinsics.areEqual((Object) this.a, (Object) sub.a)) {
            if (Intrinsics.areEqual((Object) this.b, (Object) sub.b)) {
                return true;
            }
        }
        return false;
    }

    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final List g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final kne getKind() {
        return this.b;
    }

    public final usd h(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final boolean i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return g63.l(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
