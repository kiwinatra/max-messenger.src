package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import android.util.Size;
import com.my.tracker.obfuscated.e0;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;

/* renamed from: sx5  reason: default package */
public final /* synthetic */ class sx5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object v;

    public /* synthetic */ sx5(Object obj, Object obj2, Object obj3, long j, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.v = obj3;
        this.b = j;
    }

    public final void run() {
        Rational rational;
        long j;
        switch (this.a) {
            case 0:
                wx5 wx5 = (wx5) this.c;
                do1 do1 = (do1) this.o;
                u05 u05 = (u05) this.v;
                long j2 = this.b;
                if (!wx5.d) {
                    do1.d(new Exception("Camera is not active."));
                    return;
                }
                Rect h = ((urg) wx5.a.i.w).h();
                if (wx5.e != null) {
                    rational = wx5.e;
                } else {
                    Rect h2 = ((urg) wx5.a.i.w).h();
                    rational = new Rational(h2.width(), h2.height());
                }
                List list = (List) u05.b;
                Integer num = (Integer) wx5.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
                List c2 = wx5.c(list, num == null ? 0 : num.intValue(), rational, h, 1);
                List list2 = (List) u05.c;
                Integer num2 = (Integer) wx5.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
                List c3 = wx5.c(list2, num2 == null ? 0 : num2.intValue(), rational, h, 2);
                List list3 = (List) u05.o;
                Integer num3 = (Integer) wx5.a.e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
                Rect rect = h;
                List list4 = c3;
                List c4 = wx5.c(list3, num3 == null ? 0 : num3.intValue(), rational, rect, 4);
                if (!c2.isEmpty() || !list4.isEmpty() || !c4.isEmpty()) {
                    ((HashSet) wx5.a.b.b).remove(wx5.o);
                    do1 do12 = wx5.t;
                    if (do12 != null) {
                        do12.d(new Exception("Cancelled by another startFocusAndMetering()"));
                        wx5.t = null;
                    }
                    ((HashSet) wx5.a.b.b).remove(wx5.p);
                    do1 do13 = wx5.u;
                    if (do13 != null) {
                        do13.d(new Exception("Cancelled by another startFocusAndMetering()"));
                        wx5.u = null;
                    }
                    ScheduledFuture scheduledFuture = wx5.i;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                        wx5.i = null;
                    }
                    wx5.t = do1;
                    MeteringRectangle[] meteringRectangleArr = wx5.x;
                    MeteringRectangle[] meteringRectangleArr2 = (MeteringRectangle[]) c2.toArray(meteringRectangleArr);
                    MeteringRectangle[] meteringRectangleArr3 = (MeteringRectangle[]) list4.toArray(meteringRectangleArr);
                    MeteringRectangle[] meteringRectangleArr4 = (MeteringRectangle[]) c4.toArray(meteringRectangleArr);
                    rx5 rx5 = wx5.o;
                    lr1 lr1 = wx5.a;
                    ((HashSet) lr1.b.b).remove(rx5);
                    ScheduledFuture scheduledFuture2 = wx5.i;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(true);
                        wx5.i = null;
                    }
                    ScheduledFuture scheduledFuture3 = wx5.j;
                    if (scheduledFuture3 != null) {
                        scheduledFuture3.cancel(true);
                        wx5.j = null;
                    }
                    wx5.q = meteringRectangleArr2;
                    wx5.r = meteringRectangleArr3;
                    wx5.s = meteringRectangleArr4;
                    if (meteringRectangleArr2.length > 0) {
                        wx5.g = true;
                        wx5.l = false;
                        wx5.m = false;
                        j = lr1.A();
                        wx5.e(true);
                    } else {
                        wx5.g = false;
                        wx5.l = true;
                        wx5.m = false;
                        j = lr1.A();
                    }
                    wx5.h = 0;
                    rx5 rx52 = new rx5(wx5, lr1.u(1) == 1, j);
                    wx5.o = rx52;
                    lr1.p(rx52);
                    long j3 = wx5.k + 1;
                    wx5.k = j3;
                    ux5 ux5 = new ux5(0, j3, wx5);
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    ScheduledExecutorService scheduledExecutorService = wx5.c;
                    wx5.j = scheduledExecutorService.schedule(ux5, j2, timeUnit);
                    long j4 = u05.a;
                    if (j4 > 0) {
                        wx5.i = scheduledExecutorService.schedule(new ux5(1, j3, wx5), j4, timeUnit);
                        return;
                    }
                    return;
                }
                do1.d(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
                return;
            case 1:
                eud eud = (eud) this.c;
                ue1 ue1 = (ue1) this.o;
                Size size = (Size) this.v;
                long j5 = this.b;
                synchronized (eud) {
                    try {
                        if (!((LinkedHashSet) eud.v).contains(ue1)) {
                            Long l = (Long) ((LinkedHashMap) eud.o).get(ue1);
                            if (l != null) {
                                qe.a().c(new ca2((Object) eud, j5 - l.longValue(), (Object) MapsKt.mapOf(TuplesKt.to("width", EventItemValueKt.toEventItemValue(size.getWidth())), TuplesKt.to("height", EventItemValueKt.toEventItemValue(size.getHeight()))), 5));
                                ((LinkedHashMap) eud.o).remove(ue1);
                                ((LinkedHashSet) eud.v).add(ue1);
                            }
                            Unit unit = Unit.INSTANCE;
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 2:
                ((e0) this.c).a((String) this.o, (Map) this.v, this.b);
                return;
            default:
                ((e0) this.c).a((String) this.o, (String) this.v, this.b);
                return;
        }
    }
}
