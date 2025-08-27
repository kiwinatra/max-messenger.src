package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l88  reason: default package */
public final class l88 extends ibf implements g88 {
    public final Map X;
    public final long Y;
    public final List Z;
    public final fo3 c;
    public final List o;
    public final List v;
    public final boolean v0;
    public final Map w;
    public final long w0;
    public final String x;
    public final ku4 x0;
    public final long y;
    public final long y0;
    public final ue3 z;

    public /* synthetic */ l88() {
        this((fo3) null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), MapsKt.emptyMap(), (String) null, 0, (ue3) null, MapsKt.emptyMap(), 0, CollectionsKt.emptyList(), false, 0, (ku4) null, 0);
    }

    public final String a(boolean z2, boolean z3) {
        p7d p7d;
        Map map;
        ue3 ue3 = this.z;
        if (!(ue3 == null || (p7d = ue3.b) == null || (map = (Map) p7d.b) == null)) {
            String str = null;
            if (map.containsKey("log-full")) {
                Object obj = map.get("log-full");
                z2 = Boolean.parseBoolean(obj != null ? obj.toString() : null);
            }
            if (map.containsKey("log-sensitive")) {
                Object obj2 = map.get("log-sensitive");
                if (obj2 != null) {
                    str = obj2.toString();
                }
                z3 = Boolean.parseBoolean(str);
            }
        }
        StringBuilder sb = new StringBuilder("LOGIN.Response(profile=");
        sb.append(String.valueOf(this.c));
        sb.append(",token=");
        String str2 = this.x;
        sb.append(z3 ? str2 != null ? str2.toString() : "NULL" : cvg.G(str2));
        sb.append(",time=");
        sb.append(this.y);
        sb.append(",chatMarker=");
        sb.append(this.Y);
        sb.append(",videoChatHistory=");
        sb.append(this.v0);
        sb.append(",resetAt=");
        sb.append(this.w0);
        sb.append(",contactInfos=");
        sb.append(n54.w(this.v, z2, z3));
        sb.append(",config=");
        sb.append(ue3);
        sb.append(",messages=");
        sb.append(n54.x(this.X, z2, z3));
        sb.append(",chats=");
        sb.append(n54.w(this.o, z2, z3));
        sb.append(",presence=");
        sb.append(n54.x(this.w, z2, z3));
        sb.append(",calls=");
        sb.append(n54.w(this.Z, z2, z3));
        sb.append(",draftsNews=");
        sb.append(this.x0);
        sb.append(')');
        return sb.toString();
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.v) {
            if (((fo3) next) != do3.y0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l88)) {
            return false;
        }
        l88 l88 = (l88) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) l88.c) && Intrinsics.areEqual((Object) this.o, (Object) l88.o) && Intrinsics.areEqual((Object) this.v, (Object) l88.v) && Intrinsics.areEqual((Object) this.w, (Object) l88.w) && Intrinsics.areEqual((Object) this.x, (Object) l88.x) && this.y == l88.y && Intrinsics.areEqual((Object) this.z, (Object) l88.z) && Intrinsics.areEqual((Object) this.X, (Object) l88.X) && this.Y == l88.Y && Intrinsics.areEqual((Object) this.Z, (Object) l88.Z) && this.v0 == l88.v0 && this.w0 == l88.w0 && Intrinsics.areEqual((Object) this.x0, (Object) l88.x0) && this.y0 == l88.y0;
    }

    public final int hashCode() {
        int i = 0;
        fo3 fo3 = this.c;
        int hashCode = (this.w.hashCode() + rae.i(this.v, rae.i(this.o, (fo3 == null ? 0 : fo3.hashCode()) * 31, 31), 31)) * 31;
        String str = this.x;
        int i2 = wzf.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.y);
        ue3 ue3 = this.z;
        int i3 = wzf.i(g63.e(rae.i(this.Z, wzf.i((this.X.hashCode() + ((i2 + (ue3 == null ? 0 : ue3.hashCode())) * 31)) * 31, 31, this.Y), 31), 31, this.v0), 31, this.w0);
        ku4 ku4 = this.x0;
        if (ku4 != null) {
            i = ku4.hashCode();
        }
        return Long.hashCode(this.y0) + ((i3 + i) * 31);
    }

    public final String toString() {
        return a(false, false);
    }

    public l88(fo3 fo3, List list, List list2, Map map, String str, long j, ue3 ue3, Map map2, long j2, List list3, boolean z2, long j3, ku4 ku4, long j4) {
        long j5 = j4;
        this.c = fo3;
        this.o = list;
        this.v = list2;
        this.w = map;
        this.x = str;
        this.y = j;
        this.z = ue3;
        this.X = map2;
        this.Y = j2;
        this.Z = list3;
        this.v0 = z2;
        this.w0 = j3;
        this.x0 = ku4;
        this.y0 = j5;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j5));
    }
}
