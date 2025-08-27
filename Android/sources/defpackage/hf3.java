package defpackage;

import android.widget.TextView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.KProperty;
import one.me.login.confirm.ConfirmPhoneScreen;

/* renamed from: hf3  reason: default package */
public final class hf3 extends ContinuationImpl {
    public TextView a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ConfirmPhoneScreen o;
    public int v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hf3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(continuation);
        this.o = confirmPhoneScreen;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.v |= IntCompanionObject.MIN_VALUE;
        KProperty[] kPropertyArr = ConfirmPhoneScreen.A0;
        return this.o.d0((TextView) null, 0, false, this);
    }
}
