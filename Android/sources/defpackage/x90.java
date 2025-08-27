package defpackage;

import android.media.MediaFormat;

/* renamed from: x90  reason: default package */
public final class x90 implements t55 {
    public final String a;
    public final int b;
    public final xjf c;
    public final int d;
    public final int e;
    public final int f;

    public x90(String str, int i, xjf xjf, int i2, int i3, int i4) {
        this.a = str;
        this.b = i;
        this.c = xjf;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final String b() {
        return this.a;
    }

    public final MediaFormat c() {
        String str = this.a;
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(str, this.e, this.f);
        createAudioFormat.setInteger("bitrate", this.d);
        int i = this.b;
        if (i != -1) {
            if (str.equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", i);
            } else {
                createAudioFormat.setInteger("profile", i);
            }
        }
        return createAudioFormat;
    }

    public final xjf d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x90)) {
            return false;
        }
        x90 x90 = (x90) obj;
        return this.a.equals(x90.a) && this.b == x90.b && this.c.equals(x90.c) && this.d == x90.d && this.e == x90.e && this.f == x90.f;
    }

    public final int hashCode() {
        return this.f ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.a);
        sb.append(", profile=");
        sb.append(this.b);
        sb.append(", inputTimebase=");
        sb.append(this.c);
        sb.append(", bitrate=");
        sb.append(this.d);
        sb.append(", sampleRate=");
        sb.append(this.e);
        sb.append(", channelCount=");
        return wj6.l(sb, this.f, "}");
    }
}
