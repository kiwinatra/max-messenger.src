package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: mj7  reason: default package */
public abstract class mj7 {
    /* JADX WARNING: type inference failed for: r0v2, types: [odf, java.lang.Object] */
    public static nj7 a(byte[] bArr) {
        try {
            Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = (Tasks.InvalidateAndDownloadAudio) ad9.mergeFrom(new Tasks.InvalidateAndDownloadAudio(), bArr);
            ? obj = new Object();
            Tasks.FileDownload fileDownload = invalidateAndDownloadAudio.fileDownload;
            obj.a = fileDownload.messageId;
            obj.b = fileDownload.attachId;
            obj.c = fileDownload.videoId;
            obj.d = fileDownload.audioId;
            obj.e = fileDownload.mp4GifId;
            obj.f = fileDownload.stickerId;
            obj.j = fileDownload.fileId;
            obj.k = fileDownload.fileName;
            obj.g = fileDownload.url;
            obj.h = fileDownload.notifyProgress;
            obj.i = fileDownload.checkAutoloadConnection;
            obj.l = fileDownload.invalidateCount;
            obj.m = fileDownload.useOriginalExtension;
            obj.n = fileDownload.notCopyVideoToGallery;
            return new nj7(invalidateAndDownloadAudio.requestId, invalidateAndDownloadAudio.outputPath, invalidateAndDownloadAudio.chatServerId, invalidateAndDownloadAudio.serverMessageId, new pdf(obj));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
