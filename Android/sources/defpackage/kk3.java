package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.uuid.Uuid;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: kk3  reason: default package */
public final class kk3 {
    public final /* synthetic */ int a;
    public int b;
    public List c;

    public /* synthetic */ kk3(List list, int i, int i2) {
        this.a = i2;
        this.b = i;
        this.c = list;
    }

    public kk3 a() {
        return new kk3(this);
    }

    public rtf b(int i, w28 w28) {
        if (i != 2) {
            String str = (String) w28.b;
            if (i == 3 || i == 4) {
                return new mdb(new zu9(str));
            }
            if (i == 21) {
                return new mdb(new qy4(2));
            }
            if (i != 27) {
                if (i == 36) {
                    return new mdb(new wv6(new ata(d(w28))));
                }
                if (i == 89) {
                    return new mdb(new qy4(0, (List) w28.c));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new mdb(new n3(str, 1));
                    }
                    if (i == 257) {
                        return new end(new aqg("application/vnd.dvb.ait", 12));
                    }
                    if (i != 134) {
                        if (i != 135) {
                            switch (i) {
                                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                                    if (g(2)) {
                                        return null;
                                    }
                                    return new mdb(new bc(false, str));
                                case 16:
                                    return new mdb(new qv6(new fj(d(w28))));
                                case LangUtils.HASH_SEED /*17*/:
                                    if (g(2)) {
                                        return null;
                                    }
                                    return new mdb(new yr7(str));
                                default:
                                    switch (i) {
                                        case Uuid.SIZE_BITS:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!g(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new mdb(new n3(str, 0));
                    } else if (g(16)) {
                        return null;
                    } else {
                        return new end(new aqg("application/x-scte35", 12));
                    }
                }
                return new mdb(new lx4(str));
            } else if (g(4)) {
                return null;
            } else {
                return new mdb(new uv6(new ata(d(w28)), g(1), g(8)));
            }
        }
        return new mdb(new mv6(new fj(d(w28))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        return new defpackage.ndb(new defpackage.o3(r2, r7.e(), 0));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.stf c(int r6, defpackage.g7a r7) {
        /*
            r5 = this;
            r0 = 2
            if (r6 == r0) goto L_0x015b
            r1 = 3
            java.lang.Object r2 = r7.b
            java.lang.String r2 = (java.lang.String) r2
            if (r6 == r1) goto L_0x014c
            r1 = 4
            if (r6 == r1) goto L_0x014c
            r3 = 21
            if (r6 == r3) goto L_0x0140
            r3 = 27
            r4 = 0
            if (r6 == r3) goto L_0x011a
            r1 = 36
            if (r6 == r1) goto L_0x0106
            r1 = 45
            if (r6 == r1) goto L_0x00fb
            r1 = 89
            if (r6 == r1) goto L_0x00eb
            r1 = 172(0xac, float:2.41E-43)
            if (r6 == r1) goto L_0x00db
            r1 = 257(0x101, float:3.6E-43)
            if (r6 == r1) goto L_0x00ce
            r1 = 138(0x8a, float:1.93E-43)
            if (r6 == r1) goto L_0x00bd
            r1 = 139(0x8b, float:1.95E-43)
            if (r6 == r1) goto L_0x00ac
            switch(r6) {
                case 15: goto L_0x0095;
                case 16: goto L_0x0081;
                case 17: goto L_0x006b;
                default: goto L_0x0035;
            }
        L_0x0035:
            switch(r6) {
                case 128: goto L_0x015b;
                case 129: goto L_0x005b;
                case 130: goto L_0x0052;
                default: goto L_0x0038;
            }
        L_0x0038:
            switch(r6) {
                case 134: goto L_0x003c;
                case 135: goto L_0x005b;
                case 136: goto L_0x00bd;
                default: goto L_0x003b;
            }
        L_0x003b:
            return r4
        L_0x003c:
            r6 = 16
            boolean r5 = r5.g(r6)
            if (r5 == 0) goto L_0x0045
            goto L_0x0051
        L_0x0045:
            fnd r4 = new fnd
            o5h r5 = new o5h
            java.lang.String r6 = "application/x-scte35"
            r5.<init>(r6)
            r4.<init>(r5)
        L_0x0051:
            return r4
        L_0x0052:
            r6 = 64
            boolean r5 = r5.g(r6)
            if (r5 != 0) goto L_0x00bd
            return r4
        L_0x005b:
            ndb r5 = new ndb
            o3 r6 = new o3
            int r7 = r7.e()
            r0 = 0
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x006b:
            boolean r5 = r5.g(r0)
            if (r5 == 0) goto L_0x0072
            goto L_0x0080
        L_0x0072:
            ndb r4 = new ndb
            zr7 r5 = new zr7
            int r6 = r7.e()
            r5.<init>(r2, r6)
            r4.<init>(r5)
        L_0x0080:
            return r4
        L_0x0081:
            ndb r6 = new ndb
            qv6 r0 = new qv6
            xe8 r1 = new xe8
            java.util.List r5 = r5.e(r7)
            r1.<init>((java.util.List) r5)
            r0.<init>((defpackage.xe8) r1)
            r6.<init>(r0)
            return r6
        L_0x0095:
            boolean r5 = r5.g(r0)
            if (r5 == 0) goto L_0x009c
            goto L_0x00ab
        L_0x009c:
            ndb r4 = new ndb
            cc r5 = new cc
            int r6 = r7.e()
            r7 = 0
            r5.<init>(r7, r2, r6)
            r4.<init>(r5)
        L_0x00ab:
            return r4
        L_0x00ac:
            ndb r5 = new ndb
            mx4 r6 = new mx4
            int r7 = r7.e()
            r0 = 5408(0x1520, float:7.578E-42)
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00bd:
            ndb r5 = new ndb
            mx4 r6 = new mx4
            int r7 = r7.e()
            r0 = 4096(0x1000, float:5.74E-42)
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00ce:
            fnd r5 = new fnd
            o5h r6 = new o5h
            java.lang.String r7 = "application/vnd.dvb.ait"
            r6.<init>(r7)
            r5.<init>(r6)
            return r5
        L_0x00db:
            ndb r5 = new ndb
            o3 r6 = new o3
            int r7 = r7.e()
            r0 = 1
            r6.<init>(r2, r7, r0)
            r5.<init>(r6)
            return r5
        L_0x00eb:
            ndb r5 = new ndb
            qy4 r6 = new qy4
            java.lang.Object r7 = r7.c
            java.util.List r7 = (java.util.List) r7
            r0 = 1
            r6.<init>(r0, r7)
            r5.<init>(r6)
            return r5
        L_0x00fb:
            ndb r5 = new ndb
            cv9 r6 = new cv9
            r6.<init>()
            r5.<init>(r6)
            return r5
        L_0x0106:
            ndb r6 = new ndb
            wv6 r0 = new wv6
            wsb r1 = new wsb
            java.util.List r5 = r5.e(r7)
            r1.<init>((java.util.List) r5)
            r0.<init>((defpackage.wsb) r1)
            r6.<init>(r0)
            return r6
        L_0x011a:
            boolean r6 = r5.g(r1)
            if (r6 == 0) goto L_0x0121
            goto L_0x013f
        L_0x0121:
            ndb r4 = new ndb
            uv6 r6 = new uv6
            wsb r0 = new wsb
            java.util.List r7 = r5.e(r7)
            r0.<init>((java.util.List) r7)
            r7 = 1
            boolean r7 = r5.g(r7)
            r1 = 8
            boolean r5 = r5.g(r1)
            r6.<init>((defpackage.wsb) r0, (boolean) r7, (boolean) r5)
            r4.<init>(r6)
        L_0x013f:
            return r4
        L_0x0140:
            ndb r5 = new ndb
            qy4 r6 = new qy4
            r7 = 3
            r6.<init>(r7)
            r5.<init>(r6)
            return r5
        L_0x014c:
            ndb r5 = new ndb
            av9 r6 = new av9
            int r7 = r7.e()
            r6.<init>(r2, r7)
            r5.<init>(r6)
            return r5
        L_0x015b:
            ndb r6 = new ndb
            nv6 r0 = new nv6
            xe8 r1 = new xe8
            java.util.List r5 = r5.e(r7)
            r1.<init>((java.util.List) r5)
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kk3.c(int, g7a):stf");
    }

    public List d(w28 w28) {
        ArrayList arrayList;
        String str;
        int i;
        List list;
        boolean g = g(32);
        List list2 = this.c;
        if (g) {
            return list2;
        }
        g1g g1g = new g1g((byte[]) w28.o);
        List list3 = list2;
        while (g1g.c() > 0) {
            int v = g1g.v();
            int v2 = g1g.b + g1g.v();
            if (v == 134) {
                ArrayList arrayList2 = new ArrayList();
                int v3 = g1g.v() & 31;
                for (int i2 = 0; i2 < v3; i2++) {
                    String t = g1g.t(3, x22.c);
                    int v4 = g1g.v();
                    boolean z = (v4 & Uuid.SIZE_BITS) != 0;
                    if (z) {
                        i = v4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte v5 = (byte) g1g.v();
                    g1g.I(1);
                    if (z) {
                        list = Collections.singletonList((v5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    aa6 aa6 = new aa6();
                    aa6.k = str;
                    aa6.c = t;
                    aa6.C = i;
                    aa6.m = list;
                    arrayList2.add(new ca6(aa6));
                }
                arrayList = arrayList2;
            } else {
                arrayList = list3;
            }
            g1g.H(v2);
            list3 = arrayList;
        }
        return list3;
    }

    public List e(g7a g7a) {
        ArrayList arrayList;
        String str;
        int i;
        List list;
        boolean g = g(32);
        List list2 = this.c;
        if (g) {
            return list2;
        }
        l8b l8b = new l8b((byte[]) g7a.d);
        List list3 = list2;
        while (l8b.a() > 0) {
            int u = l8b.u();
            int u2 = l8b.b + l8b.u();
            if (u == 134) {
                ArrayList arrayList2 = new ArrayList();
                int u3 = l8b.u() & 31;
                for (int i2 = 0; i2 < u3; i2++) {
                    String s = l8b.s(3, x22.c);
                    int u4 = l8b.u();
                    boolean z = (u4 & Uuid.SIZE_BITS) != 0;
                    if (z) {
                        i = u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte u5 = (byte) l8b.u();
                    l8b.H(1);
                    if (z) {
                        list = Collections.singletonList((u5 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    ba6 ba6 = new ba6();
                    ba6.m = vq9.l(str);
                    ba6.d = s;
                    ba6.F = i;
                    ba6.p = list;
                    arrayList2.add(new ea6(ba6));
                }
                arrayList = arrayList2;
            } else {
                arrayList = list3;
            }
            l8b.G(u2);
            list3 = arrayList;
        }
        return list3;
    }

    public boolean f() {
        return this.b < this.c.size();
    }

    public boolean g(int i) {
        switch (this.a) {
            case 2:
                return (this.b & i) != 0;
            default:
                return (this.b & i) != 0;
        }
    }

    public kk3(kk3 kk3) {
        this.a = 1;
        this.b = kk3.b;
        this.c = kk3.c;
    }

    public kk3(int i) {
        this.a = 0;
        this.b = i;
    }

    public kk3(ArrayList arrayList) {
        this.a = 4;
        this.c = arrayList;
    }
}
