package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: xc  reason: default package */
public final class xc implements AdapterView.OnItemClickListener {
    public final /* synthetic */ cd a;
    public final /* synthetic */ zc b;

    public xc(zc zcVar, cd cdVar) {
        this.b = zcVar;
        this.a = cdVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        zc zcVar = this.b;
        DialogInterface.OnClickListener onClickListener = zcVar.r;
        cd cdVar = this.a;
        onClickListener.onClick(cdVar.b, i);
        if (!zcVar.w) {
            cdVar.b.dismiss();
        }
    }
}
