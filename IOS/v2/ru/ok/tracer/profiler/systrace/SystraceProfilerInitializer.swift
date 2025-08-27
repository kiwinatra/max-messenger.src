package ru.ok.tracer.profiler.systrace;

import android.content.Context;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/profiler/systrace/SystraceProfilerInitializer;", "Lwf7;", "Lh8f;", "<init>", "()V", "tracer-profiler-systrace_release"}, k = 1, mv = {1, 7, 1})
@Deprecated(message = "Not needed")
public final class SystraceProfilerInitializer implements wf7 {
    public final List a() {
        return CollectionsKt.listOf(TracerInitializer.class);
    }

    public final Object b(Context context) {
        return h8f.a;
    }
}
