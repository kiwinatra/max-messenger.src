package defpackage;

import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import one.me.startconversation.StartConversationScreen;

/* renamed from: zpd  reason: default package */
public final class zpd extends SuspendLambda implements Function3 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zpd(al6 al6, aqd aqd, Continuation continuation) {
        super(3, continuation);
        this.a = 0;
        this.c = al6;
        this.o = aqd;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj;
                zpd zpd = new zpd((al6) this.c, (aqd) this.o, (Continuation) obj3);
                zpd.b = (k2b) obj2;
                return zpd.invokeSuspend(Unit.INSTANCE);
            case 1:
                zpd zpd2 = new zpd((Object) (kee) this.o, (Continuation) obj3, 1);
                zpd2.b = (a32) obj;
                zpd2.c = (vk3) obj2;
                return zpd2.invokeSuspend(Unit.INSTANCE);
            case 2:
                zpd zpd3 = new zpd((Object) (StartConversationScreen) this.o, (Continuation) obj3, 2);
                zpd3.b = (po3) obj;
                zpd3.c = (List) obj2;
                return zpd3.invokeSuspend(Unit.INSTANCE);
            default:
                zpd zpd4 = new zpd((Object) (b3b) ((d3b) this.o), (Continuation) obj3, 3);
                zpd4.c = (ImageView) obj;
                zpd4.b = (k2b) obj2;
                return zpd4.invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        CharSequence c0;
        Object obj2 = this.o;
        int i2 = this.a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (i2) {
            case 0:
                ResultKt.throwOnFailure(obj);
                k2b k2b = (k2b) this.b;
                if (((al6) this.c).c) {
                    k2b.getText().getClass();
                    i = -16745729;
                } else {
                    i = k2b.getText().g;
                }
                ((aqd) obj2).F0.setTextColor(i);
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(obj);
                a32 a32 = (a32) this.b;
                vk3 vk3 = (vk3) this.c;
                Sequence filterNot = SequencesKt.filterNot(CollectionsKt.asSequence(a32.k()), new duc(9));
                kee kee = (kee) obj2;
                kee.getClass();
                List list = SequencesKt.toList(SequencesKt.filter(filterNot, new ued(6, kee, a32)));
                if (!a32.f0()) {
                    return list;
                }
                List createListBuilder = CollectionsKt.createListBuilder();
                createListBuilder.add(vk3);
                createListBuilder.addAll(list);
                return CollectionsKt.build(createListBuilder);
            case 2:
                ResultKt.throwOnFailure(obj);
                po3 po3 = (po3) this.b;
                List list2 = (List) this.c;
                KProperty[] kPropertyArr = StartConversationScreen.E0;
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj2;
                CharSequence c02 = startConversationScreen.c0();
                if (!(c02 == null || c02.length() == 0)) {
                    return Unit.INSTANCE;
                }
                startConversationScreen.x0.G(po3.a);
                startConversationScreen.y0.G(CollectionsKt.emptyList());
                startConversationScreen.z0.G(po3.c);
                t56 t56 = startConversationScreen.A0;
                if (t56.j() == 0 && ((c0 = startConversationScreen.c0()) == null || c0.length() == 0)) {
                    t56.G(vzg.s());
                }
                po3 po32 = po3.d;
                t56 t562 = startConversationScreen.w0;
                if (po3 == po32) {
                    t562.G(CollectionsKt.emptyList());
                } else {
                    t562.G(list2);
                }
                return Unit.INSTANCE;
            default:
                ResultKt.throwOnFailure(obj);
                ((ImageView) this.c).setColorFilter(((k2b) this.b).i(((b3b) ((d3b) obj2)).d));
                return Unit.INSTANCE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zpd(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.a = i;
        this.o = obj;
    }
}
