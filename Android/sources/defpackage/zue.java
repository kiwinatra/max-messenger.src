package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: zue  reason: default package */
public final class zue extends xag {
    public static final /* synthetic */ KProperty[] C0;
    public final wie A0 = o5a.U();
    public final wie B0 = o5a.U();
    public final s85 X = new s85(0);
    public final s85 Y = new s85(0);
    public volatile Long Z;
    public final Context b;
    public final gaf c;
    public final Lazy o;
    public final Lazy v;
    public volatile int v0 = -1;
    public final Lazy w;
    public volatile Long w0;
    public final Lazy x;
    public final wie x0 = o5a.U();
    public final xme y;
    public Long y0;
    public final etc z;
    public Long z0;

    static {
        Class<zue> cls = zue.class;
        C0 = new KProperty[]{rae.s(cls, "moveFinishJob", "getMoveFinishJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "menuItemJob", "getMenuItemJob()Lkotlinx/coroutines/Job;", 0), rae.s(cls, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;", 0)};
    }

    public zue(Context context, gaf gaf, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.b = context;
        this.c = gaf;
        this.o = lazy;
        this.v = lazy2;
        this.w = lazy3;
        this.x = lazy4;
        xme a = f6e.a(CollectionsKt.emptyList());
        this.y = a;
        this.z = new etc(a);
        z68.c(zue.class.getName(), "loadSections", new Object[0]);
        bs0.K(bs0.F(new ps5(bs0.u(kv0.h(((moe) lazy.getValue()).a()), kv0.h(((vi5) lazy3.getValue()).a()), kv0.h(((ai5) lazy4.getValue()).c()), new sr3(4, (Continuation) null)), new p2c(2, this, zue.class, "processResult", "processResult(Lone/me/stickerssettings/StickersSettingsViewModel$CombinedResult;)V", 4, 14), 5), ((osa) gaf).b()), this.a);
    }

    public final String j(List list) {
        int size = list != null ? list.size() : 0;
        return this.b.getResources().getQuantityString(gza.a, size, new Object[]{Integer.valueOf(size)});
    }
}
