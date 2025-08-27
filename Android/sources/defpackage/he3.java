package defpackage;

/* renamed from: he3  reason: default package */
public final class he3 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public he3(int i) {
        this.a = i;
    }

    public void a(Object obj) {
        Object obj2;
        Object obj3;
        Object[] objArr = (Object[]) this.d;
        int i = this.a;
        int hashCode = obj.hashCode() * -1640531527;
        int i2 = (hashCode ^ (hashCode >>> 16)) & i;
        Object obj4 = objArr[i2];
        if (obj4 != null) {
            if (!obj4.equals(obj)) {
                do {
                    i2 = (i2 + 1) & i;
                    obj3 = objArr[i2];
                    if (obj3 == null) {
                    }
                } while (!obj3.equals(obj));
                return;
            }
            return;
        }
        objArr[i2] = obj;
        int i3 = this.b + 1;
        this.b = i3;
        if (i3 >= this.c) {
            Object[] objArr2 = (Object[]) this.d;
            int length = objArr2.length;
            int i4 = length << 1;
            int i5 = i4 - 1;
            Object[] objArr3 = new Object[i4];
            while (true) {
                int i6 = i3 - 1;
                if (i3 != 0) {
                    do {
                        length--;
                        obj2 = objArr2[length];
                    } while (obj2 == null);
                    int hashCode2 = obj2.hashCode() * -1640531527;
                    int i7 = (hashCode2 ^ (hashCode2 >>> 16)) & i5;
                    if (objArr3[i7] != null) {
                        do {
                            i7 = (i7 + 1) & i5;
                        } while (objArr3[i7] != null);
                    }
                    objArr3[i7] = objArr2[length];
                    i3 = i6;
                } else {
                    this.a = i5;
                    this.c = (int) (((float) i4) * 0.75f);
                    this.d = objArr3;
                    return;
                }
            }
        }
    }

    public in4 b() {
        n79.g(this.b <= this.c);
        return new in4(this);
    }

    public void c(Object[] objArr, int i, int i2) {
        int i3;
        Object obj;
        this.b--;
        while (true) {
            int i4 = i + 1;
            while (true) {
                i3 = i4 & i2;
                obj = objArr[i3];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int hashCode = obj.hashCode() * -1640531527;
                int i5 = (hashCode ^ (hashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i5 || i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                } else {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i4 = i3 + 1;
                }
            }
            objArr[i] = obj;
            i = i3;
        }
    }
}
