package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.a;

public class SupportMapFragment extends a {
    public final myg l1 = new myg(this);

    public final void e2(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        this.Q0 = true;
    }

    public final void g2(Activity activity) {
        this.Q0 = true;
        myg myg = this.l1;
        myg.x = activity;
        myg.P();
    }

    public void i2(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.i2(bundle);
            myg myg = this.l1;
            myg.getClass();
            myg.O(bundle, new qvg(myg, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        myg myg = this.l1;
        myg.getClass();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        myg.O(bundle, new bwg(myg, frameLayout, layoutInflater, viewGroup, bundle));
        if (((wu7) myg.a) == null) {
            f0.M(frameLayout);
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    public final void l2() {
        myg myg = this.l1;
        wu7 wu7 = (wu7) myg.a;
        if (wu7 != null) {
            wu7.c();
        } else {
            myg.N(1);
        }
        this.Q0 = true;
    }

    public final void m2() {
        myg myg = this.l1;
        wu7 wu7 = (wu7) myg.a;
        if (wu7 != null) {
            wu7.j();
        } else {
            myg.N(2);
        }
        this.Q0 = true;
    }

    public final void onLowMemory() {
        wu7 wu7 = (wu7) this.l1.a;
        if (wu7 != null) {
            wu7.onLowMemory();
        }
        this.Q0 = true;
    }

    public final void q2(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.Q0 = true;
            myg myg = this.l1;
            myg.x = activity;
            myg.P();
            GoogleMapOptions b = GoogleMapOptions.b(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", b);
            myg.O(bundle, new gvg(myg, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void t2() {
        myg myg = this.l1;
        wu7 wu7 = (wu7) myg.a;
        if (wu7 != null) {
            wu7.d();
        } else {
            myg.N(5);
        }
        this.Q0 = true;
    }

    public final void w2() {
        this.Q0 = true;
        myg myg = this.l1;
        myg.getClass();
        myg.O((Bundle) null, new hwg(myg, 1));
    }

    public final void x2(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        myg myg = this.l1;
        wu7 wu7 = (wu7) myg.a;
        if (wu7 != null) {
            wu7.i(bundle);
            return;
        }
        Bundle bundle2 = (Bundle) myg.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public final void y2() {
        this.Q0 = true;
        myg myg = this.l1;
        myg.getClass();
        myg.O((Bundle) null, new hwg(myg, 0));
    }

    public final void z2() {
        myg myg = this.l1;
        wu7 wu7 = (wu7) myg.a;
        if (wu7 != null) {
            wu7.f();
        } else {
            myg.N(4);
        }
        this.Q0 = true;
    }
}
