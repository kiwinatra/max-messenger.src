package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: fxf  reason: default package */
public final /* synthetic */ class fxf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jxf b;
    public final /* synthetic */ bxf c;

    public /* synthetic */ fxf(jxf jxf, bxf bxf, int i) {
        this.a = i;
        this.b = jxf;
        this.c = bxf;
    }

    public final Object call() {
        bxf bxf = this.c;
        jxf jxf = this.b;
        int i = this.a;
        jxf.getClass();
        switch (i) {
            case 0:
                axf b2 = bxf.b();
                String str = bxf.b;
                yqf yqf = jxf.g;
                try {
                    z68.c("jxf", "resizeSticker: path = %s", str);
                    File a2 = ((ln5) yqf.f.getValue()).a("png");
                    if (yqf.e(str, a2.getAbsolutePath())) {
                        z68.c("jxf", "resizeSticker: resized for path = %s", str);
                        str = a2.getAbsolutePath();
                    } else {
                        z68.c("jxf", "resizeSticker: no resize needed for path = %s", str);
                    }
                } catch (IOException e) {
                    z68.f("jxf", "resizeSticker: failed", e);
                }
                b2.b = str;
                return new bxf(b2);
            default:
                axf b3 = bxf.b();
                String str2 = bxf.b;
                yqf yqf2 = jxf.g;
                try {
                    z68.c("jxf", "resizePhoto: path = %s", str2);
                    File a3 = ((ln5) yqf2.f.getValue()).a("jpg");
                    if (o5a.X(((wj0) ((ou8) yqf2.g.getValue())).c, str2, a3.getAbsolutePath())) {
                        z68.c("jxf", "resizePhoto: resized for path = %s", str2);
                        str2 = a3.getAbsolutePath();
                    } else {
                        z68.c("jxf", "resizePhoto: no resize needed for path = %s", str2);
                    }
                } catch (IOException e2) {
                    z68.f("jxf", "resizePhoto: failed", e2);
                }
                b3.b = str2;
                return new bxf(b3);
        }
    }
}
