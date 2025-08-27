package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: i28  reason: default package */
public final class i28 extends ContinuationImpl {
    public LoadEmojiFontWorker a;
    public c35 b;
    public paf c;
    public LoadEmojiFontWorker o;
    public /* synthetic */ Object v;
    public final /* synthetic */ LoadEmojiFontWorker w;
    public int x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i28(LoadEmojiFontWorker loadEmojiFontWorker, Continuation continuation) {
        super(continuation);
        this.w = loadEmojiFontWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= IntCompanionObject.MIN_VALUE;
        return this.w.doForegroundWork(this);
    }
}
