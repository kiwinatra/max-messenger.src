package defpackage;

import android.view.ViewGroup;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* renamed from: b66  reason: default package */
public final class b66 extends pae {
    public final /* synthetic */ int v = 1;
    public final Object w;
    public final Object x;
    public final Function y;

    public b66(ExecutorService executorService, ms1 ms1, uw2 uw2) {
        super(executorService);
        this.w = executorService;
        this.x = ms1;
        this.y = uw2;
    }

    public void t(pzc pzc, int i, List list) {
        switch (this.v) {
            case 1:
                kbe kbe = (kbe) pzc;
                Iterable<Object> iterable = list;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    for (Object obj : iterable) {
                        if (obj instanceof x29) {
                            kbe.N((lz7) ((ov) this.o).f.get(i), CollectionsKt.last(list));
                            return;
                        }
                    }
                }
                s(kbe, i);
                return;
            default:
                super.t(pzc, i, list);
                return;
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        switch (this.v) {
            case 0:
                if (i == ngc.oneme_folder_widget_section_view_type) {
                    return new c66(viewGroup.getContext(), (ExecutorService) ((Executor) this.w), (ms1) ((d66) this.x));
                }
                if (i == ngc.oneme_folder_widget_section_empty_view_type) {
                    return new c66(viewGroup.getContext(), (uw2) ((Function0) this.y));
                }
                String name = b66.class.getName();
                throw new IllegalStateException(("Not supported viewType " + i + " for " + name).toString());
            default:
                if (i != cwa.D) {
                    return new qw3(viewGroup.getContext(), (hq7) ((Function1) this.x));
                }
                return new qw3(viewGroup.getContext(), (ekd) this.w, (v99) ((Function1) this.y));
        }
    }

    public b66(ExecutorService executorService, ekd ekd, hq7 hq7, v99 v99) {
        super(executorService);
        this.w = ekd;
        this.x = hq7;
        this.y = v99;
    }
}
