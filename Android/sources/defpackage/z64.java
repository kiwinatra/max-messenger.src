package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* renamed from: z64  reason: default package */
public final class z64 extends s38 {
    public final /* synthetic */ int c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z64(Executor executor, p7d p7d, int i) {
        super(executor, p7d);
        this.c = i;
    }

    public final j55 d(qa7 qa7) {
        boolean z;
        byte[] bArr;
        switch (this.c) {
            case 0:
                String uri = qa7.b.toString();
                if (uri.substring(0, 5).equals("data:")) {
                    int indexOf = uri.indexOf(44);
                    String substring = uri.substring(indexOf + 1, uri.length());
                    String substring2 = uri.substring(0, indexOf);
                    if (!substring2.contains(";")) {
                        z = false;
                    } else {
                        String[] split = substring2.split(";");
                        z = split[split.length - 1].equals("base64");
                    }
                    if (z) {
                        bArr = Base64.decode(substring, 0);
                    } else {
                        String decode = Uri.decode(substring);
                        decode.getClass();
                        bArr = decode.getBytes();
                    }
                    return c(new ByteArrayInputStream(bArr), bArr.length);
                }
                throw new IllegalArgumentException();
            default:
                return c(new FileInputStream(qa7.c().toString()), (int) qa7.c().length());
        }
    }

    public final String e() {
        switch (this.c) {
            case 0:
                return "DataFetchProducer";
            default:
                return "LocalFileFetchProducer";
        }
    }
}
