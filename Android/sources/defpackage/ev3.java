package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.upstream.ContentDataSource$ContentDataSourceException;
import com.google.android.exoplayer2.upstream.DataSourceException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: ev3  reason: default package */
public final class ev3 extends cj0 {
    public boolean X;
    public final ContentResolver v;
    public Uri w;
    public AssetFileDescriptor x;
    public FileInputStream y;
    public long z;

    public ev3(Context context) {
        super(false);
        this.v = context.getContentResolver();
    }

    public final long N(p74 p74) {
        AssetFileDescriptor assetFileDescriptor;
        p74 p742 = p74;
        int i = 2000;
        try {
            Uri uri = p742.a;
            this.w = uri;
            c();
            boolean equals = "content".equals(p742.a.getScheme());
            ContentResolver contentResolver = this.v;
            if (equals) {
                Bundle bundle = new Bundle();
                if (t0g.a >= 31) {
                    dv3.a(bundle);
                }
                assetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            }
            this.x = assetFileDescriptor;
            if (assetFileDescriptor != null) {
                long length = assetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptor.getFileDescriptor());
                this.y = fileInputStream;
                int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                long j = p742.f;
                if (i2 == 0 || j <= length) {
                    long startOffset = assetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(startOffset + j) - startOffset;
                    if (skip == j) {
                        if (i2 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.z = -1;
                            } else {
                                long position = size - channel.position();
                                this.z = position;
                                if (position < 0) {
                                    throw new DataSourceException((Throwable) null, 2008);
                                }
                            }
                        } else {
                            long j2 = length - skip;
                            this.z = j2;
                            if (j2 < 0) {
                                throw new DataSourceException((Throwable) null, 2008);
                            }
                        }
                        long j3 = p742.g;
                        int i3 = (j3 > -1 ? 1 : (j3 == -1 ? 0 : -1));
                        if (i3 != 0) {
                            long j4 = this.z;
                            this.z = j4 == -1 ? j3 : Math.min(j4, j3);
                        }
                        this.X = true;
                        d(p74);
                        return i3 != 0 ? j3 : this.z;
                    }
                    throw new DataSourceException((Throwable) null, 2008);
                }
                throw new DataSourceException((Throwable) null, 2008);
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new DataSourceException((Throwable) new IOException(sb.toString()), 2000);
        } catch (ContentDataSource$ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new DataSourceException((Throwable) e2, i);
        }
    }

    public final void close() {
        this.w = null;
        try {
            FileInputStream fileInputStream = this.y;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.y = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.x;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.x = null;
                if (this.X) {
                    this.X = false;
                    b();
                }
            } catch (IOException e) {
                throw new DataSourceException((Throwable) e, 2000);
            } catch (Throwable th) {
                this.x = null;
                if (this.X) {
                    this.X = false;
                    b();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new DataSourceException((Throwable) e2, 2000);
        } catch (Throwable th2) {
            this.y = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.x;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.x = null;
                if (this.X) {
                    this.X = false;
                    b();
                }
                throw th2;
            } catch (IOException e3) {
                throw new DataSourceException((Throwable) e3, 2000);
            } catch (Throwable th3) {
                this.x = null;
                if (this.X) {
                    this.X = false;
                    b();
                }
                throw th3;
            }
        }
    }

    public final Uri getUri() {
        return this.w;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.z;
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
        FileInputStream fileInputStream = this.y;
        int i3 = t0g.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.z;
        if (j2 != -1) {
            this.z = j2 - ((long) read);
        }
        a(read);
        return read;
    }
}
