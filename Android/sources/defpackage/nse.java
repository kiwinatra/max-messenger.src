package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.GridLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import kotlin.Lazy;
import ru.ok.messages.views.widgets.RecyclerAutofitGridView;

/* renamed from: nse  reason: default package */
public final class nse extends c0 implements gnd {
    public final Random A0 = new Random();
    public List v0 = new ArrayList();
    public final lw9 w0;
    public final mg4 x0;
    public int y0 = 1;
    public final gb8 z;
    public final SparseIntArray z0 = new SparseIntArray();

    public nse(Context context, gb8 gb8) {
        super(context, ose.STICKERS);
        this.z = gb8;
        getContext();
        ro4 b = ro4.b();
        lw9 lw9 = new lw9();
        this.w0 = lw9;
        lw9.C(true);
        this.a.T0();
        RecyclerAutofitGridView recyclerAutofitGridView = this.a;
        int i = b.h;
        recyclerAutofitGridView.setPadding(i, 0, i, 0);
        this.a.setClipChildren(false);
        this.a.setClipToPadding(false);
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.a.getLayoutManager();
        gridLayoutManager.K = new mse(gridLayoutManager, lw9, 0);
        this.a.setAdapter(lw9);
        mg4 mg4 = new mg4();
        this.x0 = mg4;
        this.a.setItemAnimator(mg4);
        ise ise = this.y;
        if (ise != null) {
            this.a.setColumnWidth(ise.a.a);
        }
        this.v.setText(qad.R9);
    }

    public final boolean E1() {
        b0 b0Var = this.x;
        return b0Var != null && b0Var.q(ose.STICKERS);
    }

    public final void a() {
        setSections(Collections.emptyList());
    }

    public final void b(boolean z2) {
        RecyclerAutofitGridView recyclerAutofitGridView = this.a;
        lw9 lw9 = this.w0;
        lw9.F();
        Context context = getContext();
        Lazy lazy = scf.b0;
        xoe s = cvg.s(j4b.k0(context), getContext());
        for (int i = 0; i < this.v0.size(); i++) {
            vte vte = (vte) this.v0.get(i);
            boolean z3 = !TextUtils.isEmpty(vte.c) && !(this.y0 == 1 && vte == this.v0.get(0));
            boolean z4 = vte != a81.i(1, this.v0);
            if (tr1.y(vte.a) == 1) {
                sq7 sq7 = new sq7(ew3.b(getContext(), nad.E2), ise.a().a.a, s, this.z);
                SparseIntArray sparseIntArray = this.z0;
                int i2 = sparseIntArray.get(i);
                if (i2 == 0) {
                    i2 = this.A0.nextInt();
                    sparseIntArray.put(i, i2);
                }
                sq7.X = i2;
                ArrayList d = ((sjd) tr1.h((qra) ym.e())).x().d(vte);
                tq7 tq7 = new tq7();
                tq7.a = d;
                sq7.z = (List) tq7.b(d).f();
                o5h o5h = new o5h(vte.b, this, tq7);
                if (sq7.o != o5h) {
                    sq7.o = o5h;
                    if (sq7.z.size() > 0) {
                        sq7.m();
                    }
                }
                lw9.E(new qmd(vte, sq7, z3, z4));
            }
        }
        if (!z2) {
            recyclerAutofitGridView.setItemAnimator((yyc) null);
        }
        try {
            kne.K(recyclerAutofitGridView, new mgd(14, lw9));
        } catch (Throwable th) {
            z68.f("StickersGridView", "updateGrid:", th);
        }
        if (!z2) {
            recyclerAutofitGridView.post(new mgd(15, this));
        }
    }

    public int getCellHeight() {
        return this.a.getWidth() / ((GridLayoutManager) this.a.getLayoutManager()).F;
    }

    public final void p() {
        b0 b0Var = this.x;
        if (b0Var != null) {
            b0Var.p();
        }
    }

    public void setSections(List<vte> list) {
        this.v0 = list;
        b(false);
        this.a.setRefreshingNext(false);
        if (list.size() == 1 && list.get(0).o.size() == 0) {
            this.a.setEmptyView(this.b);
        } else {
            this.a.setEmptyView(this.c);
        }
    }

    public void setState(int i) {
        if (this.y0 != i) {
            this.y0 = i;
            b(true);
        }
    }

    public void setStickers(ise ise) {
        super.setStickers(ise);
        ise ise2 = this.y;
        if (ise2 != null) {
            this.a.setColumnWidth(ise2.a.a);
        }
    }

    public final void u() {
    }

    public final void u1() {
        this.a.setRefreshingNext(true);
        b0 b0Var = this.x;
        if (b0Var != null) {
            b0Var.s(ose.STICKERS);
        }
    }
}
