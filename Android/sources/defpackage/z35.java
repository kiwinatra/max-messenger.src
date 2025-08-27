package defpackage;

/* renamed from: z35  reason: default package */
public final class z35 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public /* synthetic */ z35(int i, int i2, int i3, int i4, int i5) {
        this.a = i5;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public boolean a(int i) {
        switch (this.a) {
            case 1:
                if (i == 1) {
                    if (this.b - this.c <= 1) {
                        return false;
                    }
                } else if (this.d - this.e <= 1) {
                    return false;
                }
                return true;
            default:
                if (i == 1) {
                    if (this.b - this.c <= 1) {
                        return false;
                    }
                } else if (this.d - this.e <= 1) {
                    return false;
                }
                return true;
        }
    }

    public int b() {
        int i = this.e;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("MeasureResult{layoutWidth=");
                sb.append(this.b);
                sb.append(", layoutHeight=");
                sb.append(this.c);
                sb.append(", imageWidth=");
                sb.append(this.d);
                sb.append(", imageHeight=");
                return tr1.k(sb, this.e, '}');
            default:
                return super.toString();
        }
    }

    public z35() {
        this.a = 3;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }
}
