package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chatscreen.ChatScreen;

/* renamed from: yt3  reason: default package */
public final class yt3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ ContactsPickerScreen b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yt3(Continuation continuation, ContactsPickerScreen contactsPickerScreen) {
        super(2, continuation);
        this.b = contactsPickerScreen;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        yt3 yt3 = new yt3(continuation, this.b);
        yt3.a = obj;
        return yt3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((yt3) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        pd6 pd6;
        Object obj2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        wt3 wt3 = (wt3) this.a;
        if (wt3 instanceof wt3) {
            gr3 gr3 = wt3.a;
            KProperty[] kPropertyArr = ContactsPickerScreen.X;
            ContactsPickerScreen contactsPickerScreen = this.b;
            ArrayList e = contactsPickerScreen.getRouter().e();
            ListIterator listIterator = e.listIterator(e.size());
            while (true) {
                pd6 = null;
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (((i9d) obj2).a instanceof pd6) {
                    break;
                }
            }
            i9d i9d = (i9d) obj2;
            zx3 zx3 = i9d != null ? i9d.a : null;
            if (zx3 instanceof pd6) {
                pd6 = (pd6) zx3;
            }
            if (pd6 != null) {
                KProperty[] kPropertyArr2 = ContactsPickerScreen.X;
                KProperty kProperty = kPropertyArr2[0];
                is isVar = contactsPickerScreen.y;
                if (((Number) isVar.a(contactsPickerScreen)).intValue() != 0) {
                    Intent intent = new Intent();
                    intent.putExtra("contacts.picker.result.key", gr3);
                    KProperty kProperty2 = kPropertyArr2[0];
                    ((ChatScreen) pd6).D0(((Number) isVar.a(contactsPickerScreen)).intValue(), -1, intent);
                    fma onBackPressedDispatcher = contactsPickerScreen.getOnBackPressedDispatcher();
                    if (onBackPressedDispatcher != null) {
                        onBackPressedDispatcher.d();
                    }
                    Activity activity = contactsPickerScreen.getActivity();
                    if (activity != null) {
                        kr7.A(activity);
                    }
                }
            }
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
