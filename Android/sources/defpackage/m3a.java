package defpackage;

/* renamed from: m3a  reason: default package */
public final /* synthetic */ class m3a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3a b;

    public /* synthetic */ m3a(s3a s3a, int i) {
        this.a = i;
        this.b = s3a;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                s3a s3a = this.b;
                qg0 qg0 = s3a.E0;
                qg0.x0 = s3a.w0.getMeasuredWidth();
                qg0.invalidateSelf();
                return;
            default:
                s3a s3a2 = this.b;
                qg0 qg02 = s3a2.E0;
                qg02.x0 = s3a2.w0.getMeasuredWidth();
                qg02.invalidateSelf();
                return;
        }
    }
}
