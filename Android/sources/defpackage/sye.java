package defpackage;

/* renamed from: sye  reason: default package */
public final class sye extends n6e implements ome {
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) m5a.c(this.y, (this.z + ((long) ((int) ((r() + ((long) this.Y)) - this.z)))) - 1)).intValue());
        }
        return valueOf;
    }

    public final void y(int i) {
        synchronized (this) {
            d(Integer.valueOf(((Number) m5a.c(this.y, (this.z + ((long) ((int) ((r() + ((long) this.Y)) - this.z)))) - 1)).intValue() + i));
        }
    }
}
