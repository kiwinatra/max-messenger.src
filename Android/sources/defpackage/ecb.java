package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;

/* renamed from: ecb  reason: default package */
public final class ecb {
    public final ec8 a;
    public final Lazy b;
    public final Lazy c;
    public final wp d = wp.a;

    public ecb(ec8 ec8, Lazy lazy, Lazy lazy2) {
        this.a = ec8;
        this.b = lazy2;
        this.c = lazy;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [hj7, java.lang.Object] */
    public final n78 a(tbb tbb, Map map) {
        ? obj = new Object();
        obj.v = "PERF";
        obj.w = tbb.a;
        obj.b = ((qjd) ((x23) this.b.getValue())).s();
        obj.a = System.currentTimeMillis();
        obj.c(map);
        return obj.d();
    }

    public final Map b(boolean z, boolean z2, vbb vbb, ubb ubb, List list) {
        List createListBuilder = CollectionsKt.createListBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xbb xbb = (xbb) it.next();
            Map createMapBuilder = MapsKt.createMapBuilder();
            createMapBuilder.put("name", xbb.a.a);
            long j = xbb.e;
            Long valueOf = Long.valueOf(j);
            Long l = null;
            if (j == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                createMapBuilder.put("duration", Long.valueOf(xbb.e));
            }
            long j2 = xbb.f;
            Long valueOf2 = Long.valueOf(j2);
            if (j2 == -1) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                createMapBuilder.put("span_id", Long.valueOf(xbb.f));
            }
            long j3 = xbb.g;
            Long valueOf3 = Long.valueOf(j3);
            if (j3 != -1) {
                l = valueOf3;
            }
            if (l != null) {
                createMapBuilder.put("parent_span_id", Long.valueOf(xbb.g));
            }
            List<zbb> list2 = xbb.h;
            if (list2 != null) {
                for (zbb zbb : list2) {
                    zbb.getClass();
                    createMapBuilder.put("hasData", zbb.a);
                }
            }
            createListBuilder.add(MapsKt.build(createMapBuilder));
        }
        List build = CollectionsKt.build(createListBuilder);
        Map createMapBuilder2 = MapsKt.createMapBuilder();
        createMapBuilder2.put("session_id", Long.valueOf(((a33) ((x23) this.b.getValue())).B()));
        createMapBuilder2.put("start_type", z ? "cold" : "warm");
        if (z2) {
            createMapBuilder2.put("source", "push");
        }
        createMapBuilder2.put("trace_id", UUID.randomUUID().toString());
        createMapBuilder2.put("spans", build);
        createMapBuilder2.put("status", Integer.valueOf(vbb.a));
        if (ubb != null) {
            createMapBuilder2.put("errorType", Integer.valueOf(ubb.a));
        }
        return MapsKt.build(createMapBuilder2);
    }

    public final void c() {
        this.d.getClass();
        if (wp.c) {
            ybb ybb = ybb.APP_INIT;
            qz9 qz9 = wp.b;
            xbb xbb = (xbb) qz9.c(ybb);
            acb acb = xbb != null ? new acb(xbb.e, CollectionsKt.toList(new y96((aed) qz9))) : null;
            if (acb != null) {
                ((nd) this.c.getValue()).j(a(tbb.APP_INIT, b(true, this.a.i, vbb.SUCCESS, (ubb) null, acb.a)));
                for (xbb xbb2 : acb.a) {
                    wp.b.i(xbb2.a);
                }
                wp.c = false;
            }
        }
    }

    public final void d(vbb vbb, ubb ubb) {
        this.d.getClass();
        boolean z = wp.c;
        ec8 ec8 = this.a;
        boolean z2 = ec8.i;
        c();
        tbb tbb = tbb.EVENT_OPEN_CHAT;
        acb c2 = ec8.c(tbb);
        if (c2 != null) {
            xbb xbb = new xbb(ybb.OPEN_CHAT_ROOT_SPAN, -1);
            xbb.e = c2.b;
            List list = c2.a;
            ((nd) this.c.getValue()).j(a(tbb, b(z, z2, vbb, ubb, CollectionsKt.plus(CollectionsKt.listOf(xbb), list))));
            ec8.e(tbb, list);
        }
    }

    public final void e(vbb vbb, ubb ubb) {
        this.d.getClass();
        boolean z = wp.c;
        ec8 ec8 = this.a;
        boolean z2 = ec8.i;
        c();
        tbb tbb = tbb.EVENT_OPEN_CHATS;
        acb c2 = ec8.c(tbb);
        if (c2 != null) {
            xbb xbb = new xbb(ybb.OPEN_CHATS_ROOT_SPAN, -1);
            xbb.e = c2.b;
            List list = c2.a;
            ((nd) this.c.getValue()).j(a(tbb, b(z, z2, vbb, ubb, CollectionsKt.plus(CollectionsKt.listOf(xbb), list))));
            ec8.e(tbb, list);
        }
    }
}
