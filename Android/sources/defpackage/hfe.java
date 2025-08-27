package defpackage;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* renamed from: hfe  reason: default package */
public abstract class hfe extends dzc {
    public RecyclerView a;
    public Scroller b;
    public final gfe c = new gfe(this);

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            gfe gfe = this.c;
            if (recyclerView2 != null) {
                recyclerView2.u0(gfe);
                this.a.setOnFlingListener((dzc) null);
            }
            this.a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.a.m(gfe);
                this.a.setOnFlingListener(this);
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                f();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(a aVar, View view);

    public ew7 c(a aVar) {
        if (!(aVar instanceof kzc)) {
            return null;
        }
        return new nx1(this, this.a.getContext(), 2);
    }

    public abstract View d(a aVar);

    public abstract int e(a aVar, int i, int i2);

    public final void f() {
        a layoutManager;
        View d;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d = d(layoutManager)) != null) {
            int[] b2 = b(layoutManager, d);
            int i = b2[0];
            if (i != 0 || b2[1] != 0) {
                this.a.C0(i, b2[1], false);
            }
        }
    }
}
