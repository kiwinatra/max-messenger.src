package defpackage;

/* renamed from: ft  reason: default package */
public class ft {
    public final /* synthetic */ int a;
    public int b;
    public int c;

    public /* synthetic */ ft(int i) {
        this.a = i;
    }

    public void a(int i) {
        int i2;
        int i3 = this.c;
        if (i3 < i || (i2 = this.b) <= 0) {
            bg5.p("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.c), Integer.valueOf(this.b));
            return;
        }
        this.b = i2 - 1;
        this.c = i3 - i;
    }

    public int b() {
        switch (this.a) {
            case 4:
                int i = this.c;
                if (i == 2) {
                    return 10;
                }
                if (i == 5) {
                    return 11;
                }
                if (i == 29) {
                    return 12;
                }
                if (i == 42) {
                    return 16;
                }
                if (i != 22) {
                    return i != 23 ? 0 : 15;
                }
                return 1073741824;
            default:
                int i2 = this.c;
                if (i2 == 2) {
                    return 10;
                }
                if (i2 == 5) {
                    return 11;
                }
                if (i2 == 29) {
                    return 12;
                }
                if (i2 == 42) {
                    return 16;
                }
                if (i2 != 22) {
                    return i2 != 23 ? 0 : 15;
                }
                return 1073741824;
        }
    }

    public String toString() {
        switch (this.a) {
            case 8:
                StringBuilder sb = new StringBuilder("Size{width=");
                sb.append(this.b);
                sb.append(", height=");
                return tr1.k(sb, this.c, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ft(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
