package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: hre  reason: default package */
public final class hre extends jj0 {
    public final gre v;
    public final gb8 w;

    public hre(gre gre, gb8 gb8) {
        super((j4b) new w63(20));
        this.v = gre;
        this.w = gb8;
    }

    /* JADX WARNING: type inference failed for: r7v13, types: [ru.ok.messages.stickers.sets.adapter.FixedSizePerPageLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.a] */
    public final void s(pzc pzc, int i) {
        qqe qqe = (qqe) pzc;
        oqe oqe = (oqe) E(i);
        qqe.L0 = oqe;
        View view = qqe.a;
        int i2 = hn4.i(view.getContext()) ? 8 : 4;
        qqe.E0.setText(oqe.b);
        List list = oqe.e;
        int size = list.size();
        String str = oqe.d;
        boolean A = cvg.A(str);
        TextView textView = qqe.F0;
        if (A) {
            textView.setText(String.format(view.getContext().getResources().getQuantityString(pad.k, size), new Object[]{Integer.valueOf(size)}));
        } else {
            textView.setText(String.format(view.getContext().getResources().getQuantityString(pad.l, size), new Object[]{Integer.valueOf(size), str}));
        }
        qqe.M(oqe.f);
        if (qqe.K0 == null) {
            Context context = view.getContext();
            sq7 sq7 = new sq7(ew3.b(context, nad.E2), ise.a().a.a, cvg.s(scf.g(view.getContext()), context), qqe.O0);
            qqe.K0 = sq7;
            if (sq7.o != qqe) {
                sq7.o = qqe;
                if (sq7.z.size() > 0) {
                    sq7.m();
                }
            }
            qqe.N0 = new tq7();
            sq7 sq72 = qqe.K0;
            RecyclerView recyclerView = qqe.H0;
            recyclerView.setAdapter(sq72);
            ? linearLayoutManager = new LinearLayoutManager(0, false);
            linearLayoutManager.E = i2;
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setItemAnimator((yyc) null);
        }
        if (list.size() > i2) {
            list = list.subList(0, i2);
        }
        sq7 sq73 = qqe.K0;
        tq7 tq7 = qqe.N0;
        tq7.a = list;
        sq73.z = (List) tq7.b(list).f();
        qqe.K0.m();
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        View inflate = View.inflate(viewGroup.getContext(), ujc.row_sticker_set_showcase, (ViewGroup) null);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new qqe(inflate, this.w, this);
    }
}
