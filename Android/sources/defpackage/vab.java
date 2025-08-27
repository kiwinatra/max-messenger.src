package defpackage;

/* renamed from: vab  reason: default package */
public final /* synthetic */ class vab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbb b;

    public /* synthetic */ vab(fbb fbb, int i) {
        this.a = i;
        this.b = fbb;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fbb fbb = this.b;
                fbb.i1 = false;
                ebb ebb = fbb.Y0;
                if (ebb != null) {
                    ebb.d(fbb);
                    return;
                }
                return;
            case 1:
                ebb ebb2 = this.b.Y0;
                if (ebb2 != null) {
                    ebb2.e();
                    return;
                }
                return;
            case 2:
                fbb fbb2 = this.b;
                fbb2.getClass();
                fbb2.J0.log("PCRTCClient", "createPeerConnectionFactoryInternal, " + fbb2);
                fbb2.V0 = false;
                return;
            case 3:
                ebb ebb3 = this.b.Y0;
                if (ebb3 != null) {
                    ebb3.g();
                    return;
                }
                return;
            case 4:
                fbb fbb3 = this.b;
                ebb ebb4 = fbb3.Y0;
                if (ebb4 != null) {
                    ebb4.c(fbb3);
                    return;
                }
                return;
            case 5:
                fbb fbb4 = this.b;
                ebb ebb5 = fbb4.Y0;
                if (ebb5 != null) {
                    ebb5.r(fbb4);
                    return;
                }
                return;
            case 6:
                this.b.V0 = true;
                return;
            case 7:
                fbb fbb5 = this.b;
                fbb5.q();
                kk kkVar = fbb5.z;
                if (kkVar != null) {
                    kkVar.b();
                    kkVar.a.getClass();
                }
                lj ljVar = fbb5.Y;
                if (ljVar != null) {
                    u64 u64 = ljVar.c;
                    if (u64 != null) {
                        u64.c(ljVar);
                    }
                    ljVar.c = null;
                }
                fbb5.J0.log("PCRTCClient", fbb5 + ": " + ur9.c(fbb5) + " was released");
                return;
            default:
                this.b.q();
                return;
        }
    }

    public /* synthetic */ vab(fbb fbb, String str, int i) {
        this.a = i;
        this.b = fbb;
    }
}
