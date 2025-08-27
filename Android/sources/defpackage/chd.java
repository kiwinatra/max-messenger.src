package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordManager;

/* renamed from: chd  reason: default package */
public final class chd implements ahd {
    public final Lazy a;
    public final Lazy b;
    public final ReentrantLock c = new ReentrantLock(true);
    public final xme o;
    public final xme v;
    public aje w;
    public final Lazy x;
    public final xme y;
    public final xme z;

    public chd(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
        xme a2 = f6e.a(dhd.d);
        this.o = a2;
        this.v = a2;
        this.x = LazyKt.lazy(new red(3));
        xme a3 = f6e.a((Object) null);
        this.y = a3;
        this.z = a3;
    }

    public final RecordManager a() {
        Conversation a2 = ((jz3) this.a.getValue()).a();
        if (a2 != null) {
            return a2.getRecordManager();
        }
        return null;
    }

    public final void c(ehd ehd) {
        xme xme;
        Object value;
        do {
            xme = this.o;
            value = xme.getValue();
            dhd dhd = (dhd) value;
        } while (!xme.b(value, dhd.a(dhd.d, ehd, (zgd) null, false, 6)));
        aje aje = this.w;
        if (aje != null) {
            aje.b((CancellationException) null);
        }
        this.w = null;
    }

    public final void d() {
        z68.l("ScreenRecordControllerTag", "stopRecordBroadcast", new Object[0]);
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            if (((dhd) this.v.getValue()).a != ehd.a) {
                z68.l("ScreenRecordControllerTag", "startRecordBroadcast already finished", new Object[0]);
                return;
            }
            RecordManager a2 = a();
            if (a2 != null) {
                RecordManager.stopRecord$default(a2, new RecordManager.StopParams((zwd) null, 1, (DefaultConstructorMarker) null), (Function0) null, (Function1) null, 6, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e() {
        xme xme;
        Object value;
        dhd dhd;
        zgd zgd;
        RecordDescription recordDescription;
        ehd ehd = ehd.c;
        do {
            xme = this.o;
            value = xme.getValue();
            dhd = (dhd) value;
            RecordManager a2 = a();
            zgd = null;
            if (!(a2 == null || (recordDescription = a2.getRecordDescription()) == null)) {
                int ordinal = recordDescription.getType().ordinal();
                ygd ygd = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ygd.a : ygd.b : ygd.c : ygd.a;
                if (ygd != ygd.a) {
                    zgd = new zgd(recordDescription.getMovieId(), String.valueOf(recordDescription.getMovieId()), f9b.b(recordDescription.getInitiator()), recordDescription.getStart(), ygd);
                }
            }
        } while (!xme.b(value, dhd.a(dhd, ehd, zgd, false, 4)));
    }

    public final void onRecordDataChanged() {
        z68.l("ScreenRecordControllerTag", "onRecordDataChanged", new Object[0]);
        ehd ehd = ehd.a;
        e();
    }

    public final void onRecordError(String str) {
        z68.l("ScreenRecordControllerTag", "onRecordError: " + str, new Object[0]);
        c(ehd.b);
        c(ehd.c);
    }

    public final void onRecordStarted() {
        RecordDescription recordDescription;
        RecordManager a2 = a();
        if (a2 != null && (recordDescription = a2.getRecordDescription()) != null) {
            z68.l("ScreenRecordControllerTag", "onRecordStarted: data = " + recordDescription, new Object[0]);
            long start = recordDescription.getStart();
            if (this.w == null) {
                this.w = ev0.v((cp1) this.b.getValue(), (CoroutineContext) null, (f14) null, new bhd(this, start, (Continuation) null), 3);
            }
            ehd ehd = ehd.a;
            e();
        }
    }

    public final void onRecordStopped(ConversationParticipant conversationParticipant) {
        z68.l("ScreenRecordControllerTag", "onRecordStopped: stoppedBy = " + conversationParticipant, new Object[0]);
        c(ehd.c);
    }
}
