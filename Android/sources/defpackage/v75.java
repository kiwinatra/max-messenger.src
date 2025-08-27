package defpackage;

import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.text.Typography;

/* renamed from: v75  reason: default package */
public final class v75 implements aq7 {
    public final Enum[] a;
    public final usd b;
    public final Lazy c = LazyKt.lazy(new u75(0, this));

    public v75(Enum[] enumArr, t75 t75) {
        this.a = enumArr;
        this.b = t75;
    }

    public final Object a(u9 u9Var) {
        int p = u9Var.p(d());
        Enum[] enumArr = this.a;
        if (p >= 0 && p < enumArr.length) {
            return enumArr[p];
        }
        throw new IllegalArgumentException(p + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    public final void b(cy3 cy3, Object obj) {
        Enum enumR = (Enum) obj;
        Enum[] enumArr = this.a;
        int indexOf = ArraysKt.indexOf((T[]) enumArr, enumR);
        if (indexOf != -1) {
            cy3.d(d(), indexOf);
            return;
        }
        throw new IllegalArgumentException(enumR + " is not a valid enum " + d().a() + ", must be one of " + Arrays.toString(enumArr));
    }

    public final usd d() {
        return (usd) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + Typography.greater;
    }
}
