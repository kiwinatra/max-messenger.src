package ru.ok.tamtam.android.calls;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/ok/tamtam/android/calls/MediaProjectionService;", "Landroid/app/Service;", "<init>", "()V", "ru8", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nMediaProjectionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaProjectionService.kt\nru/ok/tamtam/android/calls/MediaProjectionService\n+ 2 Tag.kt\nru/ok/tamtam/logger/TagKt\n*L\n1#1,52:1\n5#2:53\n*S KotlinDebug\n*F\n+ 1 MediaProjectionService.kt\nru/ok/tamtam/android/calls/MediaProjectionService\n*L\n18#1:53\n*E\n"})
public final class MediaProjectionService extends Service {
    public static final /* synthetic */ int v = 0;
    public final Lazy a = LazyKt.lazy(new qu8(this, 0));
    public final Lazy b = LazyKt.lazy(new qu8(this, 1));
    public final ru8 c = new Binder();
    public final String o = MediaProjectionService.class.getName();

    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    public final void onCreate() {
        super.onCreate();
        String str = this.o;
        z68.c(str, "onCreate", new Object[0]);
        ((fn4) this.a.getValue()).f(str);
        pu8 pu8 = (pu8) ((cq) ((mbf) this.b.getValue())).t.getValue();
        eda h = ((pwa) pu8.b.getValue()).h(true, pu8.a, true);
        bq bqVar = pu8.c;
        bqVar.getClass();
        h.f = eda.c(bqVar.a.getString(qad.w8));
        startForeground(12, h.b());
    }

    public final void onDestroy() {
        super.onDestroy();
        String str = this.o;
        z68.c(str, "onDestroy", new Object[0]);
        ((fn4) this.a.getValue()).g(str);
    }
}
