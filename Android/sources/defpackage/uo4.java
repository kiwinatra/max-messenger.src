package defpackage;

import java.util.Iterator;

/* renamed from: uo4  reason: default package */
public class uo4 extends fm4 {
    public int m;

    public uo4(gng gng) {
        super(gng);
        if (gng instanceof s27) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    public final void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                cm4 cm4 = (cm4) it.next();
                cm4.a(cm4);
            }
        }
    }
}
