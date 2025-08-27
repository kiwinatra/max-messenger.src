package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;

/* renamed from: ne  reason: default package */
public final class ne implements urg {
    public final qt1 a;
    public final Range b;
    public float c = 1.0f;
    public do1 o;
    public float v = 1.0f;
    public final boolean w;

    public ne(qt1 qt1) {
        boolean z = false;
        this.w = false;
        this.a = qt1;
        this.b = (Range) qt1.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        if (Build.VERSION.SDK_INT >= 34) {
            int[] iArr = (int[]) ((CameraCharacteristics) qt1.b.b).get(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES);
            if (iArr != null) {
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (iArr[i] == 1) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.w = z;
    }

    public final void a(TotalCaptureResult totalCaptureResult) {
        if (this.o != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Float f = request == null ? null : (Float) request.get(CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f != null) {
                if (this.v == f.floatValue()) {
                    this.o.b((Object) null);
                    this.o = null;
                }
            }
        }
    }

    public final void d(vs6 vs6) {
        vs6.w(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(this.c));
        if (this.w && Build.VERSION.SDK_INT >= 34) {
            vs6.w(CaptureRequest.CONTROL_SETTINGS_OVERRIDE, 1);
        }
    }

    public final float e() {
        return ((Float) this.b.getUpper()).floatValue();
    }

    public final float f() {
        return ((Float) this.b.getLower()).floatValue();
    }

    public final Rect h() {
        Rect rect = (Rect) this.a.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public final void k(float f, do1 do1) {
        this.c = f;
        do1 do12 = this.o;
        if (do12 != null) {
            do12.d(new Exception("There is a new zoomRatio being set"));
        }
        this.v = this.c;
        this.o = do1;
    }

    public final void l() {
        this.c = 1.0f;
        do1 do1 = this.o;
        if (do1 != null) {
            do1.d(new Exception("Camera is not active."));
            this.o = null;
        }
    }
}
