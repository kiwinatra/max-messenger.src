package defpackage;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: efd  reason: default package */
public final class efd extends SuspendLambda implements Function2 {
    public final /* synthetic */ hdd a;
    public final /* synthetic */ ScheduledSendPickerViewModel b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public efd(hdd hdd, ScheduledSendPickerViewModel scheduledSendPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.a = hdd;
        this.b = scheduledSendPickerViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new efd(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((efd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ped ped;
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Object b2 = this.a.b("ScheduledSendPickerViewModel:delayed_attrs");
        cl4 cl4 = b2 instanceof cl4 ? (cl4) b2 : null;
        ScheduledSendPickerViewModel scheduledSendPickerViewModel = this.b;
        if (cl4 != null) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(cl4.a);
            int i2 = instance.get(5);
            int i3 = instance.get(2);
            int i4 = instance.get(1);
            int i5 = instance.get(11);
            int i6 = instance.get(12);
            ped j = ScheduledSendPickerViewModel.j(scheduledSendPickerViewModel);
            ped j2 = ScheduledSendPickerViewModel.j(scheduledSendPickerViewModel);
            ped j3 = ScheduledSendPickerViewModel.j(scheduledSendPickerViewModel);
            List list = j.a;
            Iterator it = list.iterator();
            int i7 = 0;
            while (true) {
                i = -1;
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                n84 n84 = (n84) it.next();
                if (n84.o == i4 && n84.c == i3 && n84.b == i2) {
                    break;
                }
                i7++;
            }
            int coerceAtLeast = RangesKt.coerceAtLeast(i7, 0);
            List list2 = j2.b;
            Iterator it2 = list2.iterator();
            int i8 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i8 = -1;
                    break;
                } else if (((ejf) it2.next()).a == i5) {
                    break;
                } else {
                    i8++;
                }
            }
            int coerceAtLeast2 = RangesKt.coerceAtLeast(i8, 0);
            List list3 = j3.c;
            Iterator it3 = list3.iterator();
            int i9 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (((ejf) it3.next()).a == i6) {
                    i = i9;
                    break;
                } else {
                    i9++;
                }
            }
            ped = new ped(list, list2, list3, coerceAtLeast, coerceAtLeast2, RangesKt.coerceAtLeast(i, 0));
        } else {
            ped = ScheduledSendPickerViewModel.j(scheduledSendPickerViewModel);
        }
        xme xme = scheduledSendPickerViewModel.f;
        c84 c84 = new c84((n84) ped.a.get(ped.d), (ejf) ped.b.get(ped.e), (ejf) ped.c.get(ped.f));
        xme.getClass();
        xme.m((Object) null, c84);
        xme xme2 = scheduledSendPickerViewModel.d;
        xme2.getClass();
        xme2.m((Object) null, ped);
        return Unit.INSTANCE;
    }
}
