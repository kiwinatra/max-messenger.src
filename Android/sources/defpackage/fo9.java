package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: fo9  reason: default package */
public final class fo9 extends SuspendLambda implements Function2 {
    public MessageModel a;
    public boolean b;
    public int c;
    public final /* synthetic */ MessagesListWidget o;
    public final /* synthetic */ long v;
    public final /* synthetic */ View w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fo9(MessagesListWidget messagesListWidget, long j, View view, Continuation continuation) {
        super(2, continuation);
        this.o = messagesListWidget;
        this.v = j;
        this.w = view;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new fo9(this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((fo9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r10.c
            r4 = 0
            long r5 = r10.v
            one.me.messages.list.ui.MessagesListWidget r7 = r10.o
            if (r3 == 0) goto L_0x0022
            if (r3 != r1) goto L_0x001a
            boolean r2 = r10.b
            one.me.messages.list.loader.MessageModel r3 = r10.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0088
        L_0x001a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r11)
            kotlin.reflect.KProperty[] r11 = one.me.messages.list.ui.MessagesListWidget.R0
            en9 r11 = r7.k0()
            etc r11 = r11.m1
            ome r11 = r11.a
            java.lang.Object r11 = r11.getValue()
            wj9 r11 = (defpackage.wj9) r11
            one.me.messages.list.loader.MessageModel r3 = r11.d(r5)
            vsc r11 = r7.g0()
            ru.ok.onechat.reactions.ReactionsViewModel r11 = r11.j()
            if (r3 == 0) goto L_0x0046
            oa9 r8 = r3.B0
            goto L_0x0047
        L_0x0046:
            r8 = r4
        L_0x0047:
            if (r8 == 0) goto L_0x005a
            r11.getClass()
            oa9 r9 = defpackage.oa9.ERROR
            if (r8 == r9) goto L_0x005a
            oa9 r9 = defpackage.oa9.SENDING
            if (r8 == r9) goto L_0x005a
            oa9 r9 = defpackage.oa9.UNKNOWN
            if (r8 == r9) goto L_0x005a
            r8 = r1
            goto L_0x005b
        L_0x005a:
            r8 = r0
        L_0x005b:
            boolean r9 = r11.o()
            if (r9 == 0) goto L_0x0074
            kotlin.Lazy r11 = r11.r
            java.lang.Object r11 = r11.getValue()
            gqc r11 = (defpackage.gqc) r11
            r11.getClass()
            gqc r9 = defpackage.gqc.c
            if (r11 != r9) goto L_0x0074
            if (r8 == 0) goto L_0x0074
            r11 = r1
            goto L_0x0075
        L_0x0074:
            r11 = r0
        L_0x0075:
            en9 r8 = r7.k0()
            r10.a = r3
            r10.b = r11
            r10.c = r1
            java.lang.Object r8 = r8.r(r5, r10)
            if (r8 != r2) goto L_0x0086
            return r2
        L_0x0086:
            r2 = r11
            r11 = r8
        L_0x0088:
            r8 = r11
            java.util.List r8 = (java.util.List) r8
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x0092
            r4 = r11
        L_0x0092:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L_0x0103
            long[] r11 = new long[r1]
            r11[r0] = r5
            kotlin.reflect.KProperty[] r8 = one.me.messages.list.ui.MessagesListWidget.R0
            r7.getClass()
            kotlin.reflect.KProperty[] r8 = one.me.messages.list.ui.MessagesListWidget.R0
            r1 = r8[r1]
            is r1 = r7.c
            r1.b(r7, r11)
            y99 r11 = new y99
            r11.<init>()
            android.os.Bundle r1 = r11.a
            java.lang.String r8 = "show_reactions_selector"
            r1.putBoolean(r8, r2)
            java.lang.String r2 = "message_id"
            r1.putLong(r2, r5)
            if (r3 == 0) goto L_0x00be
            long r2 = r3.b
            goto L_0x00c0
        L_0x00be:
            r2 = 0
        L_0x00c0:
            java.lang.String r5 = "message_server_id"
            r1.putLong(r5, r2)
            android.os.Bundle r2 = r7.getArgs()
            java.lang.String r3 = "ARG_CHAT_ID"
            long r2 = r2.getLong(r3)
            java.lang.String r5 = "chat_id"
            r1.putLong(r5, r2)
            egd r2 = new egd
            java.lang.String r3 = r7.b
            r2.<init>(r3)
            java.lang.String r3 = "arg_key_scope_id"
            r1.putParcelable(r3, r2)
            java.util.Collection r4 = (java.util.Collection) r4
            r11.h(r4)
            android.view.View r10 = r10.w
            r11.o(r10)
            android.graphics.Rect r10 = new android.graphics.Rect
            r1 = -1073741824(0xffffffffc0000000, float:-2.0)
            r10.<init>(r1, r0, r1, r0)
            r0 = 0
            r11.e(r10, r0)
            int r10 = defpackage.chc.messages_list_recycler_view
            r11.a(r10)
            mw3 r10 = r11.build()
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r10 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r10
            r10.o(r7)
        L_0x0103:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
