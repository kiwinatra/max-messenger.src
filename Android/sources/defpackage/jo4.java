package defpackage;

/* renamed from: jo4  reason: default package */
public final /* synthetic */ class jo4 implements s9d {
    public final /* synthetic */ int a;
    public final /* synthetic */ ko4 b;

    public /* synthetic */ jo4(ko4 ko4, int i) {
        this.a = i;
        this.b = ko4;
    }

    public void a(n9d n9d, w9d w9d) {
        int i = this.a;
        kwf kwf = (kwf) n9d;
        mwf mwf = (mwf) w9d;
        ko4 ko4 = this.b;
        ko4.getClass();
        switch (i) {
            case 0:
                if (!mwf.a.isEmpty()) {
                    ko4.a.log("DisplayLayouts", "Resend next time after response with errors");
                    ko4.e = true;
                    return;
                }
                return;
            default:
                ko4.a.log("DisplayLayouts", "Stop stream on participant removed response: " + mwf);
                return;
        }
    }

    public void b(n9d n9d, Throwable th) {
        kwf kwf = (kwf) n9d;
        switch (this.a) {
            case 1:
                ko4 ko4 = this.b;
                ko4.a.log("DisplayLayouts", "Resend next time after error");
                ko4.e = true;
                return;
            default:
                ko4 ko42 = this.b;
                ko42.getClass();
                ko42.a.log("DisplayLayouts", "Stop stream on participant removed error: " + th.getMessage());
                return;
        }
    }
}
