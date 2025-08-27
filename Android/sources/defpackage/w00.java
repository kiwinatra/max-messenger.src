package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.Locale;

/* renamed from: w00  reason: default package */
public final /* synthetic */ class w00 implements qk3, ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y00 b;
    public final /* synthetic */ l20 c;

    public /* synthetic */ w00(y00 y00, l20 l20, int i) {
        this.a = i;
        this.b = y00;
        this.c = l20;
    }

    public void accept(Object obj) {
        Uri uri = (Uri) obj;
        switch (this.a) {
            case 0:
                this.b.d.put(this.c.q, uri);
                return;
            default:
                this.b.d.put(this.c.q, uri);
                return;
        }
    }

    public void e(rh8 rh8) {
        File[] listFiles;
        y00 y00 = this.b;
        y00.getClass();
        Locale locale = Locale.ENGLISH;
        String k = wj6.k("preview_", this.c.q, "_.png");
        po5 po5 = (po5) y00.c;
        po5.getClass();
        File g = po5.g(po5.b(), "previewVideoCache");
        File file = null;
        if (cjf.o(g) && (listFiles = g.listFiles()) != null && listFiles.length != 0) {
            int length = listFiles.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                File file2 = listFiles[i];
                if (cvg.c(file2.getName(), k)) {
                    file = file2;
                    break;
                }
                i++;
            }
        }
        if (rh8.f()) {
            return;
        }
        if (file == null) {
            rh8.b();
        } else {
            rh8.a(file);
        }
    }
}
