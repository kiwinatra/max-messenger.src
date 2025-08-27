package defpackage;

/* renamed from: oa  reason: default package */
public final class oa implements xvb {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ oa(xvb xvb, int i) {
        this.a = i;
        this.b = xvb;
    }

    public final void a(zi0 zi0, yvb yvb) {
        switch (this.a) {
            case 0:
                ((xvb) this.b).a(new na(zi0, 0), yvb);
                return;
            case 1:
                ((xvb) this.b).a(new na(zi0, 2), yvb);
                return;
            case 2:
                ((xvb) this.b).a(new na(zi0, 3), yvb);
                return;
            default:
                if (((ik0) yvb).a.i == null) {
                    zi0.g(1, (Object) null);
                    return;
                } else if (!c(0, zi0, yvb)) {
                    zi0.g(1, (Object) null);
                    return;
                } else {
                    return;
                }
        }
    }

    public boolean c(int i, zi0 zi0, yvb yvb) {
        bjf[] bjfArr;
        v3d v3d = ((ik0) yvb).a.i;
        while (true) {
            bjfArr = (bjf[]) this.b;
            if (i >= bjfArr.length) {
                i = -1;
                break;
            } else if (bjfArr[i].b(v3d)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return false;
        }
        bjfArr[i].a(new ajf(this, zi0, yvb, i), yvb);
        return true;
    }

    public oa(bjf[] bjfArr) {
        this.a = 3;
        bjf[] bjfArr2 = bjfArr;
        this.b = bjfArr2;
        cvg.o(0, bjfArr2.length);
    }
}
