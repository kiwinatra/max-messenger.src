package com.my.tracker.obfuscated;

import android.text.TextUtils;
import android.util.Base64;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.s0;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class m2 {
    final o2 a;
    final y2 b;
    final int c;

    public static class a implements s0.a {
        private final s2[] a;
        private long b;

        private a(s2[] s2VarArr) {
            this.a = s2VarArr;
        }

        public static a a(s2[] s2VarArr) {
            return new a(s2VarArr);
        }

        public s2[] b() {
            return this.a;
        }

        public String toString() {
            String join = TextUtils.join(",", this.a);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                a((OutputStream) byteArrayOutputStream);
            } catch (Exception unused) {
            }
            return "[ChunkProtobufPacket]\n| sendTimestamp = " + this.b + "\n| contain " + this.a.length + " packets: " + join + "\n| content (base64): " + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0) + "\n[/ChunkProtobufPacket]";
        }

        public void a(OutputStream outputStream) {
            q qVar = new q(16384);
            q qVar2 = new q(16384);
            for (s2 a2 : this.a) {
                qVar.a();
                qVar2.a();
                a(a2, qVar2);
                qVar.a(1, qVar2);
                qVar.a(outputStream);
            }
        }

        public String a() {
            return "application/octet-stream";
        }

        public void a(long j) {
            this.b = j;
        }

        private void a(s2 s2Var, q qVar) {
            try {
                qVar.b(s2Var.b());
                qVar.a(4, this.b);
            } catch (Exception unused) {
                x2.b("TimeSpentPacketSender: something went wrong while extracting protobuf data, return empty result");
            }
        }
    }

    private m2(int i, y2 y2Var, o2 o2Var) {
        this.c = i;
        this.a = o2Var;
        this.b = y2Var;
    }

    private a b() {
        s2[] a2 = this.a.a(this.c);
        int length = a2 == null ? 0 : a2.length;
        StringBuilder o = wj6.o(length, "TimeSpentPacketSender: got database chunk, size = ", ", requested = ");
        o.append(this.c);
        x2.a(o.toString());
        if (length != 0) {
            return a.a(a2);
        }
        throw new Exception("database chunk is empty, nothing to send");
    }

    public void a(a aVar) {
        s2[] b2 = aVar.b();
        int length = b2.length;
        long[] jArr = new long[length];
        for (int i = 0; i < b2.length; i++) {
            jArr[i] = b2[i].a();
        }
        this.a.a(jArr);
        x2.a("TimeSpentPacketSender: successfully deleted " + length + " packets from repository");
    }

    public void c() {
        x2.a("TimeSpentPacketSender: i'm notified about new packet");
        m.e(new qof(18, this));
    }

    public void a() {
        x2.a("TimeSpentPacketSender: start flushing database chunk...");
        try {
            a b2 = b();
            b(b2);
            a(b2);
            x2.a("TimeSpentPacketSender: database chunk successfully flushed");
        } catch (Exception e) {
            x2.b("TimeSpentPacketSender: Something went wrong while flushing database chunk:\n" + e.getMessage());
        }
    }

    public static m2 a(int i, y2 y2Var, o2 o2Var) {
        return new m2(i, y2Var, o2Var);
    }

    public void b(a aVar) {
        MyTrackerConfig.OkHttpClientProvider n = this.b.n();
        String p = this.b.p();
        aVar.a(System.currentTimeMillis());
        if (x2.a()) {
            x2.a("TimeSpentPacketSender: This packet will be sent now:\n" + aVar);
        }
        if (s0.a(aVar, n, true).a(p).c()) {
            x2.a("TimeSpentPacketSender: packet successfully delivered to server");
            return;
        }
        throw new Exception("packet didn't delivered to server");
    }
}
