package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.camera.camera2.internal.compat.quirk.SmallDisplaySizeQuirk;
import java.util.Locale;

/* renamed from: hq4  reason: default package */
public final class hq4 {
    public static final Size e = new Size(1920, 1080);
    public static final Size f = new Size(320, 240);
    public static final Size g = new Size(640, 480);
    public static final Object h = new Object();
    public static volatile hq4 i;
    public final DisplayManager a;
    public volatile Size b = null;
    public final vs6 c = new vs6(27);
    public final vs6 d = new vs6(18);

    public hq4(Context context) {
        this.a = (DisplayManager) context.getSystemService("display");
    }

    public static hq4 b(Context context) {
        if (i == null) {
            synchronized (h) {
                try {
                    if (i == null) {
                        i = new hq4(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return i;
    }

    public static Display d(Display[] displayArr, boolean z) {
        Display display = null;
        int i2 = -1;
        for (Display display2 : displayArr) {
            if (!z || display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i3 = point.x * point.y;
                if (i3 > i2) {
                    display = display2;
                    i2 = i3;
                }
            }
        }
        return display;
    }

    public final Size a() {
        Size e2;
        Point point = new Point();
        c(false).getRealSize(point);
        Size size = new Size(point.x, point.y);
        Size size2 = pde.a;
        if (size.getHeight() * size.getWidth() < pde.a(f)) {
            size = ((SmallDisplaySizeQuirk) this.d.b) != null ? (Size) SmallDisplaySizeQuirk.a.get(Build.MODEL.toUpperCase(Locale.US)) : null;
            if (size == null) {
                size = g;
            }
        }
        if (size.getHeight() > size.getWidth()) {
            size = new Size(size.getHeight(), size.getWidth());
        }
        int height = size.getHeight() * size.getWidth();
        Size size3 = e;
        if (height > size3.getHeight() * size3.getWidth()) {
            size = size3;
        }
        if (((ExtraCroppingQuirk) this.c.b) == null || (e2 = ExtraCroppingQuirk.e(1)) == null) {
            return size;
        }
        return e2.getHeight() * e2.getWidth() > size.getHeight() * size.getWidth() ? e2 : size;
    }

    public final Display c(boolean z) {
        Display[] displays = this.a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display d2 = d(displays, z);
        if (d2 == null && z) {
            d2 = d(displays, false);
        }
        if (d2 != null) {
            return d2;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public final Size e() {
        if (this.b != null) {
            return this.b;
        }
        this.b = a();
        return this.b;
    }
}
