package defpackage;

import java.util.Map;

/* renamed from: c27  reason: default package */
public final class c27 extends jcd {
    public final Map H;
    public yv4 I;

    public c27(cb4 cb4, pw4 pw4, gw4 gw4, Map map) {
        super(cb4, pw4, gw4);
        this.H = map;
    }

    public final ea6 l(ea6 ea6) {
        yv4 yv4;
        yv4 yv42 = this.I;
        if (yv42 == null) {
            yv42 = ea6.r;
        }
        if (!(yv42 == null || (yv4 = (yv4) this.H.get(yv42.c)) == null)) {
            yv42 = yv4;
        }
        sp9 sp9 = ea6.k;
        sp9 sp92 = null;
        if (sp9 != null) {
            qp9[] qp9Arr = sp9.a;
            int length = qp9Arr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                qp9 qp9 = qp9Arr[i2];
                if ((qp9 instanceof yub) && "com.apple.streaming.transportStreamTimestamp".equals(((yub) qp9).b)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    qp9[] qp9Arr2 = new qp9[(length - 1)];
                    while (i < length) {
                        if (i != i2) {
                            qp9Arr2[i < i2 ? i : i - 1] = qp9Arr[i];
                        }
                        i++;
                    }
                    sp92 = new sp9(qp9Arr2);
                }
            }
            if (!(yv42 == ea6.r && sp9 == ea6.k)) {
                ba6 a = ea6.a();
                a.q = yv42;
                a.j = sp9;
                ea6 = a.a();
            }
            return super.l(ea6);
        }
        sp9 = sp92;
        ba6 a2 = ea6.a();
        a2.q = yv42;
        a2.j = sp9;
        ea6 = a2.a();
        return super.l(ea6);
    }
}
