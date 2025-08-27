package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wr6  reason: default package */
public final class wr6 extends c0 implements qr6 {
    public p06 v0;
    public ArrayList z;

    public final boolean E1() {
        b0 b0Var = this.x;
        return b0Var != null && b0Var.q(ose.GIFS);
    }

    public final void a() {
        b(Collections.emptyList(), true);
    }

    public final void b(List list, boolean z2) {
        ArrayList arrayList = this.z;
        arrayList.clear();
        arrayList.addAll(list);
        this.v0.m();
        this.a.setRefreshingNext(false);
        if (!list.isEmpty() || z2) {
            this.a.setEmptyView(this.c);
        } else {
            this.a.setEmptyView(this.b);
        }
    }

    public int getCellHeight() {
        return 0;
    }

    public final void p() {
        b0 b0Var = this.x;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setStickers(ise ise) {
        super.setStickers(ise);
        ise ise2 = this.y;
        if (ise2 != null) {
            this.a.setStaggeredColumnWidth((int) (((float) ise2.a.a) * 1.5f));
        }
    }

    public final void u1() {
        this.a.setRefreshingNext(true);
        b0 b0Var = this.x;
        if (b0Var != null) {
            b0Var.s(ose.GIFS);
        }
    }
}
