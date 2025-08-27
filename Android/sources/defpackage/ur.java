package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.PowerManager;
import java.io.File;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* renamed from: ur  reason: default package */
public final /* synthetic */ class ur implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Lazy b;

    public /* synthetic */ ur() {
        this.a = 23;
        this.b = rjd.N;
    }

    public final Object invoke() {
        Object obj;
        switch (this.a) {
            case 0:
                return new n28(this.b);
            case 1:
                return e14.a(((osa) ((gaf) this.b.getValue())).e());
            case 2:
                return ((osa) ((gaf) this.b.getValue())).a().s0(1, "call_chat_observing");
            case 3:
                return te8.m((Context) this.b.getValue());
            case 4:
                return ((pwa) this.b.getValue()).i(true);
            case 5:
                return ((Context) this.b.getValue()).getString(wkc.call_notification_name_temp);
            case 6:
                return ((Context) this.b.getValue()).getString(wkc.call_notification_incoming_call);
            case 7:
                return ((Context) this.b.getValue()).getString(wkc.call_notification_incoming_video_call);
            case 8:
                return ((Context) this.b.getValue()).getString(wkc.call_notification_active_call);
            case 9:
                return ((osa) ((gaf) this.b.getValue())).b();
            case 10:
                return ((OneMeRoomDatabase) ((cya) this.b.getValue()).m()).O();
            case 11:
                return (List) this.b.getValue();
            case 12:
                return ((osa) ((gaf) this.b.getValue())).b();
            case 13:
                return ((tt0) this.b.getValue()).a(1024);
            case Protos.Attaches.Attach.LOCATION /*14*/:
                qla a2 = ((rla) this.b.getValue()).a();
                a2.f = false;
                return new rla(a2);
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((bud) this.b.getValue()).getClass();
                return gqc.c;
            case 16:
                akd akd = (akd) ((bud) this.b.getValue());
                akd.getClass();
                int i = 40;
                int r = (int) akd.r(PmsKey.f82msggetreactionspagesize, (long) 40);
                if (r > 0) {
                    i = r;
                }
                return Integer.valueOf(i);
            case LangUtils.HASH_SEED /*17*/:
                return new ff0(this.b);
            case 18:
                return new ff0(this.b);
            case 19:
                akd akd2 = (akd) ((bud) this.b.getValue());
                akd2.getClass();
                EnumSet<E> noneOf = EnumSet.noneOf(h78.class);
                for (Integer intValue : akd2.o(PmsKey.f7analyticspermissions, Collections.emptyList())) {
                    sq6 sq6 = h78.a;
                    int intValue2 = intValue.intValue();
                    sq6.getClass();
                    Iterator it = h78.o.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            ((h78) obj).getClass();
                            if (10 == intValue2) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    h78 h78 = (h78) obj;
                    if (h78 != null) {
                        noneOf.add(h78);
                    }
                }
                return noneOf;
            case 20:
                return ((aua) this.b.getValue()).b();
            case 21:
                return new ez(new File(((po5) ((ln5) this.b.getValue())).c(), "chats_v2"), (lc5) null);
            case 22:
                return new ez(new File(((po5) ((ln5) this.b.getValue())).c(), "folders_v1"), (lc5) null);
            case 23:
                return new ff0(this.b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return (SensorManager) ((Context) this.b.getValue()).getSystemService("sensor");
            case 25:
                return (PowerManager) ((Context) this.b.getValue()).getSystemService("power");
            case 26:
                return ((kbf) ((jbf) this.b.getValue())).a();
            case 27:
                return (ScheduledExecutorService) ((aua) this.b.getValue()).l.getValue();
            case 28:
                return (ScheduledExecutorService) ((aua) this.b.getValue()).l.getValue();
            default:
                aua aua = (aua) this.b.getValue();
                return aua.h(aua.e(1, "ONEME_FB_BLOCK", Runtime.getRuntime().availableProcessors(), 1), "ONEME_FB_BLOCK");
        }
    }

    public /* synthetic */ ur(int i, Lazy lazy) {
        this.a = i;
        this.b = lazy;
    }
}
