package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vk8  reason: default package */
public final class vk8 implements wk8 {
    public final CharSequence a;
    public final List b;
    public final boolean c;

    public vk8(CharSequence charSequence, ArrayList arrayList, boolean z) {
        this.a = charSequence;
        this.b = arrayList;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk8)) {
            return false;
        }
        vk8 vk8 = (vk8) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) vk8.a) && Intrinsics.areEqual((Object) this.b, (Object) vk8.b) && this.c == vk8.c;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.c) + rae.i(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendMedia(caption=");
        sb.append(this.a);
        sb.append(", media=");
        sb.append(this.b);
        sb.append(", sendAsFile=");
        return tr1.m(sb, this.c, ")");
    }
}
