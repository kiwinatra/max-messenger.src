package defpackage;

/* renamed from: ezg  reason: default package */
public final class ezg extends fzg {
    public final int o;

    public ezg(int i, byte[] bArr) {
        super(bArr);
        fzg.f(0, i, bArr.length);
        this.o = i;
    }

    public final byte b(int i) {
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
        int i2 = this.o;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.b[i];
        }
        if (i < 0) {
            String h = wj6.h(i, "Index < 0: ");
            throw arrayIndexOutOfBoundsException;
        }
        arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(g63.h("Index > length: ", i, i2, ", "));
        throw arrayIndexOutOfBoundsException;
    }

    public final byte d(int i) {
        return this.b[i];
    }

    public final int e() {
        return this.o;
    }
}
