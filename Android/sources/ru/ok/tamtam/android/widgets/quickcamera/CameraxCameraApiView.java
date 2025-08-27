package ru.ok.tamtam.android.widgets.quickcamera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ok/tamtam/android/widgets/quickcamera/CameraxCameraApiView;", "Landroid/widget/FrameLayout;", "Lat1;", "", "getStatusBarHeight", "()I", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "Lnbc;", "sizeSelector", "", "setPictureSize", "(Lnbc;)V", "Lu7g;", "videoQuality", "setVideoQuality", "(Lu7g;)V", "Luu1;", "cameraListener", "setCameraListener", "(Luu1;)V", "", "flash", "setFlash", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "l", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nCameraxCameraApiView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraxCameraApiView.kt\nru/ok/tamtam/android/widgets/quickcamera/CameraxCameraApiView\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n*L\n1#1,244:1\n5#2:245\n5#2:246\n5#2:247\n5#2:248\n5#2:249\n5#2:250\n5#2:251\n5#2:252\n5#2:253\n5#2:254\n5#2:255\n*S KotlinDebug\n*F\n+ 1 CameraxCameraApiView.kt\nru/ok/tamtam/android/widgets/quickcamera/CameraxCameraApiView\n*L\n91#1:245\n96#1:246\n107#1:247\n117#1:248\n123#1:249\n149#1:250\n151#1:251\n172#1:252\n227#1:253\n161#1:254\n164#1:255\n*E\n"})
public final class CameraxCameraApiView extends FrameLayout implements at1 {
    public static final /* synthetic */ int x = 0;
    public final Executor a;
    public final kub b;
    public final mu7 c;
    public final tu1 o;
    public uu1 v;
    public nyc w;

