// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test.proto

public final class Test {
  private Test() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TestHelloWorld_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TestHelloWorld_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ntest.proto\"M\n\016TestHelloWorld\022\020\n\010strHel" +
      "lo\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\016\n\006weight\030\003 \001(\002\022\014\n" +
      "\004size\030\004 \001(\0022C\n\025TestHelloWorldService\022*\n\006" +
      "Search\022\017.TestHelloWorld\032\017.TestHelloWorld" +
      "B\010B\004TestP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TestHelloWorld_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TestHelloWorld_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TestHelloWorld_descriptor,
        new java.lang.String[] { "StrHello", "Age", "Weight", "Size", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
