// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InterpretInferenceWordRsp.proto

package emu.grasscutter.net.proto;

public final class InterpretInferenceWordRspOuterClass {
  private InterpretInferenceWordRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InterpretInferenceWordRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InterpretInferenceWordRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 page_id = 1;</code>
     * @return The pageId.
     */
    int getPageId();

    /**
     * <code>uint32 word_id = 3;</code>
     * @return The wordId.
     */
    int getWordId();
  }
  /**
   * <pre>
   * CmdId: 423
   * Obf: JIGIJIPJONA
   * </pre>
   *
   * Protobuf type {@code InterpretInferenceWordRsp}
   */
  public static final class InterpretInferenceWordRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InterpretInferenceWordRsp)
      InterpretInferenceWordRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InterpretInferenceWordRsp.newBuilder() to construct.
    private InterpretInferenceWordRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InterpretInferenceWordRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InterpretInferenceWordRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InterpretInferenceWordRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              pageId_ = input.readUInt32();
              break;
            }
            case 24: {

              wordId_ = input.readUInt32();
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.internal_static_InterpretInferenceWordRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.internal_static_InterpretInferenceWordRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp.class, emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int PAGE_ID_FIELD_NUMBER = 1;
    private int pageId_;
    /**
     * <code>uint32 page_id = 1;</code>
     * @return The pageId.
     */
    @java.lang.Override
    public int getPageId() {
      return pageId_;
    }

    public static final int WORD_ID_FIELD_NUMBER = 3;
    private int wordId_;
    /**
     * <code>uint32 word_id = 3;</code>
     * @return The wordId.
     */
    @java.lang.Override
    public int getWordId() {
      return wordId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (pageId_ != 0) {
        output.writeUInt32(1, pageId_);
      }
      if (wordId_ != 0) {
        output.writeUInt32(3, wordId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, pageId_);
      }
      if (wordId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, wordId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp other = (emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getPageId()
          != other.getPageId()) return false;
      if (getWordId()
          != other.getWordId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + PAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPageId();
      hash = (37 * hash) + WORD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getWordId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 423
     * Obf: JIGIJIPJONA
     * </pre>
     *
     * Protobuf type {@code InterpretInferenceWordRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InterpretInferenceWordRsp)
        emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.internal_static_InterpretInferenceWordRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.internal_static_InterpretInferenceWordRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp.class, emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        pageId_ = 0;

        wordId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.internal_static_InterpretInferenceWordRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp build() {
        emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp buildPartial() {
        emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp result = new emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp(this);
        result.retcode_ = retcode_;
        result.pageId_ = pageId_;
        result.wordId_ = wordId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp) {
          return mergeFrom((emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp other) {
        if (other == emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getPageId() != 0) {
          setPageId(other.getPageId());
        }
        if (other.getWordId() != 0) {
          setWordId(other.getWordId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int pageId_ ;
      /**
       * <code>uint32 page_id = 1;</code>
       * @return The pageId.
       */
      @java.lang.Override
      public int getPageId() {
        return pageId_;
      }
      /**
       * <code>uint32 page_id = 1;</code>
       * @param value The pageId to set.
       * @return This builder for chaining.
       */
      public Builder setPageId(int value) {
        
        pageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 page_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPageId() {
        
        pageId_ = 0;
        onChanged();
        return this;
      }

      private int wordId_ ;
      /**
       * <code>uint32 word_id = 3;</code>
       * @return The wordId.
       */
      @java.lang.Override
      public int getWordId() {
        return wordId_;
      }
      /**
       * <code>uint32 word_id = 3;</code>
       * @param value The wordId to set.
       * @return This builder for chaining.
       */
      public Builder setWordId(int value) {
        
        wordId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 word_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearWordId() {
        
        wordId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:InterpretInferenceWordRsp)
    }

    // @@protoc_insertion_point(class_scope:InterpretInferenceWordRsp)
    private static final emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp();
    }

    public static emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InterpretInferenceWordRsp>
        PARSER = new com.google.protobuf.AbstractParser<InterpretInferenceWordRsp>() {
      @java.lang.Override
      public InterpretInferenceWordRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InterpretInferenceWordRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InterpretInferenceWordRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InterpretInferenceWordRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InterpretInferenceWordRspOuterClass.InterpretInferenceWordRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InterpretInferenceWordRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InterpretInferenceWordRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037InterpretInferenceWordRsp.proto\"N\n\031Int" +
      "erpretInferenceWordRsp\022\017\n\007retcode\030\007 \001(\005\022" +
      "\017\n\007page_id\030\001 \001(\r\022\017\n\007word_id\030\003 \001(\rB\033\n\031emu" +
      ".grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InterpretInferenceWordRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InterpretInferenceWordRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InterpretInferenceWordRsp_descriptor,
        new java.lang.String[] { "Retcode", "PageId", "WordId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
