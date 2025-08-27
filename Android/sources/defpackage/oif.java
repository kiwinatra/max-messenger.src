package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: oif  reason: default package */
public class oif {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(oif.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public x85[] a;

    public final void a(x85 x85) {
        x85.d((y85) this);
        x85[] x85Arr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (x85Arr == null) {
            x85Arr = new x85[4];
            this.a = x85Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= x85Arr.length) {
            x85Arr = (x85[]) Arrays.copyOf(x85Arr, atomicIntegerFieldUpdater.get(this) * 2);
            this.a = x85Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        x85Arr[i] = x85;
        x85.b = i;
        while (i > 0) {
            x85[] x85Arr2 = this.a;
            int i2 = (i - 1) / 2;
            if (x85Arr2[i2].compareTo(x85Arr2[i]) > 0) {
                c(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    public final x85 b(int i) {
        x85[] x85Arr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            c(i, atomicIntegerFieldUpdater.get(this));
            int i2 = (i - 1) / 2;
            if (i <= 0 || x85Arr[i].compareTo(x85Arr[i2]) >= 0) {
                while (true) {
                    int i3 = i * 2;
                    int i4 = i3 + 1;
                    if (i4 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                    }
                    x85[] x85Arr2 = this.a;
                    int i5 = i3 + 2;
                    if (i5 >= atomicIntegerFieldUpdater.get(this) || x85Arr2[i5].compareTo(x85Arr2[i4]) >= 0) {
                        i5 = i4;
                    }
                    if (x85Arr2[i].compareTo(x85Arr2[i5]) <= 0) {
                        break;
                    }
                    c(i, i5);
                    i = i5;
                }
            } else {
                c(i, i2);
                while (i2 > 0) {
                    x85[] x85Arr3 = this.a;
                    int i6 = (i2 - 1) / 2;
                    if (x85Arr3[i6].compareTo(x85Arr3[i2]) <= 0) {
                        break;
                    }
                    c(i2, i6);
                    i2 = i6;
                }
            }
        }
        x85 x85 = x85Arr[atomicIntegerFieldUpdater.get(this)];
        x85.d((y85) null);
        x85.b = -1;
        x85Arr[atomicIntegerFieldUpdater.get(this)] = null;
        return x85;
    }

    public final void c(int i, int i2) {
        x85[] x85Arr = this.a;
        x85 x85 = x85Arr[i2];
        x85 x852 = x85Arr[i];
        x85Arr[i] = x85;
        x85Arr[i2] = x852;
        x85.b = i;
        x852.b = i2;
    }
}
