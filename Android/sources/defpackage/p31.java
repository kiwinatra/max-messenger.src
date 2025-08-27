package defpackage;

import kotlin.TuplesKt;
import one.me.calls.ui.ui.call.CallScreen;

/* renamed from: p31  reason: default package */
public final class p31 implements ya4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean o;

    public /* synthetic */ p31(long j, boolean z, boolean z2, int i) {
        this.a = i;
        this.b = j;
        this.c = z;
        this.o = z2;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                CallScreen.J0.getClass();
                return new CallScreen(o54.f(TuplesKt.to("type", "ONE_TO_ONE"), TuplesKt.to("opponent_id", Long.valueOf(this.b)), TuplesKt.to("video_enabled", Boolean.valueOf(this.c)), TuplesKt.to("microphone_enabled", Boolean.valueOf(this.o))));
            default:
                CallScreen.J0.getClass();
                return new CallScreen(o54.f(TuplesKt.to("type", "CHAT"), TuplesKt.to("chat_id", Long.valueOf(this.b)), TuplesKt.to("video_enabled", Boolean.valueOf(this.c)), TuplesKt.to("microphone_enabled", Boolean.valueOf(this.o))));
        }
    }
}
