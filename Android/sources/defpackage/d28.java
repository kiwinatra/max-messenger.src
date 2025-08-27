package defpackage;

import androidx.work.WorkRequest;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KProperty;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: d28  reason: default package */
public final class d28 {
    public static void a(ipg ipg, boolean z) {
        z68.c(LoadEmojiFontWorker.TAG, "start", new Object[0]);
        v3b v3b = (v3b) new v3b(LoadEmojiFontWorker.class).setBackoffCriteria(ag0.a, WorkRequest.MIN_BACKOFF_MILLIS, TimeUnit.MILLISECONDS);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = z ? 2 : 3;
        xv1 xv1 = new xv1(15);
        Pair pair = new Pair[]{TuplesKt.to(LoadEmojiFontWorker.WAITING_FOR_WIFI, Boolean.valueOf(z))}[0];
        xv1.w(pair.getSecond(), (String) pair.getFirst());
        w3b w3b = (w3b) ((v3b) ((v3b) ((v3b) ((v3b) v3b.setConstraints(new wj3(i, false, false, false, false, -1, -1, CollectionsKt.toSet(linkedHashSet)))).setExpedited(t5b.a)).addTag(LoadEmojiFontWorker.TAG)).setInputData(xv1.m())).build();
        UUID id = w3b.getId();
        z68.c(LoadEmojiFontWorker.TAG, "work " + id, new Object[0]);
        fb5 fb5 = fb5.b;
        KProperty[] kPropertyArr = ipg.n;
        ipg ipg2 = ipg;
        ipg.b(LoadEmojiFontWorker.TAG, fb5, w3b, false).v();
    }
}
