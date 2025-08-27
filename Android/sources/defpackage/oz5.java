package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: oz5  reason: default package */
public final class oz5 extends qz5 {
    public final CharSequence a;
    public final boolean b;

    public oz5(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz5)) {
            return false;
        }
        oz5 oz5 = (oz5) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) oz5.a) && this.b == oz5.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "Creation(name=" + this.a + ", isCreateButtonEnabled=" + this.b + ")";
    }

    public /* synthetic */ oz5() {
        this((CharSequence) null, false);
    }
}
