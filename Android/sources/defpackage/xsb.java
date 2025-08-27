package defpackage;

import android.view.Window;
import android.view.WindowInsets;

/* renamed from: xsb  reason: default package */
public abstract class xsb {
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
