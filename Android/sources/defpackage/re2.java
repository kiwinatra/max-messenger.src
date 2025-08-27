package defpackage;

import android.view.View;
import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.profile.screens.media.ChatMediaListWidget;

/* renamed from: re2  reason: default package */
public final class re2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ChatMediaListWidget a;
    public final /* synthetic */ m29 b;
    public final /* synthetic */ View c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public re2(ChatMediaListWidget chatMediaListWidget, m29 m29, View view, Continuation continuation) {
        super(2, continuation);
        this.a = chatMediaListWidget;
        this.b = m29;
        this.c = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new re2(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((re2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        int i;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ChatMediaListWidget chatMediaListWidget = this.a;
        m29 m29 = this.b;
        chatMediaListWidget.a = m29;
        lw3 o = m58.b(ix3.a).c().o(this.c);
        gh2 gh2 = chatMediaListWidget.o;
        gh2.getClass();
        boolean z = m29 instanceof i29;
        Lazy lazy = gh2.E0;
        if (z) {
            dd2 dd2 = (dd2) lazy.getValue();
            dd2.getClass();
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add((ow3) dd2.b.getValue());
            createListBuilder.add(dd2.a(lxa.s1));
            createListBuilder.add((ow3) dd2.a.getValue());
            list = CollectionsKt.build(createListBuilder);
        } else if (m29 instanceof j29) {
            dd2 dd22 = (dd2) lazy.getValue();
            dd22.getClass();
            List createListBuilder2 = CollectionsKt.createListBuilder();
            createListBuilder2.add(new ow3(jxa.V, (ngf) new igf(lxa.p1), Integer.valueOf(lya.e), (Integer) null, 20));
            createListBuilder2.add(new ow3(jxa.c0, (ngf) new igf(lxa.A1), Integer.valueOf(lya.A), (Integer) null, 20));
            createListBuilder2.add((ow3) dd22.b.getValue());
            createListBuilder2.add(dd2.a(lxa.u1));
            createListBuilder2.add((ow3) dd22.a.getValue());
            list = CollectionsKt.build(createListBuilder2);
        } else if (m29 instanceof l29) {
            dd2 dd23 = (dd2) lazy.getValue();
            dd23.getClass();
            if (m29 instanceof l29) {
                l29 l29 = (l29) m29;
                int ordinal = l29.v.ordinal();
                if (ordinal == 0) {
                    i = lxa.v1;
                } else if (ordinal == 1) {
                    i = lxa.w1;
                } else if (ordinal == 2) {
                    i = lxa.t1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                List createListBuilder3 = CollectionsKt.createListBuilder();
                createListBuilder3.add(new ow3(jxa.b0, (ngf) new igf(lxa.z1), Integer.valueOf(lya.f), (Integer) null, 20));
                createListBuilder3.add((ow3) dd23.b.getValue());
                createListBuilder3.add(dd2.a(i));
                if (!l29.y) {
                    createListBuilder3.add((ow3) dd23.a.getValue());
                }
                list = CollectionsKt.build(createListBuilder3);
            } else {
                list = CollectionsKt.emptyList();
            }
        } else if (m29 instanceof c29) {
            dd2 dd24 = (dd2) lazy.getValue();
            dd24.getClass();
            List createListBuilder4 = CollectionsKt.createListBuilder();
            createListBuilder4.add((ow3) dd24.b.getValue());
            createListBuilder4.add(dd2.a(lxa.r1));
            createListBuilder4.add((ow3) dd24.a.getValue());
            list = CollectionsKt.build(createListBuilder4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        o.h(list).build().o(chatMediaListWidget);
        return Unit.INSTANCE;
    }
}
