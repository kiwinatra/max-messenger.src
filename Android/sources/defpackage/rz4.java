package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: rz4  reason: default package */
public final /* synthetic */ class rz4 implements Function0 {
    public final /* synthetic */ sz4 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ List v;
    public final /* synthetic */ String w;
    public final /* synthetic */ List x;
    public final /* synthetic */ qe9 y;

    public /* synthetic */ rz4(sz4 sz4, long j, long j2, boolean z, List list, String str, List list2, qe9 qe9) {
        this.a = sz4;
        this.b = j;
        this.c = j2;
        this.o = z;
        this.v = list;
        this.w = str;
        this.x = list2;
        this.y = qe9;
    }

    public final Object invoke() {
        sz4 sz4 = this.a;
        fa9 fa9 = sz4.a;
        long j = this.c;
        long j2 = this.b;
        fa9.C(j2, j);
        if (this.o) {
            ((a74) fa9.a).c.n(j2, new x52(23, this.v));
        }
        sz4.a.B(j2, this.w, this.x, sz4.b, this.y);
        return null;
    }
}
