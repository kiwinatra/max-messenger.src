package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.uuid.Uuid;

/* renamed from: hn4  reason: default package */
public final class hn4 extends fn4 {
    public static int m = -1;
    public static Size n;
    public final cxe g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public e0g k;
    public final AtomicReference l = new AtomicReference((Object) null);

    public hn4(Context context, jtb jtb, cxe cxe, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        super(context, jtb, lazy3);
        this.g = cxe;
        this.h = lazy;
        this.i = lazy2;
        this.j = lazy3;
    }

    public static final boolean i(Context context) {
        return 2 == hd8.K(context);
    }

    public static final void j(Activity activity, l5b l5b) {
        int i2;
        int ordinal = l5b.ordinal();
        if (ordinal != 0) {
            i2 = 1;
            if (ordinal == 1) {
                i2 = 0;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    z68.f("hn4", "Didn't find this orientation, so return ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED", (Throwable) null);
                    i2 = -1;
                } else {
                    i2 = 9;
                }
            }
        } else {
            i2 = 8;
        }
        if (i2 != -1) {
            activity.setRequestedOrientation(i2);
        }
    }

    public static Size k(Context context) {
        Size size = n;
        if (size == null) {
            size = new Size(h88.A(context).getWidth(), h88.A(context).getHeight());
        }
        n = size;
        return size;
    }

    public static final void l(Activity activity, boolean z) {
        if (activity != null) {
            if (z) {
                activity.getWindow().addFlags(Uuid.SIZE_BITS);
            } else {
                activity.getWindow().clearFlags(Uuid.SIZE_BITS);
            }
        }
    }

    public final boolean c() {
        udg udg = (udg) this.j.getValue();
        return udg != null && udg.h > 0;
    }

    public final void e() {
        Lazy lazy = this.h;
        ((vpa) lazy.getValue()).getClass();
        ((vpa) lazy.getValue()).getClass();
    }

    public final void f(String str) {
        udg udg = (udg) this.j.getValue();
        if (udg != null) {
            z68.c("udg", "onForegroundServiceStarted: %s", str);
            udg.h++;
        }
    }

    public final void g(String str) {
        int i2;
        udg udg = (udg) this.j.getValue();
        if (udg != null) {
            z68.c("udg", "onForegroundServiceStropped: %s", str);
            int i3 = udg.h;
            if (i3 <= 0) {
                i2 = 0;
            } else {
                i2 = i3 - 1;
                udg.h = i2;
            }
            udg.h = i2;
        }
    }

    public final e0g h() {
        String str;
        jtb jtb = this.b;
        ((ltb) jtb).a.j.getClass();
        h2g.a.c().getClass();
        ((vpa) this.h.getValue()).getClass();
        e0g e0g = this.k;
        if (!Intrinsics.areEqual((Object) e0g != null ? e0g.b : null, (Object) "25.6.4")) {
            this.k = null;
        }
        e0g e0g2 = this.k;
        if (e0g2 == null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.ENGLISH, "Android %s", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE}, 1));
            String q = ((ltb) jtb).a.q();
            if (cvg.A(q)) {
                q = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            }
            String language = Resources.getSystem().getConfiguration().getLocales().get(0).getLanguage();
            String i2 = g63.i(Build.MANUFACTURER, " ", Build.MODEL);
            DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
            int i3 = displayMetrics.densityDpi;
            if (i3 == 120) {
                str = "ldpi";
            } else if (i3 == 160) {
                str = "mdpi";
            } else if (i3 == 240) {
                str = "hdpi";
            } else if (i3 == 320) {
                str = "xhdpi";
            } else if (i3 == 480) {
                str = "xxhdpi";
            } else if (i3 != 640) {
                str = i3 + "dpi";
            } else {
                str = "xxxhdpi";
            }
            this.g.getClass();
            e0g2 = new e0g(format, q, language, i2, str + " " + i3 + "dpi " + displayMetrics.widthPixels + "x" + displayMetrics.heightPixels);
            this.k = e0g2;
        }
        return e0g2;
    }

    public final int m() {
        int i2 = m;
        if (i2 != -1) {
            return i2;
        }
        Context context = this.a;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
        m = dimensionPixelSize;
        return dimensionPixelSize;
    }
}
