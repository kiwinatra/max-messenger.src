package defpackage;

/* renamed from: dw7  reason: default package */
public final class dw7 extends nk0 {
    public int h;
    public int i;
    public boolean j;
    public int k;

    public final void a() {
        super.a();
        if (this.k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        } else if (this.h != 0) {
        } else {
            if (this.b > 0 && this.g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else if (this.c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
