package com.netflix.astyanax.mapping;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * id is not counted as column
 * 17 columns
 */
public class SampleEntity {
	
	@Id
	private String id;
	
	@Column(name="BOOLEAN_PRIMITIVE")
	private boolean booleanPrimitive;
	
	@Column(name="BOOLEAN_OBJECT")
	private Boolean booleanObject;
	
	@Column(name="BYTE_PRIMITIVE")
	private byte bytePrimitive;
	
	@Column(name="BYTE_OBJECT")
	private Byte byteObject;
	
	@Column(name="SHORT_PRIMITIVE")
	private short shortPrimitive;
	
	@Column(name="SHORT_OBJECT")
	private Short shortObject;
	
	@Column(name="INT_PRIMITIVE")
	private int intPrimitive;
	
	@Column(name="INT_OBJECT")
	private Integer intObject;
	
	@Column(name="LONG_PRIMITIVE")
	private long longPrimitive;
	
	@Column(name="LONG_OBJECT")
	private Long longObject;
	
	@Column(name="FLOAT_PRIMITIVE")
	private float floatPrimitive;
	
	@Column(name="FLOAT_OBJECT")
	private Float floatObject;
	
	@Column(name="DOUBLE_PRIMITIVE")
	private double doublePrimitive;
	
	@Column(name="DOUBLE_OBJECT")
	private Double doubleObject;
	
	@Column(name="STRING")
	private String str;
	
	@Column(name="BYTE_ARRAY")
	@TTL(123456)
    private byte[] byteArray;
	
	// name should default to field name
	@Column()
	private UUID uuid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isBooleanPrimitive() {
		return booleanPrimitive;
	}

	public void setBooleanPrimitive(boolean booleanPrimitive) {
		this.booleanPrimitive = booleanPrimitive;
	}

	public Boolean getBooleanObject() {
		return booleanObject;
	}

	public void setBooleanObject(Boolean booleanObject) {
		this.booleanObject = booleanObject;
	}

	public byte getBytePrimitive() {
		return bytePrimitive;
	}

	public void setBytePrimitive(byte bytePrimitive) {
		this.bytePrimitive = bytePrimitive;
	}

	public Byte getByteObject() {
		return byteObject;
	}

	public void setByteObject(Byte byteObject) {
		this.byteObject = byteObject;
	}

	public short getShortPrimitive() {
		return shortPrimitive;
	}

	public void setShortPrimitive(short shortPrimitive) {
		this.shortPrimitive = shortPrimitive;
	}

	public Short getShortObject() {
		return shortObject;
	}

	public void setShortObject(Short shortObject) {
		this.shortObject = shortObject;
	}

	public int getIntPrimitive() {
		return intPrimitive;
	}

	public void setIntPrimitive(int intPrimitive) {
		this.intPrimitive = intPrimitive;
	}

	public Integer getIntObject() {
		return intObject;
	}

	public void setIntObject(Integer intObject) {
		this.intObject = intObject;
	}

	public long getLongPrimitive() {
		return longPrimitive;
	}

	public void setLongPrimitive(long longPrimitive) {
		this.longPrimitive = longPrimitive;
	}

	public Long getLongObject() {
		return longObject;
	}

	public void setLongObject(Long longObject) {
		this.longObject = longObject;
	}

	public float getFloatPrimitive() {
		return floatPrimitive;
	}

	public void setFloatPrimitive(float floatPrimitive) {
		this.floatPrimitive = floatPrimitive;
	}

	public Float getFloatObject() {
		return floatObject;
	}

	public void setFloatObject(Float floatObject) {
		this.floatObject = floatObject;
	}

	public double getDoublePrimitive() {
		return doublePrimitive;
	}

	public void setDoublePrimitive(double doublePrimitive) {
		this.doublePrimitive = doublePrimitive;
	}

	public Double getDoubleObject() {
		return doubleObject;
	}

	public void setDoubleObject(Double doubleObject) {
		this.doubleObject = doubleObject;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public byte[] getByteArray() {
		return byteArray;
	}

	public void setByteArray(byte[] byteArray) {
		this.byteArray = byteArray;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

}
