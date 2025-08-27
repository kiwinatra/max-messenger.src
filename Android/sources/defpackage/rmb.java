package defpackage;

/* renamed from: rmb  reason: default package */
public final /* synthetic */ class rmb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ smb b;

    public /* synthetic */ rmb(smb smb, int i) {
        this.a = i;
        this.b = smb;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                return;
            default:
                this.b.h(true);
                return;
        }
    }
}
