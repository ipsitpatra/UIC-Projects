/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\SkyDrive\\MS Computer Science\\CS 478 Development of Mobile Apps\\Project 4\\Project4MusicClient\\src\\com\\edu\\Services\\MusicCommon\\Project4MusicService.aidl
 */
package com.edu.Services.MusicCommon;
public interface Project4MusicService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.edu.Services.MusicCommon.Project4MusicService
{
private static final java.lang.String DESCRIPTOR = "com.edu.Services.MusicCommon.Project4MusicService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.edu.Services.MusicCommon.Project4MusicService interface,
 * generating a proxy if needed.
 */
public static com.edu.Services.MusicCommon.Project4MusicService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.edu.Services.MusicCommon.Project4MusicService))) {
return ((com.edu.Services.MusicCommon.Project4MusicService)iin);
}
return new com.edu.Services.MusicCommon.Project4MusicService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_playSong:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
this.playSong(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_isPlaying:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isPlaying();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_getLog:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _result = this.getLog();
reply.writeNoException();
reply.writeStringList(_result);
return true;
}
case TRANSACTION_clearLog:
{
data.enforceInterface(DESCRIPTOR);
this.clearLog();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.edu.Services.MusicCommon.Project4MusicService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void playSong(int id, int action) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(id);
_data.writeInt(action);
mRemote.transact(Stub.TRANSACTION_playSong, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean isPlaying() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isPlaying, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public java.util.List<java.lang.String> getLog() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<java.lang.String> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLog, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArrayList();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void clearLog() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_clearLog, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_playSong = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_isPlaying = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_clearLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
}
public void playSong(int id, int action) throws android.os.RemoteException;
public boolean isPlaying() throws android.os.RemoteException;
public java.util.List<java.lang.String> getLog() throws android.os.RemoteException;
public void clearLog() throws android.os.RemoteException;
}
