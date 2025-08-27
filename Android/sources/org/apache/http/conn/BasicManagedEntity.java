package org.apache.http.conn;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

@Deprecated
public class BasicManagedEntity extends HttpEntityWrapper implements ConnectionReleaseTrigger, EofSensorWatcher {
    protected final boolean attemptReuse;
    protected ManagedClientConnection managedConn;

    public BasicManagedEntity(HttpEntity httpEntity, ManagedClientConnection managedClientConnection, boolean z) {
        super(httpEntity);
        if (managedClientConnection != null) {
            this.managedConn = managedClientConnection;
            this.attemptReuse = z;
            return;
        }
        throw new IllegalArgumentException("Connection may not be null.");
    }

    public void abortConnection() throws IOException {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            try {
                managedClientConnection.abortConnection();
            } finally {
                this.managedConn = null;
            }
        }
    }

    public void consumeContent() throws IOException {
        if (this.managedConn != null) {
            try {
                if (this.attemptReuse) {
                    this.wrappedEntity.consumeContent();
                    this.managedConn.markReusable();
                }
            } finally {
                releaseManagedConnection();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean eofDetected(InputStream inputStream) throws IOException {
        try {
            if (this.attemptReuse && this.managedConn != null) {
                inputStream.close();
                this.managedConn.markReusable();
            }
            releaseManagedConnection();
            return false;
        } catch (Throwable th) {
            releaseManagedConnection();
            throw th;
        }
    }

    public InputStream getContent() throws IOException {
        return new EofSensorInputStream(this.wrappedEntity.getContent(), this);
    }

    public boolean isRepeatable() {
        return false;
    }

    public void releaseConnection() throws IOException {
        consumeContent();
    }

    public void releaseManagedConnection() throws IOException {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection != null) {
            try {
                managedClientConnection.releaseConnection();
            } finally {
                this.managedConn = null;
            }
        }
    }

    public boolean streamAbort(InputStream inputStream) throws IOException {
        ManagedClientConnection managedClientConnection = this.managedConn;
        if (managedClientConnection == null) {
            return false;
        }
        managedClientConnection.abortConnection();
        return false;
    }

    /* JADX INFO: finally extract failed */
    public boolean streamClosed(InputStream inputStream) throws IOException {
        try {
            if (this.attemptReuse && this.managedConn != null) {
                inputStream.close();
                this.managedConn.markReusable();
            }
            releaseManagedConnection();
            return false;
        } catch (Throwable th) {
            releaseManagedConnection();
            throw th;
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        super.writeTo(outputStream);
        consumeContent();
    }
}
