// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IMC.proto

package imcPersonne;

public final class IMC {
  private IMC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_imcPersonne_imcPersonneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_imcPersonne_imcPersonneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_imcPersonne_imcResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_imcPersonne_imcResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tIMC.proto\022\013imcPersonne\"P\n\022imcPersonneR" +
      "equest\022\017\n\007strName\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\016\n\006" +
      "weight\030\003 \001(\002\022\014\n\004size\030\004 \001(\002\"\037\n\013imcRespons" +
      "e\022\020\n\010response\030\001 \001(\t2Y\n\nimcService\022K\n\016tes" +
      "tHelloWorld\022\037.imcPersonne.imcPersonneReq" +
      "uest\032\030.imcPersonne.imcResponseB\tB\003IMCH\003P" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_imcPersonne_imcPersonneRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_imcPersonne_imcPersonneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_imcPersonne_imcPersonneRequest_descriptor,
        new java.lang.String[] { "StrName", "Age", "Weight", "Size", });
    internal_static_imcPersonne_imcResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_imcPersonne_imcResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_imcPersonne_imcResponse_descriptor,
        new java.lang.String[] { "Response", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
