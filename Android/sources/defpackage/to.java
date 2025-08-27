package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* renamed from: to  reason: default package */
public final class to implements zo, DialogInterface.OnClickListener {
    public ed a;
    public ListAdapter b;
    public CharSequence c;
    public final /* synthetic */ ap o;

    public to(ap apVar) {
        this.o = apVar;
    }

    public final boolean a() {
        ed edVar = this.a;
        if (edVar != null) {
            return edVar.isShowing();
        }
        return false;
    }

    public final Drawable c() {
        return null;
    }

    public final int d() {
        return 0;
    }

    public final void dismiss() {
        ed edVar = this.a;
        if (edVar != null) {
            edVar.dismiss();
            this.a = null;
        }
    }

    public final void e(int i) {
    }

    public final CharSequence g() {
        return this.c;
    }

    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    public final void j(Drawable drawable) {
    }

    public final void k(int i) {
    }

    public final void l(int i) {
    }

    public final void m(int i, int i2) {
        if (this.b != null) {
            ap apVar = this.o;
            dd ddVar = new dd(apVar.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                ddVar.setTitle(charSequence);
            }
            ListAdapter listAdapter = this.b;
            int selectedItemPosition = apVar.getSelectedItemPosition();
            zc zcVar = ddVar.a;
            zcVar.q = listAdapter;
            zcVar.r = this;
            zcVar.x = selectedItemPosition;
            zcVar.w = true;
            ed create = ddVar.create();
            this.a = create;
            AlertController$RecycleListView alertController$RecycleListView = create.w.g;
            alertController$RecycleListView.setTextDirection(i);
            alertController$RecycleListView.setTextAlignment(i2);
            this.a.show();
        }
    }

    public final int o() {
        return 0;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ap apVar = this.o;
        apVar.setSelection(i);
        if (apVar.getOnItemClickListener() != null) {
            apVar.performItemClick((View) null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    public final void p(ListAdapter listAdapter) {
        this.b = listAdapter;
    }
}
