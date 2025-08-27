package defpackage;

import androidx.work.WorkRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: lqg  reason: default package */
public final class lqg extends Lambda implements Function0 {
    public final /* synthetic */ WorkRequest a;
    public final /* synthetic */ dpg b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ata o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lqg(WorkRequest workRequest, dpg dpg, String str, ata ata) {
        super(0);
        this.a = workRequest;
        this.b = dpg;
        this.c = str;
        this.o = ata;
    }

    public final Object invoke() {
        List listOf = CollectionsKt.listOf(this.a);
        new h75(new rog(this.b, this.c, fb5.b, listOf), this.o).run();
        return Unit.INSTANCE;
    }
}
