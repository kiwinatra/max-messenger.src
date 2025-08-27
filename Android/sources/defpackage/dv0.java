package defpackage;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.JvmStatic;

/* renamed from: dv0  reason: default package */
public abstract class dv0 {
    @JvmStatic
    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    @JvmStatic
    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
