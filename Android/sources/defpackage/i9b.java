package defpackage;

import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i9b  reason: default package */
public final class i9b {
    public final y8b a;
    public final Map b;
    public final Map c;
    public final ze1 d;
    public final ze1 e;
    public final Map f;
    public final boolean g;

    public i9b(y8b y8b, Map map, Map map2, ze1 ze1, ze1 ze12, Map map3, boolean z) {
        this.a = y8b;
        this.b = map;
        this.c = map2;
        this.d = ze1;
        this.e = ze12;
        this.f = map3;
        this.g = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = r1.a.getId();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ze1 a() {
        /*
            r3 = this;
            java.util.Map r3 = r3.f
            java.util.Collection r0 = r3.values()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0022
            java.lang.Object r1 = r0.next()
            r2 = r1
            y8b r2 = (defpackage.y8b) r2
            cf1 r2 = r2.a
            boolean r2 = r2.l()
            if (r2 == 0) goto L_0x000c
            goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            y8b r1 = (defpackage.y8b) r1
            if (r1 == 0) goto L_0x0030
            cf1 r0 = r1.a
            ze1 r0 = r0.getId()
            if (r0 == 0) goto L_0x0030
            goto L_0x003b
        L_0x0030:
            java.util.Set r3 = r3.keySet()
            java.lang.Object r3 = kotlin.collections.CollectionsKt.firstOrNull(r3)
            r0 = r3
            ze1 r0 = (defpackage.ze1) r0
        L_0x003b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i9b.a():ze1");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9b)) {
            return false;
        }
        i9b i9b = (i9b) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) i9b.a) && Intrinsics.areEqual((Object) this.b, (Object) i9b.b) && Intrinsics.areEqual((Object) this.c, (Object) i9b.c) && Intrinsics.areEqual((Object) this.d, (Object) i9b.d) && Intrinsics.areEqual((Object) this.e, (Object) i9b.e) && Intrinsics.areEqual((Object) this.f, (Object) i9b.f) && this.g == i9b.g;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i = 0;
        ze1 ze1 = this.d;
        int hashCode2 = (hashCode + (ze1 == null ? 0 : ze1.hashCode())) * 31;
        ze1 ze12 = this.e;
        if (ze12 != null) {
            i = ze12.hashCode();
        }
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((hashCode2 + i) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParticipantsState(me=");
        sb.append(this.a);
        sb.append(", usersInCall=");
        sb.append(this.b);
        sb.append(", participants=");
        sb.append(this.c);
        sb.append(", primarySpeaker=");
        sb.append(this.d);
        sb.append(", opponentSpeaker=");
        sb.append(this.e);
        sb.append(", screenShareSpeakers=");
        sb.append(this.f);
        sb.append(", hasAnyEnabledCamera=");
        return tr1.m(sb, this.g, ")");
    }

    public /* synthetic */ i9b(y8b y8b) {
        this(y8b, MapsKt.emptyMap(), MapsKt.emptyMap(), (ze1) null, (ze1) null, MapsKt.emptyMap(), false);
    }
}
