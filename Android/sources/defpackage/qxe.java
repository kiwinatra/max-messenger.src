package defpackage;

import java.util.function.Supplier;
import kotlin.sequences.Sequence;
import kotlin.streams.jdk8.StreamsKt;

/* renamed from: qxe  reason: default package */
public final /* synthetic */ class qxe implements Supplier {
    public final /* synthetic */ Sequence a;

    public /* synthetic */ qxe(Sequence sequence) {
        this.a = sequence;
    }

    public final Object get() {
        return StreamsKt.asStream$lambda$4(this.a);
    }
}
