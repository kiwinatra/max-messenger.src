package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qtd  reason: default package */
public final class qtd {
    public static final /* synthetic */ int h = 0;
    public final long a;
    public final String b;
    public final List c;
    public final List d;
    public final Long e;
    public final Long f;
    public final long g;

    public qtd(long j, String str, List list, List list2, Long l, Long l2, long j2) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = l;
        this.f = l2;
        this.g = j2;
    }

    public final Map a() {
        String str = this.b;
        Pair pair = null;
        if (!cvg.D(str)) {
            str = null;
        }
        Pair pair2 = str != null ? TuplesKt.to("text", str) : null;
        List list = this.c;
        if (!(!list.isEmpty())) {
            list = null;
        }
        Pair pair3 = list != null ? TuplesKt.to("attaches", list) : null;
        List list2 = this.d;
        if (!(!list2.isEmpty())) {
            list2 = null;
        }
        Pair pair4 = list2 != null ? TuplesKt.to("elements", list2) : null;
        Long l = this.e;
        Pair pair5 = l != null ? TuplesKt.to("replyTo", Long.valueOf(l.longValue())) : null;
        Long l2 = this.f;
        Pair pair6 = l2 != null ? TuplesKt.to("editOn", Long.valueOf(l2.longValue())) : null;
        Long valueOf = Long.valueOf(this.g);
        if (valueOf.longValue() == 0) {
            valueOf = null;
        }
        Pair pair7 = valueOf != null ? TuplesKt.to("saveTime", Long.valueOf(valueOf.longValue())) : null;
        Long valueOf2 = Long.valueOf(this.a);
        if (valueOf2.longValue() == 0) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            pair = TuplesKt.to("cid", Long.valueOf(valueOf2.longValue()));
        }
        return MapsKt.toMap(CollectionsKt.listOfNotNull((T[]) new Pair[]{pair2, pair3, pair4, pair5, pair6, pair7, pair}));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtd)) {
            return false;
        }
        qtd qtd = (qtd) obj;
        return this.a == qtd.a && Intrinsics.areEqual((Object) this.b, (Object) qtd.b) && Intrinsics.areEqual((Object) this.c, (Object) qtd.c) && Intrinsics.areEqual((Object) this.d, (Object) qtd.d) && Intrinsics.areEqual((Object) this.e, (Object) qtd.e) && Intrinsics.areEqual((Object) this.f, (Object) qtd.f) && this.g == qtd.g;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int i2 = rae.i(this.d, rae.i(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        Long l = this.e;
        int hashCode2 = (i2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return Long.hashCode(this.g) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerDraft(text=***, attaches=");
        sb.append(this.c);
        sb.append(", elements=");
        sb.append(this.d);
        sb.append(", replyTo=");
        sb.append(this.e);
        sb.append(", editOn=");
        sb.append(this.f);
        sb.append(", saveTime=");
        return wj6.m(sb, this.g, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtd(String str, List list, Long l, Long l2, int i) {
        this(0, (i & 2) != 0 ? null : str, CollectionsKt.emptyList(), (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? null : l, (i & 32) != 0 ? null : l2, 0);
    }
}
