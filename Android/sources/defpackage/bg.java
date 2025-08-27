package defpackage;

import android.util.ArrayMap;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: bg  reason: default package */
public final class bg {
    public final EnhancedVectorDrawable a;
    public final ArrayList b;
    public final ArrayMap c;

    public bg(EnhancedVectorDrawable enhancedVectorDrawable, ArrayList arrayList, ArrayMap arrayMap) {
        this.a = enhancedVectorDrawable;
        this.b = arrayList;
        this.c = arrayMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) bgVar.a) && Intrinsics.areEqual((Object) this.b, (Object) bgVar.b) && Intrinsics.areEqual((Object) this.c, (Object) bgVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ParsedResource(drawable=" + this.a + ", animators=" + this.b + ", targetNameMap=" + this.c + ")";
    }
}
