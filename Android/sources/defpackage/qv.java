package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* renamed from: qv  reason: default package */
public final class qv implements tz9 {
    public final /* synthetic */ xme a = f6e.a(CollectionsKt.listOf(new Object()));
    public final /* synthetic */ gx b;

    public qv(gx gxVar) {
        this.b = gxVar;
    }

    public final Object a(Object obj, Continuation continuation) {
        this.a.setValue((List) obj);
        return Unit.INSTANCE;
    }

    public final boolean b(Object obj, Object obj2) {
        return this.a.b((List) obj, (List) obj2);
    }

    public final void c() {
        this.a.c();
        throw null;
    }

    public final boolean d(Object obj) {
        this.a.setValue((List) obj);
        return true;
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        return this.a.e(ds5, continuation);
    }

    public final ome g() {
        return this.a.g();
    }

    /* renamed from: h */
    public final List getValue() {
        return (List) this.a.getValue();
    }

    public final void setValue(Object obj) {
        this.a.setValue((List) obj);
    }
}
