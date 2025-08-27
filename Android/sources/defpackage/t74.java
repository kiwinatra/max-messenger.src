package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: t74  reason: default package */
public final class t74 {
    public final Context a;
    public final String b;
    public final e3f c;
    public final z3a d;
    public final List e;
    public final boolean f;
    public final int g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final Set l;
    public final List m;
    public final List n;

    public t74(Context context, String str, e3f e3f, z3a z3a, List list, boolean z, int i2, Executor executor, Executor executor2, boolean z2, boolean z3, Set set, List list2, List list3) {
        this.a = context;
        this.b = str;
        this.c = e3f;
        this.d = z3a;
        this.e = list;
        this.f = z;
        this.g = i2;
        this.h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = set;
        this.m = list2;
        this.n = list3;
    }

    public final boolean a(int i2, int i3) {
        if ((i2 > i3 && this.k) || !this.j) {
            return false;
        }
        Set set = this.l;
        return set == null || !set.contains(Integer.valueOf(i2));
    }
}
