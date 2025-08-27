package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pz5  reason: default package */
public final class pz5 extends qz5 {
    public final CharSequence a;
    public final String b;
    public final boolean c;

    public pz5(CharSequence charSequence, String str, boolean z) {
        this.a = charSequence;
        this.b = str;
        this.c = z;
    }

    public static pz5 b(pz5 pz5, CharSequence charSequence, boolean z, int i) {
        if ((i & 1) != 0) {
            charSequence = pz5.a;
        }
        String str = pz5.b;
        pz5.getClass();
        return new pz5(charSequence, str, z);
    }

    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz5)) {
            return false;
        }
        pz5 pz5 = (pz5) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) pz5.a) && Intrinsics.areEqual((Object) this.b, (Object) pz5.b) && this.c == pz5.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + g63.d((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Edit(name=");
        sb.append(this.a);
        sb.append(", folderId=");
        sb.append(this.b);
        sb.append(", canSave=");
        return tr1.m(sb, this.c, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pz5(String str, CharSequence charSequence, int i) {
        this((i & 1) != 0 ? null : charSequence, str, false);
    }
}