    @JvmOverloads
    public CameraxCameraApiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
    }

    private final int getStatusBarHeight() {
        WindowInsets rootWindowInsets;
        Insets f;
        Window window;
        Context context = getContext();
        View view = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (!(activity == null || (window = activity.getWindow()) == null)) {
            view = window.getDecorView();
        }
        if (Build.VERSION.SDK_INT < 30) {
            Rect rect = new Rect();
            if (view != null) {
                view.getWindowVisibleDisplayFrame(rect);
            }
            return rect.top;
        } else if (view == null || (rootWindowInsets = view.getRootWindowInsets()) == null || (f = rootWindowInsets.getInsets(1)) == null) {
            return 0;
        } else {
            return f.top;
        }
    }

    public final void a(File file) {
        Class<CameraxCameraApiView> cls = CameraxCameraApiView.class;
        z68.c(cls.getName(), "startRecordVideo", new Object[0]);
        if (q8.d(getContext(), "android.permission.RECORD_AUDIO") != 0) {
            z68.p(cls.getName(), "No permission to record audio");
            return;
        }
        an5 v2 = new grg(file).v();
        a0 a0Var = new a0(1, this);
        mu7 mu7 = this.c;
        mu7.getClass();
        ev0.g();
        bs0.r("Camera not initialized.", mu7.j());
        ev0.g();
        boolean z = false;
        bs0.r("VideoCapture disabled.", (mu7.b & 4) != 0);
        ev0.g();
        nyc nyc = mu7.g;
        if (nyc != null && !nyc.a.get()) {
            z = true;
        }
        bs0.r("Recording video. Only one recording can be active at a time.", !z);
        Context context = mu7.B;
        du1 du1 = new du1(mu7, iw3.a(context), a0Var);
        gy0 gy0 = new gy0(context, (lyc) mu7.f.J(), v2);
        if (i8b.h(context, "android.permission.RECORD_AUDIO") != -1) {
            gy0.x();
            nyc u = gy0.u(this.a, du1);
            mu7.h.put(du1, u);
            mu7.g = u;
            this.w = u;
            return;
        }
        throw new SecurityException("Attempted to start recording with audio, but application does not have RECORD_AUDIO permission granted.");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl, java.lang.Exception] */
    public final void b() {
        try {
            this.c.m(1);
        } catch (IllegalStateException e) {
            z68.f(CameraxCameraApiView.class.getName(), "failed to enable photo-mode", e);
            uu1 uu1 = this.v;
            if (uu1 != null) {
                uu1.h(new Exception(e));
            }
        }
    }

    public final void c() {
        z68.c(CameraxCameraApiView.class.getName(), "destroyCamera", new Object[0]);
        mu7 mu7 = this.c;
        mu7.getClass();
        ev0.g();
        mu7.E = null;
        mu7.m = null;
        dvb dvb = mu7.n;
        if (dvb != null) {
            dvb.a.f();
        }
        this.o.b.e(hu7.ON_DESTROY);
    }

    public final void d(ExecutorService executorService) {
        z68.c(CameraxCameraApiView.class.getName(), "takePicture", new Object[0]);
        xv1 xv1 = new xv1(0, (Object) this);
        mu7 mu7 = this.c;
        mu7.getClass();
        ev0.g();
        bs0.r("Camera not initialized.", mu7.j());
        ev0.g();
        boolean z = true;
        if ((mu7.b & 1) == 0) {
            z = false;
        }
        bs0.r("ImageCapture disabled.", z);
        ev0.g();
        if (mu7.d.F() == 3 && (mu7.f() == null || mu7.f().b == null)) {
            throw new IllegalStateException("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
        }
        mu7.d.H(executorService, xv1);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl, java.lang.Exception] */
    public final void e() {
        tu1 tu1 = this.o;
        mu7 mu7 = this.c;
        Class<CameraxCameraApiView> cls = CameraxCameraApiView.class;
        z68.c(cls.getName(), "startPreviewCamera", new Object[0]);
        try {
            mu7.getClass();
            ev0.g();
            mu7.E = tu1;
            mu7.r((Runnable) null);
            tu1.b.e(hu7.ON_RESUME);
        } catch (IllegalStateException e) {
            z68.f(cls.getName(), "failed to bind camera controller, start preview aborted", e);
            mu7.getClass();
            ev0.g();
            mu7.E = null;
            mu7.m = null;
            dvb dvb = mu7.n;
            if (dvb != null) {
                dvb.a.f();
            }
            uu1 uu1 = this.v;
            if (uu1 != null) {
                uu1.h(new Exception(e));
            }
        }
    }

    public final void f(boolean z) {
        this.c.l(z ? jv1.b : jv1.c);
    }

    public final boolean g() {
        mu7 mu7 = this.c;
        mu7.getClass();
        ev0.g();
        return mu7.d.F() == 2;
    }

    public View getRootView() {
        return this;
    }

    public final boolean h() {
        return this.c.h(jv1.c);
    }

    public final void i() {
        z68.c(CameraxCameraApiView.class.getName(), "stopRecordVideo", new Object[0]);
        nyc nyc = this.w;
        if (nyc != null) {
            nyc.close();
        }
        this.w = null;
    }

    public final boolean j() {
        u08 a2;
        fa0 fa0;
        mu7 mu7 = this.c;
        mu7.getClass();
        ev0.g();
        lu7 lu7 = mu7.m;
        p4d p4d = lu7 == null ? null : lu7.c.A0;
        int i = (p4d == null || (a2 = p4d.a.a()) == null || (fa0 = (fa0) a2.d()) == null) ? 0 : fa0.a;
        return i == 3 || i == 2;
    }

    public final void k() {
        z68.c(CameraxCameraApiView.class.getName(), "stopPreviewCamera", new Object[0]);
        this.o.b.e(hu7.ON_STOP);
    }

    public final void l() {
        this.c.m(4);
    }

    public final boolean m() {
        jv1 jv1 = jv1.c;
        mu7 mu7 = this.c;
        return mu7.h(jv1) && mu7.h(jv1.b);
    }

    public final boolean n() {
        mu7 mu7 = this.c;
        mu7.getClass();
        ev0.g();
        return mu7.d.F() == 0;
    }

    public final boolean o() {
        mu7 mu7 = this.c;
        mu7.getClass();
        ev0.g();
        lu7 lu7 = mu7.m;
        p4d p4d = lu7 == null ? null : lu7.c.A0;
        return p4d != null && p4d.a.h() == 0;
    }

    public void setCameraListener(uu1 uu1) {
        this.v = uu1;
    }

    public void setFlash(String str) {
        int ordinal = zs1.valueOf(str).ordinal();
        int i = 2;
        if (ordinal != 0) {
            int i2 = 1;
            if (ordinal != 1) {
                i2 = 0;
                if (!(ordinal == 2 || ordinal == 3)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            i = i2;
        }
        this.c.n(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    public void setPictureSize(nbc nbc) {
    }

    public void setVideoQuality(u7g u7g) {
        int ordinal = u7g.ordinal();
        mu7 mu7 = this.c;
        switch (ordinal) {
            case 0:
                mu7.o(zqd.t(yb0.h));
                return;
            case 1:
                mu7.o(zqd.t(yb0.i));
                return;
            case 2:
                mu7.o(zqd.t(yb0.h));
                return;
            case 3:
                mu7.o(zqd.t(yb0.d));
                return;
            case 4:
                mu7.o(zqd.t(yb0.e));
                return;
            case 5:
                mu7.o(zqd.t(yb0.f));
                return;
            case 6:
                mu7.o(zqd.t(yb0.g));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [eu1, mu7] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraxCameraApiView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        this.a = iw3.a(context);
        kub kub = new kub(context);
        this.b = kub;
        ? eu1 = new eu1(context);
        this.c = eu1;
        tu1 tu1 = new tu1();
        this.o = tu1;
        kub.setKeepScreenOn(true);
        addView(kub, new FrameLayout.LayoutParams(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels + getStatusBarHeight()));
        kub.getPreviewStreamState().e(tu1, new wv1(0, new l(20, this)));
        kub.setImplementationMode(hub.COMPATIBLE);
        eu1.l(jv1.c);
        eu1.m(1);
        kub.getViewPort();
        ev0.g();
        eu1.t = true;
        kub.setController(eu1);
    }
}
