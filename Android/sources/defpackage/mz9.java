package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: mz9  reason: default package */
public final class mz9 {
    public final CopyOnWriteArraySet a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public mz9() {
        this(true, false, false, false);
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((lz9) it.next()).j(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSettings{");
        if (this.e) {
            sb.append("|audio");
        }
        if (this.f) {
            sb.append("|video");
        }
        if (this.b) {
            sb.append("|screen capture");
        }
        if (this.g) {
            sb.append("|animoji");
        }
        return sb.toString();
    }

    public mz9(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = new CopyOnWriteArraySet();
        this.e = z;
        this.f = z2;
        this.b = z3;
        this.g = z4;
    }
}
