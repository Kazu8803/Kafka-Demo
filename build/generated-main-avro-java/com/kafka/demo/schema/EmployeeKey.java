/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.kafka.demo.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class EmployeeKey extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3163959311794707187L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"EmployeeKey\",\"namespace\":\"com.kafka.demo.schema\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"departmentName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<EmployeeKey> ENCODER =
      new BinaryMessageEncoder<EmployeeKey>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<EmployeeKey> DECODER =
      new BinaryMessageDecoder<EmployeeKey>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<EmployeeKey> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<EmployeeKey> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<EmployeeKey>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this EmployeeKey to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a EmployeeKey from a ByteBuffer. */
  public static EmployeeKey fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public int id;
  @Deprecated public java.lang.String departmentName;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public EmployeeKey() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param departmentName The new value for departmentName
   */
  public EmployeeKey(java.lang.Integer id, java.lang.String departmentName) {
    this.id = id;
    this.departmentName = departmentName;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return departmentName;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: departmentName = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'departmentName' field.
   * @return The value of the 'departmentName' field.
   */
  public java.lang.String getDepartmentName() {
    return departmentName;
  }

  /**
   * Sets the value of the 'departmentName' field.
   * @param value the value to set.
   */
  public void setDepartmentName(java.lang.String value) {
    this.departmentName = value;
  }

  /**
   * Creates a new EmployeeKey RecordBuilder.
   * @return A new EmployeeKey RecordBuilder
   */
  public static com.kafka.demo.schema.EmployeeKey.Builder newBuilder() {
    return new com.kafka.demo.schema.EmployeeKey.Builder();
  }

  /**
   * Creates a new EmployeeKey RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new EmployeeKey RecordBuilder
   */
  public static com.kafka.demo.schema.EmployeeKey.Builder newBuilder(com.kafka.demo.schema.EmployeeKey.Builder other) {
    return new com.kafka.demo.schema.EmployeeKey.Builder(other);
  }

  /**
   * Creates a new EmployeeKey RecordBuilder by copying an existing EmployeeKey instance.
   * @param other The existing instance to copy.
   * @return A new EmployeeKey RecordBuilder
   */
  public static com.kafka.demo.schema.EmployeeKey.Builder newBuilder(com.kafka.demo.schema.EmployeeKey other) {
    return new com.kafka.demo.schema.EmployeeKey.Builder(other);
  }

  /**
   * RecordBuilder for EmployeeKey instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<EmployeeKey>
    implements org.apache.avro.data.RecordBuilder<EmployeeKey> {

    private int id;
    private java.lang.String departmentName;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.kafka.demo.schema.EmployeeKey.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.departmentName)) {
        this.departmentName = data().deepCopy(fields()[1].schema(), other.departmentName);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing EmployeeKey instance
     * @param other The existing instance to copy.
     */
    private Builder(com.kafka.demo.schema.EmployeeKey other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.departmentName)) {
        this.departmentName = data().deepCopy(fields()[1].schema(), other.departmentName);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.kafka.demo.schema.EmployeeKey.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.kafka.demo.schema.EmployeeKey.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'departmentName' field.
      * @return The value.
      */
    public java.lang.String getDepartmentName() {
      return departmentName;
    }

    /**
      * Sets the value of the 'departmentName' field.
      * @param value The value of 'departmentName'.
      * @return This builder.
      */
    public com.kafka.demo.schema.EmployeeKey.Builder setDepartmentName(java.lang.String value) {
      validate(fields()[1], value);
      this.departmentName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'departmentName' field has been set.
      * @return True if the 'departmentName' field has been set, false otherwise.
      */
    public boolean hasDepartmentName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'departmentName' field.
      * @return This builder.
      */
    public com.kafka.demo.schema.EmployeeKey.Builder clearDepartmentName() {
      departmentName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public EmployeeKey build() {
      try {
        EmployeeKey record = new EmployeeKey();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.departmentName = fieldSetFlags()[1] ? this.departmentName : (java.lang.String) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<EmployeeKey>
    WRITER$ = (org.apache.avro.io.DatumWriter<EmployeeKey>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<EmployeeKey>
    READER$ = (org.apache.avro.io.DatumReader<EmployeeKey>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
