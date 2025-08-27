package defpackage;

/* renamed from: ta0  reason: default package */
public final class ta0 {
    public final Object a;
    public final wb0 b;

    public ta0(Object obj, wb0 wb0) {
        if (obj != null) {
            this.a = obj;
            this.b = wb0;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ta0)) {
            return false;
        }
        ta0 ta0 = (ta0) obj;
        ta0.getClass();
        if (this.a.equals(ta0.a)) {
            tub tub = tub.a;
            if (tub.equals(tub)) {
                wb0 wb0 = ta0.b;
                wb0 wb02 = this.b;
                if (wb02 == null) {
                    if (wb0 == null) {
                        return true;
                    }
                } else if (wb02.equals(wb0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ tub.a.hashCode()) * 1000003;
        wb0 wb0 = this.b;
        return (wb0 == null ? 0 : wb0.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + tub.a + ", productData=" + this.b + "}";
    }
}
