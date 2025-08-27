package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: tgd  reason: default package */
public final class tgd extends View {
    public eu1 a;
    public Window b;
    public sgd c;

    /* access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.b;
        if (window == null) {
            return Float.NaN;
        }
        return window.getAttributes().screenBrightness;
    }

    /* access modifiers changed from: private */
    public void setBrightness(float f) {
        if (this.b != null && !Float.isNaN(f)) {
            WindowManager.LayoutParams attributes = this.b.getAttributes();
            attributes.screenBrightness = f;
            this.b.setAttributes(attributes);
        }
    }

    private void setScreenFlashUiInfo(x87 x87) {
        eu1 eu1 = this.a;
        if (eu1 != null) {
            qgd qgd = qgd.b;
            rgd rgd = new rgd(qgd, x87);
            rgd f = eu1.f();
            eu1.C.put(qgd, rgd);
            rgd f2 = eu1.f();
            if (f2 != null && !f2.equals(f)) {
                rgd f3 = eu1.f();
                if (f3 == null) {
                    y87 y87 = eu1.d;
                    cu1 cu1 = eu1.D;
                    y87.getClass();
                    ugd ugd = new ugd(cu1);
                    y87.t = ugd;
                    y87.d().g(ugd);
                    return;
                }
                y87 y872 = eu1.d;
                y872.getClass();
                ugd ugd2 = new ugd(f3.b);
                y872.t = ugd2;
                y872.d().g(ugd2);
                f3.a.name();
            }
        }
    }

    public x87 getScreenFlash() {
        return this.c;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000;
    }

    public void setController(eu1 eu1) {
        ev0.g();
        eu1 eu12 = this.a;
        if (!(eu12 == null || eu12 == eu1)) {
            setScreenFlashUiInfo((x87) null);
        }
        this.a = eu1;
        if (eu1 != null) {
            ev0.g();
            if (eu1.d.F() == 3 && this.b == null) {
                throw new IllegalStateException("No window set despite setting FLASH_MODE_SCREEN in CameraController");
            }
            setScreenFlashUiInfo(getScreenFlash());
        }
    }

    public void setScreenFlashWindow(Window window) {
        ev0.g();
        if (this.b != window) {
            this.c = window == null ? null : new sgd(this);
        }
        this.b = window;
        setScreenFlashUiInfo(getScreenFlash());
    }
}
