package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xtb  reason: default package */
public final class xtb extends ibf implements g88 {
    public final List c;

    public xtb(List list) {
        this.c = list;
    }

    public final String a(boolean z, boolean z2) {
        return "PRESET_AVATARS.Response(presets=" + n54.w(this.c, z, z2) + ')';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xtb) && Intrinsics.areEqual((Object) this.c, (Object) ((xtb) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return a(false, false);
    }
}
