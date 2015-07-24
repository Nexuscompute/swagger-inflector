package io.swagger.sample.integration.responses;

import io.swagger.models.*;
import io.swagger.sample.client.ApiClient;

import io.swagger.util.Json;
import io.swagger.util.Yaml;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.util.*;
import java.math.BigDecimal;

import org.testng.annotations.Test;

public class PrimitiveResponseTestIT {
  ApiClient client = new ApiClient();

  /**
   * empty response
   */
  @Test
  public void verifyGetEmptyResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();
    queryParams.put("name", "tony");

    String str = client.invokeAPI("/mockResponses", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "");
  }

  /**
   * verifies that the return value is automatically created
   */
  @Test
  public void verifyGetFloatResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveFloatResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "1.1");
  }

  /**
   * verifies that the return value is automatically created
   */
  @Test
  public void verifyGetDoubleResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveDoubleResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "1.23");
  }

  /**
   * verifies that the return value is automatically created
   */
  @Test
  public void verifyGetUUIDResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveUUIDResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "\"3fa85f64-5717-4562-b3fc-2c963f66afa6\"");
  }

  /**
   * verifies that the return value is automatically created
   */
  @Test
  public void verifyGetStringResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveStringResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "\"string\"");
  }

  /**
   * verifies that the return value uses the schema example
   */
  @Test
  public void verifyGetStringResponseWithExample() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveStringResponseWithExample", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "\"fun\"");
  }

  /**
   * verifies that the date return value is automatically created
   */
  @Test
  public void verifyGetDateResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveDateResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "\"2015-07-20\"");
  }

  /**
   * verifies that the date-time return value is automatically created
   */
  @Test
  public void verifyGetDateTimeResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveDateTimeResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "\"2015-07-20T15:49:04-07:00\"");
  }

  /**
   * verifies that the BigDecimal return value is automatically created
   */
  @Test
  public void verifyGetBigDecimalResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveBigDecimalResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "1.5");
  }

  /**
   * verifies that the email return value is automatically created
   */
  @Test
  public void verifyGetEmailResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiveEmailResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "\"apiteam@swagger.io\"");
  }

  /**
   * verifies that the email return value is automatically created
   */
  @Test
  public void verifyGetMapResponse() throws Exception {
    Map<String, String> queryParams = new HashMap<String, String>();

    String str = client.invokeAPI("/mockResponses/primitiaveMapResponse", "GET", queryParams, null, new HashMap<String, String>(), null, "application/json", null, new String[0]);
    assertEquals(str, "{\"key\":\"string\"}");
  }
}
