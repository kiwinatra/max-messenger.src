package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: vsc  reason: default package */
public final class vsc extends xag {
    public final long b;
    public final Lazy c = LazyKt.lazy(new ifb(13, this));

    public vsc(long j) {
        this.b = j;
        vi9 vi9 = vi9.a;
        bs0.K(bs0.F(new ps5(new on2(((my2) ((qx2) vi9.getAccessor().g(qx2.class))).o(j), 28), new usc(this, (Continuation) null), 5), ((osa) vi9.getDispatchers()).a()), this.a);
    }

    public final ReactionsViewModel j() {
        return (ReactionsViewModel) this.c.getValue();
    }
}
