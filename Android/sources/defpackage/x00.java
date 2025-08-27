package defpackage;

import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.ok.tamtam.util.HandledException;

/* renamed from: x00  reason: default package */
public final /* synthetic */ class x00 implements qk3, ri8, zi6 {
    public final /* synthetic */ y00 a;

    public /* synthetic */ x00(y00 y00) {
        this.a = y00;
    }

    public void accept(Object obj) {
        y00 y00 = this.a;
        Throwable th = (Throwable) obj;
        y00.getClass();
        z68.f("AttachPreviewDiskCache", "onError", th);
        ((uta) y00.b).c(new HandledException(th), true);
    }

    public Object apply(Object obj) {
        this.a.getClass();
        HashMap hashMap = new HashMap();
        for (File file : (List) obj) {
            String name = file.getName();
            String str = !name.endsWith(".png") ? null : name.split("_")[1];
            if (!cvg.A(str)) {
                hashMap.put(str, Uri.fromFile(file));
            }
        }
        return hashMap;
    }

    public void e(rh8 rh8) {
        po5 po5 = (po5) this.a.c;
        po5.getClass();
        File g = po5.g(po5.b(), "previewVideoCache");
        if (!cjf.o(g) && !rh8.f()) {
            rh8.b();
        }
        File[] listFiles = g.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            Arrays.sort(listFiles, new v00(0));
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < listFiles.length && i < 200) {
                arrayList.add(listFiles[i]);
                i++;
            }
            if (!rh8.f()) {
                rh8.a(arrayList);
            }
        } else if (!rh8.f()) {
            rh8.b();
        }
    }
}
