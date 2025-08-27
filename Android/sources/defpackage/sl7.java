package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: sl7  reason: default package */
public final class sl7 extends xl7 {
    public final Function2 w;
    public final Function1 x;

    public sl7(r6 r6Var, oue oue) {
        super(3, 0);
        this.w = r6Var;
        this.x = oue;
    }

    public final void a(RecyclerView recyclerView, pzc pzc) {
        super.a(recyclerView, pzc);
        if (pzc instanceof pu4) {
            ((hqe) ((pu4) pzc)).a.animate().translationZ(c44.DEFAULT_ASPECT_RATIO);
            this.x.invoke(pzc);
        }
    }

    public final boolean i(pzc pzc, pzc pzc2) {
        this.w.invoke(Integer.valueOf(pzc.p()), Integer.valueOf(pzc2.p()));
        return true;
    }

    public final void j(pzc pzc, int i) {
        if (i != 0 && (pzc instanceof pu4)) {
            ((hqe) ((pu4) pzc)).a.animate().translationZ(vo4.c().getDisplayMetrics().density * 20.0f);
        }
    }
}
