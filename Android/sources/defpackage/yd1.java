package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* renamed from: yd1  reason: default package */
public final class yd1 extends pae {
    public final u6h v;
    public final Executor w;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public yd1(defpackage.u6h r2) {
        /*
            r1 = this;
            sjd r0 = defpackage.sjd.a
            aua r0 = r0.t()
            java.util.concurrent.ExecutorService r0 = r0.a()
            r1.<init>(r0)
            r1.v = r2
            r1.w = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yd1.<init>(u6h):void");
    }

    public final int l(int i) {
        return ((lz7) ((ov) this.o).f.get(i)).i();
    }

    public final void t(pzc pzc, int i, List list) {
        String str;
        kbe kbe = (kbe) pzc;
        boolean isEmpty = list.isEmpty();
        ov ovVar = (ov) this.o;
        if (isEmpty) {
            kbe.M((lz7) ovVar.f.get(i));
        } else if (((lz7) ovVar.f.get(i)).i() == 1) {
            xd1 xd1 = (xd1) kbe;
            for (rd1 rd1 : SequencesKt.filter(SequencesKt.flatMapIterable(CollectionsKt.asSequence(list), new h9(28)), m61.v)) {
                boolean z = rd1 instanceof qd1;
                View view = xd1.a;
                if (z) {
                    ((ol3) view).setName((CharSequence) ((qd1) rd1).a);
                } else if (rd1 instanceof pd1) {
                    ol3 ol3 = (ol3) view;
                    Integer num = ((pd1) rd1).a;
                    if (num != null) {
                        str = ol3.getContext().getString(num.intValue());
                    } else {
                        str = null;
                    }
                    ol3.setMessage(str);
                } else if (rd1 instanceof od1) {
                    od1 od1 = (od1) rd1;
                    ((ol3) view).Y(od1.a.a, od1.b, od1.c);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            kbe.M((lz7) ovVar.f.get(i));
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new xd1(viewGroup.getContext(), this.v);
        }
        throw new IllegalArgumentException(a81.j(i, "Not supported viewType=", " for CallOpponentsListAdapter"));
    }
}
