package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;

/* renamed from: dc3  reason: default package */
public class dc3 extends Dialog implements jv7, gma, odd {
    public lv7 a;
    public final ndd b = new ndd(this);
    public final fma c = new fma(new pr1(18, this));

    public dc3(Context context, int i) {
        super(context, i);
    }

    public static void a(dc3 dc3) {
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addContentView(view, layoutParams);
    }

    public final lv7 b() {
        lv7 lv7 = this.a;
        if (lv7 != null) {
            return lv7;
        }
        lv7 lv72 = new lv7(this);
        this.a = lv72;
        return lv72;
    }

    public final void c() {
        q8.M(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(wic.view_tree_on_back_pressed_dispatcher_owner, this);
        iq.V(getWindow().getDecorView(), this);
    }

    public final ju7 getLifecycle() {
        return b();
    }

    public final mdd getSavedStateRegistry() {
        return this.b.b;
    }

    public final void onBackPressed() {
        this.c.d();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher k = getOnBackInvokedDispatcher();
            fma fma = this.c;
            fma.e = k;
            fma.e(fma.g);
        }
        this.b.b(bundle);
        b().e(hu7.ON_CREATE);
    }

    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        this.b.c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    public void onStart() {
        super.onStart();
        b().e(hu7.ON_RESUME);
    }

    public void onStop() {
        b().e(hu7.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    public void setContentView(View view) {
        c();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.setContentView(view, layoutParams);
    }
}
