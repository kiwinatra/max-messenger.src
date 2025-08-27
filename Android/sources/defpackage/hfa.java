package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.messages.NotificationsImagesProvider;

/* renamed from: hfa  reason: default package */
public final class hfa extends ContinuationImpl {
    public NotificationsImagesProvider a;
    public qx0 b;
    public d14 c;
    public /* synthetic */ Object o;
    public final /* synthetic */ NotificationsImagesProvider v;
    public int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hfa(NotificationsImagesProvider notificationsImagesProvider, Continuation continuation) {
        super(continuation);
        this.v = notificationsImagesProvider;
    }

    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.w |= IntCompanionObject.MIN_VALUE;
        return NotificationsImagesProvider.a(this.v, (uae) null, (d14) null, this);
    }
}
