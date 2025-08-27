package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cqe  reason: default package */
public final class cqe {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final List h;
    public final boolean i;
    public final int j;

    public cqe(aqe aqe) {
        this.a = aqe.a;
        this.b = aqe.b;
        this.c = aqe.c;
        this.d = aqe.d;
        this.e = aqe.e;
        this.f = aqe.f;
        this.g = aqe.h;
        this.h = aqe.g;
        this.i = aqe.i;
        this.j = aqe.j;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [aqe, java.lang.Object] */
    public static cqe a(pf9 pf9) {
        int e0 = ryg.e0(pf9);
        if (e0 == 0) {
            return null;
        }
        ? obj = new Object();
        for (int i2 = 0; i2 < e0; i2++) {
            String A0 = pf9.A0();
            A0.getClass();
            char c2 = 65535;
            switch (A0.hashCode()) {
                case -295931082:
                    if (A0.equals("updateTime")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3355:
                    if (A0.equals("id")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3321850:
                    if (A0.equals("link")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3373707:
                    if (A0.equals("name")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 95844769:
                    if (A0.equals("draft")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 1369213417:
                    if (A0.equals("createTime")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1433072646:
                    if (A0.equals("authorId")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1531715286:
                    if (A0.equals("stickers")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1638765110:
                    if (A0.equals("iconUrl")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 2009367604:
                    if (A0.equals("installCount")) {
                        c2 = 9;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.f = ryg.d0(pf9, 0);
                    break;
                case 1:
                    obj.a = pf9.x0();
                    break;
                case 2:
                    obj.h = ryg.g0(pf9);
                    break;
                case 3:
                    obj.b = ryg.g0(pf9);
                    break;
                case 4:
                    obj.i = ryg.Y(pf9);
                    break;
                case 5:
                    obj.e = ryg.d0(pf9, 0);
                    break;
                case 6:
                    obj.d = ryg.d0(pf9, 0);
                    break;
                case 7:
                    int X = ryg.X(pf9);
                    ArrayList arrayList = new ArrayList(X);
                    for (int i3 = 0; i3 < X; i3++) {
                        arrayList.add(Long.valueOf(pf9.x0()));
                    }
                    obj.g = arrayList;
                    break;
                case 8:
                    obj.c = ryg.g0(pf9);
                    break;
                case 9:
                    obj.j = ryg.c0(pf9);
                    break;
                default:
                    pf9.A();
                    break;
            }
        }
        return new cqe(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickerSet{id=");
        sb.append(this.a);
        sb.append(", name='");
        sb.append(this.b);
        sb.append("', iconUrl='");
        sb.append(this.c);
        sb.append("', authorId=");
        sb.append(this.d);
        sb.append(", createTime=");
        sb.append(this.e);
        sb.append(", updateTime=");
        sb.append(this.f);
        sb.append(", link='");
        sb.append(this.g);
        sb.append("', stickers=");
        sb.append(this.h);
        sb.append(", draft=");
        sb.append(this.i);
        sb.append(", installCount=");
        return wj6.l(sb, this.j, "}");
    }
}
