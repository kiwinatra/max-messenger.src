package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* renamed from: d69  reason: default package */
public abstract class d69 extends gk0 {
    public final int[] Y;

    public d69(g69 g69, pqb pqb, qqb qqb) {
        super(g69, pqb, qqb);
        SparseIntArray sparseIntArray = pqb.c;
        sparseIntArray.getClass();
        this.Y = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.Y;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                this.b.getClass();
                this.z.getClass();
                return;
            }
        }
    }

    public final void d(Object obj) {
        c69 c69 = (c69) obj;
        c69.getClass();
        c69.close();
    }

    public final int f(int i) {
        if (i > 0) {
            for (int i2 : this.Y) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new BasePool$InvalidSizeException(Integer.valueOf(i));
    }

    public final int g(Object obj) {
        c69 c69 = (c69) obj;
        c69.getClass();
        return c69.getSize();
    }

    public final int h(int i) {
        return i;
    }

    public final boolean k(Object obj) {
        c69 c69 = (c69) obj;
        c69.getClass();
        return !c69.isClosed();
    }
}
