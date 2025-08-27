package defpackage;

import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: ota  reason: default package */
public final class ota implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeDraweeView b;

    public /* synthetic */ ota(OneMeDraweeView oneMeDraweeView, int i) {
        this.a = i;
        this.b = oneMeDraweeView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                OneMeDraweeView oneMeDraweeView = this.b;
                oneMeDraweeView.requestLayout();
                oneMeDraweeView.invalidate();
                return;
            case 1:
                OneMeDraweeView oneMeDraweeView2 = this.b;
                oneMeDraweeView2.requestLayout();
                oneMeDraweeView2.invalidate();
                return;
            case 2:
                OneMeDraweeView oneMeDraweeView3 = this.b;
                oneMeDraweeView3.requestLayout();
                oneMeDraweeView3.invalidate();
                return;
            default:
                OneMeDraweeView oneMeDraweeView4 = this.b;
                oneMeDraweeView4.requestLayout();
                oneMeDraweeView4.invalidate();
                return;
        }
    }
}
