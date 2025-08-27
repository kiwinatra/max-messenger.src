package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import one.me.rlottie.RLottie;
import one.me.rlottie.g;

/* renamed from: xvg  reason: default package */
public final /* synthetic */ class xvg implements Runnable {
    public static final /* synthetic */ xvg b = new xvg(0);
    public final /* synthetic */ int a;

    public /* synthetic */ xvg(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    public final void run() {
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                ArrayList arrayList = g.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    g.j = null;
                    return;
                }
                ArrayList arrayList2 = g.j;
                g.j = null;
                if (g.k == null) {
                    g.k = new g(Math.max(1, RLottie.config.corePoolSize));
                }
                RLottie.config.workQueue.post(new ue(3, arrayList2));
                return;
            case 3:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (s15.p != null) {
                        s15.a().d();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
            case 5:
            case 6:
                return;
            default:
                ((ec8) vi9.a.getAccessor().g(ec8.class)).a(CollectionsKt.listOf(new zbb(0)));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
