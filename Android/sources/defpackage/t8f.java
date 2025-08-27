package defpackage;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* renamed from: t8f  reason: default package */
public abstract class t8f {
    public int a;
    public int b;
    public int c;
    public Object d;

    /* JADX WARNING: type inference failed for: r0v2, types: [mz4, java.lang.Object] */
    public t8f() {
        if (mz4.x == null) {
            mz4.x = new Object();
        }
    }

    public int a(int i) {
        if (i < this.c) {
            return ((ByteBuffer) this.d).getShort(this.b + i);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public Object d(View view) {
        if (Build.VERSION.SDK_INT >= this.b) {
            return b(view);
        }
        Object tag = view.getTag(this.a);
        if (((Class) this.d).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void e(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.b) {
            c(view, obj);
        } else if (f(d(view), obj)) {
            WeakHashMap weakHashMap = gag.a;
            View.AccessibilityDelegate a2 = bag.a(view);
            v3 v3Var = a2 == null ? null : a2 instanceof u3 ? ((u3) a2).a : new v3(a2);
            if (v3Var == null) {
                v3Var = new v3();
            }
            gag.j(view, v3Var);
            view.setTag(this.a, obj);
            gag.e(view, this.c);
        }
    }

    public abstract boolean f(Object obj, Object obj2);
}
