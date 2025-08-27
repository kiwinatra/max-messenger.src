package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import java.util.Arrays;

/* renamed from: e13  reason: default package */
public final class e13 {
    public int a;
    public int b;
    public int[] c;
    public int d;

    public e13() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.d = highestOneBit - 1;
        this.c = new int[highestOneBit];
    }

    public void a(int i) {
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        int i3 = this.d & (i2 + 1);
        this.b = i3;
        int i4 = this.a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 >= 0) {
                int[] iArr2 = new int[i6];
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr2, 0, i4, length);
                ArraysKt___ArraysJvmKt.copyInto(this.c, iArr2, i5, 0, this.a);
                this.c = iArr2;
                this.a = 0;
                this.b = length;
                this.d = i6 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public void b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        } else if (i2 >= 0) {
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[(i3 * 4)];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        } else {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        a aVar = recyclerView.z0;
        if (recyclerView.y0 != null && aVar != null && aVar.i) {
            if (z) {
                if (!recyclerView.v.A()) {
                    aVar.j(recyclerView.y0.j(), this);
                }
            } else if (!recyclerView.Z()) {
                aVar.i(this.a, this.b, recyclerView.q1, this);
            }
            int i = this.d;
            if (i > aVar.j) {
                aVar.j = i;
                aVar.k = z;
                recyclerView.c.l();
            }
        }
    }
}
