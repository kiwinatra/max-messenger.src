package defpackage;

import java.util.Objects;
import java.util.function.Predicate;

/* renamed from: lm3  reason: default package */
public final /* synthetic */ class lm3 implements Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ lm3(int i) {
        this.a = i;
    }

    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.isNull((pm3) obj);
            case 1:
                return ((ald) obj).v != null;
            case 2:
                return ((ald) obj).o != null;
            case 3:
                return ((ald) obj).v != null;
            default:
                return ((ald) obj).o != null;
        }
    }
}
