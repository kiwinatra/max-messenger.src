package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import kotlin.jvm.functions.Function0;

/* renamed from: z71  reason: default package */
public final /* synthetic */ class z71 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ic3 b;

    public /* synthetic */ z71(ic3 ic3, int i) {
        this.a = i;
        this.b = ic3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.b.a;
                int i = oec.ic_reject_video_call_15;
                int i2 = a81.g(fu4.k, context).i;
                Drawable b2 = ew3.b(context, i);
                iq.a0(b2, i2);
                return b2;
            case 1:
                Context context2 = (Context) this.b.a;
                int i3 = oec.ic_reject_audio_call_12;
                int i4 = a81.g(fu4.k, context2).i;
                Drawable b3 = ew3.b(context2, i3);
                iq.a0(b3, i4);
                return b3;
            case 2:
                Context context3 = (Context) this.b.a;
                int i5 = oec.ic_incoming_video_call_15;
                int i6 = a81.g(fu4.k, context3).i;
                Drawable b4 = ew3.b(context3, i5);
                iq.a0(b4, i6);
                return b4;
            case 3:
                Context context4 = (Context) this.b.a;
                int i7 = oec.ic_incoming_audio_call_13;
                int i8 = a81.g(fu4.k, context4).i;
                Drawable b5 = ew3.b(context4, i7);
                iq.a0(b5, i8);
                return b5;
            case 4:
                Context context5 = (Context) this.b.a;
                int i9 = oec.ic_outgoing_video_call_15;
                int i10 = a81.g(fu4.k, context5).i;
                Drawable b6 = ew3.b(context5, i9);
                iq.a0(b6, i10);
                return b6;
            default:
                Context context6 = (Context) this.b.a;
                int i11 = oec.ic_outgoing_audio_call_13;
                int i12 = a81.g(fu4.k, context6).i;
                Drawable b7 = ew3.b(context6, i11);
                iq.a0(b7, i12);
                return b7;
        }
    }
}
