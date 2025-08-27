package defpackage;

import android.content.Context;

/* renamed from: ksf  reason: default package */
public final class ksf extends Thread {
    public final /* synthetic */ byd a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ksf(byd byd, Context context, String str, long j) {
        super("TransmuxTranscodeHelper:Mp4Info");
        this.a = byd;
        this.b = context;
        this.c = str;
        this.o = j;
    }

    public final void run() {
        byd byd = this.a;
        try {
            byd.l(ru9.a(this.b, this.o, this.c));
        } catch (Exception e) {
            byd.m(e);
        }
    }
}
