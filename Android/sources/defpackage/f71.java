package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.SequencesKt;

/* renamed from: f71  reason: default package */
public final class f71 extends pae {
    public final er7 v;
    public final Executor w;

    public f71(er7 er7, ExecutorService executorService) {
        super(executorService);
        this.v = er7;
        this.w = executorService;
    }

    public final void t(pzc pzc, int i, List list) {
        e71 e71 = (e71) pzc;
        if (list.isEmpty()) {
            e71.M((uz6) ((ov) this.o).f.get(i));
            return;
        }
        for (tz6 tz6 : SequencesKt.filter(SequencesKt.flatMapIterable(CollectionsKt.asSequence(list), new h9(19)), m61.c)) {
            boolean z = tz6 instanceof rz6;
            View view = e71.a;
            if (z) {
                ((kl3) view).setTitle(((rz6) tz6).a);
            } else if (tz6 instanceof nz6) {
                nz6 nz6 = (nz6) tz6;
                boolean z2 = nz6.d;
                long j = nz6.a;
                if (z2) {
                    kl3 kl3 = (kl3) view;
                    kl3.R(j, (CharSequence) null, (String) null);
                    kl3.setAvatarOverlay((be0) e71.E0.getValue());
                } else {
                    kl3 kl32 = (kl3) view;
                    kl32.setAvatarOverlay((be0) null);
                    String str = nz6.c;
                    if (str == null) {
                        str = "";
                    }
                    kl32.R(j, nz6.b, str);
                }
            } else if (tz6 instanceof sz6) {
                ((kl3) view).setTime(((sz6) tz6).a);
            } else if (tz6 instanceof qz6) {
                ((kl3) view).Q(((qz6) tz6).a);
            } else if (tz6 instanceof pz6) {
                ((kl3) view).setDescription(((pz6) tz6).a);
            } else if (tz6 instanceof oz6) {
                kl3 kl33 = (kl3) view;
                djd djd = hz6.a;
                oz6 oz6 = (oz6) tz6;
                hz6 hz6 = oz6.a;
                djd.getClass();
                boolean z3 = false;
                kl33.O(hz6 == hz6.b);
                if (oz6.a == hz6.c) {
                    z3 = true;
                }
                kl33.P(z3);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return new e71(new kl3(viewGroup.getContext(), (AttributeSet) null), this.v);
    }
}
