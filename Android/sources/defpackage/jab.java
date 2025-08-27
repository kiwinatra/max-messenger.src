package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: jab  reason: default package */
public final class jab {
    public static final String b;
    public final Context a;

    static {
        String str = File.separator;
        b = str + "copy" + str + "media";
    }

    public jab(Context context) {
        this.a = context;
    }
}
