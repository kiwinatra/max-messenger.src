package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.view.OrientationEventListener;

/* renamed from: n5b  reason: default package */
public final class n5b extends OrientationEventListener {
    public static final /* synthetic */ int d = 0;
    public final Context a;
    public b4a b;
    public l5b c;

    public n5b(Context context, b4a b4a) {
        super(context, 3);
        this.a = context;
        this.b = b4a;
    }

    public final void onOrientationChanged(int i) {
        b4a b4a;
        if (i != -1) {
            Context context = this.a;
            l5b l5b = hd8.x(context) == 1 ? (i < 60 || i > 140) ? (i < 140 || i > 220) ? (i < 220 || i > 300) ? l5b.c : l5b.b : l5b.o : l5b.a : (i < 60 || i > 140) ? (i < 140 || i > 220) ? (i < 220 || i > 300) ? l5b.b : l5b.o : l5b.a : l5b.c;
            boolean z = false;
            if (Settings.System.getInt(context.getContentResolver(), "accelerometer_rotation", 0) == 1) {
                z = true;
            }
            if (!z) {
                l5b l5b2 = this.c;
                if (l5b2 == null || l5b == l5b2) {
                    int i2 = context.getResources().getConfiguration().orientation;
                    if (i2 != 0) {
                        l5b = i2 != 1 ? i2 != 2 ? null : m5b.$EnumSwitchMapping$0[l5b.ordinal()] == 1 ? l5b.a : l5b.b : m5b.$EnumSwitchMapping$0[l5b.ordinal()] == 2 ? l5b.o : l5b.c;
                    }
                    this.c = l5b;
                    b4a b4a2 = this.b;
                    if (b4a2 != null) {
                        b4a2.g0(l5b);
                        return;
                    }
                    return;
                }
                return;
            }
            l5b l5b3 = this.c;
            if (l5b3 != null && (l5b == l5b3 || ((b4a = this.b) != null && ((m5) ((Context) b4a.b)).getRequestedOrientation() == -1))) {
                if (l5b != this.c) {
                    int i3 = context.getResources().getConfiguration().orientation;
                    if (i3 != 2 || (l5b != l5b.c && l5b != l5b.o)) {
                        if (i3 == 1 && (l5b == l5b.b || l5b == l5b.a)) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.c = l5b;
            b4a b4a3 = this.b;
            if (b4a3 != null) {
                b4a3.g0(l5b);
            }
        }
    }
}
