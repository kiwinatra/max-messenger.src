package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: ci7  reason: default package */
public final /* synthetic */ class ci7 implements vla {
    public final /* synthetic */ bi7 a;
    public final /* synthetic */ mbg b;
    public final /* synthetic */ tag c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ View v;

    public /* synthetic */ ci7(bi7 bi7, mbg mbg, tag tag, boolean z, View view) {
        this.a = bi7;
        this.b = mbg;
        this.c = tag;
        this.o = z;
        this.v = view;
    }

    public final iog z(View view, iog iog) {
        iog a2 = this.a.a(view, iog, this.b, this.c);
        if (this.o) {
            WeakHashMap weakHashMap = gag.a;
            v9g.u(this.v, (vla) null);
        }
        return a2;
    }
}
