package defpackage;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: vgd  reason: default package */
public abstract /* synthetic */ class vgd {
    public static /* synthetic */ WindowInsetsAnimation.Bounds i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation j(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation k(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInlineVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.visitors.MethodInlineVisitor.inlineMth(MethodInlineVisitor.java:57)
        	at jadx.core.dex.visitors.MethodInlineVisitor.visit(MethodInlineVisitor.java:47)
        */
    public static /* synthetic */ void n() {
        /*
            android.view.WindowInsetsAnimation$Bounds r0 = new android.view.WindowInsetsAnimation$Bounds
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vgd.n():void");
    }
}
