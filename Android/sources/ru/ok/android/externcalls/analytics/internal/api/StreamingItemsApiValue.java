package ru.ok.android.externcalls.analytics.internal.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipException;
import kotlin.io.ConstantsKt;
import ru.ok.android.api.json.JsonSerializeException;
import ru.ok.android.api.json.JsonSyntaxException;

public class StreamingItemsApiValue extends hs0 {
    private final File file;
    private final boolean isCompressed;

    public StreamingItemsApiValue(File file2, boolean z) {
        this.file = file2;
        this.isCompressed = z;
    }

    public void write(zp7 zp7) throws IOException, JsonSerializeException {
        InputStream fileInputStream;
        InputStreamReader inputStreamReader;
        zp7.v();
        try {
            fileInputStream = new FileInputStream(this.file);
            if (this.isCompressed) {
                fileInputStream = new GZIPInputStream(fileInputStream, ConstantsKt.DEFAULT_BLOCK_SIZE);
            }
            inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            zp7.p(inputStreamReader);
            inputStreamReader.close();
            fileInputStream.close();
            zp7.u();
            return;
            throw th;
            throw th;
        } catch (JsonSyntaxException e) {
            throw new Exception(e);
        } catch (ZipException e2) {
            throw new Exception(e2);
        } catch (Throwable th) {
            zp7.u();
            throw th;
        }
    }
}
