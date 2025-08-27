package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fm4  reason: default package */
public class fm4 implements cm4 {
    public gng a = null;
    public boolean b = false;
    public boolean c = false;
    public final gng d;
    public int e = 1;
    public int f;
    public int g;
    public int h = 1;
    public uo4 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public fm4(gng gng) {
        this.d = gng;
    }

    public final void a(cm4 cm4) {
        ArrayList arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((fm4) it.next()).j) {
                return;
            }
        }
        this.c = true;
        gng gng = this.a;
        if (gng != null) {
            gng.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        fm4 fm4 = null;
        int i2 = 0;
        while (it2.hasNext()) {
            fm4 fm42 = (fm4) it2.next();
            if (!(fm42 instanceof uo4)) {
                i2++;
                fm4 = fm42;
            }
        }
        if (fm4 != null && i2 == 1 && fm4.j) {
            uo4 uo4 = this.i;
            if (uo4 != null) {
                if (uo4.j) {
                    this.f = this.h * uo4.g;
                } else {
                    return;
                }
            }
            d(fm4.g + this.f);
        }
        gng gng2 = this.a;
        if (gng2 != null) {
            gng2.a(this);
        }
    }

    public final void b(cm4 cm4) {
        this.k.add(cm4);
        if (this.j) {
            cm4.a(cm4);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i2) {
        if (!this.j) {
            this.j = true;
            this.g = i2;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                cm4 cm4 = (cm4) it.next();
                cm4.a(cm4);
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
