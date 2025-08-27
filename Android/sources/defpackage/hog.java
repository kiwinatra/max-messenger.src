package defpackage;

import android.view.WindowInsets;

/* renamed from: hog  reason: default package */
public abstract class hog {
    public static int a(int i) {
        int C;
        int i2 = 0;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    C = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    C = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    C = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    C = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    C = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    C = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    C = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    C = WindowInsets.Type.displayCutout();
                }
                i2 |= C;
            }
        }
        return i2;
    }
}
