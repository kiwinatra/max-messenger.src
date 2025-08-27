package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: rl7  reason: default package */
public final class rl7 extends xl7 {
    public final ql7 w;

    public rl7(ql7 ql7) {
        super(3, 0);
        this.w = ql7;
    }

    public final void a(RecyclerView recyclerView, pzc pzc) {
        super.a(recyclerView, pzc);
        if (pzc instanceof zl7) {
            ((zl7) pzc).h();
        }
    }

    public final boolean i(pzc pzc, pzc pzc2) {
        this.w.M(pzc.q(), pzc2.q());
        return true;
    }

    public final void j(pzc pzc, int i) {
        if (i != 0 && (pzc instanceof zl7)) {
            ((zl7) pzc).m();
        }
    }
}
