package defpackage;

import android.net.Uri;
import java.io.File;
import java.net.URI;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.ExecutorService;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* renamed from: tn5  reason: default package */
public final /* synthetic */ class tn5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ do5 b;

    public /* synthetic */ tn5(do5 do5, int i) {
        this.a = i;
        this.b = do5;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                do5 do5 = this.b;
                URI uri = do5.h;
                String str = do5.a == myf.a ? "application/octet-stream" : "application/x-binary; charset=x-user-defined";
                StringBuilder sb = new StringBuilder("POST ");
                sb.append(uri.getRawPath());
                sb.append('?');
                sb.append(uri.getRawQuery());
                sb.append(" HTTP/1.1\nHost: ");
                sb.append(uri.getHost());
                sb.append("\nContent-Type: ");
                sb.append(str);
                sb.append(10);
                myf myf = myf.v;
                File file = do5.i;
                String str2 = do5.b;
                String name = do5.a == myf ? (str2 == null || str2.length() == 0) ? file.getName() : Uri.encode(str2) : (str2 == null || str2.length() == 0) ? String.valueOf(file.getName().hashCode()) : Uri.encode(str2);
                sb.append("Content-Disposition: attachment; filename=" + name + "\n");
                sb.append("X-Uploading-Mode: parallel\nConnection: keep-alive\nUser-Agent: ");
                String l = g63.l(sb, (String) do5.c.e.getValue(), 10);
                if (do5.u) {
                    String str3 = do5.d;
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.o, str3, a81.m("Prepared sharedHeaders: ", l), (Throwable) null);
                    }
                }
                byte[] bytes = l.getBytes(Charsets.UTF_8);
                ByteBuffer put = ((tt0) do5.g.getValue()).a(bytes.length).put(bytes);
                put.flip();
                return put;
            default:
                do5 do52 = this.b;
                return AsynchronousFileChannel.open(Paths.get(do52.i.getPath(), new String[0]), SetsKt.setOf(StandardOpenOption.READ), (ExecutorService) do52.e.getValue(), new FileAttribute[0]);
        }
    }
}
