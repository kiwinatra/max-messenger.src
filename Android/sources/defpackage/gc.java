package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import androidx.work.WorkRequest;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import one.me.android.OneMeApplication;
import one.me.rlottie.RLottie;
import one.me.rlottie.b;
import one.me.rlottie.c;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;

/* renamed from: gc  reason: default package */
public final /* synthetic */ class gc implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ gc(int i) {
        this.a = i;
    }

    private final void a() {
    }

    public final void run() {
        switch (this.a) {
            case 0:
                int i = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                float andSet = (float) gg.a.getAndSet(0);
                float andSet2 = (float) gg.b.getAndSet(0);
                float andSet3 = (float) gg.c.getAndSet(0);
                float f = andSet + andSet2 + andSet3;
                if (f > c44.DEFAULT_ASPECT_RATIO) {
                    float f2 = andSet / f;
                    float f3 = andSet3 / f;
                    int i2 = ((andSet2 / f) > 0.25f ? 1 : ((andSet2 / f) == 0.25f ? 0 : -1));
                    ConcurrentHashMap concurrentHashMap = gg.d;
                    if (i2 > 0 || f3 > 0.1f) {
                        for (Map.Entry entry : concurrentHashMap.entrySet()) {
                            gg.a((le6) entry.getKey(), -((Number) entry.getValue()).intValue());
                        }
                    } else if (f2 > 0.98f) {
                        for (Map.Entry entry2 : concurrentHashMap.entrySet()) {
                            gg.a((le6) entry2.getKey(), ((Number) entry2.getValue()).intValue());
                        }
                    }
                    concurrentHashMap.clear();
                }
                ((Handler) gg.e.getValue()).postDelayed(gg.f, 2000);
                return;
            case 2:
                long currentTimeMillis = System.currentTimeMillis() - WorkRequest.MIN_BACKOFF_MILLIS;
                ConcurrentHashMap concurrentHashMap2 = ke6.d;
                Date date = new Date(currentTimeMillis);
                ConcurrentHashMap concurrentHashMap3 = ke6.d;
                synchronized (concurrentHashMap3) {
                    try {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry3 : concurrentHashMap3.entrySet()) {
                            if (((hwf) entry3.getValue()).b.compareTo(date) < 0) {
                                linkedHashMap.put(entry3.getKey(), entry3.getValue());
                            }
                        }
                        for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                            yt0 yt0 = ((hwf) entry4.getValue()).a;
                            ConcurrentHashMap concurrentHashMap4 = yt0.f;
                            for (xt0 xt0 : concurrentHashMap4.values()) {
                                y33.U(xt0.a);
                            }
                            concurrentHashMap4.clear();
                            yt0.j = -1;
                            ke6.d.remove(entry4.getKey());
                        }
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
                ((Handler) gg.e.getValue()).postDelayed(gg.g, WorkRequest.MIN_BACKOFF_MILLIS);
                return;
            case 3:
                b bVar = c.A;
                if (bVar != null) {
                    ArrayList arrayList = null;
                    for (int i3 = 0; i3 < c.x; i3++) {
                        Bitmap[] bitmapArr = bVar.b;
                        if (bitmapArr[i3] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(bitmapArr[i3]);
                        }
                        bitmapArr[i3] = null;
                        bVar.a[i3] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        RLottie.config.workQueue.post(new ue(2, arrayList));
                    }
                    c.A = null;
                    return;
                }
                return;
            case 4:
                ExecutorService executorService = hz0.m2;
                return;
            case 5:
                return;
            case 6:
                int i4 = qs1.g;
                return;
            case 7:
                EglBase10Impl.EglConnection.lambda$new$1();
                return;
            case 8:
                EglBase14Impl.EglConnection.lambda$new$1();
                return;
            case 9:
                throw null;
            case 10:
                int i5 = OneMeApplication.X;
                doa e = sjd.a.e();
                e.getClass();
                z68.c("doa", "invalidate", new Object[0]);
                if (!e.e()) {
                    e.h(false);
                    return;
                }
                return;
            case 11:
                w6b.v.set(w6b.o);
                return;
            case 12:
                int i6 = wud.o;
                return;
            default:
                String[] strArr = bug.F;
                return;
        }
    }
}
