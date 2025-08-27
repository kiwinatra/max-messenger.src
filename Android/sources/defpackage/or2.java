package defpackage;

import android.view.View;

/* renamed from: or2  reason: default package */
public final class or2 {
    public final View a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public final /* synthetic */ mqf f;

    public or2(mqf mqf, View view, int i, boolean z, boolean z2) {
        this.f = mqf;
        this.a = view;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || or2.class != obj.getClass()) {
            return false;
        }
        or2 or2 = (or2) obj;
        if (this.b != or2.b || this.c != or2.c) {
            return false;
        }
        View view = or2.a;
        View view2 = this.a;
        return view2 != null ? view2.equals(view) : view == null;
    }

    public final int hashCode() {
        View view = this.a;
        return ((((view != null ? view.hashCode() : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }
}
