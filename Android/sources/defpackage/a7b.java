package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: a7b  reason: default package */
public abstract class a7b {
    public static final String a = h88.V("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z) {
        String str = "disabled";
        String str2 = a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            h88 x = h88.x();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z ? "enabled" : str);
            x.p(str2, sb.toString());
        } catch (Exception e) {
            h88 x2 = h88.x();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z) {
                str = "enabled";
            }
            sb2.append(str);
            x2.q(str2, sb2.toString(), e);
        }
    }
}
