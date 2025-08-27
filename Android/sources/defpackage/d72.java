package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: d72  reason: default package */
public final class d72 {
    public static final List h;
    public static final d72 i;
    public final long a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, c72] */
    static {
        List asList = Arrays.asList(new a72[]{a72.a, a72.b, a72.c});
        h = asList;
        ? obj = new Object();
        obj.a = 0;
        obj.c = 0;
        obj.d = 0;
        obj.b = asList;
        obj.f = 0;
        obj.g = 0;
        i = obj.b();
    }

    public d72(c72 c72) {
        this.a = c72.a;
        List list = c72.b;
        this.b = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.c = c72.c;
        this.d = c72.d;
        this.e = c72.e;
        this.f = c72.f;
        this.g = c72.g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, c72] */
    public final c72 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = new ArrayList(this.b);
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatSettings{dontDisturbUntil=");
        sb.append(this.a);
        sb.append(", options=");
        List list = this.b;
        sb.append(list == null ? "[]" : CollectionsKt___CollectionsKt.joinToString(list, ",", "[", "]", -1, "...", new wg7(8)));
        sb.append(", lastNotifMark=");
        sb.append(this.c);
        sb.append(", lastNotifMessageId=");
        sb.append(this.d);
        sb.append(", favoriteIndex=");
        sb.append(this.e);
        sb.append(", hideMyLiveLocationPanelBeforeTime=");
        sb.append(this.f);
        sb.append(", hideLiveLocationPanelBeforeTime=");
        return i2a.j(sb, this.g, '}');
    }
}
