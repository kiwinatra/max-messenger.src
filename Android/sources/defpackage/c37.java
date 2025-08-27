package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c37  reason: default package */
public final class c37 extends xag {
    public final q13 b;
    public final Lazy c;
    public final Lazy o;
    public final Lazy v;
    public final SharedPreferences w;
    public final List x = CollectionsKt.plus(CollectionsKt.listOf("api.oneme.ru", "api-test.oneme.ru", "api-tg.oneme.ru"), (T[]) new String[0]);
    public final xme y = f6e.a(k());
    public final s85 z = new s85(0);

    public c37() {
        tm4 tm4 = tm4.a;
        Class<Context> cls = Context.class;
        Class<doa> cls2 = doa.class;
        Lazy h = tm4.getAccessor().h(cls2);
        Lazy h2 = tm4.getAccessor().h(jtb.class);
        Lazy h3 = tm4.getAccessor().h(gaf.class);
        this.b = new q13((Context) tm4.getAccessor().g(cls), tm4.getAccessor().h(sv0.class), tm4.getAccessor().h(cls2), tm4.getAccessor().h(f8f.class));
        this.c = h2;
        this.o = h3;
        this.v = h;
        this.w = ((Context) tm4.getAccessor().g(cls)).getSharedPreferences("dev_tools", 0);
    }

    public final jtb j() {
        return (jtb) this.c.getValue();
    }

    public final List k() {
        List createListBuilder = CollectionsKt.createListBuilder();
        Iterable<String> iterable = this.x;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (String str : iterable) {
            arrayList.add(new u27(str, Boolean.valueOf(Intrinsics.areEqual((Object) str, (Object) ((ltb) j()).a.z()))));
        }
        createListBuilder.addAll(arrayList);
        String str2 = "";
        String string = this.w.getString("Custom", str2);
        if (!(string == null || string.length() == 0)) {
            str2 = wj6.k(" (", string, ")");
        }
        createListBuilder.add(new u27(a81.m("Custom", str2), Boolean.valueOf(Intrinsics.areEqual((Object) string, (Object) ((ltb) j()).a.z()))));
        return CollectionsKt.build(createListBuilder);
    }

    public final void l(String str) {
        ev0.v(this.a, ((osa) ((gaf) this.o.getValue())).a().plus(caa.a), (f14) null, new b37(str, this, (Continuation) null), 2);
    }
}
