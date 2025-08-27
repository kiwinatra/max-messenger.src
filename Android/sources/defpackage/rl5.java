package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: rl5  reason: default package */
public final class rl5 {
    public final ln5 a;
    public File b;
    public File c;
    public File d;
    public File e;
    public File f;
    public File g;
    public File h;
    public File i;
    public List j;

    public rl5(ln5 ln5) {
        this.a = ln5;
    }

    public final File a(zx0 zx0) {
        int ordinal = zx0.ordinal();
        ln5 ln5 = this.a;
        switch (ordinal) {
            case 0:
                if (this.b == null) {
                    this.b = new File(((po5) ln5).b());
                }
                return this.b;
            case 1:
                if (this.d == null) {
                    this.d = ((po5) ln5).m();
                }
                return this.d;
            case 2:
                if (this.e == null) {
                    po5 po5 = (po5) ln5;
                    po5.getClass();
                    this.e = po5.g(po5.b(), "audioCache");
                }
                return this.e;
            case 3:
                if (this.g == null) {
                    po5 po52 = (po5) ln5;
                    po52.getClass();
                    this.g = po5.g(po52.b(), "gifCache");
                }
                return this.g;
            case 4:
                if (this.f == null) {
                    po5 po53 = (po5) ln5;
                    po53.getClass();
                    this.f = po5.g(po53.b(), "stickerCache");
                }
                return this.f;
            case 5:
                if (this.c == null) {
                    po5 po54 = (po5) ln5;
                    po54.getClass();
                    this.c = po5.g(po54.b(), "upload");
                }
                return this.c;
            case 6:
                if (this.h == null) {
                    po5 po55 = (po5) ln5;
                    po55.getClass();
                    this.h = po5.g(po55.b(), "exo_files_cache");
                }
                return this.h;
            case 7:
                if (this.i == null) {
                    po5 po56 = (po5) ln5;
                    po56.getClass();
                    this.i = po5.g(po56.b(), "videoCache");
                }
                return this.i;
            default:
                return null;
        }
    }
}
