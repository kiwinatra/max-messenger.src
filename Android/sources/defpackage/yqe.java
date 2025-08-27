package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collections;
import java.util.List;
import ru.ok.messages.views.widgets.RecyclerAutofitGridView;

/* renamed from: yqe  reason: default package */
public final class yqe extends c0 implements gre {
    public final hre z;

    public yqe(Context context, gb8 gb8) {
        super(context, ose.STICKER_SETS);
        hre hre = new hre(this, gb8);
        this.z = hre;
        this.a.setThreshold(10);
        this.a.setAdapter(hre);
        RecyclerAutofitGridView recyclerAutofitGridView = this.a;
        getContext();
        recyclerAutofitGridView.setLayoutManager(new LinearLayoutManager(1, false));
        this.a.setItemAnimator((yyc) null);
        this.v.setText(qad.A3);
    }

    public final boolean E1() {
        b0 b0Var = this.x;
        return b0Var != null && b0Var.q(ose.STICKER_SETS);
    }

    public final void a() {
        b(Collections.emptyList(), false);
    }

    public final void b(List list, boolean z2) {
        hre hre = this.z;
        List list2 = ((ov) hre.o).f;
        hre.H(list, (list2.isEmpty() || list.isEmpty() || ((oqe) list2.get(0)).a == ((oqe) list.get(0)).a) ? null : new mgd(13, this));
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

    public oqe getLastVisibleStickerSet() {
        int R0 = this.a.R0();
        if (R0 == -1) {
            return null;
        }
        return (oqe) ((ov) this.z.o).f.get(R0);
    }

    public final void p() {
        b0 b0Var = this.x;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public final void u1() {
        this.a.setRefreshingNext(true);
        b0 b0Var = this.x;
        if (b0Var != null) {
            b0Var.s(ose.STICKER_SETS);
        }
    }
}
