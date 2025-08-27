package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import androidx.media3.datasource.DataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: rt  reason: default package */
public final class rt extends dj0 {
    public final AssetManager v;
    public Uri w;
    public InputStream x;
    public long y;
    public boolean z;

    public rt(Context context) {
        super(false);
        this.v = context.getAssets();
    }

    public final long G(q74 q74) {
        try {
            Uri uri = q74.a;
            long j = q74.f;
            this.w = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            c();
            InputStream open = this.v.open(path, 1);
            this.x = open;
            if (open.skip(j) >= j) {
                long j2 = q74.g;
                if (j2 != -1) {
                    this.y = j2;
                } else {
                    long available = (long) this.x.available();
                    this.y = available;
                    if (available == 2147483647L) {
                        this.y = -1;
                    }
                }
                this.z = true;
                d(q74);
                return this.y;
            }
            throw new DataSourceException((Throwable) null, 2008);
        } catch (AssetDataSource$AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new DataSourceException((Throwable) e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    public final void close() {
        this.w = null;
        try {
            InputStream inputStream = this.x;
            if (inputStream != null) {
                inputStream.close();
            }
            this.x = null;
            if (this.z) {
                this.z = false;
                b();
            }
        } catch (IOException e) {
            throw new DataSourceException((Throwable) e, 2000);
        } catch (Throwable th) {
            this.x = null;
            if (this.z) {
                this.z = false;
                b();
            }
            throw th;
        }
    }

    public final Uri getUri() {
        return this.w;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.y;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            }
        }
        InputStream inputStream = this.x;
        int i3 = v0g.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.y;
        if (j2 != -1) {
            this.y = j2 - ((long) read);
        }
        a(read);
        return read;
    }
}
