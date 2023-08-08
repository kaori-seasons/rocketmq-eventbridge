package org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto;

public final class Master {
    private Master() {}
    public static void registerAllExtensions(
        com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
        com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
            (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface ContainerInfosOrBuilder extends
        // @@protoc_insertion_point(interface_extends:ContainerInfos)
        com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bytes payload = 1;</code>
         * @return The payload.
         */
        com.google.protobuf.ByteString getPayload();
    }
    /**
     * Protobuf type {@code ContainerInfos}
     */
    public static final class ContainerInfos extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:ContainerInfos)
        ContainerInfosOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ContainerInfos.newBuilder() to construct.
        private ContainerInfos(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ContainerInfos() {
            payload_ = com.google.protobuf.ByteString.EMPTY;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
            return new ContainerInfos();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private ContainerInfos(
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
                        case 10: {

                            payload_ = input.readBytes();
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
            return internal_static_ContainerInfos_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_ContainerInfos_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos.Builder.class);
        }

        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString payload_;
        /**
         * <code>bytes payload = 1;</code>
         * @return The payload.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString getPayload() {
            return payload_;
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
            if (!payload_.isEmpty()) {
                output.writeBytes(1, payload_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!payload_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(1, payload_);
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
            if (!(obj instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos)) {
                return super.equals(obj);
            }
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos other = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos) obj;

            if (!getPayload()
                .equals(other.getPayload())) return false;
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
            hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
            hash = (53 * hash) + getPayload().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parseFrom(
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
        public static Builder newBuilder(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos prototype) {
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
         * Protobuf type {@code ContainerInfos}
         */
        public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:ContainerInfos)
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfosOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return internal_static_ContainerInfos_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return internal_static_ContainerInfos_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos.Builder.class);
            }

            // Construct using org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos.newBuilder()
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
                payload_ = com.google.protobuf.ByteString.EMPTY;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return internal_static_ContainerInfos_descriptor;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos getDefaultInstanceForType() {
                return getDefaultInstance();
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos build() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos buildPartial() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos result = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos(this);
                result.payload_ = payload_;
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
                if (other instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos) {
                    return mergeFrom((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos other) {
                if (other == getDefaultInstance()) return this;
                if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
                    setPayload(other.getPayload());
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
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>bytes payload = 1;</code>
             * @return The payload.
             */
            @java.lang.Override
            public com.google.protobuf.ByteString getPayload() {
                return payload_;
            }
            /**
             * <code>bytes payload = 1;</code>
             * @param value The payload to set.
             * @return This builder for chaining.
             */
            public Builder setPayload(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                payload_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bytes payload = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearPayload() {

                payload_ = getDefaultInstance().getPayload();
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


            // @@protoc_insertion_point(builder_scope:ContainerInfos)
        }

        // @@protoc_insertion_point(class_scope:ContainerInfos)
        private static final org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos();
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ContainerInfos>
            PARSER = new com.google.protobuf.AbstractParser<ContainerInfos>() {
            @java.lang.Override
            public ContainerInfos parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
                return new ContainerInfos(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ContainerInfos> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ContainerInfos> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerInfos getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface ContainerIdsOrBuilder extends
        // @@protoc_insertion_point(interface_extends:ContainerIds)
        com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated int32 containerId = 1;</code>
         * @return A list containing the containerId.
         */
        java.util.List<java.lang.Integer> getContainerIdList();
        /**
         * <code>repeated int32 containerId = 1;</code>
         * @return The count of containerId.
         */
        int getContainerIdCount();
        /**
         * <code>repeated int32 containerId = 1;</code>
         * @param index The index of the element to return.
         * @return The containerId at the given index.
         */
        int getContainerId(int index);
    }
    /**
     * Protobuf type {@code ContainerIds}
     */
    public static final class ContainerIds extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:ContainerIds)
        ContainerIdsOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use ContainerIds.newBuilder() to construct.
        private ContainerIds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private ContainerIds() {
            containerId_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
            return new ContainerIds();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private ContainerIds(
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
                        case 8: {
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                containerId_ = newIntList();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            containerId_.addInt(input.readInt32());
                            break;
                        }
                        case 10: {
                            int length = input.readRawVarint32();
                            int limit = input.pushLimit(length);
                            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                containerId_ = newIntList();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            while (input.getBytesUntilLimit() > 0) {
                                containerId_.addInt(input.readInt32());
                            }
                            input.popLimit(limit);
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
                    containerId_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return internal_static_ContainerIds_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_ContainerIds_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds.Builder.class);
        }

        public static final int CONTAINERID_FIELD_NUMBER = 1;
        private com.google.protobuf.Internal.IntList containerId_;
        /**
         * <code>repeated int32 containerId = 1;</code>
         * @return A list containing the containerId.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer>
        getContainerIdList() {
            return containerId_;
        }
        /**
         * <code>repeated int32 containerId = 1;</code>
         * @return The count of containerId.
         */
        public int getContainerIdCount() {
            return containerId_.size();
        }
        /**
         * <code>repeated int32 containerId = 1;</code>
         * @param index The index of the element to return.
         * @return The containerId at the given index.
         */
        public int getContainerId(int index) {
            return containerId_.getInt(index);
        }
        private int containerIdMemoizedSerializedSize = -1;

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
            if (getContainerIdList().size() > 0) {
                output.writeUInt32NoTag(10);
                output.writeUInt32NoTag(containerIdMemoizedSerializedSize);
            }
            for (int i = 0; i < containerId_.size(); i++) {
                output.writeInt32NoTag(containerId_.getInt(i));
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
                for (int i = 0; i < containerId_.size(); i++) {
                    dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(containerId_.getInt(i));
                }
                size += dataSize;
                if (!getContainerIdList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
                }
                containerIdMemoizedSerializedSize = dataSize;
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
            if (!(obj instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds)) {
                return super.equals(obj);
            }
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds other = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds) obj;

            if (!getContainerIdList()
                .equals(other.getContainerIdList())) return false;
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
            if (getContainerIdCount() > 0) {
                hash = (37 * hash) + CONTAINERID_FIELD_NUMBER;
                hash = (53 * hash) + getContainerIdList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parseFrom(
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
        public static Builder newBuilder(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds prototype) {
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
         * Protobuf type {@code ContainerIds}
         */
        public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:ContainerIds)
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIdsOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return internal_static_ContainerIds_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return internal_static_ContainerIds_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds.Builder.class);
            }

            // Construct using org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds.newBuilder()
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
                containerId_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return internal_static_ContainerIds_descriptor;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds getDefaultInstanceForType() {
                return getDefaultInstance();
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds build() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds buildPartial() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds result = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    containerId_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.containerId_ = containerId_;
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
                if (other instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds) {
                    return mergeFrom((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds other) {
                if (other == getDefaultInstance()) return this;
                if (!other.containerId_.isEmpty()) {
                    if (containerId_.isEmpty()) {
                        containerId_ = other.containerId_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureContainerIdIsMutable();
                        containerId_.addAll(other.containerId_);
                    }
                    onChanged();
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
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private com.google.protobuf.Internal.IntList containerId_ = emptyIntList();
            private void ensureContainerIdIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    containerId_ = mutableCopy(containerId_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated int32 containerId = 1;</code>
             * @return A list containing the containerId.
             */
            public java.util.List<java.lang.Integer>
            getContainerIdList() {
                return ((bitField0_ & 0x00000001) != 0) ?
                    java.util.Collections.unmodifiableList(containerId_) : containerId_;
            }
            /**
             * <code>repeated int32 containerId = 1;</code>
             * @return The count of containerId.
             */
            public int getContainerIdCount() {
                return containerId_.size();
            }
            /**
             * <code>repeated int32 containerId = 1;</code>
             * @param index The index of the element to return.
             * @return The containerId at the given index.
             */
            public int getContainerId(int index) {
                return containerId_.getInt(index);
            }
            /**
             * <code>repeated int32 containerId = 1;</code>
             * @param index The index to set the value at.
             * @param value The containerId to set.
             * @return This builder for chaining.
             */
            public Builder setContainerId(
                int index, int value) {
                ensureContainerIdIsMutable();
                containerId_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 containerId = 1;</code>
             * @param value The containerId to add.
             * @return This builder for chaining.
             */
            public Builder addContainerId(int value) {
                ensureContainerIdIsMutable();
                containerId_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 containerId = 1;</code>
             * @param values The containerId to add.
             * @return This builder for chaining.
             */
            public Builder addAllContainerId(
                java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureContainerIdIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, containerId_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated int32 containerId = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearContainerId() {
                containerId_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
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


            // @@protoc_insertion_point(builder_scope:ContainerIds)
        }

        // @@protoc_insertion_point(class_scope:ContainerIds)
        private static final org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds();
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<ContainerIds>
            PARSER = new com.google.protobuf.AbstractParser<ContainerIds>() {
            @java.lang.Override
            public ContainerIds parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
                return new ContainerIds(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<ContainerIds> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<ContainerIds> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.ContainerIds getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface RegisterRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:RegisterRequest)
        com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bytes payload = 1;</code>
         * @return The payload.
         */
        com.google.protobuf.ByteString getPayload();
    }
    /**
     * Protobuf type {@code RegisterRequest}
     */
    public static final class RegisterRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:RegisterRequest)
        RegisterRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use RegisterRequest.newBuilder() to construct.
        private RegisterRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private RegisterRequest() {
            payload_ = com.google.protobuf.ByteString.EMPTY;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
            return new RegisterRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private RegisterRequest(
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
                        case 10: {

                            payload_ = input.readBytes();
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
            return internal_static_RegisterRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_RegisterRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest.Builder.class);
        }

        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private com.google.protobuf.ByteString payload_;
        /**
         * <code>bytes payload = 1;</code>
         * @return The payload.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString getPayload() {
            return payload_;
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
            if (!payload_.isEmpty()) {
                output.writeBytes(1, payload_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (!payload_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(1, payload_);
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
            if (!(obj instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest)) {
                return super.equals(obj);
            }
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest other = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest) obj;

            if (!getPayload()
                .equals(other.getPayload())) return false;
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
            hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
            hash = (53 * hash) + getPayload().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parseFrom(
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
        public static Builder newBuilder(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest prototype) {
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
         * Protobuf type {@code RegisterRequest}
         */
        public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:RegisterRequest)
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return internal_static_RegisterRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return internal_static_RegisterRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest.Builder.class);
            }

            // Construct using org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest.newBuilder()
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
                payload_ = com.google.protobuf.ByteString.EMPTY;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return internal_static_RegisterRequest_descriptor;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest getDefaultInstanceForType() {
                return getDefaultInstance();
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest build() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest buildPartial() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest result = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest(this);
                result.payload_ = payload_;
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
                if (other instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest) {
                    return mergeFrom((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest other) {
                if (other == getDefaultInstance()) return this;
                if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
                    setPayload(other.getPayload());
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
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>bytes payload = 1;</code>
             * @return The payload.
             */
            @java.lang.Override
            public com.google.protobuf.ByteString getPayload() {
                return payload_;
            }
            /**
             * <code>bytes payload = 1;</code>
             * @param value The payload to set.
             * @return This builder for chaining.
             */
            public Builder setPayload(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                payload_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bytes payload = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearPayload() {

                payload_ = getDefaultInstance().getPayload();
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


            // @@protoc_insertion_point(builder_scope:RegisterRequest)
        }

        // @@protoc_insertion_point(class_scope:RegisterRequest)
        private static final org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest();
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<RegisterRequest>
            PARSER = new com.google.protobuf.AbstractParser<RegisterRequest>() {
            @java.lang.Override
            public RegisterRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
                return new RegisterRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<RegisterRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<RegisterRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface RegisterResponseOrBuilder extends
        // @@protoc_insertion_point(interface_extends:RegisterResponse)
        com.google.protobuf.MessageOrBuilder {

        /**
         * <code>bool success = 1;</code>
         * @return The success.
         */
        boolean getSuccess();

        /**
         * <code>bytes payload = 2;</code>
         * @return The payload.
         */
        com.google.protobuf.ByteString getPayload();
    }
    /**
     * Protobuf type {@code RegisterResponse}
     */
    public static final class RegisterResponse extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:RegisterResponse)
        RegisterResponseOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use RegisterResponse.newBuilder() to construct.
        private RegisterResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private RegisterResponse() {
            payload_ = com.google.protobuf.ByteString.EMPTY;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
            return new RegisterResponse();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private RegisterResponse(
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

                            success_ = input.readBool();
                            break;
                        }
                        case 18: {

                            payload_ = input.readBytes();
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
            return internal_static_RegisterResponse_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_RegisterResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse.Builder.class);
        }

        public static final int SUCCESS_FIELD_NUMBER = 1;
        private boolean success_;
        /**
         * <code>bool success = 1;</code>
         * @return The success.
         */
        @java.lang.Override
        public boolean getSuccess() {
            return success_;
        }

        public static final int PAYLOAD_FIELD_NUMBER = 2;
        private com.google.protobuf.ByteString payload_;
        /**
         * <code>bytes payload = 2;</code>
         * @return The payload.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString getPayload() {
            return payload_;
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
            if (success_ != false) {
                output.writeBool(1, success_);
            }
            if (!payload_.isEmpty()) {
                output.writeBytes(2, payload_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (success_ != false) {
                size += com.google.protobuf.CodedOutputStream
                    .computeBoolSize(1, success_);
            }
            if (!payload_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(2, payload_);
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
            if (!(obj instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse)) {
                return super.equals(obj);
            }
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse other = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse) obj;

            if (getSuccess()
                != other.getSuccess()) return false;
            if (!getPayload()
                .equals(other.getPayload())) return false;
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
            hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
                getSuccess());
            hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
            hash = (53 * hash) + getPayload().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parseFrom(
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
        public static Builder newBuilder(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse prototype) {
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
         * Protobuf type {@code RegisterResponse}
         */
        public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:RegisterResponse)
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponseOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return internal_static_RegisterResponse_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return internal_static_RegisterResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse.Builder.class);
            }

            // Construct using org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse.newBuilder()
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
                success_ = false;

                payload_ = com.google.protobuf.ByteString.EMPTY;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return internal_static_RegisterResponse_descriptor;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse getDefaultInstanceForType() {
                return getDefaultInstance();
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse build() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse buildPartial() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse result = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse(this);
                result.success_ = success_;
                result.payload_ = payload_;
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
                if (other instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse) {
                    return mergeFrom((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse other) {
                if (other == getDefaultInstance()) return this;
                if (other.getSuccess() != false) {
                    setSuccess(other.getSuccess());
                }
                if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
                    setPayload(other.getPayload());
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
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private boolean success_ ;
            /**
             * <code>bool success = 1;</code>
             * @return The success.
             */
            @java.lang.Override
            public boolean getSuccess() {
                return success_;
            }
            /**
             * <code>bool success = 1;</code>
             * @param value The success to set.
             * @return This builder for chaining.
             */
            public Builder setSuccess(boolean value) {

                success_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool success = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearSuccess() {

                success_ = false;
                onChanged();
                return this;
            }

            private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>bytes payload = 2;</code>
             * @return The payload.
             */
            @java.lang.Override
            public com.google.protobuf.ByteString getPayload() {
                return payload_;
            }
            /**
             * <code>bytes payload = 2;</code>
             * @param value The payload to set.
             * @return This builder for chaining.
             */
            public Builder setPayload(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                payload_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bytes payload = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearPayload() {

                payload_ = getDefaultInstance().getPayload();
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


            // @@protoc_insertion_point(builder_scope:RegisterResponse)
        }

        // @@protoc_insertion_point(class_scope:RegisterResponse)
        private static final org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse();
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<RegisterResponse>
            PARSER = new com.google.protobuf.AbstractParser<RegisterResponse>() {
            @java.lang.Override
            public RegisterResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
                return new RegisterResponse(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<RegisterResponse> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<RegisterResponse> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.RegisterResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface HeartbeatRequestOrBuilder extends
        // @@protoc_insertion_point(interface_extends:HeartbeatRequest)
        com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 id = 1;</code>
         * @return The id.
         */
        int getId();

        /**
         * <code>int64 timestamp = 2;</code>
         * @return The timestamp.
         */
        long getTimestamp();

        /**
         * <code>bytes payload = 3;</code>
         * @return The payload.
         */
        com.google.protobuf.ByteString getPayload();
    }
    /**
     * Protobuf type {@code HeartbeatRequest}
     */
    public static final class HeartbeatRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:HeartbeatRequest)
        HeartbeatRequestOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use HeartbeatRequest.newBuilder() to construct.
        private HeartbeatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private HeartbeatRequest() {
            payload_ = com.google.protobuf.ByteString.EMPTY;
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
            return new HeartbeatRequest();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private HeartbeatRequest(
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

                            id_ = input.readInt32();
                            break;
                        }
                        case 16: {

                            timestamp_ = input.readInt64();
                            break;
                        }
                        case 26: {

                            payload_ = input.readBytes();
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
            return internal_static_HeartbeatRequest_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return internal_static_HeartbeatRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                    org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private int id_;
        /**
         * <code>int32 id = 1;</code>
         * @return The id.
         */
        @java.lang.Override
        public int getId() {
            return id_;
        }

        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private long timestamp_;
        /**
         * <code>int64 timestamp = 2;</code>
         * @return The timestamp.
         */
        @java.lang.Override
        public long getTimestamp() {
            return timestamp_;
        }

        public static final int PAYLOAD_FIELD_NUMBER = 3;
        private com.google.protobuf.ByteString payload_;
        /**
         * <code>bytes payload = 3;</code>
         * @return The payload.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString getPayload() {
            return payload_;
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
            if (id_ != 0) {
                output.writeInt32(1, id_);
            }
            if (timestamp_ != 0L) {
                output.writeInt64(2, timestamp_);
            }
            if (!payload_.isEmpty()) {
                output.writeBytes(3, payload_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, id_);
            }
            if (timestamp_ != 0L) {
                size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(2, timestamp_);
            }
            if (!payload_.isEmpty()) {
                size += com.google.protobuf.CodedOutputStream
                    .computeBytesSize(3, payload_);
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
            if (!(obj instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest)) {
                return super.equals(obj);
            }
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest other = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest) obj;

            if (getId()
                != other.getId()) return false;
            if (getTimestamp()
                != other.getTimestamp()) return false;
            if (!getPayload()
                .equals(other.getPayload())) return false;
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
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId();
            hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getTimestamp());
            hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
            hash = (53 * hash) + getPayload().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
        }
        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parseFrom(
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
        public static Builder newBuilder(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest prototype) {
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
         * Protobuf type {@code HeartbeatRequest}
         */
        public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:HeartbeatRequest)
            org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequestOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return internal_static_HeartbeatRequest_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return internal_static_HeartbeatRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                        org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest.class, org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest.Builder.class);
            }

            // Construct using org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest.newBuilder()
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
                id_ = 0;

                timestamp_ = 0L;

                payload_ = com.google.protobuf.ByteString.EMPTY;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return internal_static_HeartbeatRequest_descriptor;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest getDefaultInstanceForType() {
                return getDefaultInstance();
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest build() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest buildPartial() {
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest result = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest(this);
                result.id_ = id_;
                result.timestamp_ = timestamp_;
                result.payload_ = payload_;
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
                if (other instanceof org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest) {
                    return mergeFrom((org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest other) {
                if (other == getDefaultInstance()) return this;
                if (other.getId() != 0) {
                    setId(other.getId());
                }
                if (other.getTimestamp() != 0L) {
                    setTimestamp(other.getTimestamp());
                }
                if (other.getPayload() != com.google.protobuf.ByteString.EMPTY) {
                    setPayload(other.getPayload());
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
                org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int id_ ;
            /**
             * <code>int32 id = 1;</code>
             * @return The id.
             */
            @java.lang.Override
            public int getId() {
                return id_;
            }
            /**
             * <code>int32 id = 1;</code>
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(int value) {

                id_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 id = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0;
                onChanged();
                return this;
            }

            private long timestamp_ ;
            /**
             * <code>int64 timestamp = 2;</code>
             * @return The timestamp.
             */
            @java.lang.Override
            public long getTimestamp() {
                return timestamp_;
            }
            /**
             * <code>int64 timestamp = 2;</code>
             * @param value The timestamp to set.
             * @return This builder for chaining.
             */
            public Builder setTimestamp(long value) {

                timestamp_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int64 timestamp = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearTimestamp() {

                timestamp_ = 0L;
                onChanged();
                return this;
            }

            private com.google.protobuf.ByteString payload_ = com.google.protobuf.ByteString.EMPTY;
            /**
             * <code>bytes payload = 3;</code>
             * @return The payload.
             */
            @java.lang.Override
            public com.google.protobuf.ByteString getPayload() {
                return payload_;
            }
            /**
             * <code>bytes payload = 3;</code>
             * @param value The payload to set.
             * @return This builder for chaining.
             */
            public Builder setPayload(com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                payload_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bytes payload = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearPayload() {

                payload_ = getDefaultInstance().getPayload();
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


            // @@protoc_insertion_point(builder_scope:HeartbeatRequest)
        }

        // @@protoc_insertion_point(class_scope:HeartbeatRequest)
        private static final org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest();
        }

        public static org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<HeartbeatRequest>
            PARSER = new com.google.protobuf.AbstractParser<HeartbeatRequest>() {
            @java.lang.Override
            public HeartbeatRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
                return new HeartbeatRequest(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<HeartbeatRequest> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<HeartbeatRequest> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public org.apache.rocketmq.eventbridge.adapter.runtime.boot.rpc.proto.Master.HeartbeatRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
        internal_static_ContainerInfos_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_ContainerInfos_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
        internal_static_ContainerIds_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_ContainerIds_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
        internal_static_RegisterRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_RegisterRequest_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
        internal_static_RegisterResponse_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_RegisterResponse_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
        internal_static_HeartbeatRequest_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internal_static_HeartbeatRequest_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
        descriptor;
    static {
        java.lang.String[] descriptorData = {
            "\n\014master.proto\032\033google/protobuf/empty.pr" +
                "oto\"!\n\016ContainerInfos\022\017\n\007payload\030\001 \001(\014\"#" +
                "\n\014ContainerIds\022\023\n\013containerId\030\001 \003(\005\"\"\n\017R" +
                "egisterRequest\022\017\n\007payload\030\001 \001(\014\"4\n\020Regis" +
                "terResponse\022\017\n\007success\030\001 \001(\010\022\017\n\007payload\030" +
                "\002 \001(\014\"B\n\020HeartbeatRequest\022\n\n\002id\030\001 \001(\005\022\021\n" +
                "\ttimestamp\030\002 \001(\003\022\017\n\007payload\030\003 \001(\0142\371\002\n\rMa" +
                "sterService\0224\n\020getContainerInfo\022\r.Contai" +
                "nerIds\032\017.ContainerInfos\"\000\022A\n\024getAllConta" +
                "inerInfos\022\026.google.protobuf.Empty\032\017.Cont" +
                "ainerInfos\"\000\022:\n\021registerContainer\022\020.Regi" +
                "sterRequest\032\021.RegisterResponse\"\000\0227\n\016regi" +
                "sterDriver\022\020.RegisterRequest\032\021.RegisterR" +
                "esponse\"\000\022?\n\020receiveHeartbeat\022\021.Heartbea" +
                "tRequest\032\026.google.protobuf.Empty\"\000\0229\n\005cl" +
                "ose\022\026.google.protobuf.Empty\032\026.google.pro" +
                "tobuf.Empty\"\000B\"\n\036org.apache.rocketmq.eventbridge.adapter.runtime.boot.rp" +
                "c.protoP\000b\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
            .internalBuildGeneratedFileFrom(descriptorData,
                new com.google.protobuf.Descriptors.FileDescriptor[] {
                    com.google.protobuf.EmptyProto.getDescriptor(),
                });
        internal_static_ContainerInfos_descriptor =
            getDescriptor().getMessageTypes().get(0);
        internal_static_ContainerInfos_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_ContainerInfos_descriptor,
            new java.lang.String[] { "Payload", });
        internal_static_ContainerIds_descriptor =
            getDescriptor().getMessageTypes().get(1);
        internal_static_ContainerIds_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_ContainerIds_descriptor,
            new java.lang.String[] { "ContainerId", });
        internal_static_RegisterRequest_descriptor =
            getDescriptor().getMessageTypes().get(2);
        internal_static_RegisterRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_RegisterRequest_descriptor,
            new java.lang.String[] { "Payload", });
        internal_static_RegisterResponse_descriptor =
            getDescriptor().getMessageTypes().get(3);
        internal_static_RegisterResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_RegisterResponse_descriptor,
            new java.lang.String[] { "Success", "Payload", });
        internal_static_HeartbeatRequest_descriptor =
            getDescriptor().getMessageTypes().get(4);
        internal_static_HeartbeatRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_HeartbeatRequest_descriptor,
            new java.lang.String[] { "Id", "Timestamp", "Payload", });
        com.google.protobuf.EmptyProto.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
