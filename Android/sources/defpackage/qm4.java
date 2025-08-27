package defpackage;

/* renamed from: qm4  reason: default package */
public final class qm4 extends q8 {
    public final void O(Object obj, float f) {
        rm4 rm4 = (rm4) obj;
        rm4.x0.b = f / 10000.0f;
        rm4.invalidateSelf();
    }

    public final float q(Object obj) {
        return ((rm4) obj).x0.b * 10000.0f;
    }
}
