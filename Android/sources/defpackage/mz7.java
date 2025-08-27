package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* renamed from: mz7  reason: default package */
public final class mz7 extends BaseAdapter {
    public int a = -1;
    public final /* synthetic */ nz7 b;

    public mz7(nz7 nz7) {
        this.b = nz7;
        a();
    }

    public final void a() {
        m69 m69 = this.b.c;
        u69 u69 = m69.E0;
        if (u69 != null) {
            m69.i();
            ArrayList arrayList = m69.X;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((u69) arrayList.get(i)) == u69) {
                    this.a = i;
                    return;
                }
            }
        }
        this.a = -1;
    }

    /* renamed from: b */
    public final u69 getItem(int i) {
        nz7 nz7 = this.b;
        m69 m69 = nz7.c;
        m69.i();
        ArrayList arrayList = m69.X;
        nz7.getClass();
        int i2 = this.a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (u69) arrayList.get(i);
    }

    public final int getCount() {
        nz7 nz7 = this.b;
        m69 m69 = nz7.c;
        m69.i();
        int size = m69.X.size();
        nz7.getClass();
        return this.a < 0 ? size : size - 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            nz7 nz7 = this.b;
            view = nz7.b.inflate(nz7.v, viewGroup, false);
        }
        ((k79) view).d(getItem(i));
        return view;
    }

    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
