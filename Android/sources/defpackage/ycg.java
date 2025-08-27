package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ycg  reason: default package */
public final class ycg extends xx3 {
    public final /* synthetic */ bs6 a;
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ adg c;
    public final /* synthetic */ View d;

    public ycg(bs6 bs6, ViewTreeObserver viewTreeObserver, adg adg, View view) {
        this.a = bs6;
        this.b = viewTreeObserver;
        this.c = adg;
        this.d = view;
    }

    public final void s(zx3 zx3, View view) {
        Iterator it = ((ArrayList) this.a.c).iterator();
        while (it.hasNext()) {
            ((wcg) it.next()).b();
        }
        zx3.removeLifecycleListener(this);
        bs6.a(this.c, this.d, this.b);
    }
}
