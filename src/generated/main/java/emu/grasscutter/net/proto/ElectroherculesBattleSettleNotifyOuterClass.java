// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ElectroherculesBattleSettleNotify.proto

package emu.grasscutter.net.proto;

public final class ElectroherculesBattleSettleNotifyOuterClass {
  private ElectroherculesBattleSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ElectroherculesBattleSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ElectroherculesBattleSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 BNMHJGCJAPB = 10;</code>
     * @return The bNMHJGCJAPB.
     */
    int getBNMHJGCJAPB();

    /**
     * <code>uint32 finish_time = 1;</code>
     * @return The finishTime.
     */
    int getFinishTime();

    /**
     * <code>uint32 gallery_id = 3;</code>
     * @return The galleryId.
     */
    int getGalleryId();

    /**
     * <code>bool is_new_record = 7;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 stage_id = 14;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>bool is_succ = 11;</code>
     * @return The isSucc.
     */
    boolean getIsSucc();

    /**
     * <code>bool BBEILLFPCOC = 2;</code>
     * @return The bBEILLFPCOC.
     */
    boolean getBBEILLFPCOC();
  }
  /**
   * <pre>
   * CmdId: 22701
   * Obf: KCFNLIHPJBG
   * </pre>
   *
   * Protobuf type {@code ElectroherculesBattleSettleNotify}
   */
  public static final class ElectroherculesBattleSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ElectroherculesBattleSettleNotify)
      ElectroherculesBattleSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ElectroherculesBattleSettleNotify.newBuilder() to construct.
    private ElectroherculesBattleSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ElectroherculesBattleSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ElectroherculesBattleSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ElectroherculesBattleSettleNotify(
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

              finishTime_ = input.readUInt32();
              break;
            }
            case 16: {

              bBEILLFPCOC_ = input.readBool();
              break;
            }
            case 24: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 56: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 80: {

              bNMHJGCJAPB_ = input.readUInt32();
              break;
            }
            case 88: {

              isSucc_ = input.readBool();
              break;
            }
            case 112: {

              stageId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.internal_static_ElectroherculesBattleSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.internal_static_ElectroherculesBattleSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify.class, emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify.Builder.class);
    }

    public static final int BNMHJGCJAPB_FIELD_NUMBER = 10;
    private int bNMHJGCJAPB_;
    /**
     * <code>uint32 BNMHJGCJAPB = 10;</code>
     * @return The bNMHJGCJAPB.
     */
    @java.lang.Override
    public int getBNMHJGCJAPB() {
      return bNMHJGCJAPB_;
    }

    public static final int FINISH_TIME_FIELD_NUMBER = 1;
    private int finishTime_;
    /**
     * <code>uint32 finish_time = 1;</code>
     * @return The finishTime.
     */
    @java.lang.Override
    public int getFinishTime() {
      return finishTime_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 3;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 3;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 7;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 7;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 14;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 14;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int IS_SUCC_FIELD_NUMBER = 11;
    private boolean isSucc_;
    /**
     * <code>bool is_succ = 11;</code>
     * @return The isSucc.
     */
    @java.lang.Override
    public boolean getIsSucc() {
      return isSucc_;
    }

    public static final int BBEILLFPCOC_FIELD_NUMBER = 2;
    private boolean bBEILLFPCOC_;
    /**
     * <code>bool BBEILLFPCOC = 2;</code>
     * @return The bBEILLFPCOC.
     */
    @java.lang.Override
    public boolean getBBEILLFPCOC() {
      return bBEILLFPCOC_;
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
      if (finishTime_ != 0) {
        output.writeUInt32(1, finishTime_);
      }
      if (bBEILLFPCOC_ != false) {
        output.writeBool(2, bBEILLFPCOC_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(3, galleryId_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(7, isNewRecord_);
      }
      if (bNMHJGCJAPB_ != 0) {
        output.writeUInt32(10, bNMHJGCJAPB_);
      }
      if (isSucc_ != false) {
        output.writeBool(11, isSucc_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(14, stageId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finishTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, finishTime_);
      }
      if (bBEILLFPCOC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, bBEILLFPCOC_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, galleryId_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isNewRecord_);
      }
      if (bNMHJGCJAPB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, bNMHJGCJAPB_);
      }
      if (isSucc_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(11, isSucc_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, stageId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify other = (emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify) obj;

      if (getBNMHJGCJAPB()
          != other.getBNMHJGCJAPB()) return false;
      if (getFinishTime()
          != other.getFinishTime()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (getIsSucc()
          != other.getIsSucc()) return false;
      if (getBBEILLFPCOC()
          != other.getBBEILLFPCOC()) return false;
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
      hash = (37 * hash) + BNMHJGCJAPB_FIELD_NUMBER;
      hash = (53 * hash) + getBNMHJGCJAPB();
      hash = (37 * hash) + FINISH_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getFinishTime();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + IS_SUCC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSucc());
      hash = (37 * hash) + BBEILLFPCOC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getBBEILLFPCOC());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify prototype) {
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
     * CmdId: 22701
     * Obf: KCFNLIHPJBG
     * </pre>
     *
     * Protobuf type {@code ElectroherculesBattleSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ElectroherculesBattleSettleNotify)
        emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.internal_static_ElectroherculesBattleSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.internal_static_ElectroherculesBattleSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify.class, emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify.newBuilder()
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
        bNMHJGCJAPB_ = 0;

        finishTime_ = 0;

        galleryId_ = 0;

        isNewRecord_ = false;

        stageId_ = 0;

        isSucc_ = false;

        bBEILLFPCOC_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.internal_static_ElectroherculesBattleSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify build() {
        emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify buildPartial() {
        emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify result = new emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify(this);
        result.bNMHJGCJAPB_ = bNMHJGCJAPB_;
        result.finishTime_ = finishTime_;
        result.galleryId_ = galleryId_;
        result.isNewRecord_ = isNewRecord_;
        result.stageId_ = stageId_;
        result.isSucc_ = isSucc_;
        result.bBEILLFPCOC_ = bBEILLFPCOC_;
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
        if (other instanceof emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify other) {
        if (other == emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify.getDefaultInstance()) return this;
        if (other.getBNMHJGCJAPB() != 0) {
          setBNMHJGCJAPB(other.getBNMHJGCJAPB());
        }
        if (other.getFinishTime() != 0) {
          setFinishTime(other.getFinishTime());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getIsSucc() != false) {
          setIsSucc(other.getIsSucc());
        }
        if (other.getBBEILLFPCOC() != false) {
          setBBEILLFPCOC(other.getBBEILLFPCOC());
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
        emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bNMHJGCJAPB_ ;
      /**
       * <code>uint32 BNMHJGCJAPB = 10;</code>
       * @return The bNMHJGCJAPB.
       */
      @java.lang.Override
      public int getBNMHJGCJAPB() {
        return bNMHJGCJAPB_;
      }
      /**
       * <code>uint32 BNMHJGCJAPB = 10;</code>
       * @param value The bNMHJGCJAPB to set.
       * @return This builder for chaining.
       */
      public Builder setBNMHJGCJAPB(int value) {
        
        bNMHJGCJAPB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 BNMHJGCJAPB = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBNMHJGCJAPB() {
        
        bNMHJGCJAPB_ = 0;
        onChanged();
        return this;
      }

      private int finishTime_ ;
      /**
       * <code>uint32 finish_time = 1;</code>
       * @return The finishTime.
       */
      @java.lang.Override
      public int getFinishTime() {
        return finishTime_;
      }
      /**
       * <code>uint32 finish_time = 1;</code>
       * @param value The finishTime to set.
       * @return This builder for chaining.
       */
      public Builder setFinishTime(int value) {
        
        finishTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finish_time = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishTime() {
        
        finishTime_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 3;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 3;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 7;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 7;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 14;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 14;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private boolean isSucc_ ;
      /**
       * <code>bool is_succ = 11;</code>
       * @return The isSucc.
       */
      @java.lang.Override
      public boolean getIsSucc() {
        return isSucc_;
      }
      /**
       * <code>bool is_succ = 11;</code>
       * @param value The isSucc to set.
       * @return This builder for chaining.
       */
      public Builder setIsSucc(boolean value) {
        
        isSucc_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_succ = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSucc() {
        
        isSucc_ = false;
        onChanged();
        return this;
      }

      private boolean bBEILLFPCOC_ ;
      /**
       * <code>bool BBEILLFPCOC = 2;</code>
       * @return The bBEILLFPCOC.
       */
      @java.lang.Override
      public boolean getBBEILLFPCOC() {
        return bBEILLFPCOC_;
      }
      /**
       * <code>bool BBEILLFPCOC = 2;</code>
       * @param value The bBEILLFPCOC to set.
       * @return This builder for chaining.
       */
      public Builder setBBEILLFPCOC(boolean value) {
        
        bBEILLFPCOC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool BBEILLFPCOC = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBBEILLFPCOC() {
        
        bBEILLFPCOC_ = false;
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


      // @@protoc_insertion_point(builder_scope:ElectroherculesBattleSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:ElectroherculesBattleSettleNotify)
    private static final emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify();
    }

    public static emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ElectroherculesBattleSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<ElectroherculesBattleSettleNotify>() {
      @java.lang.Override
      public ElectroherculesBattleSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ElectroherculesBattleSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ElectroherculesBattleSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ElectroherculesBattleSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ElectroherculesBattleSettleNotifyOuterClass.ElectroherculesBattleSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ElectroherculesBattleSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ElectroherculesBattleSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'ElectroherculesBattleSettleNotify.prot" +
      "o\"\260\001\n!ElectroherculesBattleSettleNotify\022" +
      "\023\n\013BNMHJGCJAPB\030\n \001(\r\022\023\n\013finish_time\030\001 \001(" +
      "\r\022\022\n\ngallery_id\030\003 \001(\r\022\025\n\ris_new_record\030\007" +
      " \001(\010\022\020\n\010stage_id\030\016 \001(\r\022\017\n\007is_succ\030\013 \001(\010\022" +
      "\023\n\013BBEILLFPCOC\030\002 \001(\010B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ElectroherculesBattleSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ElectroherculesBattleSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ElectroherculesBattleSettleNotify_descriptor,
        new java.lang.String[] { "BNMHJGCJAPB", "FinishTime", "GalleryId", "IsNewRecord", "StageId", "IsSucc", "BBEILLFPCOC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
