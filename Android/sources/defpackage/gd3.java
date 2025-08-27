package defpackage;

import java.util.List;

/* renamed from: gd3  reason: default package */
public final class gd3 {
    public tb7 a;
    public t9a b;
    public o05 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public gd3(List list, t9a t9a, o05 o05, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        n79.f("Audio transmuxing and audio track forcing are not allowed together.", !z2 || !z);
        this.a = tb7.p(list);
        this.b = t9a;
        this.c = o05;
        this.e = z2;
        this.f = z3;
        this.d = z;
        this.g = i;
        this.h = z4;
    }

    public gd3 a() {
        tb7 tb7 = this.a;
        boolean z = this.f;
        int i = this.g;
        return new gd3(tb7, this.b, this.c, this.d, this.e, z, i, this.h && i == 0);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gd3, java.lang.Object] */
    public gd3 b() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public void c(List list) {
        n79.f("The composition must contain at least one EditedMediaItemSequence.", !list.isEmpty());
        this.a = tb7.p(list);
    }
}
