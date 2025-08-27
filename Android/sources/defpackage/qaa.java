package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: qaa  reason: default package */
public final class qaa extends ibf {
    public List X;
    public long c;
    public ArrayList o;
    public int v;
    public wt w;
    public int x;
    public long y;
    public ArrayList z;

    public qaa(pf9 pf9) {
        super(pf9);
    }

    public final void c(pf9 pf9, String str) {
        ArrayList arrayList;
        wt wtVar;
        int i = 1;
        str.getClass();
        ArrayList arrayList2 = null;
        int i2 = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2005455306:
                if (str.equals("recentsList")) {
                    c2 = 0;
                    break;
                }
                break;
            case -310976023:
                if (str.equals("recentEmojiList")) {
                    c2 = 1;
                    break;
                }
                break;
            case -295915613:
                if (str.equals("updateType")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3355:
                if (str.equals("id")) {
                    c2 = 3;
                    break;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    c2 = 4;
                    break;
                }
                break;
            case 3545755:
                if (str.equals("sync")) {
                    c2 = 5;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c2 = 6;
                    break;
                }
                break;
            case 109327645:
                if (str.equals("setId")) {
                    c2 = 7;
                    break;
                }
                break;
            case 747804969:
                if (str.equals("position")) {
                    c2 = 8;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (pf9.n().a() == 7) {
                    arrayList2 = new ArrayList();
                    int t0 = pf9.t0();
                    while (i2 < t0) {
                        arrayList2.add(puc.a(pf9));
                        i2++;
                    }
                } else {
                    pf9.A();
                }
                this.z = arrayList2;
                return;
            case 1:
                if (pf9.n().a() == 7) {
                    ArrayList arrayList3 = new ArrayList();
                    int t02 = pf9.t0();
                    while (i2 < t02) {
                        nuc a = nuc.a(pf9);
                        if (a != null) {
                            arrayList3.add(a);
                        }
                        i2++;
                    }
                    arrayList = arrayList3;
                } else {
                    pf9.A();
                    arrayList = Collections.emptyList();
                }
                this.X = arrayList;
                return;
            case 2:
                String g0 = ryg.g0(pf9);
                wt[] wtVarArr = wt.o;
                int length = wtVarArr.length;
                while (true) {
                    if (i2 < length) {
                        wtVar = wtVarArr[i2];
                        if (!wtVar.a.equalsIgnoreCase(g0)) {
                            i2++;
                        }
                    } else {
                        wtVar = wt.UNKNOWN;
                    }
                }
                this.w = wtVar;
                return;
            case 3:
                this.c = ryg.d0(pf9, 0);
                return;
            case 4:
                if (pf9.n().a() == 7) {
                    arrayList2 = new ArrayList();
                    int t03 = pf9.t0();
                    while (i2 < t03) {
                        arrayList2.add(Long.valueOf(ryg.d0(pf9, 0)));
                        i2++;
                    }
                } else {
                    pf9.A();
                }
                this.o = arrayList2;
                return;
            case 5:
                this.y = ryg.d0(pf9, 0);
                return;
            case 6:
                String g02 = ryg.g0(pf9);
                int[] A = tr1.A(10);
                int length2 = A.length;
                while (true) {
                    if (i2 < length2) {
                        int i3 = A[i2];
                        if (tr1.d(i3).equals(g02)) {
                            i = i3;
                        } else {
                            i2++;
                        }
                    }
                }
                this.v = i;
                return;
            case 7:
                ryg.d0(pf9, 0);
                return;
            case 8:
                this.x = ryg.c0(pf9);
                return;
            default:
                pf9.A();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        int i = this.v;
        wt wtVar = this.w;
        int i2 = this.x;
        int o2 = kv0.o(this.X);
        int o3 = kv0.o(this.z);
        StringBuilder n = tr1.n(j, "Response{id=", ", assetType=");
        n.append(tr1.z(i));
        n.append(", updateType=");
        n.append(wtVar);
        n.append(", position=");
        g63.o(n, i2, ", recentEmojiList=", o2, ", recentsList=");
        return wj6.l(n, o3, "}");
    }
}
