package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.list.ChatsListWidget;

/* renamed from: ax2  reason: default package */
public final class ax2 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ChatsListWidget b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ax2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.b = chatsListWidget;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ax2 ax2 = new ax2(continuation, this.b);
        ax2.a = obj;
        return ax2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ax2) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        v5a v5a = (v5a) this.a;
        if (v5a instanceof a4b) {
            ox2 ox2 = ox2.b;
            long longValue = ((Number) ((a4b) v5a).a).longValue();
            ta4 W0 = ox2.W0();
            W0.b(":settings/folder/by-chat?id=" + longValue, (Bundle) null);
        } else if (v5a instanceof rt9) {
            ox2.b.W0().b(wj6.j(((Number) ((rt9) v5a).a).longValue(), ":profile/pick-admin?id=", "&type=channel"), (Bundle) null);
        } else if (v5a instanceof pa4) {
            ox2.b.Y0((pa4) v5a);
        } else {
            boolean z = v5a instanceof y3b;
            ChatsListWidget chatsListWidget = this.b;
            if (z) {
                Context context = chatsListWidget.getContext();
                Uri uri = (Uri) ((y3b) v5a).a;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.addCategory("android.intent.category.BROWSABLE");
                intent.setData(uri);
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    e.getMessage();
                    Objects.toString(uri);
                }
            } else if (v5a instanceof dj7) {
                ox2 ox22 = ox2.b;
                ox22.W0().c(((bb4) ((dj7) v5a).a).a, (Bundle) null);
            } else if (v5a instanceof dl7) {
                KProperty[] kPropertyArr = ChatsListWidget.I0;
                ((oo3) chatsListWidget.w0.getValue()).a(chatsListWidget.requireActivity());
            }
        }
        return Unit.INSTANCE;
    }
}
