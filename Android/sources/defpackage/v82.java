package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: v82  reason: default package */
public final /* synthetic */ class v82 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ia2 b;

    public /* synthetic */ v82(ia2 ia2, int i) {
        this.a = i;
        this.b = ia2;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new j5d("all.chat.folder", this.b.h().a.getString(qad.E2), (String) null, 0, SetsKt.emptySet(), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064);
            case 1:
                String uuid = UUID.randomUUID().toString();
                ia2 ia2 = this.b;
                return CollectionsKt.mutableListOf(new j5d(uuid, ia2.h().a.getString(qad.b3), "👤", 0, SetsKt.setOf(q82.x0), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064), new j5d(UUID.randomUUID().toString(), ia2.h().a.getString(qad.c3), "✉️", 1, SetsKt.setOf(q82.y, q82.z), false, false, (List) null, (Long) null, (Map) null, (List) null, (Set) null, 8064));
            default:
                q82 q82 = q82.y;
                ia2 ia22 = this.b;
                return CollectionsKt.listOf(TuplesKt.to(q82, ia22.h().a.getString(qad.S2)), TuplesKt.to(q82.z, ia22.h().a.getString(qad.W2)), TuplesKt.to(q82.w, ia22.h().a.getString(qad.U2)), TuplesKt.to(q82.v, ia22.h().a.getString(qad.R2)), TuplesKt.to(q82.X, ia22.h().a.getString(qad.Q2)), TuplesKt.to(q82.Z, ia22.h().a.getString(qad.P2)), TuplesKt.to(q82.Y, ia22.h().a.getString(qad.X2)), TuplesKt.to(q82.x0, ia22.h().a.getString(qad.Z2)), TuplesKt.to(q82.v0, ia22.h().a.getString(qad.V2)), TuplesKt.to(q82.w0, ia22.h().a.getString(qad.Y2)), TuplesKt.to(q82.y0, ia22.h().a.getString(qad.a3)));
        }
    }
}
