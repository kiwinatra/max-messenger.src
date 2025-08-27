package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: qs6  reason: default package */
public final class qs6 implements lz7 {
    public final long X;
    public final long a;
    public final CharSequence b;
    public final isb c;
    public final isb o;
    public final Uri v;
    public final fo3 w;
    public final List x;
    public final boolean y;
    public final int z = rra.p;

    public qs6(long j, String str, isb isb, isb isb2, Uri uri, fo3 fo3, a00 a00, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = isb;
        this.o = isb2;
        this.v = uri;
        this.w = fo3;
        this.x = a00;
        this.y = z2;
        this.X = j;
    }

    public final long getItemId() {
        return this.X;
    }

    public final int i() {
        return this.z;
    }
}
