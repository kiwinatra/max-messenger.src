package defpackage;

import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;

/* renamed from: hmd  reason: default package */
public final class hmd extends kd8 implements bmd, hmf {
    public final /* synthetic */ int b;
    public final cla c;
    public final ViewGroup o;

    public /* synthetic */ hmd(ViewGroup viewGroup, cla cla, int i) {
        this.b = i;
        this.o = viewGroup;
        this.c = cla;
    }

    public final void a() {
        switch (this.b) {
            case 0:
                ((gmd) this.o).setOnQueryTextListener((bmd) null);
                return;
            default:
                ((Toolbar) this.o).setOnMenuItemClickListener((hmf) null);
                return;
        }
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        if (this.a.get()) {
            return true;
        }
        this.c.d(menuItem);
        return true;
    }
}
