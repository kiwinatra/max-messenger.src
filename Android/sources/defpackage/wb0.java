package defpackage;

/* renamed from: wb0  reason: default package */
public final class wb0 {
    public final Integer a;

    public wb0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wb0)) {
            return false;
        }
        wb0 wb0 = (wb0) obj;
        Integer num = this.a;
        return num == null ? wb0.a == null : num.equals(wb0.a);
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
