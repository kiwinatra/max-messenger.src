package defpackage;

import android.os.Bundle;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* renamed from: swb  reason: default package */
public final class swb {
    public final Lazy a = LazyKt.lazy(new lgb(24));

    public final c6c a(CharSequence charSequence, qr2 qr2) {
        int ordinal = qr2.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            kgf kgf = new kgf(lxa.n1, ArraysKt.toList((T[]) new Object[]{charSequence}));
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(new pg3(jxa.R, new igf(lxa.m1), og3.a));
            createListBuilder.add(new pg3(jxa.y, new igf(lxa.l1), og3.c));
            Unit unit = Unit.INSTANCE;
            return new c6c(kgf, (ngf) null, CollectionsKt.build(createListBuilder), (Bundle) null);
        } else if (ordinal == 2) {
            kgf kgf2 = new kgf(lxa.j1, ArraysKt.toList((T[]) new Object[]{charSequence}));
            igf igf = new igf(lxa.i1);
            List createListBuilder2 = CollectionsKt.createListBuilder();
            createListBuilder2.add(new pg3(jxa.R, new igf(lxa.h1), og3.a));
            createListBuilder2.add(new pg3(jxa.y, new igf(lxa.l1), og3.c));
            Unit unit2 = Unit.INSTANCE;
            return new c6c(kgf2, igf, CollectionsKt.build(createListBuilder2), (Bundle) null);
        } else if (ordinal == 3) {
            return c();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final pg3 b() {
        return (pg3) this.a.getValue();
    }

    public final c6c c() {
        mgf mgf = new mgf("Unsupported chat type");
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(new pg3(jxa.B, new igf(lxa.L0), og3.a));
        createListBuilder.add(b());
        Unit unit = Unit.INSTANCE;
        return new c6c(mgf, (ngf) null, CollectionsKt.build(createListBuilder), (Bundle) null);
    }
}
