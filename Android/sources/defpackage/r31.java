package defpackage;

import kotlin.TuplesKt;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;

/* renamed from: r31  reason: default package */
public final class r31 implements ya4 {
    public final /* synthetic */ long a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean o;

    public r31(long j, String str, String str2, boolean z) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = z;
    }

    public final Object a() {
        CallIncomingScreen.x.getClass();
        return new CallIncomingScreen(o54.f(TuplesKt.to("call_incoming_avatar", this.c), TuplesKt.to("call_incoming_name", this.b), TuplesKt.to("call_incoming_chat_id", Long.valueOf(this.a)), TuplesKt.to("call_incoming_video", Boolean.valueOf(this.o))));
    }
}
