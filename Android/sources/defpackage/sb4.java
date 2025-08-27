package defpackage;

/* renamed from: sb4  reason: default package */
public final /* synthetic */ class sb4 implements h08 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ u8g b;

    public /* synthetic */ sb4(sd sdVar, u8g u8g) {
        this.b = u8g;
    }

    public final void invoke(Object obj) {
        u8g u8g = this.b;
        switch (this.a) {
            case 0:
                sb5 sb5 = (sb5) obj;
                sb5.getClass();
                z68.c("sb5", "videoDebugListener.onVideoSizeChanged: %s", u8g);
                int i = u8g.c;
                int i2 = u8g.b;
                int i3 = u8g.a;
                if (i == 90 || i == 270) {
                    sb5.X = i2;
                    sb5.Y = i3;
                } else {
                    sb5.X = i3;
                    sb5.Y = i2;
                }
                sb5.Z = i;
                if (sb5.x != null) {
                    float f = sb5.y - (1.0f / (((float) i3) / ((float) i2)));
                    if (f == c44.DEFAULT_ASPECT_RATIO || ((double) Math.abs(f)) <= 1.0E-4d) {
                        sb5.X = i2;
                        sb5.Y = i3;
                    }
                }
                m48 m48 = sb5.w;
                if (m48 != null) {
                    int i4 = sb5.X;
                    int i5 = sb5.Y;
                    int i6 = sb5.Z;
                    iu8 iu8 = m48.e;
                    if (iu8 != null) {
                        iu8.k(i4, i5, i6);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((rob) obj).z(u8g);
                return;
        }
    }

    public /* synthetic */ sb4(u8g u8g) {
        this.b = u8g;
    }
}
