// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TriggerRoguelikeCurseNotify.proto

package emu.grasscutter.net.proto;

public final class TriggerRoguelikeCurseNotifyOuterClass {
  private TriggerRoguelikeCurseNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TriggerRoguelikeCurseNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TriggerRoguelikeCurseNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 CMHIDNPDNFE = 15;</code>
     * @return The cMHIDNPDNFE.
     */
    int getCMHIDNPDNFE();

    /**
     * <code>repeated uint32 effect_param_list = 3;</code>
     * @return A list containing the effectParamList.
     */
    java.util.List<java.lang.Integer> getEffectParamListList();
    /**
     * <code>repeated uint32 effect_param_list = 3;</code>
     * @return The count of effectParamList.
     */
    int getEffectParamListCount();
    /**
     * <code>repeated uint32 effect_param_list = 3;</code>
     * @param index The index of the element to return.
     * @return The effectParamList at the given index.
     */
    int getEffectParamList(int index);

    /**
     * <code>bool is_trigger_curse = 13;</code>
     * @return The isTriggerCurse.
     */
    boolean getIsTriggerCurse();

    /**
     * <code>uint32 JPMJHMPGOLL = 7;</code>
     * @return The jPMJHMPGOLL.
     */
    int getJPMJHMPGOLL();
  }
  /**
   * <pre>
   * CmdId: 8958
   * Obf: OONGFKFDNBI
   * </pre>
   *
   * Protobuf type {@code TriggerRoguelikeCurseNotify}
   */
  public static final class TriggerRoguelikeCurseNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TriggerRoguelikeCurseNotify)
      TriggerRoguelikeCurseNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TriggerRoguelikeCurseNotify.newBuilder() to construct.
    private TriggerRoguelikeCurseNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TriggerRoguelikeCurseNotify() {
      effectParamList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TriggerRoguelikeCurseNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TriggerRoguelikeCurseNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 24: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                effectParamList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              effectParamList_.addInt(input.readUInt32());
              break;
            }
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                effectParamList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                effectParamList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 56: {

              jPMJHMPGOLL_ = input.readUInt32();
              break;
            }
            case 104: {

              isTriggerCurse_ = input.readBool();
              break;
            }
            case 120: {

              cMHIDNPDNFE_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          effectParamList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.class, emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.Builder.class);
    }

    public static final int CMHIDNPDNFE_FIELD_NUMBER = 15;
    private int cMHIDNPDNFE_;
    /**
     * <code>uint32 CMHIDNPDNFE = 15;</code>
     * @return The cMHIDNPDNFE.
     */
    @java.lang.Override
    public int getCMHIDNPDNFE() {
      return cMHIDNPDNFE_;
    }

    public static final int EFFECT_PARAM_LIST_FIELD_NUMBER = 3;
    private com.google.protobuf.Internal.IntList effectParamList_;
    /**
     * <code>repeated uint32 effect_param_list = 3;</code>
     * @return A list containing the effectParamList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getEffectParamListList() {
      return effectParamList_;
    }
    /**
     * <code>repeated uint32 effect_param_list = 3;</code>
     * @return The count of effectParamList.
     */
    public int getEffectParamListCount() {
      return effectParamList_.size();
    }
    /**
     * <code>repeated uint32 effect_param_list = 3;</code>
     * @param index The index of the element to return.
     * @return The effectParamList at the given index.
     */
    public int getEffectParamList(int index) {
      return effectParamList_.getInt(index);
    }
    private int effectParamListMemoizedSerializedSize = -1;

    public static final int IS_TRIGGER_CURSE_FIELD_NUMBER = 13;
    private boolean isTriggerCurse_;
    /**
     * <code>bool is_trigger_curse = 13;</code>
     * @return The isTriggerCurse.
     */
    @java.lang.Override
    public boolean getIsTriggerCurse() {
      return isTriggerCurse_;
    }

    public static final int JPMJHMPGOLL_FIELD_NUMBER = 7;
    private int jPMJHMPGOLL_;
    /**
     * <code>uint32 JPMJHMPGOLL = 7;</code>
     * @return The jPMJHMPGOLL.
     */
    @java.lang.Override
    public int getJPMJHMPGOLL() {
      return jPMJHMPGOLL_;
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
      getSerializedSize();
      if (getEffectParamListList().size() > 0) {
        output.writeUInt32NoTag(26);
        output.writeUInt32NoTag(effectParamListMemoizedSerializedSize);
      }
      for (int i = 0; i < effectParamList_.size(); i++) {
        output.writeUInt32NoTag(effectParamList_.getInt(i));
      }
      if (jPMJHMPGOLL_ != 0) {
        output.writeUInt32(7, jPMJHMPGOLL_);
      }
      if (isTriggerCurse_ != false) {
        output.writeBool(13, isTriggerCurse_);
      }
      if (cMHIDNPDNFE_ != 0) {
        output.writeUInt32(15, cMHIDNPDNFE_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < effectParamList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(effectParamList_.getInt(i));
        }
        size += dataSize;
        if (!getEffectParamListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        effectParamListMemoizedSerializedSize = dataSize;
      }
      if (jPMJHMPGOLL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, jPMJHMPGOLL_);
      }
      if (isTriggerCurse_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isTriggerCurse_);
      }
      if (cMHIDNPDNFE_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, cMHIDNPDNFE_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify other = (emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify) obj;

      if (getCMHIDNPDNFE()
          != other.getCMHIDNPDNFE()) return false;
      if (!getEffectParamListList()
          .equals(other.getEffectParamListList())) return false;
      if (getIsTriggerCurse()
          != other.getIsTriggerCurse()) return false;
      if (getJPMJHMPGOLL()
          != other.getJPMJHMPGOLL()) return false;
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
      hash = (37 * hash) + CMHIDNPDNFE_FIELD_NUMBER;
      hash = (53 * hash) + getCMHIDNPDNFE();
      if (getEffectParamListCount() > 0) {
        hash = (37 * hash) + EFFECT_PARAM_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getEffectParamListList().hashCode();
      }
      hash = (37 * hash) + IS_TRIGGER_CURSE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsTriggerCurse());
      hash = (37 * hash) + JPMJHMPGOLL_FIELD_NUMBER;
      hash = (53 * hash) + getJPMJHMPGOLL();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify prototype) {
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
     * CmdId: 8958
     * Obf: OONGFKFDNBI
     * </pre>
     *
     * Protobuf type {@code TriggerRoguelikeCurseNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TriggerRoguelikeCurseNotify)
        emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.class, emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.newBuilder()
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
        cMHIDNPDNFE_ = 0;

        effectParamList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        isTriggerCurse_ = false;

        jPMJHMPGOLL_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.internal_static_TriggerRoguelikeCurseNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify build() {
        emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify buildPartial() {
        emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify result = new emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify(this);
        int from_bitField0_ = bitField0_;
        result.cMHIDNPDNFE_ = cMHIDNPDNFE_;
        if (((bitField0_ & 0x00000001) != 0)) {
          effectParamList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.effectParamList_ = effectParamList_;
        result.isTriggerCurse_ = isTriggerCurse_;
        result.jPMJHMPGOLL_ = jPMJHMPGOLL_;
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
        if (other instanceof emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify other) {
        if (other == emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify.getDefaultInstance()) return this;
        if (other.getCMHIDNPDNFE() != 0) {
          setCMHIDNPDNFE(other.getCMHIDNPDNFE());
        }
        if (!other.effectParamList_.isEmpty()) {
          if (effectParamList_.isEmpty()) {
            effectParamList_ = other.effectParamList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEffectParamListIsMutable();
            effectParamList_.addAll(other.effectParamList_);
          }
          onChanged();
        }
        if (other.getIsTriggerCurse() != false) {
          setIsTriggerCurse(other.getIsTriggerCurse());
        }
        if (other.getJPMJHMPGOLL() != 0) {
          setJPMJHMPGOLL(other.getJPMJHMPGOLL());
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
        emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int cMHIDNPDNFE_ ;
      /**
       * <code>uint32 CMHIDNPDNFE = 15;</code>
       * @return The cMHIDNPDNFE.
       */
      @java.lang.Override
      public int getCMHIDNPDNFE() {
        return cMHIDNPDNFE_;
      }
      /**
       * <code>uint32 CMHIDNPDNFE = 15;</code>
       * @param value The cMHIDNPDNFE to set.
       * @return This builder for chaining.
       */
      public Builder setCMHIDNPDNFE(int value) {
        
        cMHIDNPDNFE_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 CMHIDNPDNFE = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearCMHIDNPDNFE() {
        
        cMHIDNPDNFE_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList effectParamList_ = emptyIntList();
      private void ensureEffectParamListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          effectParamList_ = mutableCopy(effectParamList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 effect_param_list = 3;</code>
       * @return A list containing the effectParamList.
       */
      public java.util.List<java.lang.Integer>
          getEffectParamListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(effectParamList_) : effectParamList_;
      }
      /**
       * <code>repeated uint32 effect_param_list = 3;</code>
       * @return The count of effectParamList.
       */
      public int getEffectParamListCount() {
        return effectParamList_.size();
      }
      /**
       * <code>repeated uint32 effect_param_list = 3;</code>
       * @param index The index of the element to return.
       * @return The effectParamList at the given index.
       */
      public int getEffectParamList(int index) {
        return effectParamList_.getInt(index);
      }
      /**
       * <code>repeated uint32 effect_param_list = 3;</code>
       * @param index The index to set the value at.
       * @param value The effectParamList to set.
       * @return This builder for chaining.
       */
      public Builder setEffectParamList(
          int index, int value) {
        ensureEffectParamListIsMutable();
        effectParamList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 effect_param_list = 3;</code>
       * @param value The effectParamList to add.
       * @return This builder for chaining.
       */
      public Builder addEffectParamList(int value) {
        ensureEffectParamListIsMutable();
        effectParamList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 effect_param_list = 3;</code>
       * @param values The effectParamList to add.
       * @return This builder for chaining.
       */
      public Builder addAllEffectParamList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureEffectParamListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, effectParamList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 effect_param_list = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEffectParamList() {
        effectParamList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private boolean isTriggerCurse_ ;
      /**
       * <code>bool is_trigger_curse = 13;</code>
       * @return The isTriggerCurse.
       */
      @java.lang.Override
      public boolean getIsTriggerCurse() {
        return isTriggerCurse_;
      }
      /**
       * <code>bool is_trigger_curse = 13;</code>
       * @param value The isTriggerCurse to set.
       * @return This builder for chaining.
       */
      public Builder setIsTriggerCurse(boolean value) {
        
        isTriggerCurse_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_trigger_curse = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsTriggerCurse() {
        
        isTriggerCurse_ = false;
        onChanged();
        return this;
      }

      private int jPMJHMPGOLL_ ;
      /**
       * <code>uint32 JPMJHMPGOLL = 7;</code>
       * @return The jPMJHMPGOLL.
       */
      @java.lang.Override
      public int getJPMJHMPGOLL() {
        return jPMJHMPGOLL_;
      }
      /**
       * <code>uint32 JPMJHMPGOLL = 7;</code>
       * @param value The jPMJHMPGOLL to set.
       * @return This builder for chaining.
       */
      public Builder setJPMJHMPGOLL(int value) {
        
        jPMJHMPGOLL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 JPMJHMPGOLL = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearJPMJHMPGOLL() {
        
        jPMJHMPGOLL_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TriggerRoguelikeCurseNotify)
    }

    // @@protoc_insertion_point(class_scope:TriggerRoguelikeCurseNotify)
    private static final emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify();
    }

    public static emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TriggerRoguelikeCurseNotify>
        PARSER = new com.google.protobuf.AbstractParser<TriggerRoguelikeCurseNotify>() {
      @java.lang.Override
      public TriggerRoguelikeCurseNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TriggerRoguelikeCurseNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TriggerRoguelikeCurseNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TriggerRoguelikeCurseNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TriggerRoguelikeCurseNotifyOuterClass.TriggerRoguelikeCurseNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TriggerRoguelikeCurseNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TriggerRoguelikeCurseNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!TriggerRoguelikeCurseNotify.proto\"|\n\033T" +
      "riggerRoguelikeCurseNotify\022\023\n\013CMHIDNPDNF" +
      "E\030\017 \001(\r\022\031\n\021effect_param_list\030\003 \003(\r\022\030\n\020is" +
      "_trigger_curse\030\r \001(\010\022\023\n\013JPMJHMPGOLL\030\007 \001(" +
      "\rB\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TriggerRoguelikeCurseNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TriggerRoguelikeCurseNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TriggerRoguelikeCurseNotify_descriptor,
        new java.lang.String[] { "CMHIDNPDNFE", "EffectParamList", "IsTriggerCurse", "JPMJHMPGOLL", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
