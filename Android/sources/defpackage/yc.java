package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: yc  reason: default package */
public final class yc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController$RecycleListView a;
    public final /* synthetic */ cd b;
    public final /* synthetic */ zc c;

    public yc(zc zcVar, AlertController$RecycleListView alertController$RecycleListView, cd cdVar) {
        this.c = zcVar;
        this.a = alertController$RecycleListView;
        this.b = cdVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        zc zcVar = this.c;
        boolean[] zArr = zcVar.u;
        AlertController$RecycleListView alertController$RecycleListView = this.a;
        if (zArr != null) {
            zArr[i] = alertController$RecycleListView.isItemChecked(i);
        }
        zcVar.y.onClick(this.b.b, i, alertController$RecycleListView.isItemChecked(i));
    }
}
