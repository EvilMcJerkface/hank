/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.liveramp.hank.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HostDomainMetadata implements org.apache.thrift.TBase<HostDomainMetadata, HostDomainMetadata._Fields>, java.io.Serializable, Cloneable, Comparable<HostDomainMetadata> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HostDomainMetadata");

  private static final org.apache.thrift.protocol.TField PARTITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("partitions", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HostDomainMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HostDomainMetadataTupleSchemeFactory());
  }

  public Map<Integer,HostDomainPartitionMetadata> partitions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PARTITIONS((short)1, "partitions");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PARTITIONS
          return PARTITIONS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PARTITIONS, new org.apache.thrift.meta_data.FieldMetaData("partitions", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HostDomainPartitionMetadata.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HostDomainMetadata.class, metaDataMap);
  }

  public HostDomainMetadata() {
  }

  public HostDomainMetadata(
    Map<Integer,HostDomainPartitionMetadata> partitions)
  {
    this();
    this.partitions = partitions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HostDomainMetadata(HostDomainMetadata other) {
    if (other.is_set_partitions()) {
      Map<Integer,HostDomainPartitionMetadata> __this__partitions = new HashMap<Integer,HostDomainPartitionMetadata>();
      for (Map.Entry<Integer, HostDomainPartitionMetadata> other_element : other.partitions.entrySet()) {

        Integer other_element_key = other_element.getKey();
        HostDomainPartitionMetadata other_element_value = other_element.getValue();

        Integer __this__partitions_copy_key = other_element_key;

        HostDomainPartitionMetadata __this__partitions_copy_value = new HostDomainPartitionMetadata(other_element_value);

        __this__partitions.put(__this__partitions_copy_key, __this__partitions_copy_value);
      }
      this.partitions = __this__partitions;
    }
  }

  public HostDomainMetadata deepCopy() {
    return new HostDomainMetadata(this);
  }

  @Override
  public void clear() {
    this.partitions = null;
  }

  public int get_partitions_size() {
    return (this.partitions == null) ? 0 : this.partitions.size();
  }

  public void put_to_partitions(int key, HostDomainPartitionMetadata val) {
    if (this.partitions == null) {
      this.partitions = new HashMap<Integer,HostDomainPartitionMetadata>();
    }
    this.partitions.put(key, val);
  }

  public Map<Integer,HostDomainPartitionMetadata> get_partitions() {
    return this.partitions;
  }

  public HostDomainMetadata set_partitions(Map<Integer,HostDomainPartitionMetadata> partitions) {
    this.partitions = partitions;
    return this;
  }

  public void unset_partitions() {
    this.partitions = null;
  }

  /** Returns true if field partitions is set (has been assigned a value) and false otherwise */
  public boolean is_set_partitions() {
    return this.partitions != null;
  }

  public void set_partitions_isSet(boolean value) {
    if (!value) {
      this.partitions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PARTITIONS:
      if (value == null) {
        unset_partitions();
      } else {
        set_partitions((Map<Integer,HostDomainPartitionMetadata>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PARTITIONS:
      return get_partitions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PARTITIONS:
      return is_set_partitions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HostDomainMetadata)
      return this.equals((HostDomainMetadata)that);
    return false;
  }

  public boolean equals(HostDomainMetadata that) {
    if (that == null)
      return false;

    boolean this_present_partitions = true && this.is_set_partitions();
    boolean that_present_partitions = true && that.is_set_partitions();
    if (this_present_partitions || that_present_partitions) {
      if (!(this_present_partitions && that_present_partitions))
        return false;
      if (!this.partitions.equals(that.partitions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_partitions = true && (is_set_partitions());
    builder.append(present_partitions);
    if (present_partitions)
      builder.append(partitions);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(HostDomainMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(is_set_partitions()).compareTo(other.is_set_partitions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_partitions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.partitions, other.partitions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("HostDomainMetadata(");
    boolean first = true;

    sb.append("partitions:");
    if (this.partitions == null) {
      sb.append("null");
    } else {
      sb.append(this.partitions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (partitions == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'partitions' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HostDomainMetadataStandardSchemeFactory implements SchemeFactory {
    public HostDomainMetadataStandardScheme getScheme() {
      return new HostDomainMetadataStandardScheme();
    }
  }

  private static class HostDomainMetadataStandardScheme extends StandardScheme<HostDomainMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HostDomainMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PARTITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map28 = iprot.readMapBegin();
                struct.partitions = new HashMap<Integer,HostDomainPartitionMetadata>(2*_map28.size);
                for (int _i29 = 0; _i29 < _map28.size; ++_i29)
                {
                  int _key30; // required
                  HostDomainPartitionMetadata _val31; // required
                  _key30 = iprot.readI32();
                  _val31 = new HostDomainPartitionMetadata();
                  _val31.read(iprot);
                  struct.partitions.put(_key30, _val31);
                }
                iprot.readMapEnd();
              }
              struct.set_partitions_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, HostDomainMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.partitions != null) {
        oprot.writeFieldBegin(PARTITIONS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.partitions.size()));
          for (Map.Entry<Integer, HostDomainPartitionMetadata> _iter32 : struct.partitions.entrySet())
          {
            oprot.writeI32(_iter32.getKey());
            _iter32.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HostDomainMetadataTupleSchemeFactory implements SchemeFactory {
    public HostDomainMetadataTupleScheme getScheme() {
      return new HostDomainMetadataTupleScheme();
    }
  }

  private static class HostDomainMetadataTupleScheme extends TupleScheme<HostDomainMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HostDomainMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.partitions.size());
        for (Map.Entry<Integer, HostDomainPartitionMetadata> _iter33 : struct.partitions.entrySet())
        {
          oprot.writeI32(_iter33.getKey());
          _iter33.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HostDomainMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map34 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.partitions = new HashMap<Integer,HostDomainPartitionMetadata>(2*_map34.size);
        for (int _i35 = 0; _i35 < _map34.size; ++_i35)
        {
          int _key36; // required
          HostDomainPartitionMetadata _val37; // required
          _key36 = iprot.readI32();
          _val37 = new HostDomainPartitionMetadata();
          _val37.read(iprot);
          struct.partitions.put(_key36, _val37);
        }
      }
      struct.set_partitions_isSet(true);
    }
  }

}

