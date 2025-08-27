package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;

/* renamed from: oc6  reason: default package */
public final class oc6 extends ld8 implements jma, yma, oma, pma, hbg, gma, f9, odd, gd6, o69 {
    public final Activity v0;
    public final Context w0;
    public final Handler x0;
    public final ed6 y0 = new c();
    public final /* synthetic */ b z0;

    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.fragment.app.c, ed6] */
    public oc6(b bVar) {
        this.z0 = bVar;
        Handler handler = new Handler();
        this.v0 = bVar;
        this.w0 = bVar;
        this.x0 = handler;
    }

    public final void D0(j79 j79) {
        this.z0.addMenuProvider(j79);
    }

    public final void E0(tk3 tk3) {
        this.z0.addOnConfigurationChangedListener(tk3);
    }

    public final void F0(tk3 tk3) {
        this.z0.addOnMultiWindowModeChangedListener(tk3);
    }

    public final void G0(tk3 tk3) {
        this.z0.addOnPictureInPictureModeChangedListener(tk3);
    }

    public final void H0(tk3 tk3) {
        this.z0.addOnTrimMemoryListener(tk3);
    }

    public final void I0(j79 j79) {
        this.z0.removeMenuProvider(j79);
    }

    public final void J0(tk3 tk3) {
        this.z0.removeOnConfigurationChangedListener(tk3);
    }

    public final void K0(tk3 tk3) {
        this.z0.removeOnMultiWindowModeChangedListener(tk3);
    }

    public final void L0(tk3 tk3) {
        this.z0.removeOnPictureInPictureModeChangedListener(tk3);
    }

    public final void M0(tk3 tk3) {
        this.z0.removeOnTrimMemoryListener(tk3);
    }

    public final void a(a aVar) {
        this.z0.getClass();
    }

    public final ju7 getLifecycle() {
        return this.z0.b;
    }

    public final mdd getSavedStateRegistry() {
        return this.z0.getSavedStateRegistry();
    }

    public final gbg getViewModelStore() {
        return this.z0.getViewModelStore();
    }

    public final View h0(int i) {
        return this.z0.findViewById(i);
    }

    public final boolean i0() {
        Window window = this.z0.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
