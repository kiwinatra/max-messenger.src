package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lxf7;", "Ljv7;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
public final class ProcessLifecycleInitializer implements xf7 {
    public final List a() {
        return CollectionsKt.emptyList();
    }

    public final Object b(Context context) {
        if (((HashSet) w28.J(context).c).contains(ProcessLifecycleInitializer.class)) {
            if (!yu7.a.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new xu7());
            }
            ivb ivb = ivb.y;
            ivb.getClass();
            ivb.v = new Handler();
            ivb.w.e(hu7.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new hvb(ivb));
            return ivb;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
