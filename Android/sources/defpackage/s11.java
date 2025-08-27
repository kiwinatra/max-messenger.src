package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s11  reason: default package */
public final class s11 extends FrameLayout {
    public final kub a;
    public final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.NONE, new j6(17, this));

    public s11(Context context) {
        super(context, (AttributeSet) null, 0);
        kub kub = new kub(context);
        this.a = kub;
        addView(kub, -1, -1);
        r11 cameraPreviewController = getCameraPreviewController();
        cameraPreviewController.getClass();
        cvb cvb = cvb.f;
        cz1 A = kv0.A(context);
        A.d(new c(15, cameraPreviewController, A), iw3.a(context));
    }

    private final r11 getCameraPreviewController() {
        return (r11) this.b.getValue();
    }

    public final void a(boolean z, boolean z2) {
        if (Intrinsics.areEqual((Object) null, (Object) Boolean.valueOf(z)) && Intrinsics.areEqual((Object) null, (Object) Boolean.valueOf(z2))) {
            return;
        }
        if (z) {
            r11 cameraPreviewController = getCameraPreviewController();
            cvb cvb = cameraPreviewController.b;
            if (cvb != null) {
                if (cvb != null) {
                    cvb.f();
                }
                boolean z3 = !z2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                bs0.r("The specified lens facing is invalid.", !z3);
                linkedHashSet.add(new wt7(z3 ? 1 : 0));
                jv1 jv1 = new jv1(linkedHashSet);
                bub b2 = new d87(2).b();
                b2.E(this.a.getSurfaceProvider());
                cvb.c(cameraPreviewController.a, jv1, b2);
                return;
            }
            return;
        }
        cvb cvb2 = getCameraPreviewController().b;
        if (cvb2 != null) {
            cvb2.f();
        }
    }
}
