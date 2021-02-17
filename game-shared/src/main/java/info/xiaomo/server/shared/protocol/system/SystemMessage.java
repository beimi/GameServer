// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SystemMessage.proto

package info.xiaomo.server.shared.protocol.system;

public final class SystemMessage {
  private SystemMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SystemErrorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SystemErrorResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeartRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HeartResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HeartResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UdpConnectRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UdpConnectRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UdpConnectResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UdpConnectResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023SystemMessage.proto\032\017MessageId.proto\"^" +
      "\n\023SystemErrorResponse\022\025\n\005msgId\030\001 \001(\0162\006.M" +
      "sgId\022#\n\terrorCode\030\002 \001(\0162\020.SystemErrorCod" +
      "e\022\013\n\003msg\030\003 \001(\t\"%\n\014HeartRequest\022\025\n\005msgId\030" +
      "\001 \001(\0162\006.MsgId\":\n\rHeartResponse\022\025\n\005msgId\030" +
      "\001 \001(\0162\006.MsgId\022\022\n\nserverTime\030\002 \001(\003\"J\n\021Udp" +
      "ConnectRequest\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022\021\n" +
      "\tsessionId\030\002 \001(\003\022\013\n\003rid\030\003 \001(\003\";\n\022UdpConn" +
      "ectResponse\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022\016\n\006re" +
      "sult\030\002 \001(\005*Q\n\017SystemErrorCode\022\013\n\007Default" +
      "\020\000\022\017\n\013HallNotFind\020\001\022\017\n\013GameNotFind\020\002\022\017\n\013" +
      "ConectReset\020\003B-\n)info.xiaomo.server.shar" +
      "ed.protocol.systemP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor(),
        });
    internal_static_SystemErrorResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SystemErrorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SystemErrorResponse_descriptor,
        new java.lang.String[] { "MsgId", "ErrorCode", "Msg", });
    internal_static_HeartRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_HeartRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeartRequest_descriptor,
        new java.lang.String[] { "MsgId", });
    internal_static_HeartResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_HeartResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HeartResponse_descriptor,
        new java.lang.String[] { "MsgId", "ServerTime", });
    internal_static_UdpConnectRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_UdpConnectRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UdpConnectRequest_descriptor,
        new java.lang.String[] { "MsgId", "SessionId", "Rid", });
    internal_static_UdpConnectResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_UdpConnectResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UdpConnectResponse_descriptor,
        new java.lang.String[] { "MsgId", "Result", });
    info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}