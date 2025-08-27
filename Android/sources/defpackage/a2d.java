package defpackage;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* renamed from: a2d  reason: default package */
public final /* synthetic */ class a2d implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;

    public /* synthetic */ a2d(int i) {
        this.a = i;
        switch (i) {
            case 4:
                this.b = xd3.f;
                return;
            case 5:
                this.b = xd3.f;
                return;
            case 6:
                this.b = xd3.f;
                return;
            case 7:
                this.b = xd3.f;
                return;
            default:
                this.b = xd3.f;
                return;
        }
    }

    public final Object invoke() {
        Lazy lazy = this.b;
        switch (this.a) {
            case 0:
                return (ScheduledExecutorService) ((aua) lazy.getValue()).m.getValue();
            case 1:
                return new mxd((ycf) lazy.getValue());
            case 2:
                List createListBuilder = CollectionsKt.createListBuilder();
                createListBuilder.add(gyd.NOTIFICATIONS);
                createListBuilder.add(gyd.PRIVACY);
                createListBuilder.add(gyd.MESSAGES);
                if (((akd) ((bud) lazy.getValue())).y()) {
                    createListBuilder.add(gyd.SAVED_MESSAGES);
                }
                createListBuilder.add(gyd.FOLDERS);
                return CollectionsKt.build(createListBuilder);
            case 3:
                return new ea5((ScheduledExecutorService) ((aua) lazy.getValue()).m.getValue(), true);
            case 4:
                aua aua = (aua) lazy.getValue();
                aua.getClass();
                KProperty kProperty = aua.o[3];
                ExecutorService d = aua.d(aua.i);
                wce wce = xfd.a;
                return new ea5(d, false);
            case 5:
                return new ea5(((aua) lazy.getValue()).b(), true);
            case 6:
                return new ea5(((aua) lazy.getValue()).a(), true);
            case 7:
                return new ea5(((aua) lazy.getValue()).e(0, "upload", 2, 5), true);
            case 8:
                return ((aua) lazy.getValue()).f(5, "srvc-rqst");
            case 9:
                return ((aua) lazy.getValue()).g();
            case 10:
                return ((tt0) lazy.getValue()).a(16384);
            case 11:
                return new kzf((j6d) lazy.getValue());
            default:
                q4 q4Var = ((vfg) lazy.getValue()).a;
                return new zgg(q4Var.h(sv0.class), q4Var.h(gaf.class));
        }
    }

    public /* synthetic */ a2d(int i, Lazy lazy) {
        this.a = i;
        this.b = lazy;
    }
}
