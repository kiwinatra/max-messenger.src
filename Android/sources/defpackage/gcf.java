package defpackage;

import kotlin.Lazy;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: gcf  reason: default package */
public final class gcf {
    public static final /* synthetic */ int b = 0;
    public final Lazy a;

    public gcf(Lazy lazy) {
        this.a = lazy;
    }

    public static boolean a(int i) {
        return i == 2 || i == 3;
    }

    public static boolean c(Throwable th) {
        return (th instanceof TamErrorException) && m58.A(((TamErrorException) th).a.b);
    }

    public static boolean d(Throwable th) {
        return (th instanceof TamErrorException) && "io.exception".equals(((TamErrorException) th).a.b);
    }

    public final rka b() {
        om0 om0 = ((jxd) ((hxd) this.a.getValue())).e;
        dre dre = new dre(20);
        om0.getClass();
        return new mha(om0, dre, 1).y(1);
    }
}
