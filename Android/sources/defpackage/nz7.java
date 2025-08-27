package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* renamed from: nz7  reason: default package */
public final class nz7 implements i79, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public m69 c;
    public ExpandedMenuView o;
    public final int v;
    public h79 w;
    public mz7 x;

    public nz7(Context context, int i) {
        this.v = i;
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [n69, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, java.lang.Object, h79, android.content.DialogInterface$OnDismissListener] */
    public final boolean c(lye lye) {
        if (!lye.hasVisibleItems()) {
            return false;
        }
        ? obj = new Object();
        obj.a = lye;
        Context context = lye.a;
        dd ddVar = new dd(context);
        nz7 nz7 = new nz7(ddVar.getContext(), vjc.abc_list_menu_item_layout);
        obj.c = nz7;
        nz7.w = obj;
        lye.b(nz7, context);
        nz7 nz72 = obj.c;
        if (nz72.x == null) {
            nz72.x = new mz7(nz72);
        }
        mz7 mz7 = nz72.x;
        zc zcVar = ddVar.a;
        zcVar.q = mz7;
        zcVar.r = obj;
        View view = lye.x0;
        if (view != null) {
            zcVar.e = view;
        } else {
            zcVar.c = lye.w0;
            ddVar.setTitle(lye.v0);
        }
        zcVar.o = obj;
        ed create = ddVar.create();
        obj.b = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.b.show();
        h79 h79 = this.w;
        if (h79 == null) {
            return true;
        }
        h79.a0(lye);
        return true;
    }

    public final boolean d() {
        return false;
    }

    public final boolean e(u69 u69) {
        return false;
    }

    public final void f(h79 h79) {
        this.w = h79;
    }

    public final boolean g(u69 u69) {
        return false;
    }

    public final void h() {
        mz7 mz7 = this.x;
        if (mz7 != null) {
            mz7.notifyDataSetChanged();
        }
    }

    public final void j(Context context, m69 m69) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = m69;
        mz7 mz7 = this.x;
        if (mz7 != null) {
            mz7.notifyDataSetChanged();
        }
    }

    public final void m(m69 m69, boolean z) {
        h79 h79 = this.w;
        if (h79 != null) {
            h79.m(m69, z);
        }
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.q(this.x.getItem(i), this, 0);
    }
}
