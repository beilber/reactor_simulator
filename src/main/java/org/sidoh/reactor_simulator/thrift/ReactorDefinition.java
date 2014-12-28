/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.sidoh.reactor_simulator.thrift;

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

public class ReactorDefinition implements org.apache.thrift.TBase<ReactorDefinition, ReactorDefinition._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReactorDefinition");

  private static final org.apache.thrift.protocol.TField X_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("xSize", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField Z_SIZE_FIELD_DESC = new org.apache.thrift.protocol.TField("zSize", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField HEIGHT_FIELD_DESC = new org.apache.thrift.protocol.TField("height", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField LAYOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("layout", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField IS_ACTIVELY_COOLED_FIELD_DESC = new org.apache.thrift.protocol.TField("isActivelyCooled", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ReactorDefinitionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ReactorDefinitionTupleSchemeFactory());
  }

  public int xSize; // required
  public int zSize; // required
  public int height; // required
  public String layout; // required
  public boolean isActivelyCooled; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    X_SIZE((short)1, "xSize"),
    Z_SIZE((short)2, "zSize"),
    HEIGHT((short)3, "height"),
    LAYOUT((short)4, "layout"),
    IS_ACTIVELY_COOLED((short)5, "isActivelyCooled");

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
        case 1: // X_SIZE
          return X_SIZE;
        case 2: // Z_SIZE
          return Z_SIZE;
        case 3: // HEIGHT
          return HEIGHT;
        case 4: // LAYOUT
          return LAYOUT;
        case 5: // IS_ACTIVELY_COOLED
          return IS_ACTIVELY_COOLED;
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
  private static final int __XSIZE_ISSET_ID = 0;
  private static final int __ZSIZE_ISSET_ID = 1;
  private static final int __HEIGHT_ISSET_ID = 2;
  private static final int __ISACTIVELYCOOLED_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.X_SIZE, new org.apache.thrift.meta_data.FieldMetaData("xSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.Z_SIZE, new org.apache.thrift.meta_data.FieldMetaData("zSize", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.HEIGHT, new org.apache.thrift.meta_data.FieldMetaData("height", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LAYOUT, new org.apache.thrift.meta_data.FieldMetaData("layout", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.IS_ACTIVELY_COOLED, new org.apache.thrift.meta_data.FieldMetaData("isActivelyCooled", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReactorDefinition.class, metaDataMap);
  }

  public ReactorDefinition() {
  }

  public ReactorDefinition(
    int xSize,
    int zSize,
    int height,
    String layout,
    boolean isActivelyCooled)
  {
    this();
    this.xSize = xSize;
    setXSizeIsSet(true);
    this.zSize = zSize;
    setZSizeIsSet(true);
    this.height = height;
    setHeightIsSet(true);
    this.layout = layout;
    this.isActivelyCooled = isActivelyCooled;
    setIsActivelyCooledIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReactorDefinition(ReactorDefinition other) {
    __isset_bitfield = other.__isset_bitfield;
    this.xSize = other.xSize;
    this.zSize = other.zSize;
    this.height = other.height;
    if (other.isSetLayout()) {
      this.layout = other.layout;
    }
    this.isActivelyCooled = other.isActivelyCooled;
  }

  public ReactorDefinition deepCopy() {
    return new ReactorDefinition(this);
  }

  @Override
  public void clear() {
    setXSizeIsSet(false);
    this.xSize = 0;
    setZSizeIsSet(false);
    this.zSize = 0;
    setHeightIsSet(false);
    this.height = 0;
    this.layout = null;
    setIsActivelyCooledIsSet(false);
    this.isActivelyCooled = false;
  }

  public int getXSize() {
    return this.xSize;
  }

  public ReactorDefinition setXSize(int xSize) {
    this.xSize = xSize;
    setXSizeIsSet(true);
    return this;
  }

  public void unsetXSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __XSIZE_ISSET_ID);
  }

  /** Returns true if field xSize is set (has been assigned a value) and false otherwise */
  public boolean isSetXSize() {
    return EncodingUtils.testBit(__isset_bitfield, __XSIZE_ISSET_ID);
  }

  public void setXSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __XSIZE_ISSET_ID, value);
  }

  public int getZSize() {
    return this.zSize;
  }

  public ReactorDefinition setZSize(int zSize) {
    this.zSize = zSize;
    setZSizeIsSet(true);
    return this;
  }

  public void unsetZSize() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ZSIZE_ISSET_ID);
  }

  /** Returns true if field zSize is set (has been assigned a value) and false otherwise */
  public boolean isSetZSize() {
    return EncodingUtils.testBit(__isset_bitfield, __ZSIZE_ISSET_ID);
  }

  public void setZSizeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ZSIZE_ISSET_ID, value);
  }

  public int getHeight() {
    return this.height;
  }

  public ReactorDefinition setHeight(int height) {
    this.height = height;
    setHeightIsSet(true);
    return this;
  }

  public void unsetHeight() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __HEIGHT_ISSET_ID);
  }

  /** Returns true if field height is set (has been assigned a value) and false otherwise */
  public boolean isSetHeight() {
    return EncodingUtils.testBit(__isset_bitfield, __HEIGHT_ISSET_ID);
  }

  public void setHeightIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __HEIGHT_ISSET_ID, value);
  }

  public String getLayout() {
    return this.layout;
  }

  public ReactorDefinition setLayout(String layout) {
    this.layout = layout;
    return this;
  }

  public void unsetLayout() {
    this.layout = null;
  }

  /** Returns true if field layout is set (has been assigned a value) and false otherwise */
  public boolean isSetLayout() {
    return this.layout != null;
  }

  public void setLayoutIsSet(boolean value) {
    if (!value) {
      this.layout = null;
    }
  }

  public boolean isIsActivelyCooled() {
    return this.isActivelyCooled;
  }

  public ReactorDefinition setIsActivelyCooled(boolean isActivelyCooled) {
    this.isActivelyCooled = isActivelyCooled;
    setIsActivelyCooledIsSet(true);
    return this;
  }

  public void unsetIsActivelyCooled() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISACTIVELYCOOLED_ISSET_ID);
  }

  /** Returns true if field isActivelyCooled is set (has been assigned a value) and false otherwise */
  public boolean isSetIsActivelyCooled() {
    return EncodingUtils.testBit(__isset_bitfield, __ISACTIVELYCOOLED_ISSET_ID);
  }

  public void setIsActivelyCooledIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISACTIVELYCOOLED_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case X_SIZE:
      if (value == null) {
        unsetXSize();
      } else {
        setXSize((Integer)value);
      }
      break;

    case Z_SIZE:
      if (value == null) {
        unsetZSize();
      } else {
        setZSize((Integer)value);
      }
      break;

    case HEIGHT:
      if (value == null) {
        unsetHeight();
      } else {
        setHeight((Integer)value);
      }
      break;

    case LAYOUT:
      if (value == null) {
        unsetLayout();
      } else {
        setLayout((String)value);
      }
      break;

    case IS_ACTIVELY_COOLED:
      if (value == null) {
        unsetIsActivelyCooled();
      } else {
        setIsActivelyCooled((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case X_SIZE:
      return Integer.valueOf(getXSize());

    case Z_SIZE:
      return Integer.valueOf(getZSize());

    case HEIGHT:
      return Integer.valueOf(getHeight());

    case LAYOUT:
      return getLayout();

    case IS_ACTIVELY_COOLED:
      return Boolean.valueOf(isIsActivelyCooled());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case X_SIZE:
      return isSetXSize();
    case Z_SIZE:
      return isSetZSize();
    case HEIGHT:
      return isSetHeight();
    case LAYOUT:
      return isSetLayout();
    case IS_ACTIVELY_COOLED:
      return isSetIsActivelyCooled();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ReactorDefinition)
      return this.equals((ReactorDefinition)that);
    return false;
  }

  public boolean equals(ReactorDefinition that) {
    if (that == null)
      return false;

    boolean this_present_xSize = true;
    boolean that_present_xSize = true;
    if (this_present_xSize || that_present_xSize) {
      if (!(this_present_xSize && that_present_xSize))
        return false;
      if (this.xSize != that.xSize)
        return false;
    }

    boolean this_present_zSize = true;
    boolean that_present_zSize = true;
    if (this_present_zSize || that_present_zSize) {
      if (!(this_present_zSize && that_present_zSize))
        return false;
      if (this.zSize != that.zSize)
        return false;
    }

    boolean this_present_height = true;
    boolean that_present_height = true;
    if (this_present_height || that_present_height) {
      if (!(this_present_height && that_present_height))
        return false;
      if (this.height != that.height)
        return false;
    }

    boolean this_present_layout = true && this.isSetLayout();
    boolean that_present_layout = true && that.isSetLayout();
    if (this_present_layout || that_present_layout) {
      if (!(this_present_layout && that_present_layout))
        return false;
      if (!this.layout.equals(that.layout))
        return false;
    }

    boolean this_present_isActivelyCooled = true;
    boolean that_present_isActivelyCooled = true;
    if (this_present_isActivelyCooled || that_present_isActivelyCooled) {
      if (!(this_present_isActivelyCooled && that_present_isActivelyCooled))
        return false;
      if (this.isActivelyCooled != that.isActivelyCooled)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ReactorDefinition other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ReactorDefinition typedOther = (ReactorDefinition)other;

    lastComparison = Boolean.valueOf(isSetXSize()).compareTo(typedOther.isSetXSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetXSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.xSize, typedOther.xSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetZSize()).compareTo(typedOther.isSetZSize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetZSize()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.zSize, typedOther.zSize);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeight()).compareTo(typedOther.isSetHeight());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeight()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.height, typedOther.height);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetLayout()).compareTo(typedOther.isSetLayout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLayout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.layout, typedOther.layout);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsActivelyCooled()).compareTo(typedOther.isSetIsActivelyCooled());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsActivelyCooled()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isActivelyCooled, typedOther.isActivelyCooled);
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
    StringBuilder sb = new StringBuilder("ReactorDefinition(");
    boolean first = true;

    sb.append("xSize:");
    sb.append(this.xSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("zSize:");
    sb.append(this.zSize);
    first = false;
    if (!first) sb.append(", ");
    sb.append("height:");
    sb.append(this.height);
    first = false;
    if (!first) sb.append(", ");
    sb.append("layout:");
    if (this.layout == null) {
      sb.append("null");
    } else {
      sb.append(this.layout);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("isActivelyCooled:");
    sb.append(this.isActivelyCooled);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ReactorDefinitionStandardSchemeFactory implements SchemeFactory {
    public ReactorDefinitionStandardScheme getScheme() {
      return new ReactorDefinitionStandardScheme();
    }
  }

  private static class ReactorDefinitionStandardScheme extends StandardScheme<ReactorDefinition> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReactorDefinition struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // X_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.xSize = iprot.readI32();
              struct.setXSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // Z_SIZE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.zSize = iprot.readI32();
              struct.setZSizeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // HEIGHT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.height = iprot.readI32();
              struct.setHeightIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // LAYOUT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.layout = iprot.readString();
              struct.setLayoutIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // IS_ACTIVELY_COOLED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isActivelyCooled = iprot.readBool();
              struct.setIsActivelyCooledIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReactorDefinition struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(X_SIZE_FIELD_DESC);
      oprot.writeI32(struct.xSize);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Z_SIZE_FIELD_DESC);
      oprot.writeI32(struct.zSize);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(HEIGHT_FIELD_DESC);
      oprot.writeI32(struct.height);
      oprot.writeFieldEnd();
      if (struct.layout != null) {
        oprot.writeFieldBegin(LAYOUT_FIELD_DESC);
        oprot.writeString(struct.layout);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(IS_ACTIVELY_COOLED_FIELD_DESC);
      oprot.writeBool(struct.isActivelyCooled);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReactorDefinitionTupleSchemeFactory implements SchemeFactory {
    public ReactorDefinitionTupleScheme getScheme() {
      return new ReactorDefinitionTupleScheme();
    }
  }

  private static class ReactorDefinitionTupleScheme extends TupleScheme<ReactorDefinition> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReactorDefinition struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetXSize()) {
        optionals.set(0);
      }
      if (struct.isSetZSize()) {
        optionals.set(1);
      }
      if (struct.isSetHeight()) {
        optionals.set(2);
      }
      if (struct.isSetLayout()) {
        optionals.set(3);
      }
      if (struct.isSetIsActivelyCooled()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetXSize()) {
        oprot.writeI32(struct.xSize);
      }
      if (struct.isSetZSize()) {
        oprot.writeI32(struct.zSize);
      }
      if (struct.isSetHeight()) {
        oprot.writeI32(struct.height);
      }
      if (struct.isSetLayout()) {
        oprot.writeString(struct.layout);
      }
      if (struct.isSetIsActivelyCooled()) {
        oprot.writeBool(struct.isActivelyCooled);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReactorDefinition struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.xSize = iprot.readI32();
        struct.setXSizeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.zSize = iprot.readI32();
        struct.setZSizeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.height = iprot.readI32();
        struct.setHeightIsSet(true);
      }
      if (incoming.get(3)) {
        struct.layout = iprot.readString();
        struct.setLayoutIsSet(true);
      }
      if (incoming.get(4)) {
        struct.isActivelyCooled = iprot.readBool();
        struct.setIsActivelyCooledIsSet(true);
      }
    }
  }

}

