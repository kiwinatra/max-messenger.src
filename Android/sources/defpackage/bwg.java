package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: bwg  reason: default package */
public final class bwg implements owg {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ f0 e;

    public bwg(f0 f0Var, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = f0Var;
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
    }

    public final int a() {
        return 2;
    }

    public final void b() {
        FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        frameLayout.addView(((wu7) this.e.a).h(this.b, this.c, this.d));
    }
}
