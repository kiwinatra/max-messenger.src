package defpackage;

/* renamed from: t08  reason: default package */
public abstract class t08 {
    public final dla a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ u08 o;

    public t08(u08 u08, dla dla) {
        this.o = u08;
        this.a = dla;
    }

    public final void a(boolean z) {
        if (z != this.b) {
            this.b = z;
            int i = z ? 1 : -1;
            u08 u08 = this.o;
            int i2 = u08.c;
            u08.c = i + i2;
            if (!u08.d) {
                u08.d = true;
                while (true) {
                    try {
                        int i3 = u08.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            u08.g();
                        } else if (z3) {
                            u08.h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        u08.d = false;
                        throw th;
                    }
                }
                u08.d = false;
            }
            if (this.b) {
                u08.c(this);
            }
        }
    }

    public void b() {
    }

    public boolean c(jv7 jv7) {
        return false;
    }

    public abstract boolean e();
}
