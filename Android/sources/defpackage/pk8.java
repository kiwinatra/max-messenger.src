package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: pk8  reason: default package */
public final class pk8 implements wk8 {
    public final CharSequence a;
    public final List b;
    public final boolean c;

    public pk8(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk8)) {
            return false;
        }
        pk8 pk8 = (pk8) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) pk8.a) && Intrinsics.areEqual((Object) this.b, (Object) pk8.b) && this.c == pk8.c;
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        List list = this.b;
        if (list != null) {
            i = list.hashCode();
        }
        return Boolean.hashCode(this.c) + ((hashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinishEditMessage(text=");
        sb.append(this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", mediaChanged=");
        return tr1.m(sb, this.c, ")");
    }
}
