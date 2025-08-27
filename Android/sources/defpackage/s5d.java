package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* renamed from: s5d  reason: default package */
public final /* synthetic */ class s5d implements Function1 {
    public final /* synthetic */ c6d a;
    public final /* synthetic */ long b;
    public final /* synthetic */ List c;

    public /* synthetic */ s5d(c6d c6d, long j, ArrayList arrayList) {
        this.a = c6d;
        this.b = j;
        this.c = arrayList;
    }

    public final Object invoke(Object obj) {
        c6d c6d = this.a;
        c6d.getClass();
        ArrayList arrayList = (ArrayList) this.c;
        return c6d.j(c6d, this.b, arrayList, (Continuation) obj);
    }
}
