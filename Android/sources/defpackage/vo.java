package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: vo  reason: default package */
public final class vo implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj;
        switch (this.a) {
            case 0:
                xo xoVar = (xo) this.b;
                xoVar.N0.setSelection(i);
                if (xoVar.N0.getOnItemClickListener() != null) {
                    xoVar.N0.performItemClick(view, i, xoVar.K0.getItemId(i));
                }
                xoVar.dismiss();
                return;
            case 1:
                View view2 = null;
                eg8 eg8 = (eg8) this.b;
                if (i < 0) {
                    sz7 sz7 = eg8.v;
                    obj = !sz7.I0.isShowing() ? null : sz7.c.getSelectedItem();
                } else {
                    obj = eg8.getAdapter().getItem(i);
                }
                eg8.b(eg8, obj);
                AdapterView.OnItemClickListener onItemClickListener = eg8.getOnItemClickListener();
                sz7 sz72 = eg8.v;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        if (sz72.I0.isShowing()) {
                            view2 = sz72.c.getSelectedView();
                        }
                        view = view2;
                        i = !sz72.I0.isShowing() ? -1 : sz72.c.getSelectedItemPosition();
                        j = !sz72.I0.isShowing() ? Long.MIN_VALUE : sz72.c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(sz72.c, view, i, j);
                }
                sz72.dismiss();
                return;
            default:
                ((gmd) this.b).onItemClicked(i, 0, (String) null);
                return;
        }
    }
}
