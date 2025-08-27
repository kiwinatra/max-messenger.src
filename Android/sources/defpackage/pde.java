package defpackage;

import android.util.Size;

/* renamed from: pde  reason: default package */
public abstract class pde {
    public static final Size a = new Size(0, 0);
    public static final Size b = new Size(320, 240);
    public static final Size c = new Size(640, 480);
    public static final Size d = new Size(720, 480);
    public static final Size e = new Size(1280, 720);
    public static final Size f = new Size(1920, 1080);
    public static final Size g = new Size(1920, 1440);

    public static int a(Size size) {
        return size.getHeight() * size.getWidth();
    }
}
