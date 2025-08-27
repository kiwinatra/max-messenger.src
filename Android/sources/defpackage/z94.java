package defpackage;

import java.util.Locale;

/* renamed from: z94  reason: default package */
public final class z94 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public int m;

    public /* synthetic */ z94(int i2) {
        this.a = i2;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                int i2 = this.b;
                int i3 = this.c;
                int i4 = this.d;
                int i5 = this.e;
                int i6 = this.f;
                int i7 = this.g;
                int i8 = this.h;
                int i9 = this.i;
                int i10 = this.j;
                int i11 = this.k;
                long j2 = this.l;
                int i12 = this.m;
                int i13 = t0g.a;
                Locale locale = Locale.US;
                StringBuilder n = a81.n("DecoderCounters {\n decoderInits=", i2, ",\n decoderReleases=", i3, "\n queuedInputBuffers=");
                g63.o(n, i4, "\n skippedInputBuffers=", i5, "\n renderedOutputBuffers=");
                g63.o(n, i6, "\n skippedOutputBuffers=", i7, "\n droppedBuffers=");
                g63.o(n, i8, "\n droppedInputBuffers=", i9, "\n maxConsecutiveDroppedBuffers=");
                String str = "\n droppedToKeyframeEvents=";
                int i14 = i10;
                int i15 = i11;
                g63.o(n, i14, str, i15, "\n totalVideoFrameProcessingOffsetUs=");
                n.append(j2);
                n.append("\n videoFrameProcessingOffsetCount=");
                n.append(i12);
                n.append("\n}");
                return n.toString();
            default:
                int i16 = this.b;
                int i17 = this.c;
                int i18 = this.d;
                int i19 = this.e;
                int i20 = this.f;
                int i21 = this.g;
                int i22 = this.h;
                int i23 = this.i;
                int i24 = this.j;
                int i25 = this.k;
                long j3 = this.l;
                int i26 = this.m;
                int i27 = v0g.a;
                Locale locale2 = Locale.US;
                StringBuilder n2 = a81.n("DecoderCounters {\n decoderInits=", i16, ",\n decoderReleases=", i17, "\n queuedInputBuffers=");
                g63.o(n2, i18, "\n skippedInputBuffers=", i19, "\n renderedOutputBuffers=");
                g63.o(n2, i20, "\n skippedOutputBuffers=", i21, "\n droppedBuffers=");
                String str2 = "\n droppedInputBuffers=";
                g63.o(n2, i22, str2, i23, "\n maxConsecutiveDroppedBuffers=");
                int i28 = i24;
                g63.o(n2, i28, "\n droppedToKeyframeEvents=", i25, "\n totalVideoFrameProcessingOffsetUs=");
                n2.append(j3);
                n2.append("\n videoFrameProcessingOffsetCount=");
                n2.append(i26);
                n2.append("\n}");
                return n2.toString();
        }
    }
}
