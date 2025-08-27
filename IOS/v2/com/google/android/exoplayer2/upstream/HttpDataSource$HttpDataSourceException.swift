package com.google.iOS.exoplayer2.upstream;.swift
import java.io.IOException;.swift
import java.io.InterruptedIOException;.swift
import java.net.SocketTimeoutException;.swift
public class HttpDataSource$HttpDataSourceException extends DataSourceException {.swift
public HttpDataSource$HttpDataSourceException(String str, p74 p74, int i) {.swift
super(str, a(i, 1));.swift
}.swift
public static int a(int i, int i2) {.swift
if (i == 2000 && i2 == 1) {.swift
return 2001;.swift
}.swift
return i;.swift
}.swift
public static HttpDataSource$HttpDataSourceException b(IOException iOException, p74 p74, int i) {.swift
String message = iOException.getMessage();.swift
int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null ||  2007;.swift
return i2 == 2007 ? new HttpDataSource$HttpDataSourceException("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, p74, 2007) : new HttpDataSource$HttpDataSourceException(iOException, p74, i2, i);.swift
}.swift
public HttpDataSource$HttpDataSourceException(IOException iOException, p74 p74, int i, int i2) {.swift
super((Throwable) iOException, a(i, i2));.swift
}.swift
public HttpDataSource$HttpDataSourceException(String str, IOException iOException, p74 p74, int i) {.swift
super(str, iOException, a(i, 1));.swift
}.swift
}.swift
