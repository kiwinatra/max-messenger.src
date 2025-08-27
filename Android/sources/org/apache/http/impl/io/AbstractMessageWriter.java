package org.apache.http.impl.io;

import java.io.IOException;
import kotlin.uuid.Uuid;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.io.HttpMessageWriter;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.message.BasicLineFormatter;
import org.apache.http.message.LineFormatter;
import org.apache.http.params.HttpParams;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public abstract class AbstractMessageWriter implements HttpMessageWriter {
    protected final CharArrayBuffer lineBuf;
    protected final LineFormatter lineFormatter;
    protected final SessionOutputBuffer sessionBuffer;

    public AbstractMessageWriter(SessionOutputBuffer sessionOutputBuffer, LineFormatter lineFormatter2, HttpParams httpParams) {
        if (sessionOutputBuffer != null) {
            this.sessionBuffer = sessionOutputBuffer;
            this.lineBuf = new CharArrayBuffer(Uuid.SIZE_BITS);
            this.lineFormatter = lineFormatter2 == null ? BasicLineFormatter.DEFAULT : lineFormatter2;
            return;
        }
        throw new IllegalArgumentException("Session input buffer may not be null");
    }

    public void write(HttpMessage httpMessage) throws IOException, HttpException {
        if (httpMessage != null) {
            writeHeadLine(httpMessage);
            HeaderIterator headerIterator = httpMessage.headerIterator();
            while (headerIterator.hasNext()) {
                this.sessionBuffer.writeLine(this.lineFormatter.formatHeader(this.lineBuf, (Header) headerIterator.next()));
            }
            this.lineBuf.clear();
            this.sessionBuffer.writeLine(this.lineBuf);
            return;
        }
        throw new IllegalArgumentException("HTTP message may not be null");
    }

    public abstract void writeHeadLine(HttpMessage httpMessage) throws IOException;
}
