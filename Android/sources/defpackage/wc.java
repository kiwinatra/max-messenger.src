package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: wc  reason: default package */
public final class wc extends ArrayAdapter {
    public final /* synthetic */ AlertController$RecycleListView a;
    public final /* synthetic */ zc b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wc(zc zcVar, Context context, int i, CharSequence[] charSequenceArr, AlertController$RecycleListView alertController$RecycleListView) {
        super(context, i, 16908308, charSequenceArr);
        this.b = zcVar;
        this.a = alertController$RecycleListView;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        boolean[] zArr = this.b.u;
        if (zArr != null && zArr[i]) {
            this.a.setItemChecked(i, true);
        }
        return view2;
    }
}
