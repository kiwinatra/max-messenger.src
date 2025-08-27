package defpackage;

/* renamed from: rab  reason: default package */
public final /* synthetic */ class rab implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbb b;
    public final /* synthetic */ String c;

    public /* synthetic */ rab(fbb fbb, String str, int i) {
        this.a = i;
        this.b = fbb;
        this.c = str;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                fbb fbb = this.b;
                fbb.getClass();
                StringBuilder sb = new StringBuilder("set sdp error ");
                String str = this.c;
                sb.append(str);
                fbb.j(sb.toString(), "set.sdp2");
                fbb.I0.log(jme.callError, "setSdpFailed", (String) null);
                fbb.B0.post(new vab(fbb, str, 3));
                return;
            case 1:
                fbb fbb2 = this.b;
                fbb2.getClass();
                StringBuilder sb2 = new StringBuilder("create sdp error ");
                String str2 = this.c;
                sb2.append(str2);
                fbb2.j(sb2.toString(), "create.sdp2");
                fbb2.I0.log(jme.callError, "onCreateSDPFailed", (String) null);
                fbb2.B0.post(new vab(fbb2, str2, 1));
                return;
            default:
                fbb fbb3 = this.b;
                ebb ebb = fbb3.Y0;
                if (ebb != null) {
                    ebb.h(fbb3, this.c);
                    return;
                }
                return;
        }
    }
}
