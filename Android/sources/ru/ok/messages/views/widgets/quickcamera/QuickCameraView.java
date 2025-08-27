package ru.ok.messages.views.widgets.quickcamera;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.ranges.RangesKt;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/messages/views/widgets/quickcamera/QuickCameraView;", "Landroid/widget/FrameLayout;", "", "alpha", "", "setBackgroundAlpha", "(F)V", "Lacc;", "delegate", "setDelegate", "(Lacc;)V", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class QuickCameraView extends FrameLayout {
    public static final /* synthetic */ int o = 0;
    public kag a;
    public final ao b = new ao(new jkb(11, (Object) this));
    public acc c;

    @JvmOverloads
    public QuickCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        View.inflate(context, ujc.view_quick_camera, this);
        setBackgroundColor(-16777216);
        CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) findViewById(lic.quick_camera_view__cv_camera);
    }

    /* access modifiers changed from: private */
    public final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (((float) KotlinVersion.MAX_COMPONENT_VALUE) * RangesKt.coerceAtLeast(RangesKt.coerceAtMost(f, 1.0f), (float) c44.DEFAULT_ASPECT_RATIO)));
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        kag kag = this.a;
        if (kag == null) {
            kag = null;
        }
        if (kag.g()) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        acc acc = this.c;
        if (!(acc != null ? ((b4a) acc).Z() : true)) {
            return false;
        }
        if (keyEvent.getKeyCode() != 25 && keyEvent.getKeyCode() != 24) {
            return false;
        }
        int action = keyEvent.getAction();
        if (action == 0) {
            return true;
        }
        if (action != 1) {
            return false;
        }
        acc acc2 = this.c;
        if (acc2 == null) {
            return true;
        }
        ((b4a) acc2).e0();
        return true;
    }

    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l5b l5b;
        acc acc = this.c;
        if (acc != null ? ((b4a) acc).Z() : true) {
            Rect rect = rcg.a;
            rcg.d(rect, this);
            if (rect.top == 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                acc acc2 = this.c;
                if (acc2 == null || (l5b = ((b4a) acc2).A0) == null) {
                    l5b = l5b.c;
                }
                ViewGroup viewGroup = (ViewGroup) getParent();
                int ordinal = l5b.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    layoutParams.width = viewGroup.getMeasuredWidth();
                } else {
                    layoutParams.height = viewGroup.getMeasuredHeight();
                }
                setLayoutParams(layoutParams);
            }
        }
        return super.onApplyWindowInsets(windowInsets);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        ao aoVar = this.b;
        aoVar.getClass();
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(aoVar, intentFilter);
    }

    public final void onDetachedFromWindow() {
        getContext().unregisterReceiver(this.b);
        super.onDetachedFromWindow();
        acc acc = this.c;
        if (acc != null) {
            b4a b4a = (b4a) acc;
            n5b n5b = b4a.w0;
            if (n5b != null) {
                n5b.b = null;
                n5b.disable();
                b4a.w0 = null;
            }
            b4a.q0();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        acc acc = this.c;
        if (!(acc != null ? ((b4a) acc).Z() : true)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        kag kag = this.a;
        if (kag == null) {
            kag = null;
        }
        return kag.q(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kag kag = this.a;
        if (kag == null) {
            kag = null;
        }
        kag.k(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public final void onWindowFocusChanged(boolean z) {
        acc acc;
        super.onWindowFocusChanged(z);
        if (z && (acc = this.c) != null) {
            b4a b4a = (b4a) acc;
            if (b4a.Z()) {
                z68.c("b4a", "onAttachedView: start camera for full mode", new Object[0]);
                if (b4a.w0 == null) {
                    b4a.w0 = new n5b((Context) b4a.b, b4a);
                }
                b4a.w0.enable();
                z68.c("b4a", "startPreviewCamera", new Object[0]);
                if (b4a.y0 == null) {
                    z3a z3a = new z3a(0, b4a);
                    b4a.y0 = z3a;
                    b4a.D0.setCameraListener(z3a);
                }
                b4a.D0.e();
                for (v1a v1a : (Set) b4a.a) {
                    ((ok8) v1a.b).t();
                }
            } else if (((View) b4a.c).getVisibility() == 0) {
                z68.c("b4a", "onAttachedView: start camera", new Object[0]);
                b4a.p0();
            }
        }
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        acc acc = this.c;
        if (!(acc != null ? ((b4a) acc).Z() : true)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void setDelegate(acc acc) {
        this.c = acc;
        this.a = new kag(getContext(), this, new ee7(this, acc));
    }
}
