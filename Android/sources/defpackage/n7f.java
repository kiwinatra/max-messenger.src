package defpackage;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: n7f  reason: default package */
public final class n7f {
    public static final String b = h88.V("SystemJobInfoConverter");
    public final ComponentName a;

    public n7f(Context context) {
        this.a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
