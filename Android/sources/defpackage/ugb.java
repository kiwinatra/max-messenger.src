package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import one.me.chats.picker.ActChatPickerCompat;
import one.me.chats.picker.PickerChatController;

/* renamed from: ugb  reason: default package */
public final class ugb extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ PickerChatController b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ugb(PickerChatController pickerChatController, Continuation continuation) {
        super(2, continuation);
        this.b = pickerChatController;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        ugb ugb = new ugb(this.b, continuation);
        ugb.a = obj;
        return ugb;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ugb) create((q33) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (((q33) this.a) instanceof q33) {
            PickerChatController pickerChatController = this.b;
            e9d e9d = pickerChatController.w0;
            if (e9d != null && e9d.n()) {
                pickerChatController.f0().A0.C(og9.a);
            }
            pickerChatController.x0.k();
            hn requireActivity = pickerChatController.requireActivity();
            ActChatPickerCompat actChatPickerCompat = requireActivity instanceof ActChatPickerCompat ? (ActChatPickerCompat) requireActivity : null;
            if (actChatPickerCompat != null) {
                List emptyList = CollectionsKt.emptyList();
                List<a32> list = CollectionsKt.toList(((Map) pickerChatController.f0().z.a.getValue()).values());
                KProperty kProperty = PickerChatController.z0[2];
                String str = (String) pickerChatController.v.a(pickerChatController);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (a32 a32 : list) {
                    arrayList.add(Long.valueOf(a32.a));
                    arrayList2.add(Long.valueOf(a32.b.a));
                }
                ev0.v(i8b.t(actChatPickerCompat.getLifecycle()), ((osa) ((gaf) actChatPickerCompat.x.getValue())).b(), (f14) null, new y5(emptyList, actChatPickerCompat, (r62) cs2.a.getAccessor().g(r62.class), arrayList, arrayList2, str, (Continuation) null), 2);
            } else {
                Boxing.boxBoolean(pickerChatController.getRouter().B(pickerChatController));
            }
            return Unit.INSTANCE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
