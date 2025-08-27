package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: i38  reason: default package */
public final class i38 extends s38 {
    public final /* synthetic */ int c;
    public final ContentResolver d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i38(Executor executor, p7d p7d, ContentResolver contentResolver, int i) {
        super(executor, p7d);
        this.c = i;
        this.d = contentResolver;
    }

    public final j55 d(qa7 qa7) {
        j55 j55;
        InputStream inputStream;
        ContentResolver contentResolver = this.d;
        switch (this.c) {
            case 0:
                Uri uri = qa7.b;
                Uri uri2 = mzf.a;
                if (uri.getPath() != null && "content".equals(mzf.b(uri)) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith(mzf.a.getPath())) {
                    if (StringsKt__StringsJVMKt.endsWith$default(uri.toString(), "/photo", false, 2, (Object) null)) {
                        inputStream = contentResolver.openInputStream(uri);
                    } else if (StringsKt__StringsJVMKt.endsWith$default(uri.toString(), "/display_photo", false, 2, (Object) null)) {
                        try {
                            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
                            if (openAssetFileDescriptor != null) {
                                inputStream = openAssetFileDescriptor.createInputStream();
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        } catch (IOException unused) {
                            throw new IOException("Contact photo does not exist: " + uri);
                        }
                    } else {
                        InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri);
                        if (openContactPhotoInputStream != null) {
                            inputStream = openContactPhotoInputStream;
                        } else {
                            throw new IOException("Contact photo does not exist: " + uri);
                        }
                    }
                    if (inputStream != null) {
                        return c(inputStream, -1);
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (mzf.d(uri)) {
                    try {
                        ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
                        if (openFileDescriptor != null) {
                            j55 c2 = c(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
                            openFileDescriptor.close();
                            j55 = c2;
                            if (j55 != null) {
                                return j55;
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    } catch (FileNotFoundException unused2) {
                        j55 = null;
                    }
                }
                InputStream openInputStream = contentResolver.openInputStream(uri);
                if (openInputStream != null) {
                    return c(openInputStream, -1);
                }
                throw new IllegalStateException("Required value was null.".toString());
            default:
                InputStream openInputStream2 = contentResolver.openInputStream(qa7.b);
                if (openInputStream2 != null) {
                    return c(openInputStream2, -1);
                }
                throw new IllegalStateException("ContentResolver returned null InputStream".toString());
        }
    }

    public final String e() {
        switch (this.c) {
            case 0:
                return "LocalContentUriFetchProducer";
            default:
                return "QualifiedResourceFetchProducer";
        }
    }
}
