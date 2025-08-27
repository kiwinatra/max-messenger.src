package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* renamed from: br6  reason: default package */
public final class br6 {
    public final cjd a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public br6(Lazy lazy, Lazy lazy2, cjd cjd) {
        this.a = cjd;
        this.b = lazy;
        this.c = LazyKt.lazy(new ur(15, lazy2));
        this.d = LazyKt.lazy(new ur(16, lazy2));
    }

    public final void a(a32 a32, Collection collection) {
        gqc gqc = (gqc) this.c.getValue();
        gqc.getClass();
        if (gqc == gqc.a) {
            z68.p("br6", "executeByServerIds: reactPermission is disabled");
        } else if (collection.isEmpty()) {
            z68.p("br6", "messageServerIds are empty!");
        } else {
            if (a32.b.a == 0) {
                if (!a32.b.h(this.a.a())) {
                    return;
                }
            }
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                w78 w78 = w78.o;
                int size = collection.size();
                String p = CollectionsKt___CollectionsKt.joinToString$default(collection, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
                a67.d(w78, "br6", "executeByServerIds " + size + " [" + p + "]", (Throwable) null);
            }
            try {
                b(a32.a, a32.b.a, CollectionsKt.asSequence(collection));
            } catch (Throwable th) {
                z68.f("br6", "executeByServerIds: call request failure!", th);
            }
        }
    }

    public final void b(long j, long j2, Sequence sequence) {
        Lazy lazy = this.d;
        for (List list : SequencesKt___SequencesKt.windowed(sequence, ((Number) lazy.getValue()).intValue(), ((Number) lazy.getValue()).intValue(), true)) {
            jna jna = (jna) ((rl) this.b.getValue());
            if (jna.r(j)) {
                jna.z(jna, new uv9(((ltb) jna.D()).a.n(), j, j2, list));
            }
        }
    }
}
