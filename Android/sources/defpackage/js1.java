package defpackage;

/* renamed from: js1  reason: default package */
public final class js1 extends bt1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ do1 b;

    public js1() {
        this.a = 1;
        this.b = null;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Capture request is cancelled because camera is closed", (Throwable) null));
                return;
            case 1:
                do1 do1 = this.b;
                if (do1 != null) {
                    do1.d(new Exception("Camera is closed"));
                    return;
                }
                return;
            default:
                do1 do12 = this.b;
                if (do12 != null) {
                    do12.d(new Exception("Camera is closed"));
                    return;
                }
                return;
        }
    }

    public final void b(int i, it1 it1) {
        switch (this.a) {
            case 0:
                this.b.b((Object) null);
                return;
            case 1:
                do1 do1 = this.b;
                if (do1 != null) {
                    do1.b(it1);
                    return;
                }
                return;
            default:
                do1 do12 = this.b;
                if (do12 != null) {
                    do12.b((Object) null);
                    return;
                }
                return;
        }
    }

    public final void c(int i, dbe dbe) {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Capture request failed with reason ".concat("ERROR"), (Throwable) null));
                return;
            case 1:
                do1 do1 = this.b;
                if (do1 != null) {
                    do1.d(new Exception());
                    return;
                }
                return;
            default:
                do1 do12 = this.b;
                if (do12 != null) {
                    do12.d(new Exception());
                    return;
                }
                return;
        }
    }

    public /* synthetic */ js1(do1 do1, int i) {
        this.a = i;
        this.b = do1;
    }
}
