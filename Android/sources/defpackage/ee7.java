package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import ru.ok.messages.calls.views.IncomingButtonsLayout;
import ru.ok.messages.calls.views.IncomingCallControlsView;
import ru.ok.messages.views.widgets.quickcamera.QuickCameraView;

/* renamed from: ee7  reason: default package */
public final class ee7 extends fqc {
    public final /* synthetic */ int h = 0;
    public View i;
    public final /* synthetic */ Object j;

    public ee7(IncomingButtonsLayout incomingButtonsLayout) {
        this.j = incomingButtonsLayout;
    }

    public void F(View view, int i2) {
        switch (this.h) {
            case 0:
                IncomingButtonsLayout incomingButtonsLayout = (IncomingButtonsLayout) this.j;
                if (!((IncomingCallControlsView) incomingButtonsLayout.b).z0) {
                    view.animate().scaleX(1.2f).scaleY(1.2f).setDuration(200).start();
                    ((IncomingCallControlsView) incomingButtonsLayout.b).g(view);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void G(int i2) {
        View view;
        switch (this.h) {
            case 0:
                if (i2 == 0 && (view = this.i) != null) {
                    IncomingCallControlsView incomingCallControlsView = (IncomingCallControlsView) ((IncomingButtonsLayout) this.j).b;
                    if (!incomingCallControlsView.z0) {
                        ImageButton imageButton = incomingCallControlsView.b;
                        incomingCallControlsView.k(view == imageButton ? incomingCallControlsView.v : view == incomingCallControlsView.o ? incomingCallControlsView.w : incomingCallControlsView.x, view == imageButton ? incomingCallControlsView.y : view == incomingCallControlsView.o ? incomingCallControlsView.z : incomingCallControlsView.v0, 0, true);
                        incomingCallControlsView.j(view, 2, 0);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void H(View view, int i2, int i3, int i4) {
        switch (this.h) {
            case 0:
                IncomingButtonsLayout incomingButtonsLayout = (IncomingButtonsLayout) this.j;
                boolean z = true;
                if (incomingButtonsLayout.a.a == 1) {
                    float abs = 1.0f - Math.abs(((float) i3) / ((float) ((int) (((float) view.getHeight()) * 1.5f))));
                    if (Math.abs(view.getTop()) < ((int) (((float) view.getHeight()) * 1.5f)) - (view.getHeight() / 5)) {
                        z = false;
                    }
                    ((IncomingCallControlsView) incomingButtonsLayout.b).h(abs, view, z);
                    return;
                }
                return;
            default:
                QuickCameraView quickCameraView = (QuickCameraView) this.i;
                kag kag = quickCameraView.a;
                if (kag == null) {
                    kag = null;
                }
                if (kag.a == 1) {
                    quickCameraView.setBackgroundAlpha(i3 > 0 ? Math.abs(1.0f - (((float) i3) / ((float) quickCameraView.getMeasuredHeight()))) : Math.abs(((float) (quickCameraView.getBottom() + i3)) / ((float) quickCameraView.getMeasuredHeight())));
                    return;
                }
                return;
        }
    }

    public final void I(View view, float f, float f2) {
        Object obj = this.j;
        switch (this.h) {
            case 0:
                IncomingButtonsLayout incomingButtonsLayout = (IncomingButtonsLayout) obj;
                if (!((IncomingCallControlsView) incomingButtonsLayout.b).z0) {
                    int i2 = IncomingButtonsLayout.c;
                    z68.c("ru.ok.messages.calls.views.IncomingButtonsLayout", "onViewReleased yvel: " + f2, new Object[0]);
                    if (f2 < -2000.0f) {
                        z68.c("ru.ok.messages.calls.views.IncomingButtonsLayout", "onViewReleased: enough velocity to complete action", new Object[0]);
                        ((IncomingCallControlsView) incomingButtonsLayout.b).h(1.0f - Math.abs(((float) view.getTop()) / ((float) ((int) (((float) view.getHeight()) * 1.5f)))), view, true);
                    }
                    this.i = view;
                    ((IncomingCallControlsView) incomingButtonsLayout.b).i(view);
                    incomingButtonsLayout.a.p(view.getLeft(), 0);
                    for (int i3 = 0; i3 < incomingButtonsLayout.getChildCount(); i3++) {
                        incomingButtonsLayout.getChildAt(i3).clearAnimation();
                    }
                    view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start();
                    return;
                }
                return;
            default:
                QuickCameraView quickCameraView = (QuickCameraView) this.i;
                ViewGroup viewGroup = (ViewGroup) quickCameraView.getParent();
                if (Math.abs(f2) > 1000.0f || view.getY() > ((float) viewGroup.getMeasuredHeight()) / 6.0f || ((float) view.getBottom()) < ((float) viewGroup.getMeasuredHeight()) * 0.9f) {
                    quickCameraView.setY(view.getY());
                    acc acc = (acc) obj;
                    if (acc != null) {
                        z68.a("b4a", "closeFullScreenMode");
                        ((b4a) acc).N(new l3a(7));
                        return;
                    }
                    return;
                }
                kag kag = quickCameraView.a;
                if (kag == null) {
                    kag = null;
                }
                kag.p(view.getLeft(), 0);
                quickCameraView.invalidate();
                return;
        }
    }

    public final boolean Q(View view, int i2) {
        switch (this.h) {
            case 0:
                return true;
            default:
                acc acc = ((QuickCameraView) this.i).c;
                if (acc != null) {
                    b4a b4a = (b4a) acc;
                    return b4a.Z() && !b4a.Y0 && b4a.Z0 != 3 && view.getId() == lic.quick_camera_view__fl_root;
                }
        }
    }

    public int f(View view, int i2) {
        switch (this.h) {
            case 0:
                return view.getLeft();
            default:
                return super.f(view, i2);
        }
    }

    public final int g(View view, int i2) {
        switch (this.h) {
            case 0:
                return (i2 > 0 || Math.abs(i2) > ((int) (((float) view.getHeight()) * 1.5f))) ? view.getTop() : i2;
            default:
                return i2;
        }
    }

    public int t(View view) {
        switch (this.h) {
            case 0:
                return 0;
            default:
                return super.t(view);
        }
    }

    public final int u(View view) {
        switch (this.h) {
            case 0:
                return 1;
            default:
                return ((QuickCameraView) this.i).getMeasuredHeight();
        }
    }

    public ee7(QuickCameraView quickCameraView, acc acc) {
        this.i = quickCameraView;
        this.j = acc;
    }
}
