package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: of0  reason: default package */
public final /* synthetic */ class of0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BacklogWorker b;

    public /* synthetic */ of0(BacklogWorker backlogWorker, int i) {
        this.a = i;
        this.b = backlogWorker;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((sjd) this.b.getTamComponent()).y();
            default:
                return (ipg) ((sjd) this.b.getTamComponent()).getAccessor().g(ipg.class);
        }
    }
}
