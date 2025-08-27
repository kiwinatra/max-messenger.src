package ru.ok.tracer.disk.usage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/disk/usage/DiskUsageInitializer;", "Lwf7;", "Ljs9;", "<init>", "()V", "tracer-disk-usage_release"}, k = 1, mv = {1, 7, 1})
public final class DiskUsageInitializer implements wf7 {
    public final List a() {
        return CollectionsKt.listOf(TracerInitializer.class);
    }

    public final Object b(Context context) {
        Lazy lazy = ipf.a;
        new Handler(Looper.getMainLooper()).post(new i40(new nn(context, 2), 6));
        return js9.b;
    }
}
