/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.proximitybeacon.v1beta1.model;

/**
 * Represents one beacon observed once.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Proximity Beacon API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Observation extends com.google.api.client.json.GenericJson {

  /**
   * The ID advertised by the beacon the client has encountered.
   *
   * If the submitted `advertised_id` type is Eddystone-EID, then the client must be authorized to
   * resolve the given beacon. Otherwise no data will be returned for that beacon. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdvertisedId advertisedId;

  /**
   * The array of telemetry bytes received from the beacon. The server is responsible for parsing
   * it. This field may frequently be empty, as with a beacon that transmits telemetry only
   * occasionally.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String telemetry;

  /**
   * Time when the beacon was observed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestampMs;

  /**
   * The ID advertised by the beacon the client has encountered.
   *
   * If the submitted `advertised_id` type is Eddystone-EID, then the client must be authorized to
   * resolve the given beacon. Otherwise no data will be returned for that beacon. Required.
   * @return value or {@code null} for none
   */
  public AdvertisedId getAdvertisedId() {
    return advertisedId;
  }

  /**
   * The ID advertised by the beacon the client has encountered.
   *
   * If the submitted `advertised_id` type is Eddystone-EID, then the client must be authorized to
   * resolve the given beacon. Otherwise no data will be returned for that beacon. Required.
   * @param advertisedId advertisedId or {@code null} for none
   */
  public Observation setAdvertisedId(AdvertisedId advertisedId) {
    this.advertisedId = advertisedId;
    return this;
  }

  /**
   * The array of telemetry bytes received from the beacon. The server is responsible for parsing
   * it. This field may frequently be empty, as with a beacon that transmits telemetry only
   * occasionally.
   * @see #decodeTelemetry()
   * @return value or {@code null} for none
   */
  public java.lang.String getTelemetry() {
    return telemetry;
  }

  /**
   * The array of telemetry bytes received from the beacon. The server is responsible for parsing
   * it. This field may frequently be empty, as with a beacon that transmits telemetry only
   * occasionally.
   * @see #getTelemetry()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTelemetry() {
    return com.google.api.client.util.Base64.decodeBase64(telemetry);
  }

  /**
   * The array of telemetry bytes received from the beacon. The server is responsible for parsing
   * it. This field may frequently be empty, as with a beacon that transmits telemetry only
   * occasionally.
   * @see #encodeTelemetry()
   * @param telemetry telemetry or {@code null} for none
   */
  public Observation setTelemetry(java.lang.String telemetry) {
    this.telemetry = telemetry;
    return this;
  }

  /**
   * The array of telemetry bytes received from the beacon. The server is responsible for parsing
   * it. This field may frequently be empty, as with a beacon that transmits telemetry only
   * occasionally.
   * @see #setTelemetry()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Observation encodeTelemetry(byte[] telemetry) {
    this.telemetry = com.google.api.client.util.Base64.encodeBase64URLSafeString(telemetry);
    return this;
  }

  /**
   * Time when the beacon was observed.
   * @return value or {@code null} for none
   */
  public String getTimestampMs() {
    return timestampMs;
  }

  /**
   * Time when the beacon was observed.
   * @param timestampMs timestampMs or {@code null} for none
   */
  public Observation setTimestampMs(String timestampMs) {
    this.timestampMs = timestampMs;
    return this;
  }

  @Override
  public Observation set(String fieldName, Object value) {
    return (Observation) super.set(fieldName, value);
  }

  @Override
  public Observation clone() {
    return (Observation) super.clone();
  }

}
