package ru.ok.tracer.performance.metrics;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import ru.ok.tracer.TracerInitializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/tracer/performance/metrics/PerformanceMetricsInitializer;", "Lwf7;", "Lfpf;", "<init>", "()V", "tracer-performance-metrics_release"}, k = 1, mv = {1, 7, 1})
public final class PerformanceMetricsInitializer implements wf7 {
    public final List a() {
        return CollectionsKt.listOf(TracerInitializer.class);
    }

    public final Object b(Context context) {
        fpf fpf = fpf.a;
        kof kof = kof.a;
        Object obj = kof.c().get(n54.b);
        dcb dcb = obj instanceof dcb ? (dcb) obj : null;
        if (dcb == null) {
            dcb = new dcb(new ni0(14));
        }
        if (dcb.a) {
            fpf.b = new cpf();
            ipf.a(new nn(context, 6));
        }
        return fpf.a;
    }
}
