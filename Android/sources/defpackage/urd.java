package defpackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: urd  reason: default package */
public final class urd extends SuspendLambda implements Function2 {
    public ur0 a;
    public int b;
    public final /* synthetic */ List c;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ CharSequence v;
    public final /* synthetic */ vrd w;
    public final /* synthetic */ long x;
    public final /* synthetic */ Long y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public urd(List list, boolean z, CharSequence charSequence, vrd vrd, long j, Long l, Continuation continuation) {
        super(2, continuation);
        this.c = list;
        this.o = z;
        this.v = charSequence;
        this.w = vrd;
        this.x = j;
        this.y = l;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new urd(this.c, this.o, this.v, this.w, this.x, this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((urd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ur0 ur0;
        Object obj2;
        LinkedList linkedList;
        int i;
        LinkedList linkedList2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.b;
        String str = null;
        CharSequence charSequence = this.v;
        int i3 = 0;
        long j = this.x;
        vrd vrd = this.w;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            List list = this.c;
            int size = list.size();
            z68.i("SendMessageWithMediaUseCase", "Sending messages with media. Media count " + size, (Throwable) null);
            ur0 = new ur0(list, !this.o && list.size() > 1, charSequence);
            this.a = ur0;
            this.b = 1;
            obj2 = ((ej9) vrd.d.getValue()).a(j, this.y, this);
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i2 == 1) {
            ur0 ur02 = this.a;
            ResultKt.throwOnFailure(obj);
            ur0 = ur02;
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mc9 mc9 = (mc9) obj2;
        List b2 = ((ar6) vrd.e.getValue()).b(charSequence, j);
        LinkedList linkedList3 = new LinkedList();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        o29 o29 = (o29) vrd.c.getValue();
        o29.getClass();
        if (ur0.c) {
            akd akd = (akd) o29.a;
            akd.getClass();
            linkedList = linkedList3;
            i = (int) akd.r(PmsKey.f60maxattachcount, (long) 12);
        } else {
            linkedList = linkedList3;
            i = 1;
        }
        List list2 = (List) ur0.d;
        int size2 = list2 != null ? list2.size() : 0;
        if (size2 == 0 && !cvg.A((CharSequence) ur0.e)) {
            z68.f("SendMessageWithMediaUseCase", "Unexpected empty media list", (Throwable) null);
        } else if (size2 > 0) {
            while (i3 < size2) {
                int i4 = i3 + i;
                try {
                    fvd fvd = new fvd(j, new ArrayList(list2.subList(i3, Math.min(size2, i4))));
                    if (!booleanRef.element) {
                        try {
                            booleanRef.element = true;
                            fvd.m = charSequence != null ? charSequence.toString() : str;
                            fvd.n = b2;
                            fvd.b = mc9;
                        } catch (Throwable th) {
                            th = th;
                            linkedList2 = linkedList;
                            z68.f("o29", "splitMedias: Exception after split medias for send", th);
                            linkedList = linkedList2;
                            str = null;
                            i3 = i4;
                        }
                    }
                    gvd gvd = new gvd(fvd);
                    linkedList2 = linkedList;
                    try {
                        linkedList2.add(gvd);
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    linkedList2 = linkedList;
                    z68.f("o29", "splitMedias: Exception after split medias for send", th);
                    linkedList = linkedList2;
                    str = null;
                    i3 = i4;
                }
                linkedList = linkedList2;
                str = null;
                i3 = i4;
            }
        }
        ((jqg) vrd.b.getValue()).a(new jvd(new kud(j, linkedList, 2)));
        return Unit.INSTANCE;
    }
}
