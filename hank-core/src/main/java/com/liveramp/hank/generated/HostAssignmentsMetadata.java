/**
 * Autogenerated by Thrift Compiler (0.9.0)
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

public class HostAssignmentsMetadata implements org.apache.thrift.TBase<HostAssignmentsMetadata, HostAssignmentsMetadata._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("HostAssignmentsMetadata");

  private static final org.apache.thrift.protocol.TField DOMAINS_FIELD_DESC = new org.apache.thrift.protocol.TField("domains", org.apache.thrift.protocol.TType.MAP, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HostAssignmentsMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HostAssignmentsMetadataTupleSchemeFactory());
  }

  public Map<Integer,HostDomainMetadata> domains; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DOMAINS((short)1, "domains");

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
        case 1: // DOMAINS
          return DOMAINS;
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
    tmpMap.put(_Fields.DOMAINS, new org.apache.thrift.meta_data.FieldMetaData("domains", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HostDomainMetadata.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(HostAssignmentsMetadata.class, metaDataMap);
  }

  public HostAssignmentsMetadata() {
  }

  public HostAssignmentsMetadata(
    Map<Integer,HostDomainMetadata> domains)
  {
    this();
    this.domains = domains;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public HostAssignmentsMetadata(HostAssignmentsMetadata other) {
    if (other.is_set_domains()) {
      Map<Integer,HostDomainMetadata> __this__domains = new HashMap<Integer,HostDomainMetadata>();
      for (Map.Entry<Integer, HostDomainMetadata> other_element : other.domains.entrySet()) {

        Integer other_element_key = other_element.getKey();
        HostDomainMetadata other_element_value = other_element.getValue();

        Integer __this__domains_copy_key = other_element_key;

        HostDomainMetadata __this__domains_copy_value = new HostDomainMetadata(other_element_value);

        __this__domains.put(__this__domains_copy_key, __this__domains_copy_value);
      }
      this.domains = __this__domains;
    }
  }

  public HostAssignmentsMetadata deepCopy() {
    return new HostAssignmentsMetadata(this);
  }

  @Override
  public void clear() {
    this.domains = null;
  }

  public int get_domains_size() {
    return (this.domains == null) ? 0 : this.domains.size();
  }

  public void put_to_domains(int key, HostDomainMetadata val) {
    if (this.domains == null) {
      this.domains = new HashMap<Integer,HostDomainMetadata>();
    }
    this.domains.put(key, val);
  }

  public Map<Integer,HostDomainMetadata> get_domains() {
    return this.domains;
  }

  public HostAssignmentsMetadata set_domains(Map<Integer,HostDomainMetadata> domains) {
    this.domains = domains;
    return this;
  }

  public void unset_domains() {
    this.domains = null;
  }

  /** Returns true if field domains is set (has been assigned a value) and false otherwise */
  public boolean is_set_domains() {
    return this.domains != null;
  }

  public void set_domains_isSet(boolean value) {
    if (!value) {
      this.domains = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DOMAINS:
      if (value == null) {
        unset_domains();
      } else {
        set_domains((Map<Integer,HostDomainMetadata>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DOMAINS:
      return get_domains();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DOMAINS:
      return is_set_domains();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof HostAssignmentsMetadata)
      return this.equals((HostAssignmentsMetadata)that);
    return false;
  }

  public boolean equals(HostAssignmentsMetadata that) {
    if (that == null)
      return false;

    boolean this_present_domains = true && this.is_set_domains();
    boolean that_present_domains = true && that.is_set_domains();
    if (this_present_domains || that_present_domains) {
      if (!(this_present_domains && that_present_domains))
        return false;
      if (!this.domains.equals(that.domains))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_domains = true && (is_set_domains());
    builder.append(present_domains);
    if (present_domains)
      builder.append(domains);

    return builder.toHashCode();
  }

  public int compareTo(HostAssignmentsMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    HostAssignmentsMetadata typedOther = (HostAssignmentsMetadata)other;

    lastComparison = Boolean.valueOf(is_set_domains()).compareTo(typedOther.is_set_domains());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_domains()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domains, typedOther.domains);
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
    StringBuilder sb = new StringBuilder("HostAssignmentsMetadata(");
    boolean first = true;

    sb.append("domains:");
    if (this.domains == null) {
      sb.append("null");
    } else {
      sb.append(this.domains);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (domains == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'domains' was not present! Struct: " + toString());
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

  private static class HostAssignmentsMetadataStandardSchemeFactory implements SchemeFactory {
    public HostAssignmentsMetadataStandardScheme getScheme() {
      return new HostAssignmentsMetadataStandardScheme();
    }
  }

  private static class HostAssignmentsMetadataStandardScheme extends StandardScheme<HostAssignmentsMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, HostAssignmentsMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DOMAINS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map38 = iprot.readMapBegin();
                struct.domains = new HashMap<Integer,HostDomainMetadata>(2*_map38.size);
                for (int _i39 = 0; _i39 < _map38.size; ++_i39)
                {
                  int _key40; // required
                  HostDomainMetadata _val41; // optional
                  _key40 = iprot.readI32();
                  _val41 = new HostDomainMetadata();
                  _val41.read(iprot);
                  struct.domains.put(_key40, _val41);
                }
                iprot.readMapEnd();
              }
              struct.set_domains_isSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, HostAssignmentsMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.domains != null) {
        oprot.writeFieldBegin(DOMAINS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, struct.domains.size()));
          for (Map.Entry<Integer, HostDomainMetadata> _iter42 : struct.domains.entrySet())
          {
            oprot.writeI32(_iter42.getKey());
            _iter42.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HostAssignmentsMetadataTupleSchemeFactory implements SchemeFactory {
    public HostAssignmentsMetadataTupleScheme getScheme() {
      return new HostAssignmentsMetadataTupleScheme();
    }
  }

  private static class HostAssignmentsMetadataTupleScheme extends TupleScheme<HostAssignmentsMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, HostAssignmentsMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      {
        oprot.writeI32(struct.domains.size());
        for (Map.Entry<Integer, HostDomainMetadata> _iter43 : struct.domains.entrySet())
        {
          oprot.writeI32(_iter43.getKey());
          _iter43.getValue().write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, HostAssignmentsMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      {
        org.apache.thrift.protocol.TMap _map44 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.domains = new HashMap<Integer,HostDomainMetadata>(2*_map44.size);
        for (int _i45 = 0; _i45 < _map44.size; ++_i45)
        {
          int _key46; // required
          HostDomainMetadata _val47; // optional
          _key46 = iprot.readI32();
          _val47 = new HostDomainMetadata();
          _val47.read(iprot);
          struct.domains.put(_key46, _val47);
        }
      }
      struct.set_domains_isSet(true);
    }
  }

}
