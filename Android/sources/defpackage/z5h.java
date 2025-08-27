package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: z5h  reason: default package */
public final class z5h extends nzg {
    public final /* synthetic */ int d;
    public final /* synthetic */ e5h e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z5h(e5h e5h, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 6);
        this.d = i;
        this.e = e5h;
    }

    public void h(Status status) {
        switch (this.d) {
            case 0:
                this.e.X(status);
                return;
            default:
                super.h(status);
                return;
        }
    }

    public void o(Status status) {
        switch (this.d) {
            case 1:
                this.e.X(status);
                return;
            default:
                super.o(status);
                return;
        }
    }
}
