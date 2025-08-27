package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: add  reason: default package */
public final /* synthetic */ class add implements Function1 {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ add(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final Object invoke(Object obj) {
        kr7.M((j10) obj, this.a, this.b, this.c);
        return Unit.INSTANCE;
    }
}
