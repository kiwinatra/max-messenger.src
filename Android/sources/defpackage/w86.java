package defpackage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: w86  reason: default package */
public final class w86 extends xag {
    public final etc X;
    public final xme Y;
    public final etc Z;
    public final gaf b;
    public final jua c;
    public final ji3 o;
    public final uua v;
    public final etc v0;
    public final udg w;
    public boolean w0;
    public final Lazy x;
    public final Lazy y;
    public final xme z;

    public w86() {
        Lazy lazy = rjd.F1;
        cs2 cs2 = cs2.a;
        fua fua = (fua) cs2.getAccessor().g(fua.class);
        sjd sjd = sjd.a;
        gaf y2 = sjd.y();
        uua uua = (uua) cs2.getAccessor().g(uua.class);
        Lazy h = cs2.getAccessor().h(xva.class);
        this.b = y2;
        this.c = (jua) sjd.getAccessor().g(jua.class);
        this.o = (ji3) cs2.getAccessor().g(ji3.class);
        this.v = uua;
        this.w = (udg) cs2.getAccessor().g(udg.class);
        this.x = lazy;
        this.y = h;
        List createListBuilder = CollectionsKt.createListBuilder();
        Iterable<jr9> iterable = (List) ((AtomicReference) ((kr9) uua.c.getValue()).c).get();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        boolean z2 = false;
        for (jr9 jr9 : iterable) {
            if (Intrinsics.areEqual((Object) jr9.a, (Object) "all.chat.folder")) {
                z2 = true;
            }
            arrayList.add(new y16(jr9.a, jr9.b, (CharSequence) null, jr9.c, jr9.d));
        }
        createListBuilder.addAll(arrayList);
        if (!z2) {
            createListBuilder.add(0, new y16("all.chat.folder", this.c.a.getString(qad.E2), (CharSequence) null, r14.b, EnumSet.allOf(a26.class)));
        }
        xme a = f6e.a(CollectionsKt.build(createListBuilder));
        this.z = a;
        this.X = new etc(a);
        xme a2 = f6e.a(0);
        this.Y = a2;
        this.Z = new etc(a2);
        bs0.K(bs0.F(new ps5(bs0.F(new i21(((ia2) ((u82) this.x.getValue())).j(), fua.f, new x2(this, (Continuation) null, 11), 4), ((osa) this.b).a()), new p86(this, (Continuation) null), 5), ((osa) this.b).b()), this.a);
        Duration.Companion companion = Duration.Companion;
        long r3 = Duration.m1371getInWholeMillisecondsimpl(DurationKt.toDuration(2, DurationUnit.SECONDS));
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = System.currentTimeMillis();
        this.v0 = bs0.X(bs0.w(bs0.L(bs0.w(gt5.d(new i21(bs0.k(new v86(this, longRef, (Continuation) null)), new wb(20, new etc(this.o.b), this), new t86(3, (Continuation) null, 0), 4), DurationKt.toDuration(500, DurationUnit.MILLISECONDS))), new s86(longRef, r3, (Continuation) null))), this.a, z6e.b, gx6.c);
    }

    public final void j(String str) {
        if (str != null) {
            Iterator it = ((List) this.z.getValue()).iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                } else if (Intrinsics.areEqual((Object) ((y16) it.next()).a, (Object) str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                Integer valueOf = Integer.valueOf(i);
                xme xme = this.Y;
                xme.getClass();
                xme.m((Object) null, valueOf);
            }
        }
    }
}
