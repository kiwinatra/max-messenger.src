package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h2d  reason: default package */
public final class h2d extends ArrayList {
    public final Collection a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h2d() {
        /*
            r1 = this;
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.<init>(r0)
            r1.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h2d.<init>():void");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof f2d)) {
            return false;
        }
        return super.contains((f2d) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2d) && Intrinsics.areEqual((Object) this.a, (Object) ((h2d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof f2d)) {
            return -1;
        }
        return super.indexOf((f2d) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof f2d)) {
            return -1;
        }
        return super.lastIndexOf((f2d) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof f2d)) {
            return false;
        }
        return super.remove((f2d) obj);
    }

    public final String toString() {
        return "ReplyButtonRow(buttons=" + this.a + ")";
    }
}
