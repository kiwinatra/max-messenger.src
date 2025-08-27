package defpackage;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: jq5  reason: default package */
public final class jq5 implements eo0 {
    public static final jq5 c = new jq5(0, 1);
    public static final jq5 d = new jq5(0, 2);
    public static final jq5 e = new jq5(0, 3);
    public static final jq5 f = new jq5(1, 3);
    public static final jq5 g = new jq5(2, 3);
    public final /* synthetic */ int a;
    public int b;

    public /* synthetic */ jq5(int i) {
        this.a = i;
    }

    public int a(int i) {
        int i2 = this.b;
        int i3 = i % i2;
        Integer valueOf = Integer.valueOf(i3);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return valueOf != null ? valueOf.intValue() : i2 + i3;
    }

    public boolean b(int i) {
        int i2 = this.b;
        return i2 != 0 && (i2 & i) == i;
    }

    public void f() {
    }

    public void g(zc4 zc4, do0 do0, dg dgVar, int i, Function0 function0) {
        zc4 zc42 = zc4;
        int i2 = this.b;
        if (1 <= i2) {
            int i3 = 1;
            while (true) {
                int e2 = (i + i3) % dgVar.e();
                if (bg5.e(2)) {
                    bg5.g(jq5.class, "Preparing frame %d, last drawn: %d", Integer.valueOf(e2), Integer.valueOf(i));
                }
                zc4.getClass();
                int hashCode = (dgVar.hashCode() * 31) + e2;
                synchronized (((SparseArray) zc42.v)) {
                    if (((SparseArray) zc42.v).get(hashCode) != null) {
                        bg5.f(zc4.class, Integer.valueOf(e2), "Already scheduled decode job for frame %d");
                        do0 do02 = do0;
                    } else if (do0.o(e2)) {
                        bg5.f(zc4.class, Integer.valueOf(e2), "Frame %d is cached already.");
                    } else {
                        yc4 yc4 = new yc4(zc4, dgVar, do0, e2, hashCode);
                        ((SparseArray) zc42.v).put(hashCode, yc4);
                        ((ExecutorService) zc42.o).execute(yc4);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    public y33 h(int i, int i2, int i3) {
        return null;
    }

    public void i() {
    }

    public void j(int i, int i2) {
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "Restrictions{restrictions=" + this.b + ", cannotInvite=" + b(1) + ", cannotModifyIcon=" + b(2) + ", cannotModifyTitle=" + b(4) + ", cannotLeave=" + b(8) + ", cannotPin=" + b(16) + ", cannotLiveLocation=" + b(32) + ", cannotInput=" + b(64) + '}';
            case 3:
                return wj6.l(new StringBuilder("{value="), this.b, "}");
            case 6:
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return String.format((Locale) null, "Status: %d", Arrays.copyOf(new Object[]{Integer.valueOf(this.b)}, 1));
            default:
                return super.toString();
        }
    }

    public /* synthetic */ jq5(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public /* synthetic */ jq5(boolean z) {
        this.a = 8;
    }

    public jq5() {
        this.a = 4;
        this.b = 3;
    }
}
