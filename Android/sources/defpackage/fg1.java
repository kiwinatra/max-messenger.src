package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: fg1  reason: default package */
public final class fg1 extends xag {
    public final xme X;
    public final etc Y;
    public final xme Z;
    public final String b;
    public final boolean c;
    public final List o;
    public final Lazy v;
    public final etc v0;
    public final Lazy w;
    public final etc w0;
    public final xme x;
    public final s85 x0 = new s85(0);
    public final xme y;
    public final etc z;

    public fg1(String str, boolean z2, List list) {
        oh1 oh1 = oh1.a;
        Lazy h = oh1.getAccessor().h(yva.class);
        Lazy h2 = oh1.getAccessor().h(tq1.class);
        this.b = str;
        this.c = z2;
        this.o = list;
        this.v = h;
        this.w = h2;
        xme a = f6e.a(new dg1((Integer) null, ri7.a, (CharSequence) null));
        this.x = a;
        xme a2 = f6e.a(new igf(sqa.K));
        this.y = a2;
        this.z = new etc(a2);
        xme a3 = f6e.a(k());
        this.X = a3;
        this.Y = new etc(a3);
        xme a4 = f6e.a(CollectionsKt.emptyList());
        this.Z = a4;
        this.v0 = new etc(a4);
        pc pcVar = new pc(a, 12);
        Boolean bool = Boolean.FALSE;
        this.w0 = bs0.X(pcVar, this.a, z6e.a, bool);
    }

    public static ArrayList j(boolean z2) {
        List list;
        if (z2) {
            kpc.b.getClass();
            list = CollectionsKt.listOf(kpc.VIDEO_FREEZES, kpc.VIDEO_QUALITY, kpc.VIDEO_SYNC, kpc.VIDEO_CALL_INTERRUPTION, kpc.USERS_FREEZES, kpc.OTHER);
        } else {
            kpc.b.getClass();
            list = CollectionsKt.listOf(kpc.AUDIO_FREEZES, kpc.AUDIO_CALL_INTERRUPTION, kpc.VOICE_COMMUNICATION_PROBLEM, kpc.AUDIO_QUALITY, kpc.AUDIO_ECHO, kpc.OTHER);
        }
        Iterable<kpc> iterable = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (kpc j0 : iterable) {
            arrayList.add(o5a.j0(j0, false));
        }
        return arrayList;
    }

    public final List k() {
        Integer num = ((dg1) this.x.getValue()).a;
        boolean z2 = false;
        boolean z3 = num == null;
        epc epc = z3 ? epc.b : epc.a;
        int i = qqa.j0;
        int i2 = qqa.i0;
        int i3 = qqa.h0;
        Lazy lazy = this.v;
        hpc hpc = new hpc(i, epc, ((yva) lazy.getValue()).k.c("😍"), z3 || (num != null && num.intValue() == i));
        hpc hpc2 = new hpc(i2, epc, ((yva) lazy.getValue()).k.c("😐"), z3 || (num != null && num.intValue() == i2));
        CharSequence c2 = ((yva) lazy.getValue()).k.c("😡");
        if (z3 || (num != null && num.intValue() == i3)) {
            z2 = true;
        }
        return CollectionsKt.listOf(hpc, hpc2, new hpc(i3, epc, c2, z2));
    }
}
