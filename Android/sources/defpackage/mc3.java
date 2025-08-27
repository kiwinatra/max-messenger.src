package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: mc3  reason: default package */
public final class mc3 extends cjf {
    public final /* synthetic */ int h;
    public final Object i;

    public /* synthetic */ mc3(int i2, Object obj) {
        this.h = i2;
        this.i = obj;
    }

    public final cjf e(Object obj) {
        switch (this.h) {
            case 0:
                ((PrintStream) this.i).print(obj);
                return this;
            default:
                ((PrintWriter) this.i).print(obj);
                return this;
        }
    }
}
