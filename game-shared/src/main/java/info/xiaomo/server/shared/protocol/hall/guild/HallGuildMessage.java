// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HallGuildMessage.proto

package info.xiaomo.server.shared.protocol.hall.guild;

public final class HallGuildMessage {
  private HallGuildMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApplyGuildRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApplyGuildRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ApplyGuildResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ApplyGuildResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildApprovalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildApprovalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildApprovalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildApprovalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateGuildRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateGuildRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CreateGuildResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CreateGuildResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GuildMemberInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GuildMemberInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HallGuildMessage.proto\032\017MessageId.prot" +
      "o\":\n\020GuildInfoRequest\022\025\n\005msgId\030\001 \001(\0162\006.M" +
      "sgId\022\017\n\007guildId\030\002 \001(\003\"I\n\021GuildInfoRespon" +
      "se\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022\035\n\tguildInfo\030\002" +
      " \001(\0132\n.GuildInfo\")\n\020GuildListRequest\022\025\n\005" +
      "msgId\030\001 \001(\0162\006.MsgId\"F\n\021GuildListResponse" +
      "\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022\032\n\006guilds\030\002 \003(\0132" +
      "\n.GuildInfo\";\n\021ApplyGuildRequest\022\025\n\005msgI" +
      "d\030\001 \001(\0162\006.MsgId\022\017\n\007guildId\030\002 \001(\003\";\n\022Appl" +
      "yGuildResponse\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022\016\n" +
      "\006result\030\002 \001(\005\"K\n\024GuildApprovalRequest\022\025\n" +
      "\005msgId\030\001 \001(\0162\006.MsgId\022\016\n\006roleId\030\002 \001(\003\022\014\n\004" +
      "type\030\003 \001(\005\">\n\025GuildApprovalResponse\022\025\n\005m" +
      "sgId\030\001 \001(\0162\006.MsgId\022\016\n\006result\030\002 \001(\005\"9\n\022Cr" +
      "eateGuildRequest\022\025\n\005msgId\030\001 \001(\0162\006.MsgId\022" +
      "\014\n\004name\030\002 \001(\t\"[\n\023CreateGuildResponse\022\025\n\005" +
      "msgId\030\001 \001(\0162\006.MsgId\022\016\n\006result\030\002 \001(\005\022\035\n\tg" +
      "uildInfo\030\003 \001(\0132\n.GuildInfo\"i\n\tGuildInfo\022" +
      "\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\020\n\010masterId\030\003 " +
      "\001(\003\022\r\n\005level\030\004 \001(\005\022!\n\007members\030\005 \003(\0132\020.Gu" +
      "ildMemberInfo\">\n\017GuildMemberInfo\022\016\n\006role" +
      "Id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\r\n\005level\030\003 \001(\005B1\n" +
      "-info.xiaomo.server.shared.protocol.hall" +
      ".guildP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor(),
        });
    internal_static_GuildInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GuildInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildInfoRequest_descriptor,
        new java.lang.String[] { "MsgId", "GuildId", });
    internal_static_GuildInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GuildInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildInfoResponse_descriptor,
        new java.lang.String[] { "MsgId", "GuildInfo", });
    internal_static_GuildListRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_GuildListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildListRequest_descriptor,
        new java.lang.String[] { "MsgId", });
    internal_static_GuildListResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_GuildListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildListResponse_descriptor,
        new java.lang.String[] { "MsgId", "Guilds", });
    internal_static_ApplyGuildRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ApplyGuildRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApplyGuildRequest_descriptor,
        new java.lang.String[] { "MsgId", "GuildId", });
    internal_static_ApplyGuildResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ApplyGuildResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ApplyGuildResponse_descriptor,
        new java.lang.String[] { "MsgId", "Result", });
    internal_static_GuildApprovalRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_GuildApprovalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildApprovalRequest_descriptor,
        new java.lang.String[] { "MsgId", "RoleId", "Type", });
    internal_static_GuildApprovalResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_GuildApprovalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildApprovalResponse_descriptor,
        new java.lang.String[] { "MsgId", "Result", });
    internal_static_CreateGuildRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_CreateGuildRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateGuildRequest_descriptor,
        new java.lang.String[] { "MsgId", "Name", });
    internal_static_CreateGuildResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_CreateGuildResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CreateGuildResponse_descriptor,
        new java.lang.String[] { "MsgId", "Result", "GuildInfo", });
    internal_static_GuildInfo_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_GuildInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildInfo_descriptor,
        new java.lang.String[] { "Id", "Name", "MasterId", "Level", "Members", });
    internal_static_GuildMemberInfo_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_GuildMemberInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GuildMemberInfo_descriptor,
        new java.lang.String[] { "RoleId", "Name", "Level", });
    info.xiaomo.server.shared.protocol.msg.MessageId.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}