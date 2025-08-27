package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* renamed from: snf  reason: default package */
public final class snf {
    public static WeakReference c;
    public soc a;
    public final Executor b;

    public snf(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized rnf a() {
        String str;
        rnf rnf;
        soc soc = this.a;
        synchronized (((ArrayDeque) soc.v)) {
            str = (String) ((ArrayDeque) soc.v).peek();
        }
        Pattern pattern = rnf.d;
        rnf = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                rnf = new rnf(split[0], split[1]);
            }
        }
        return rnf;
    }
}
