package defpackage;

import one.me.sdk.zoom.ZoomableDraweeView;

/* renamed from: csg  reason: default package */
public final /* synthetic */ class csg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ZoomableDraweeView b;

    public /* synthetic */ csg(ZoomableDraweeView zoomableDraweeView, int i) {
        this.a = i;
        this.b = zoomableDraweeView;
    }

    public final void run() {
        ZoomableDraweeView zoomableDraweeView = this.b;
        switch (this.a) {
            case 0:
                int i = ZoomableDraweeView.D0;
                zoomableDraweeView.requestLayout();
                zoomableDraweeView.invalidate();
                return;
            case 1:
                int i2 = ZoomableDraweeView.D0;
                zoomableDraweeView.requestLayout();
                zoomableDraweeView.invalidate();
                return;
            default:
                int i3 = ZoomableDraweeView.D0;
                bg5.f(ZoomableDraweeView.class, Integer.valueOf(zoomableDraweeView.hashCode()), "onRelease: view %x");
                ik4 ik4 = (ik4) zoomableDraweeView.C0;
                ik4.c = false;
                ik4.reset();
                return;
        }
    }
}
