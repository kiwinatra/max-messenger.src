package defpackage;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;

/* renamed from: dl4  reason: default package */
public final /* synthetic */ class dl4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ dl4(View view, boolean z, el4 el4, ViewGroup viewGroup, View view2, cy3 cy3) {
        this.a = 0;
        this.c = view;
        this.b = z;
        this.v = el4;
        this.w = viewGroup;
        this.o = view2;
        this.x = cy3;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                ViewGroup viewGroup = (ViewGroup) this.w;
                if (view != null) {
                    if (this.b) {
                        ((el4) this.v).getClass();
                    }
                    viewGroup.removeView(view);
                }
                View view2 = (View) this.o;
                if (view2 != null && view2.getParent() == null) {
                    viewGroup.addView(view2);
                }
                if (viewGroup.getWindowToken() != null) {
                    ((cy3) this.x).n();
                    return;
                }
                return;
            case 1:
                uz8 uz8 = (uz8) this.c;
                ((vz8) this.o).u(uz8.a, uz8.b, (k28) this.v, (es8) this.w, (IOException) this.x, this.b);
                return;
            case 2:
                cs csVar = (cs) this.c;
                ((wz8) this.o).b(csVar.b, (nz8) csVar.c, (l28) this.v, (es8) this.w, (IOException) this.x, this.b);
                return;
            default:
                Pair pair = (Pair) this.o;
                ((wb4) ((j09) ((wsb) this.c).b).j).b(((Integer) pair.first).intValue(), (nz8) pair.second, (l28) this.v, (es8) this.w, (IOException) this.x, this.b);
                return;
        }
    }

    public /* synthetic */ dl4(Object obj, Object obj2, Object obj3, Object obj4, IOException iOException, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.v = obj3;
        this.w = obj4;
        this.x = iOException;
        this.b = z;
    }
}
