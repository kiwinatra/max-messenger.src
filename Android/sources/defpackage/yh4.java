package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* renamed from: yh4  reason: default package */
public final class yh4 implements t1d {
    public final Context a;
    public final xg4 b;

    public yh4(Context context) {
        this.a = context;
        this.b = new xg4(context);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [gc4, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v9, types: [aqg, java.lang.Object] */
    public final pk0[] a(Handler handler, nc5 nc5, nc5 nc52, nc5 nc53, nc5 nc54) {
        ArrayList arrayList = new ArrayList();
        xg4 xg4 = this.b;
        Context context = this.a;
        Handler handler2 = handler;
        nc5 nc55 = nc5;
        arrayList.add(new jo8(context, xg4, handler, nc5));
        ? obj = new Object();
        obj.d = context;
        obj.e = u30.c;
        obj.g = cd4.c;
        obj.a = false;
        obj.b = false;
        n79.n(!obj.c);
        obj.c = true;
        if (((aqg) obj.f) == null) {
            m60[] m60Arr = new m60[0];
            m60 iae = new iae();
            m60 vfe = new vfe();
            ? obj2 = new Object();
            m60[] m60Arr2 = new m60[(m60Arr.length + 2)];
            obj2.a = m60Arr2;
            System.arraycopy(m60Arr, 0, m60Arr2, 0, m60Arr.length);
            obj2.b = iae;
            obj2.c = vfe;
            m60Arr2[m60Arr.length] = iae;
            m60Arr2[m60Arr.length + 1] = vfe;
            obj.f = obj2;
        }
        if (((npg) obj.h) == null) {
            obj.h = new npg(9, (Object) context);
        }
        sc4 sc4 = new sc4(obj);
        arrayList.add(new ln8(this.a, this.b, handler, nc52, sc4));
        arrayList.add(new bgf(nc53, handler.getLooper()));
        arrayList.add(new eq9(nc54, handler.getLooper()));
        arrayList.add(new av1());
        arrayList.add(new ma7(d97.C));
        return (pk0[]) arrayList.toArray(new pk0[0]);
    }
}
