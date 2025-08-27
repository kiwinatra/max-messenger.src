package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: or1  reason: default package */
public final /* synthetic */ class or1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xr1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ fwd o;
    public final /* synthetic */ zzf v;
    public final /* synthetic */ hc0 w;
    public final /* synthetic */ List x;

    public /* synthetic */ or1(xr1 xr1, String str, fwd fwd, zzf zzf, hc0 hc0, List list, int i) {
        this.a = i;
        this.b = xr1;
        this.c = str;
        this.o = fwd;
        this.v = zzf;
        this.w = hc0;
        this.x = list;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                xr1 xr1 = this.b;
                String str = this.c;
                fwd fwd = this.o;
                zzf zzf = this.v;
                hc0 hc0 = this.w;
                List list = this.x;
                xr1.getClass();
                xr1.toString();
                xr1.a.K(str, fwd, zzf, hc0, list);
                xr1.p();
                xr1.C();
                xr1.J();
                if (xr1.Q0 == 9) {
                    xr1.A();
                    return;
                }
                return;
            case 1:
                xr1 xr12 = this.b;
                xr12.getClass();
                xr12.toString();
                xr12.a.K(this.c, this.o, this.v, this.w, this.x);
                xr12.J();
                return;
            default:
                xr1 xr13 = this.b;
                xr13.getClass();
                xr13.toString();
                LinkedHashMap linkedHashMap = (LinkedHashMap) xr13.a.b;
                String str2 = this.c;
                xzf xzf = (xzf) linkedHashMap.get(str2);
                fwd fwd2 = this.o;
                zzf zzf2 = this.v;
                hc0 hc02 = this.w;
                List list2 = this.x;
                if (xzf == null) {
                    xzf = new xzf(fwd2, zzf2, hc02, list2);
                    linkedHashMap.put(str2, xzf);
                }
                xzf.f = true;
                xr13.a.K(str2, fwd2, zzf2, hc02, list2);
                xr13.J();
                return;
        }
    }
}
