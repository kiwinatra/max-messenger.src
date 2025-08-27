package defpackage;

import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: tr5  reason: default package */
public final class tr5 implements Drawable.Callback {
    public final ne4 a;
    public final uo5 b;
    public final /* synthetic */ ur5 c;

    public tr5(ur5 ur5) {
        this.c = ur5;
        this.a = new ne4(25, ur5);
        this.b = new uo5(3, (Object) ur5, (Object) this);
    }

    public final void invalidateDrawable(Drawable drawable) {
        ur5 ur5 = this.c;
        RecyclerView recyclerView = ur5.z;
        uo5 uo5 = this.b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(uo5);
        }
        RecyclerView recyclerView2 = ur5.z;
        if (recyclerView2 != null) {
            recyclerView2.post(uo5);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        ur5 ur5 = this.c;
        RecyclerView recyclerView = ur5.z;
        uo5 uo5 = this.b;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(uo5);
        }
        RecyclerView recyclerView2 = ur5.z;
        if (recyclerView2 != null) {
            recyclerView2.postDelayed(uo5, j - System.currentTimeMillis());
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        RecyclerView recyclerView = this.c.z;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(this.b);
        }
    }
}
