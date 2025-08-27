package defpackage;

import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: os1  reason: default package */
public final /* synthetic */ class os1 implements eo1, vu {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs1 b;

    public /* synthetic */ os1(qs1 qs1, int i) {
        this.a = i;
        this.b = qs1;
    }

    public zz7 apply(Object obj) {
        Void voidR = (Void) obj;
        switch (this.a) {
            case 1:
                wx5 wx5 = this.b.a.h;
                return lr1.t(wx5.a.e, 5) != 5 ? xa7.c : m5a.F(new h62(wx5, true, 2));
            case 2:
                qs1 qs1 = this.b;
                qs1.getClass();
                return m5a.F(new os1(qs1, 0));
            case 3:
                wx5 wx52 = this.b.a.h;
                wx52.getClass();
                return m5a.F(new lc5(10, (Object) wx52));
            default:
                fm0 fm0 = new fm0(16);
                qs1 qs12 = this.b;
                ScheduledExecutorService scheduledExecutorService = qs12.c;
                long millis = TimeUnit.NANOSECONDS.toMillis(qs1.f);
                ns1 ns1 = new ns1(fm0);
                lr1 lr1 = qs12.a;
                lr1.p(ns1);
                ir1 ir1 = new ir1(5, lr1, ns1);
                go1 go1 = ns1.b;
                go1.b.d(ir1, lr1.c);
                return m5a.F(new cr0(go1, scheduledExecutorService, millis));
        }
    }

    public Object r(do1 do1) {
        qs1 qs1 = this.b;
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = (TorchFlashRequiredFor3aUpdateQuirk) qs1.e.a;
        boolean z = false;
        if (torchFlashRequiredFor3aUpdateQuirk != null) {
            if (!(lr1.t(torchFlashRequiredFor3aUpdateQuirk.a, 5) == 5)) {
                z = true;
            }
        }
        if (!z) {
            do1.b((Object) null);
            return "EnableTorchInternal";
        }
        qs1.a.r(true);
        do1.b((Object) null);
        return "EnableTorchInternal";
    }
}
