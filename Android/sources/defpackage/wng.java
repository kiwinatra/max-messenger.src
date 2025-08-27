package defpackage;

import android.view.View;
import java.lang.reflect.Field;

/* renamed from: wng  reason: default package */
public abstract class wng {
    public static final Field a;
    public static final Field b;
    public static final Field c;
    public static final boolean d = true;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            c = declaredField3;
            declaredField3.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
    }
}
