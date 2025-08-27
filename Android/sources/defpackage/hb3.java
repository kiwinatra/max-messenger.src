package defpackage;

/* renamed from: hb3  reason: default package */
public final class hb3 extends lbe {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ hb3(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void m(gce gce) {
        switch (this.a) {
            case 0:
                ((ma3) this.b).j(new ox0(this, gce, false, 7));
                return;
            case 1:
                ((ti8) this.b).a(new vi8(gce, (lbe) this.c, 0));
                return;
            case 2:
                ((ti8) this.b).a(new ab3(3, gce, this.c));
                return;
            case 3:
                ((ma3) this.b).j(new vi8(gce, (lbe) this.c, 1));
                return;
            case 4:
                ((lbe) this.b).l(new ao1(gce, (x6) this.c));
                return;
            case 5:
                ((lbe) this.b).l(new npg(this, gce, false, 22));
                return;
            default:
                lbe[] lbeArr = (lbe[]) this.b;
                int length = lbeArr.length;
                int i = 0;
                if (length == 1) {
                    lbeArr[0].l(new ox0(23, (Object) gce, (Object) new ch2(23, this)));
                    return;
                }
                kde kde = new kde(length, (zi6) this.c, gce);
                gce.c(kde);
                while (i < length && !kde.f()) {
                    lbe lbe = lbeArr[i];
                    if (lbe == null) {
                        kde.a(new NullPointerException("One of the sources is null"), i);
                        return;
                    } else {
                        lbe.l(kde.c[i]);
                        i++;
                    }
                }
                return;
        }
    }

    public hb3(lbe lbe, ma3 ma3) {
        this.a = 3;
        this.c = lbe;
        this.b = ma3;
    }
}
