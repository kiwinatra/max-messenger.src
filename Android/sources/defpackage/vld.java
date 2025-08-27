package defpackage;

import android.view.View;

/* renamed from: vld  reason: default package */
public final class vld implements View.OnFocusChangeListener {
    public final /* synthetic */ gmd a;

    public vld(gmd gmd) {
        this.a = gmd;
    }

    public final void onFocusChange(View view, boolean z) {
        gmd gmd = this.a;
        View.OnFocusChangeListener onFocusChangeListener = gmd.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(gmd, z);
        }
    }
}
