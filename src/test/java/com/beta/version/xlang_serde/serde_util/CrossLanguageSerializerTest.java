package com.beta.version.xlang_serde.serde_util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
//import com.beta.version.xlang_serde.serde_util.CrossLanguageSerializer;
//import com.beta.version.xlang_serde.serde_util.Person;

import org.junit.Before;
import org.junit.Test;


public class CrossLanguageSerializerTest {
  private CrossLanguageSerializer classUnderTest;
	
	@Before 
	public void setUp() {
		classUnderTest = new CrossLanguageSerializer();
	}
	
	//TODO
	@Test
  public void testSerializeToJson() {
      Person person = new Person();
      assertTrue(true);
  }
  
  //TODO
  @Test
  public void testDeserializeFromJson() {
    assertTrue(true);
  }
  
  //TODO
  @Test
  public void testSerializeToXml() {
    assertTrue(true);
  }

  //TODO
  @Test
  public void testDeserializeFromXml() {
    assertTrue(true);
  }

  //TODO
  @Test
  public void testNestedObjectSerialization() {
    assertTrue(true);
  }

  //TODO
  @Test
  public void testNestedObjectDeserialization() {
    assertTrue(true);
  }

}
