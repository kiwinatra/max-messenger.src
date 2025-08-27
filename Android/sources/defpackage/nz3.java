package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import one.me.android.OneMeApplication;
import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: nz3  reason: default package */
public final /* synthetic */ class nz3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ nz3(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (Conversation.State) this.b.get();
            case 1:
                AtomicReference atomicReference = this.b;
                int i = OneMeApplication.X;
                long nanoTime = System.nanoTime();
                uua uua = (uua) sjd.a.getAccessor().g(uua.class);
                uua.getClass();
                z68.c("OneMeInitialDataStorage", "load", new Object[0]);
                List list = (List) ev0.C(EmptyCoroutineContext.INSTANCE, new tua(uua, (Continuation) null));
                boolean z = false;
                boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
                if (booleanValue && booleanValue2) {
                    z = true;
                }
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, "OneMeInitialDataStorage", i2a.i("load finished ", z), (Throwable) null);
                }
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    w78 w78 = w78.o;
                    Duration.Companion companion = Duration.Companion;
                    a672.d(w78, "InitialDataTask", a81.m("initialDataStorage().load() by ", Duration.m1402toStringimpl(DurationKt.toDuration(System.nanoTime() - nanoTime, DurationUnit.NANOSECONDS))), (Throwable) null);
                }
                atomicReference.set(Boolean.valueOf(z));
                return Unit.INSTANCE;
            case 2:
                int i2 = OneMeApplication.X;
                Boolean bool = (Boolean) this.b.get();
                bool.booleanValue();
                return bool;
            default:
                mq4 mq4 = (mq4) this.b.getAndSet(p45.a);
                if (mq4 != null) {
                    mq4.dispose();
                }
                return Unit.INSTANCE;
        }
    }
}
