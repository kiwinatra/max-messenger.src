package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: j69  reason: default package */
public final class j69 extends BaseAdapter {
    public final m69 a;
    public int b = -1;
    public boolean c;
    public final boolean o;
    public final LayoutInflater v;
    public final int w;

    public j69(m69 m69, LayoutInflater layoutInflater, boolean z, int i) {
        this.o = z;
        this.v = layoutInflater;
        this.a = m69;
        this.w = i;
        a();
    }

    public final void a() {
        m69 m69 = this.a;
        u69 u69 = m69.E0;
        if (u69 != null) {
            m69.i();
            ArrayList arrayList = m69.X;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((u69) arrayList.get(i)) == u69) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    /* renamed from: b */
    public final u69 getItem(int i) {
        ArrayList arrayList;
        boolean z = this.o;
        m69 m69 = this.a;
        if (z) {
            m69.i();
            arrayList = m69.X;
        } else {
            arrayList = m69.l();
        }
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (u69) arrayList.get(i);
    }

    public final int getCount() {
        ArrayList arrayList;
        boolean z = this.o;
        m69 m69 = this.a;
        if (z) {
            m69.i();
            arrayList = m69.X;
        } else {
            arrayList = m69.l();
        }
        return this.b < 0 ? arrayList.size() : arrayList.size() - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.v.inflate(this.w, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.a.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        k79 k79 = (k79) view;
        if (this.c) {
            listMenuItemView.setForceShowIcon(true);
        }
        k79.d(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
