package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: iw3  reason: default package */
public abstract class iw3 {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}
