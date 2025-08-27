package defpackage;

import android.text.Editable;

/* renamed from: z15  reason: default package */
public final class z15 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile z15 b;
    public static Class c;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new fge(cls, charSequence) : super.newEditable(charSequence);
    }
}
