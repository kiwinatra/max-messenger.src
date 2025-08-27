package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* renamed from: qp6  reason: default package */
public class qp6 extends gk0 {
    public final int[] Y;

    public qp6(u9a u9a, pqb pqb, v9a v9a) {
        super(u9a, pqb, v9a);
        SparseIntArray sparseIntArray = pqb.c;
        if (sparseIntArray != null) {
            this.Y = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.Y[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.Y = new int[0];
        }
        this.b.getClass();
        this.z.getClass();
    }

    public final Object a(int i) {
        return new byte[i];
    }

    public final /* bridge */ /* synthetic */ void d(Object obj) {
        byte[] bArr = (byte[]) obj;
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
        return ((byte[]) obj).length;
    }

    public final int h(int i) {
        return i;
    }
}
