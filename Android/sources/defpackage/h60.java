package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: h60  reason: default package */
public final class h60 {
    public final tb7 a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public j60 d;
    public j60 e;
    public boolean f;

    public h60(tb7 tb7) {
        this.a = tb7;
        j60 j60 = j60.e;
        this.d = j60;
        this.e = j60;
        this.f = false;
    }

    public final j60 a(j60 j60) {
        if (!j60.equals(j60.e)) {
            int i = 0;
            while (true) {
                tb7 tb7 = this.a;
                if (i < tb7.size()) {
                    m60 m60 = (m60) tb7.get(i);
                    j60 e2 = m60.e(j60);
                    if (m60.isActive()) {
                        n79.n(!e2.equals(j60.e));
                        j60 = e2;
                    }
                    i++;
                } else {
                    this.e = j60;
                    return j60;
                }
            }
        } else {
            throw new AudioProcessor$UnhandledAudioFormatException(j60);
        }
    }

    public final void b() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = this.e;
        this.f = false;
        int i = 0;
        while (true) {
            tb7 tb7 = this.a;
            if (i >= tb7.size()) {
                break;
            }
            m60 m60 = (m60) tb7.get(i);
            m60.flush();
            if (m60.isActive()) {
                arrayList.add(m60);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= c(); i2++) {
            this.c[i2] = ((m60) arrayList.get(i2)).a();
        }
    }

    public final int c() {
        return this.c.length - 1;
    }

    public final ByteBuffer d() {
        if (!f()) {
            return m60.a;
        }
        ByteBuffer byteBuffer = this.c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(m60.a);
        return this.c[c()];
    }

    public final boolean e() {
        return this.f && ((m60) this.b.get(c())).d() && !this.c[c()].hasRemaining();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h60)) {
            return false;
        }
        h60 h60 = (h60) obj;
        tb7 tb7 = this.a;
        if (tb7.size() != h60.a.size()) {
            return false;
        }
        for (int i = 0; i < tb7.size(); i++) {
            if (tb7.get(i) != h60.a.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return !this.b.isEmpty();
    }

    public final void g(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= c()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    m60 m60 = (m60) arrayList.get(i);
                    if (!m60.d()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : m60.a;
                        m60.b(byteBuffer2);
                        this.c[i] = m60.a();
                        z |= ((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < c()) {
                        ((m60) arrayList.get(i + 1)).c();
                    }
                }
                i++;
            }
        }
    }

    public final void h() {
        if (f() && !this.f) {
            this.f = true;
            ((m60) this.b.get(0)).c();
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(ByteBuffer byteBuffer) {
        if (f() && !this.f) {
            g(byteBuffer);
        }
    }

    public final void j() {
        int i = 0;
        while (true) {
            tb7 tb7 = this.a;
            if (i < tb7.size()) {
                m60 m60 = (m60) tb7.get(i);
                m60.flush();
                m60.reset();
                i++;
            } else {
                this.c = new ByteBuffer[0];
                j60 j60 = j60.e;
                this.d = j60;
                this.e = j60;
                this.f = false;
                return;
            }
        }
    }
}
