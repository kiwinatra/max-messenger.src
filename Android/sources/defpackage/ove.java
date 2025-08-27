package defpackage;

import kotlin.jvm.functions.Function1;

/* renamed from: ove  reason: default package */
public final /* synthetic */ class ove implements Function1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ove(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        boe boe = (boe) obj;
        String str = boe.y;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = boe.o;
        }
        String str2 = str;
        long j = this.a;
        boolean z = this.b;
        long j2 = boe.a;
        return new gpe(j2, j, boe.Z, str2, boe.v0, 0, 0, false, false, z ? Math.abs(j) - boe.a : j2, 2016);
    }
}
