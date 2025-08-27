package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: rse  reason: default package */
public final class rse extends tyc {
    public final WeakHashMap o = new WeakHashMap();
    public final List v;
    public final b0 w;
    public ise x;
    public gb8 y;

    public rse(ArrayList arrayList, b0 b0Var, ise ise, gb8 gb8) {
        this.v = arrayList;
        this.w = b0Var;
        this.x = ise;
        this.y = gb8;
    }

    public final c0 E(ose ose) {
        return (c0) this.o.get(ose);
    }

    public final int j() {
        return this.v.size();
    }

    public final long k(int i) {
        return (long) ((ose) this.v.get(i)).a.hashCode();
    }

    public final int l(int i) {
        return ((ose) this.v.get(i)).a.hashCode();
    }

    public final void s(pzc pzc, int i) {
        View view = ((qse) pzc).a;
        if (view instanceof c0) {
            c0 c0Var = (c0) view;
            c0Var.setStickers(this.x);
            c0Var.c();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: yqe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: yqe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: yqe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: nse} */
    /* JADX WARNING: type inference failed for: r6v3, types: [android.view.View, wr6, c0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.pzc u(android.view.ViewGroup r5, int r6) {
        /*
            r4 = this;
            r0 = -1980625194(0xffffffff89f20ed6, float:-5.8273332E-33)
            if (r6 != r0) goto L_0x0014
            nse r6 = new nse
            android.content.Context r5 = r5.getContext()
            gb8 r0 = r4.y
            r6.<init>(r5, r0)
            ose r5 = defpackage.ose.STICKERS
            goto L_0x00bb
        L_0x0014:
            r0 = 2187567(0x21612f, float:3.065434E-39)
            if (r6 != r0) goto L_0x00a9
            wr6 r6 = new wr6
            android.content.Context r5 = r5.getContext()
            ose r0 = defpackage.ose.GIFS
            r6.<init>(r5, r0)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6.z = r5
            r6.getContext()
            ro4 r1 = defpackage.ro4.b()
            p06 r2 = new p06
            r2.<init>(r5, r6)
            r6.v0 = r2
            r5 = 1
            r2.C(r5)
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r5 = r6.a
            r2 = 10
            r5.setThreshold(r2)
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r5 = r6.a
            int r2 = r1.h
            r3 = 0
            r5.setPadding(r2, r3, r2, r3)
            ise r5 = r6.y
            if (r5 != 0) goto L_0x0051
            goto L_0x005f
        L_0x0051:
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r2 = r6.a
            r3 r5 = r5.a
            int r5 = r5.a
            float r5 = (float) r5
            r3 = 1069547520(0x3fc00000, float:1.5)
            float r5 = r5 * r3
            int r5 = (int) r5
            r2.setStaggeredColumnWidth(r5)
        L_0x005f:
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r5 = r6.a
            r2 = 6
            r5.setMaxColumns(r2)
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r5 = r6.a
            p06 r3 = r6.v0
            r5.setAdapter(r3)
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r5 = r6.a
            android.content.Context r3 = r5.getContext()
            boolean r3 = defpackage.hn4.i(r3)
            if (r3 == 0) goto L_0x007b
            r5.k2 = r2
            goto L_0x007e
        L_0x007b:
            r2 = 3
            r5.k2 = r2
        L_0x007e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = new androidx.recyclerview.widget.StaggeredGridLayoutManager
            int r3 = r5.k2
            r2.<init>(r3)
            r5.setLayoutManager(r2)
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r5 = r6.a
            r2 = 0
            r5.setItemAnimator(r2)
            int r5 = r1.d
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r1 = r6.a
            w51 r2 = new w51
            r3 = 3
            r2.<init>(r5, r3)
            r1.j(r2)
            ru.ok.messages.views.widgets.RecyclerAutofitGridView r1 = r6.a
            r1.setPadding(r5, r5, r5, r5)
            android.widget.TextView r5 = r6.v
            int r1 = defpackage.qad.A3
            r5.setText(r1)
            r5 = r0
            goto L_0x00bb
        L_0x00a9:
            r0 = 315790899(0x12d29633, float:1.328989E-27)
            if (r6 != r0) goto L_0x00cb
            yqe r6 = new yqe
            android.content.Context r5 = r5.getContext()
            gb8 r0 = r4.y
            r6.<init>(r5, r0)
            ose r5 = defpackage.ose.STICKER_SETS
        L_0x00bb:
            java.util.WeakHashMap r0 = r4.o
            r0.put(r5, r6)
            b0 r4 = r4.w
            r6.setListener(r4)
            qse r4 = new qse
            r4.<init>(r6)
            return r4
        L_0x00cb:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.String r5 = "Unexpected value: "
            java.lang.String r5 = defpackage.wj6.h(r6, r5)
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rse.u(android.view.ViewGroup, int):pzc");
    }
}
